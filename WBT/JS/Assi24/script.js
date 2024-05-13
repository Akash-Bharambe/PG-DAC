const username = document.getElementById("username");
const password = document.getElementById("password");
const outUnm = document.getElementById("out-unm");
const outPass = document.getElementById("out-pass");
const out = document.getElementById("out");
document.getElementById("btn").addEventListener("click", () => {
  let flag = validateData();
  if (flag) {
    out.innerHTML = "Logged IN";
  } else {
    out.innerHTML = "Data is Invalid";
  }
  setTimeout(() => {
    out.innerHTML = "";
  }, 2000);
});

function validateData() {
  let flag1 = validateUname();
  let flag2 = validatePass();
  if (!flag1) {
    outUnm.innerHTML = `Username must be alphabets only (6 to 10) characters`;
    outUnm.style.color = `red`;
  } else outUnm.innerHTML = "";

  if (!flag2) {
    outPass.innerHTML = `Password must be alphanumeric with # and between 8 to 20 characters`;
    outPass.style.color = `red`;
  } else outPass.innerHTML = "";

  return flag1 && flag2;
}

function validateUname() {
  const unm = username.value;
  return /^[a-zA-Z]{6,10}$/.test(unm);
}

function validatePass() {
  const pass = password.value;
  return /[0-9a-zA-Z#]{8,20}/.test(pass);
}
