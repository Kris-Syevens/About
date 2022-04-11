const decrease = document.querySelector(".decrease");
const reset = document.querySelector(".reset");
const increase = document.querySelector(".increase");
let value = document.getElementById("value");

function validateColor() {
  if (value.innerText > 0) {
    value.style.color = "green";
  } else if (value.innerText < 0) {
    value.style.color = "red";
  } else {
    value.style.color = "black";
  }
}

decrease.addEventListener("click", function () {
  value.innerText = value.innerText - 1;
  validateColor();
});

reset.addEventListener("click", function () {
  value.innerText = 0;
  validateColor();
});

increase.addEventListener("click", function () {
  let number = Number(value.innerText);
  number = number + 1;
  value.innerText = number;
  validateColor();
});

console.log(Number(value.innerText));
