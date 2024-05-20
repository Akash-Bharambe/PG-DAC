function calcArea(radius) {
  return Math.PI * radius * radius;
}
function calcCircumference(radius) {
  return Math.PI * 2 * radius;
}

module.exports = {
  calcArea,
  calcCircumference,
};
