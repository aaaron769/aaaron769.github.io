$(function() {
    $('#btn_add').click(chargeCustomer);

    function chargeCustomer() {
        // language=JQuery-CSS
        var guestId = $('#guest_id').text();
        var rentBill = $('#rent_Bill').val();
        var  billingInfo= {id: guestId, bill: rentBill};
        $.post('checkout', {billingInfo: JSON.stringify(billingInfo)}, "json")
    }
});