<%--
  Created by IntelliJ IDEA.
  User: sovicheacheth
  Date: 2019-07-13
  Time: 09:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="resources/css/styles.css" rel="stylesheet"/>
    <script src="resources/js/scripts.js" type="text/javascript"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <link href="resources/images/favicon.ico" rel="icon" type="image/x-icon"/>
</head>
<body class="loginPageBody">

<%
    Cookie[] cookies = request.getCookies();
    String username = "", password = "", remember = "";
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("username")) {
                username = cookie.getValue();
            }
            if (cookie.getName().equals("remember")) {
                remember = cookie.getValue();
            }
        }
    }
%>


<form method="POST" class="loginForm" action="login">
    <h1>Login Form</h1>
    <br/>

    <label for="username">Username: </label><br/>
    <input type="text" placeholder="Username" id="username" name="username" value="${cookie.username.value}"/><br/>
    <label for="password">Password: </label><br/>
    <input type="password" placeholder="Password" id="password" name="password"/><br/>
    <label>Remember Me</label>
    <input type="checkbox" name="remember" value="1" <%= "1".equals(remember.trim()) ? "checked='checked'" : "" %>/>
    <input type="submit" value="Login">

    <p class="errorMsg">
        <%=request.getSession().getAttribute("msg") != null ? request.getSession().getAttribute("msg") : ""%>
    </p>
</form>

</body>
</html>
