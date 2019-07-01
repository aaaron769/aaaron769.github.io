// Aaon Gezai tip calculator js file
function calculateTotal() {
        var subtotalElem = document.getElementById('subtotal');
        var tipElem = document.getElementById('tip');
        var totalElem = document.getElementById('total');
        var subtotal = parseInt(subtotalElem.value);
        var tip = parseInt(tipElem.value);
        var total =( subtotal ) + ((tip*subtotal)/100);
        totalElem.innerHTML = '$' + total;

}