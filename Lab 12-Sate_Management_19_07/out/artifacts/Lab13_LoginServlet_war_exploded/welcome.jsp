<%--
  Created by IntelliJ IDEA.
  User: aaaron769
  Date: 7/13/2019
  Time: 1:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<% if(session.getAttribute("uName").equals("aaron")){
    response.sendRedirect("/welcome.jsp");
}

%>

</body>
</html>
