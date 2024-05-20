const arr = [
  { username: "admin123", password: "admin123" },
  {
    username: "user123",
    password: "pass123",
  },
];

function checkUname(username) {
  if (username.trim().length > 6) {
    return arr.some((obj) => {
     return obj.username === username;
    });
  }
  return false;
}

function checkPass(password) {
  return arr.some((obj) => {
    return obj.password === password;
  });
}
module.exports = {
  checkUname,
  checkPass,
};
