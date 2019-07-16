<%--
  Created by IntelliJ IDEA.
  User: james
  Updated: sovicheacheth
  Date: 7/13/19
  Time: 6:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Hotel Management System</title>
    <link href="resources/css/styles.css" rel="stylesheet"/>
    <script src="resources/js/scripts.js" type="text/javascript"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <link href="resources/images/favicon.ico" rel="icon" type="image/x-icon"/>
</head>
<body>
<div id="header">
    <div class="navbar">
        <a href="#">
            <img src="resources/images/logo2.png" alt="Hotel Management System" width="320"/>
        </a>
        <a href="login.jsp" class="login">Login</a>

    </div>
</div>
<div id="container">
    <div class="column left">
        <img src="resources/images/feature-image-01.png" alt="Hotel Feature Image"/>
    </div>
    <div class="column right">

        <a href="guestDetails.jsp"><button id="btnBooking" text="Book Now">Book Now</button></a>
        <h3>The best American hotel</h3>
        <p>&#11088;&#11088;&#11088;&#11088;&#11088;</p>
        <p>
            This smoke-free hotel features an indoor pool, a fitness center, and a bar/lounge. Free buffet breakfast and
            free self parking are also provided. Other amenities include a spa tub, coffee/tea in a common area, and a
            business center. All 63 rooms provide free WiFi and free wired Internet, LCD TVs with cable channels, and
            conveniences like refrigerators and microwaves.
        </p>
    </div>
</div>
<div id="roomRate">
    <div class="roomInfo">
        <img src="resources/images/one-bed-room.png" alt="One Bed Room"/>
        <div class="roomRateDetail">
            <p class="roomFeature">
                <strong>Standard Room, 1 Queen Bed</strong><br/>
                Free Wi-Fi<br/>
                Free Breakfast<br/>
                Free Parking
            </p>
            <p class="roomPrice">
                $110/night
            </p>
        </div>
    </div>

    <div class="roomInfo">
        <img src="resources/images/two-bed-room.png" alt="Two Bed Room"/>
        <div class="roomRateDetail">
            <p class="roomFeature">
                <strong>Standard Room, 2 Queen Bed</strong><br/>
                Free Wi-Fi<br/>
                Free Breakfast<br/>
                Free Parking
            </p>
            <p class="roomPrice">
                $175/night
            </p>
        </div>
    </div>
</div>
<div id="footer">
    <pre>
Copyright &copy; 2019 Group 5
Hotel Management System
    </pre>
</div>
</body>
</html>

