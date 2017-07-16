<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>资质登录</title>
    <link href="WEB-INF/css/bootstrap.min.css" rel="stylesheet">
    <script src="/js/jquery-3.2.1.slim.min.js"></script>
</head>
<body>
    <form action="/account/login" method="post">
        <input type="text" name="username" /><br/>
        <input type="password" name="password" /><br/>
        <input type="text" id="code" name="code"  style="width:100px;"/>
        <img id="imgObj" alt="验证码" src="/account/validateCode" onclick="changeImg()"/>
        <a href="#" onclick="changeImg()">换一张</a><br/>
        <input type="submit" name="登录"/>
    </form>
<script src="/js/bootstrap.min.js"></script>
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
</script>
</body>
</html>