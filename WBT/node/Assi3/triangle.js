function isEquilateral(side1, side2, side3) {
  return side1 === side2 && side2 === side3;
}
function calcPerimeter(...side) {
  if (side.length <= 3) {
    let res = 0;
    for (let s of side) {
      res += s;
    }
    return res;
  }
  return null;
}

module.exports = {
  isEquilateral,
  calcPerimeter,
};
