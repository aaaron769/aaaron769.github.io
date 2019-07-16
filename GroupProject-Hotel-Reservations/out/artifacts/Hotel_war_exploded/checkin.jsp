<%--
  Created by IntelliJ IDEA.
  User: sovicheacheth
  Date: 2019-07-14
  Time: 09:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<title>Hotel Maharishi</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="resources/css/checkin.css">
<link rel="script" href="resources/css/modal.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript"
        src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="resources/js/checkin.js"></script>
<style>
    body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", Arial, Helvetica, sans-serif}
</style>
<body class="grp5-light-grey">

<!-- Navigation Bar -->
<div class="grp5-bar grp5-white grp5-large">
    <a href="#" class="grp5-bar-item grp5-button grp5-red grp5-mobile"><i class="fa fa-bed grp5-margin-right"></i>Attendant</a>
    <a href="#rooms" class="grp5-bar-item grp5-button grp5-mobile">Rooms</a>
    <a href="#about" class="grp5-bar-item grp5-button grp5-mobile">Information</a>
    <a href="#contact" class="grp5-bar-item grp5-button grp5-mobile">Messages</a>
    <a href="logout" class="grp5-bar-item grp5-button grp5-right grp5-light-grey grp5-mobile">Logout</a>
</div>
<!-- Header -->
<header id="header" class="grp5-display-container grp5-content" style="max-width:1500px;">
    <img class="grp5-image" src="resources/images/hotel.jpg" alt="The Hotel" style="min-width:1000px" width="1500" height="800">
    <div class="grp5-display-left grp5-padding grp5-col l6 m8">
        <div class="grp5-container grp5-red">
            <h2><i class="fa fa-bed grp5-margin-right"></i>Hotel Maharishi Guests</h2>
        </div>
        <div class="grp5-container grp5-white grp5-padding-16">
            <table id="tbl_products">
                  <thead>
                  <tr>
                      <th>First Name</th>
                      <th>Last Name</th>
                      <th>Check In</th>
                      <th>Check Out</th>
                  </tr>
                  </thead>
                <tbody>
                <tr>
                <c:forEach items="${guests}" var="guest">
                    <tr>
                        <td><c:out value="${guest.firstName}" /></td>
                        <td><c:out value="${guest.lastName}"/> </td>
                    <td>
                        <i  class="fa fa-calendar-o"></i>
                        <a href="#rooms" class ="checkin" id ="<c:out value="${guest.id}" />"> Check In</a></td>
                    <td>
                        <i class="fa fa-credit-card" aria-hidden="true"></i>
                        <a href="<c:url value="/checkin">
                                    <c:param name="guestId" value="${guest.id}"/>
                                </c:url>" class ="checkout"  >Check Out</a></td>
                    </tr>
                </c:forEach>
                <br>
                </tbody>
            </table>
        </div>
    </div>
</header>

<!-- Page content -->
<div class="grp5-content" style="max-width:1532px;">

    <div class="grp5-container grp5-margin-top" id="rooms">
        <h3>Rooms</h3>
        <p>Make yourself at home is our slogan. We offer the best beds in the industry. Sleep well and rest well.</p>
    </div>

    <div class="grp5-row-padding">
        <div class="grp5-col m3">
            <label><i class="fa fa-calendar-o"></i> Check In</label>
            <input class="grp5-input grp5-border" type="date" placeholder="DD MM YYYY">
        </div>
        <div class="grp5-col m3">
            <label><i class="fa fa-calendar-o"></i> Check Out</label>
            <input class="grp5-input grp5-border" type="date" placeholder="DD MM YYYY">
        </div>
        <div class="grp5-col m2">
            <label><i class="fa fa-male"></i> Adults</label>
            <input class="grp5-input grp5-border" type="number" placeholder="1">
        </div>
        <div class="grp5-col m2">
            <label><i class="fa fa-child"></i> Kids</label>
            <input class="grp5-input grp5-border" type="number" placeholder="0">
        </div>
        <div class="grp5-col m2">
            <label><i class="fa fa-search"></i> Search</label>
            <button class="grp5-button grp5-block grp5-black">Search</button>
        </div>
    </div>

    <div class="grp5-row-padding grp5-padding-16">
        <div class="grp5-third grp5-margin-bottom">
            <img src="resources/images/room_single.jpg" alt="Norway" style="width:100%">
            <div class="grp5-container grp5-white">
                <h3>Single Room</h3>
                <h6 class="grp5-opacity">From $100</h6>
                <p>Single bed</p>
                <p>15m<sup>2</sup></p>
                <p class="grp5-large"><i class="fa fa-bath"></i> <i class="fa fa-phone"></i> <i class="fa fa-wifi"></i></p>
                <button id="single" class="room-type grp5-button grp5-block grp5-black grp5-margin-bottom">Choose Room</button>
            </div>
        </div>
        <div class="grp5-third grp5-margin-bottom">
            <img src="resources/images/room_double.jpg" alt="Norway" style="width:100%">
            <div class="grp5-container grp5-white">
                <h3>Double Room</h3>
                <h6 class="grp5-opacity">From $200</h6>
                <p>Queen-size bed</p>
                <p>25m<sup>2</sup></p>
                <p class="grp5-large"><i class="fa fa-bath"></i> <i class="fa fa-phone"></i> <i class="fa fa-wifi"></i> <i class="fa fa-tv"></i></p>
                <button id="double" class="room-type grp5-button grp5-block grp5-black grp5-margin-bottom">Choose Room</button>
            </div>
        </div>
        <div class="grp5-third grp5-margin-bottom">
            <img src="resources/images/room_deluxe.jpg" alt="Norway" style="width:100%">
            <div class="grp5-container grp5-white">
                <h3>Deluxe Room</h3>
                <h6 class="grp5-opacity">From $500</h6>
                <p>King-size bed</p>
                <p>40m<sup>2</sup></p>
                <p class="grp5-large"><i class="fa fa-bath"></i> <i class="fa fa-phone"></i> <i class="fa fa-wifi"></i> <i class="fa fa-tv"></i> <i class="fa fa-glass"></i> <i class="fa fa-cutlery"></i></p>
                <button id="deluxe" class="room-type grp5-button grp5-block grp5-black grp5-margin-bottom">Choose Room</button>
            </div>
        </div>
    </div>

    <div class="grp5-row-padding" id="about">
        <div class="grp5-col l4 12">
            <h3>Information</h3>
            <h6>Our hotel is one of a kind. It is truely amazing. Located in Fairfield Iowa, From the kindness of a friendly greeting to the comfort of a good night’s sleep, you’ll find everything you need right here.</h6>
            <p>We accept: <i class="fa fa-credit-card grp5-large"></i> <i class="fa fa-cc-mastercard grp5-large"></i> <i class="fa fa-cc-amex grp5-large"></i> <i class="fa fa-cc-cc-visa grp5-large"></i><i class="fa fa-cc-paypal grp5-large"></i></p>
        </div>
        <div class="grp5-col l8 12">
            <!-- Image of location/map -->
            <img src="resources/images/map.jpg" class="grp5-image grp5-greyscale" style="width:100%;">
        </div>
    </div>

    <div class="grp5-row-padding grp5-large grp5-center" style="margin:32px 0">
        <div class="grp5-third"><i class="fa fa-map-marker grp5-text-red"></i> 52257 Fairfield, IOWAFrom the kindness of a friendly greeting to the comfort of a good night’s sleep, you’ll find everything you need right here., US</div>
        <div class="grp5-third"><i class="fa fa-phone grp5-text-red"></i> Phone: +00 151515</div>
        <div class="grp5-third"><i class="fa fa-envelope grp5-text-red"></i> Email: mail@mail.com</div>
    </div>

    <div class="grp5-panel grp5-red grp5-leftbar grp5-padding-32">
        <h6><i class="fa fa-info grp5-deep-orange grp5-padding grp5-margin-right"></i> On demand, we can offer playstation, babycall, children care, dog equipment, etc.</h6>
    </div>

    <div class="grp5-container">
        <h3>Our Hotels</h3>
        <h6>You can find our hotels anywhere in the world:</h6>
    </div>

    <div class="grp5-row-padding grp5-padding-16 grp5-text-white grp5-large">
        <div class="grp5-half grp5-margin-bottom">
            <div class="grp5-display-container">
                <img src="resources/images/cinqueterre.jpg" alt="Cinque Terre" style="width:100%">
                <span class="grp5-display-bottomleft grp5-padding">Cinque Terre</span>
            </div>
        </div>
        <div class="grp5-half">
            <div class="grp5-row-padding" style="margin:0 -16px">
                <div class="grp5-half grp5-margin-bottom">
                    <div class="grp5-display-container">
                        <img src="resources/images/newyork2.jpg" alt="New York" style="width:100%">
                        <span class="grp5-display-bottomleft grp5-padding">New York</span>
                    </div>
                </div>
                <div class="grp5-half grp5-margin-bottom">
                    <div class="grp5-display-container">
                        <img src="resources/images/sanfran.jpg" alt="San Francisco" style="width:100%">
                        <span class="grp5-display-bottomleft grp5-padding">San Francisco</span>
                    </div>
                </div>
            </div>
            <div class="grp5-row-padding" style="margin:0 -16px">
                <div class="grp5-half grp5-margin-bottom">
                    <div class="grp5-display-container">
                        <img src="resources/images/pisa.jpg" alt="Pisa" style="width:100%">
                        <span class="grp5-display-bottomleft grp5-padding">Pisa</span>
                    </div>
                </div>
                <div class="grp5-half grp5-margin-bottom">
                    <div class="grp5-display-container">
                        <img src="resources/images/paris.jpg" alt="Paris" style="width:100%">
                        <span class="grp5-display-bottomleft grp5-padding">Paris</span>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="grp5-container grp5-padding-32 grp5-black grp5-opacity grp5-card grp5-hover-opacity-off" style="margin:32px 0;">
        <h2>Get the best offers first!</h2>
        <p>Join our newsletter.</p>
        <label>E-mail</label>
        <input class="grp5-input grp5-border" type="text" placeholder="Your Email address">
        <button type="button" class="grp5-button grp5-red grp5-margin-top">Subscribe</button>
    </div>

    <div class="grp5-container" id="contact">
        <h2>Messages</h2>
        <p>Do you need help?, do not hesitate to ask them.</p>
        <i class="fa fa-map-marker grp5-text-red" style="width:30px"></i> Support<br>
        <i class="fa fa-phone grp5-text-red" style="width:30px"></i> Phone: +00 151515<br>
        <i class="fa fa-envelope grp5-text-red" style="width:30px"> </i> Email: support@mail.com<br>
        <form action="/action_page.php" target="_blank">
            <p><input class="grp5-input grp5-padding-16 grp5-border" type="text" placeholder="Name" required name="Name"></p>
            <p><input class="grp5-input grp5-padding-16 grp5-border" type="text" placeholder="Email" required name="Email"></p>
            <p><input class="grp5-input grp5-padding-16 grp5-border" type="text" placeholder="Message" required name="Message"></p>
            <p><button class="grp5-button grp5-black grp5-padding-large" type="submit">SEND MESSAGE</button></p>
        </form>
    </div>

    <!-- End page content -->
</div>

<div id="myModal" class="modal">

    <!-- Modal content -->
    <div class="modal-content">
        <div class="modal-header">
            <span class="close">&times;</span>
            <h2>Checkin</h2>
        </div>
        <div class="modal-body">
            <p id="message"> this is a message</p>
        </div>
        <div class="modal-footer">
            <%--      <h3></h3>--%>
        </div>
    </div>

</div>

<!-- Footer -->
<footer class="grp5-padding-32 grp5-black grp5-center grp5-margin-top">
    <h5>Find Us On</h5>
    <div class="grp5-xlarge grp5-padding-16">
        <i class="fa fa-facebook-official grp5-hover-opacity"></i>
        <i class="fa fa-instagram grp5-hover-opacity"></i>
        <i class="fa fa-snapchat grp5-hover-opacity"></i>
        <i class="fa fa-pinterest-p grp5-hover-opacity"></i>
        <i class="fa fa-twitter grp5-hover-opacity"></i>
        <i class="fa fa-linkedin grp5-hover-opacity"></i>
    </div>
</footer>


</body>
</html>