<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--this is the guest details if the guest needs to book--%>
<html lang="en">
    <!-- the header part -->
<head>
    <title> Room reservation</title>
    <link href="resources/css/guestDetails.css" rel="stylesheet" />
</head>
<!-- the body part -->
<body>
    <div id="theEntireForm">      
            <div id="theHeader">   <!-- the head of the form -->
                    <h1>Room Reservation Form</h1>
                </div><!-- the FormHead -->
        <!-- the entire form div      -->
        <form action="guest" method="POST">
            <div id="content">
                <div id="personalAndBilling">
                    <!-- personalAndBilling -->
                    <div class="block_border">
                        <!-- the personal details div  -->
                        <h3> Personal details</h3>
                        <p>First Name :<input type="text" name="firstName" required placeholder="first name" /></p>
                        <p>Last Name :<input type="text" name="lastName" required placeholder="last name" /></p>
                        <p>Email Address :<input type="email" name="emailAddress" required
                                placeholder="email Address" />
                        </p>
                        <p>Social security :<input type="text" name="socialSecurity" required
                                placeholder="social Security" />
                        </p>
                        <p>Date of Birth :<input type="date" name="dateOfBirth" required placeholder="(yyyy/mm/dd)"
                                pattern="yyyy/mm/dd" /></p>
                        <p>Phone Number :<input type="tel" name="phoneNumber" required placeholder="(xxx)-xxx-xxxx" />
                        </p>
                    </div>
                    <div class="block_border">
                        <!-- the billingAddress div-->
                        <h3>Billing Address:</h3>
                        <p>Address Line1:<input type="text" name="addressLineOne" required
                                placeholder="address line one" />
                        </p>
                        <p>Address Line2:<input type="text" name="addressLineTwo" required
                                placeholder="address line two" />
                        </p>
                        <p>City :<input type="text" name="city" required placeholder="city" /></p>
                        <p>State:<select name="state">
                                <option> WA </option>
                                <option> CA </option>
                                <option> IA </option>
                                <option> TX </option>
                                <option> NY </option>
                            </select></p>
                        <p> Zip Code:<input type="text" name="zipCode" required placeholder="Zip Code"/>

                        </p>
                        <p> Country:<input type="text" name="country" required placeholder="country" /></p>
                    </div> <!-- the billingAddress div end-->
                </div> <!-- personalAndBilling Div -->
                <div id="shippmentAndPayment">
                    <!-- personalAndBilling -->

                    <div class="block_border">                        
                        <!-- the Shipping address-->
                        <h1>Booking Duration:</h1>
                        <p>CheckIn time:<input type="date" name="checkInTime" required/>  </p>
                        <p>CheckOutTime:<input type="date" name="checkOutTime" required/>  </p>                                   
                        
                        <p>Type of Room:<select name="typeOfBedRoom">
                            <option>1_BedRoom </option>
                            <option>2_BedRoom</option>                                
                        </select></p>
                        <p id="moreInfo" >SpecialRequirement write here :
                            <textarea name="moreInfoTextArea"></textarea></p>
                     
                    </div> <!-- the Shipping Address div end-->
                    <!-- the payment Information -->
                    <div class="block_border">
                        <h3> Payment Information</h3>
                        <p>
                            <fieldset id="field">
                                <legend> credit cards</legend>
                                Payment Type?
                                <input type="radio" name="ok" value="visa" />:Visa
                                <input type="radio" name="ok" value="masterCard" />:Master-Card
                                <input type="radio" name="ok" value="payPal" />:PayPal

                            </fieldset>
                        </p>
                        <p>
                            Card Number:<input type="text" name="cardNumber" required
                                placeholder="**** **** **** ****" />
                            <p> expire Date:<input type="date" name="expireDate" required pattern="yyyy/mm/dd"
                                    placeholder="yyyy/mm/dd" />
                                security Code:<input type="text" name="sCode" required
                                   />
                            </p>
                        </p>
                    </div> <!-- payment div ends here -->
                    <!-- check for agreement -->
                    <p>press continue for process payment no for cancel?
                        <input type="radio" name="paymentAgreement" value="Yes" /> Continue
                        <input type="radio" name="paymentAgreement" value="No" /> No </p>
                </div>
            </div>
            <!-- the submit and reset buttons -->
            <div class="block_border">
                <input type="submit" value="Submit" />
                <input type="reset" value="Reset" />
            </div>

        </form>

    </div> <!-- the entire form ends here -->

</body>

</html>
