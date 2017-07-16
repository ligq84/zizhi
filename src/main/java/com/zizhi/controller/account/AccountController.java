package com.zizhi.controller.account;

import com.zizhi.jopo.UserPrincipal;
import com.zizhi.secure.realm.AccountToken;
import com.zizhi.service.AccountService;
import com.zizhi.utils.ValidateCodeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * @Auth liguoqiang
 * @Date 2017-7-15
 * @Update
 * @UDate
*/
@RequestMapping(value = "/account", produces = {APPLICATION_JSON_UTF8_VALUE})
@RestController
public class AccountController {

    private static Logger logger = Logger.getLogger(AccountController.class);
    @Autowired
    private AccountService accountService;

    @RequestMapping("/login")
    public ModelAndView Login(@RequestParam String username, @RequestParam String password, @RequestParam String code, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        AccountToken token = new AccountToken();
        String sessionCode = null == request.getSession(true).getAttribute("checkcode")?"":request.getSession(true).getAttribute("checkcode").toString();
        if (!StringUtils.equalsIgnoreCase(code, sessionCode)) {  //忽略验证码大小写
            modelAndView.setViewName("redirect:/login.jsp");
            modelAndView.addObject("result","{\"mesg\":\"验证码对应不上！\"}");
            return modelAndView;
        }

        // 如果是带验证的，则进行验证，否则没有验证，只能进行一般的请求
        if (username != null && password != null) {
            token.setPrincipal(new UserPrincipal(username, UserPrincipal.PrincipType.USER));
            Subject currentUser = SecurityUtils.getSubject();
            token.setPassword(password);
            if (currentUser.isAuthenticated()) {//如果当前已经有人登录，先登出
                currentUser.logout();
            }
            try {
                currentUser.login(token);
                // 如果认证成功，则增加request的属性，用于@CurrentUser注解使用
                //Account account = token.getAccount();
            } catch (AuthenticationException e) {
                logger.info("认证失败! "+e.getClass().getSimpleName());
                modelAndView.setViewName("redirect:/login.jsp");
                modelAndView.addObject("result","{\"mesg\":\"密码不对！\"}");
            } catch (Exception e) {
                logger.info("其他认证失败! "+e.getClass().getSimpleName());
                e.printStackTrace();
                modelAndView.setViewName("redirect:/login.jsp");
                modelAndView.addObject("result","{\"mesg\":\"登录异常！\"}");
            }

        }
        modelAndView.setViewName("index");
        return modelAndView;
    }

    /**
     * 生成验证码
     */
    @RequestMapping("/validateCode")
    public void getValidateCode(HttpServletRequest request, HttpServletResponse response) throws Exception{
        // 设置响应的类型格式为图片格式
        response.setContentType("image/jpeg");
        //禁止图像缓存。
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);

        ValidateCodeUtils vCode = new ValidateCodeUtils(120,40,4,100);
        vCode.write(response.getOutputStream());
        request.getSession(true).setAttribute("checkcode", vCode.getCode());
    }
}
