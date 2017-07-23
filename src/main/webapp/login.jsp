<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>资质登录</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <script src="/js/jquery-3.2.1.slim.min.js"></script>
</head>
<body>
    <input type="hidden" id="mesg" value="${mesg}"/>
    <div class="container">
        <h2>趣逛科技资质管理系统</h2>
        <form action="/account/login" method="post" class="form-horizontal">
            <div class="form-group">
                <label for="username" class="col-sm-2 control-label">用户名</label>
                <div class="col-sm-3">
                    <input type="text"  class="form-control" name="username" id="username" placeholder="用户名"/>
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-3">
                    <input type="password" class="form-control" name="password" id="password" placeholder="密码">
                </div>
            </div>
            <div class="form-group">
                <label for="companycode" class="col-sm-2 control-label">公司编码</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" name="companycode" id="companycode" placeholder="公司编码">
                </div>
            </div>
            <div class="form-group">
                <label for="code" class="col-sm-2 control-label">验证码</label>
                <div class="col-sm-2">
                    <input type="text" class="form-control" name="code" id="code" placeholder="验证码">
                </div>
                <div class="col-sm-2">
                    <img id="imgObj" alt="验证码" src="/account/validateCode" onclick="changeImg()"/>
                </div>
                <%--<div class="col-sm-1">--%>
                    <%--<a href="#" onclick="changeImg()">换一张</a>--%>
                <%--</div>--%>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit"class="btn btn-default"  name="登录"/>
                </div>
            </div>


        </form>
    </div>
<script type="text/javascript">
    // 刷新图片
    function changeImg() {
        var imgSrc = $("#imgObj");
        var src = imgSrc.attr("src");
        imgSrc.attr("src", changeUrl(src));
    }
    //为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳
    function changeUrl(url) {
        var timestamp = (new Date()).valueOf();
        var index = url.indexOf("?",url);
        if (index > 0) {
            url = url.substring(0, url.indexOf(url, "?"));
        }
        if ((url.indexOf("&") >= 0)) {
            url = url + "×tamp=" + timestamp;
        } else {
            url = url + "?timestamp=" + timestamp;
        }
        return url;
    }
    function alertMesg(){
       var mesg = $("#mesg").val();
        if(null!= mesg &&mesg!=""){
            alert(mesg)
        }
    }
    alertMesg();
</script>
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>