package com.zizhi.secure.realm;

import com.zizhi.jopo.UserPrincipal;
import com.zizhi.model.Account;
import com.zizhi.service.AccountService;
import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auth liguoqiang
 * @Date 2017-7-13
 * @Update
 * @UDate
 */
public class AccountRealm extends AuthorizingRealm {
    private static Logger logger = Logger.getLogger(AccountRealm.class);

    @Autowired
    private AccountService  accountService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        AccountToken accountToken = (AccountToken) token;
        UserPrincipal userPrincipal = accountToken.getUserPrincipal();
        String pass = accountToken.getPassword();
        if(null!=userPrincipal && null != userPrincipal.getUsername()){

            Account account  = accountService.selectAccountByName(userPrincipal.getUsername());
            if(null != account){
                String salt = account.getAccountId()+"#"+account.getCreatedTime();
                //String encodedPassword =new Sha512Hash(accountToken.getPassword(), salt, 32).toBase64();
                if(accountToken.getPassword().equals(account.getAccountPassword())){
                    SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo();
                    accountToken.setAccount(account);
                    SimplePrincipalCollection simplePrincipalCollection = new SimplePrincipalCollection();
                    simplePrincipalCollection.add(userPrincipal, getName());
                    authenticationInfo.setPrincipals(simplePrincipalCollection);
                    authenticationInfo.setCredentials(pass);
                    logger.info("认证成功!!! principalls:" + userPrincipal + " credentiasl:" + pass);
                    return authenticationInfo;
                }
            }
        }
        return null;
    }

    @Override
    public boolean supports(AuthenticationToken token) {

        boolean result = token instanceof AccountToken;

        return result;

    }

    /**
     * 获取授权信息,这里会进行判断，如果是认证登录通过，则拥有user:*权限 如果是
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        UserPrincipal userPrincipal = (UserPrincipal) principals.getPrimaryPrincipal();
        UserPrincipal.PrincipType principType = userPrincipal.getPrincipType();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addRole(principType.getRoleName());
        switch (principType) {
            case USER:
                authorizationInfo.addStringPermission("user:*");
                authorizationInfo.addStringPermission("avatar:read");
                break;
            case ADMIN:
                authorizationInfo.addStringPermission("user:*");
                authorizationInfo.addStringPermission("avatar:*");
                authorizationInfo.addStringPermission("admin:*");
                break;
        }
        logger.info("authrizations: Roles:" + authorizationInfo.getRoles() + " permesins" + authorizationInfo.getStringPermissions());

        return authorizationInfo;
    }

}
