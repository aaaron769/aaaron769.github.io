$(function() {
    // on click addGuest will called
    $('#btn').click(addGuest);
   // the addGuest Function will prevent the default action which has form
    function addGuest(event) {
        event.preventDefault();
// I am retrieving the value of the input from application form
        var firstName = $("input[name='firstName']").val();
        var lastName = $("input[name='lastName']").val();
        var emailAddress = $("input[name='emailAddress']").val();
        var socialSecurity = $("input[name='socialSecurity']").val();
        var dateOfBirth = $("input[name='dateOfBirth']").val();
        var phoneNumber = $("input[name='phoneNumber']").val();
        var addressLineOne = $("input[name='addressLineOne']").val();
        var addressLineTwo = $("input[name='addressLineTwo']").val();
        var city = $("input[name='city']").val();
        var state = $("input[name='state']").val();
        var zipCode = $("input[name='zipCode']").val();
        var country = $("input[name='country']").val();
        // booking duration
        var checkInTime = $("input[name='checkInTime']").val();
        var checkOutTime = $("input[name='checkOutTime']").val();
        var typeOfBedRoom = $("input[name='typeOfBedRoom']").val();
        var moreInfoTextArea = $("input[name='moreInfoTextArea']").val();
        // payment Info
        var paymentType = $("input[name='ok']").val();
        var cardNumber = $("input[name='cardNumber']").val();
        var expireDate = $("input[name='expireDate']").val();
        var sCode = $("input[name='sCode']").val();
        var paymentAgreement = $("input[name='paymentAgreement']").val();

        // javascript object of the guest
        var guest = {
            firstName: firstName,
            lastName: lastName,
            emailAddress: emailAddress,
            socialSecurity: socialSecurity,
            dateOfBirth: dateOfBirth,
            phoneNumber: phoneNumber,
            addressLineOne: addressLineOne,
            addressLineTwo: addressLineTwo,
            city: city,
            state: state,
            zipCode: zipCode,
            country: country,
            checkInTime: checkInTime,
            checkOutTime: checkOutTime,
            typeOfBedRoom: typeOfBedRoom,
            moreInfoTextArea: moreInfoTextArea,
            paymentType: paymentType,
            cardNumber: cardNumber,
            expireDate: expireDate,
            sCode: sCode,
            paymentAgreement: paymentAgreement
        };

        // post json to the servlet guestController having url /guest
        $.post('guest', {guest: JSON.stringify(guest)}, processData, "json");

// processData will alert the successfully guest booking confirmation and redirect to confirmation page.
        function processData(data) {
            //data = JSON.parse(data);
            alert("Booking successfully made for guest: " + data.firstName + " " + data.lastName);
            window.location.href = "guestConfirmation.jsp";
        }
    }
})
