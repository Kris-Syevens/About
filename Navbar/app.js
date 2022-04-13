const linksContainer = document.querySelector(".links");
const toggleBtn = document.querySelector(".nav-toggle");

toggleBtn.addEventListener("click", function () {
  linksContainer.classList.toggle("show-links");
});
