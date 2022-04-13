const openModal = document.querySelector(".modal-btn");
const modalBox = document.querySelector(".modal-overlay");
const closeModal = document.querySelector(".close-btn");

openModal.addEventListener("click", function () {
  modalBox.classList.add("open-modal");
});

closeModal.addEventListener("click", function () {
  modalBox.classList.remove("open-modal");
});
