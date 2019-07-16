$(function(){
    $('.checkin').click(goToRoom);
    $('.room-type').click(checkin);
    var selectedId = "";
    var modal = $("#myModal");


    function goToRoom(event){
        selectedId = event.target.id;
      //  $(document).scrollTop( $("#room").offset().top );
        $(document).scrollTop( $("#room") );
    }

    function checkin(event){
        var roomType = event.target.id;
        var checkinObj = {roomType: roomType, guestId : selectedId};
        $.post("checkin",{"checkin":JSON.stringify(checkinObj)})
            .done(function (data) {
                data = JSON.parse(data);
                    if(data.success){
                        $("#message").text("successfully checked in");
                    }else{
                        $("#message").text( data.message);
                    }})
            .fail(function () {
                $("#message").innerHTML= "An error occurred";
            })
            .always(function () {
                // show the message dialog
                $("#myModal").css("cssText", "display: block !important;");

            });
    }

    // When the user clicks on <span> (x), close the modal
    $(".close").click(function () {
        $("#myModal").css("cssText", "display: none !important;");
        window.scrollTo(0, 0);
    });

    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none !important;";
        }
    }

});
