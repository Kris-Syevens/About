const hex = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, "A", "B", "C", "D", "E", "F"];

const btn = document.getElementById("btn");
const color = document.querySelector(".color");

function randomIndex() {
  return Math.floor(Math.random() * hex.length);
}

btn.addEventListener("click", function () {
  document.body.style.backgroundColor = randomHexGenerator();
  color.textContent = randomHexGenerator();
});

function randomHexGenerator() {
  let result = "#";
  for (let i = 0; i < 6; i++) {
    result += hex[randomIndex()];
  }

  return result;
}

console.log(randomHexGenerator());
