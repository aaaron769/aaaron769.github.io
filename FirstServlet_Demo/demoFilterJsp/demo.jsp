<%--this tag called diclarative tag and will have attribute key=value--%>
<%@ page language="java" contentType="text/html; UTF-8"%>
<html>
<head>
<title>Demo JSP</title>
</head>
<body>
<%--	the jsp declarative scriptlet will have the syntax <%!%>--%>
	<%!int count1 = 0;%>
<%--	the jsp  scriptlet will have the syntax <% javacode  %>
this will be just like in service in servlet--%>

	<%
		int count2 = 0;
	%>
	The count1 is now:
	<%=count1%><br/>
	The count2 is now:
<%--this called expressiong srciptlet will display in the page like out.print in servlet--%>
	<%=count2%><br/>

	<%-- This is a jsp scriptlet that increments the counts --%>
	<%
		count1++;
		count2++;
	%>

	The count1 is now:
	<%=count1%><br/>
	The count2 is now:
	<%=count2%>

	<%-- <%! int count3 = count1+count2; %> --%>
	<!-- This is an html will be copied -->
	<%-- But not this JSP comment --%>
</body>
</html>
