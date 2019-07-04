window.onload = onLoadCalled;

function btnIpay() {
    document.getElementById("btnIgpay").onclick = btnIgpayOnClicked;

}

function btnIgpayOnClicked() {
    var textArea = document.getElementById("textArea").value;
    var str = textArea.toLowerCase();
    var st = "";
    for (var i = 0; i < str.length; i++) {
        if ("aeiouAEIOU".indexOf(str.charAt(i)) !== -1) {
            st = st + str.substr(i, str.length);
            st = st + str.substr(0, i) + "ay";
            break;
        }
    }
    document.getElementById("textArea").value = st;
}


function onLoadCalled() {
    biggerDecorationBtn();
    radioBtnBling();
    btnIpay();
  
}

function biggerDecorationBtn() {
    document.getElementById("decorationBtn").onclick = btclicke;
}
var visit=false;
function btclicke(){
if(visit){
    cleartimer(intervalId);
}
else{
    biggerBtnOnClickCalled();
}
if(!visit){
    visit=true;
}
else{
    visit=false;
}
console.log(visit);
}
function cleartimer(){
    clearInterval(intervalId);
}
var intervalId;
function biggerBtnOnClickCalled() {
    var textArea = document.getElementById("textArea");
    var style = window.getComputedStyle(textArea, null).getPropertyValue("font-size");
    var fontSize = parseFloat(style);
    textArea.style.fontSize = (fontSize + 2) + 'pt';
    intervalId=setInterval(biggerBtnOnClickCalled, 2000);
}

function radioBtnBling() {
    document.getElementById("decorationCheckBox").onclick = radioBtnBlingChecked;
}

function radioBtnBlingChecked() {
    if (document.getElementById("decorationCheckBox").checked) {

        document.getElementById("body").style.background = "#f3f3f3 url('dollar.jpg')";
        document.getElementById("textArea").style.fontWeight = "bold";
        document.getElementById("textArea").style.color = "green";
        document.getElementById("textArea").style.textDecoration = "underline";
    } else {
        document.getElementById("textArea").style.color = "";
        document.getElementById("body").style.background = "";
        document.getElementById("textArea").style.textDecoration = "";
        document.getElementById("textArea").style.fontWeight = "";
    }
}