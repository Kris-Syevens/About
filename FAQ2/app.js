// const button = document.querySelectorAll(".question-btn");
// const question = document.getElementsByClassName("question");

// for (let i = 0; i < button.length; i++) {
//   button[i].addEventListener("click", (e) => {
//     let grandParent = e.currentTarget.parentElement.parentElement;

//     if (!grandParent.classList.contains("show-text")) {
//       grandParent.classList.add("show-text");
//     } else {
//       grandParent.classList.remove("show-text");
//     }
//   });
// }

const questions = document.querySelectorAll(".question");

questions.forEach(function (question) {
  const btn = question.querySelector(".question-btn");
  btn.addEventListener("click", function () {
    if (!question.classList.contains("show-text")) {
      question.classList.add("show-text");
    } else {
      question.classList.remove("show-text");
    }
  });
});
