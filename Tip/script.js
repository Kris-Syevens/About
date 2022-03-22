

const submitAction = document.getElementById("submit");

submitAction.onclick = function () {

    var billAmount = document.querySelector("#billAmount").value;
    var tipPercentInput = document.querySelector("#tipPercent").value;
    var tipPercent = (tipPercentInput / 100);
    var tipResults = ("$" + (billAmount * tipPercent));
   
    return document.querySelector(".tip-result").innerText = (tipResults);
}