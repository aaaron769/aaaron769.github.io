<%--
  Created by IntelliJ IDEA.
  User: aaaron769
  Date: 7/15/2019
  Time: 12:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hotel Reservation confirmation</title>
    <link href="resources/css/confirmedBooking.css" rel="stylesheet" />
</head>
<body>

<p id="confirmation">Dear<span id="namOfGuest"> ${aGuest.getFirstName()}  ${aGuest.getLastName()} </span><br/>
    Thank you for making your reservation with us at the Maharishi Hotel,
    We will do our best to be sure we are ready for you when you arrive and provide all the amenities and luxuries we can.<br/>
    Our rooms are very spacious with great views. Our cabins are all individually placed so their views are exceptional as well.<br/>
    To contact us:
    <br/>
    <span id="contactInfo">
    Maharishi hotel<br/>
    fairField, IOW<br/>
    phone: 641-252-2525<br/>
        <span id="ourEmail"> ${contactUs}<br/></span>

    </span>
    <span id="To_Home_Page" ><a href="index.jsp"><button>To Home</button></a></span>

</p>

</body>
</html>
