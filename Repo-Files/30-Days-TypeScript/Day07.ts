// Day 7 of 30 Day Challenge

// DESCRIPTION:
// A hero is on his way to the castle to complete his mission. However, he's been told that the castle is surrounded with a couple of powerful dragons! each dragon takes 2 bullets to be defeated, our hero has no idea how many bullets he should carry.. Assuming he's gonna grab a specific given number of bullets and move forward to fight another specific given number of dragons, will he survive?

// Return True if yes, False otherwise :)

function willHeSurvive(bullets: number, dragonCount: number): boolean {
  return bullets >= dragonCount * 2;
}

console.log(willHeSurvive(3, 2)); // false
console.log(willHeSurvive(4, 2)); // true
