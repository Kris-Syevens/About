// local reviews data
const reviews = [
  {
    name: "susan smith",
    job: "web developer",
    img: "https://res.cloudinary.com/diqqf3eq2/image/upload/v1586883334/person-1_rfzshl.jpg",
    text: "I'm baby meggings twee health goth +1. Bicycle rights tumeric chartreuse before they sold out chambray pop-up. Shaman humblebrag pickled coloring book salvia hoodie, cold-pressed four dollar toast everyday carry",
  },
  {
    name: "anna johnson",
    job: "web designer",
    img: "https://res.cloudinary.com/diqqf3eq2/image/upload/v1586883409/person-2_np9x5l.jpg",
    text: "Helvetica artisan kinfolk thundercats lumbersexual blue bottle. Disrupt glossier gastropub deep v vice franzen hell of brooklyn twee enamel pin fashion axe.photo booth jean shorts artisan narwhal.",
  },
  {
    name: "peter jones",
    job: "intern",
    img: "https://res.cloudinary.com/diqqf3eq2/image/upload/v1586883417/person-3_ipa0mj.jpg",
    text: "Sriracha literally flexitarian irony, vape marfa unicorn. Glossier tattooed 8-bit, fixie waistcoat offal activated charcoal slow-carb marfa hell of pabst raclette post-ironic jianbing swag.",
  },
  {
    name: "bill anderson",
    job: "the boss",
    img: "https://res.cloudinary.com/diqqf3eq2/image/upload/v1586883423/person-4_t9nxjt.jpg",
    text: "Edison bulb put a bird on it humblebrag, marfa pok pok heirloom fashion axe cray stumptown venmo actually seitan. VHS farm-to-table schlitz, edison bulb pop-up 3 wolf moon tote bag street art shabby chic. ",
  },
];

const personImage = document.getElementById("person-img");
const author = document.getElementById("author");
const job = document.getElementById("job");
const info = document.getElementById("info");

const previousBtn = document.querySelector(".prev-btn");
const nextBtn = document.querySelector(".next-btn");
const randomBtn = document.querySelector(".random-btn");

const personOne = reviews[0];
const personTwo = reviews[1];
const personThree = reviews[2];
const personFour = reviews[3];

var activeReview = 0;

document.body.onload = function () {
  personImage.src = reviews[0].img;
  author.innerText = reviews[0].name;
  job.innerText = reviews[0].job;
  info.innerText = reviews[0].text;
};

previousBtn.addEventListener("click", function () {
  let active = activeReview;
  if (active > 0) {
    active--;
    personImage.src = reviews[active].img;
    author.innerText = reviews[active].name;
    job.innerText = reviews[active].job;
    info.innerText = reviews[active].text;
  } else {
    console.log("active is currently 0");
  }
  activeReview = active;
});

nextBtn.addEventListener("click", function () {
  let active = activeReview;
  if (active < 3) {
    active++;
    personImage.src = reviews[active].img;
    author.innerText = reviews[active].name;
    job.innerText = reviews[active].job;
    info.innerText = reviews[active].text;
  } else {
    console.log("active is currently 3");
  }

  activeReview = active;
});

randomBtn.addEventListener("click", function () {
  let active = Math.floor(Math.random() * reviews.length);
  personImage.src = reviews[active].img;
  author.innerText = reviews[active].name;
  job.innerText = reviews[active].job;
  info.innerText = reviews[active].text;
  activeReview = active;
});

console.log();
