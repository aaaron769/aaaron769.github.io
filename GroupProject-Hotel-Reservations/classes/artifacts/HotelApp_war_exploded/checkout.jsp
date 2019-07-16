<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 7/15/2019
  Time: 12:13 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <title>Title</title>
    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="resources/js/checkout.js"></script>
</head>
<body>
<div>

    <label for="FirstName">Name</label> <c:out value="${guest.firstName}"  />
    <label for="LastName">Bill</label> <c:out value="${guest.room.rate}"/>
    <label for="GuestId"></label><span id="guest_id"><c:out value="${guest.id}" /></span>
</div>
<div>
    <input id="btn_add" type="submit" value="Submit" />
</div>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>totalBill</th>
    </tr>
    </thead>
    <tbody>
        <tr>
            <td><c:out value="${guest.id}" /></td>
            <td><c:out value="${guest.firstName}" /></td>
            <td><c:out value="${totalBill}" /></td>
        </tr>
    </tbody>
</table>
</body>
</html>
