const name1 = document.getElementById("name");
const bmonth = document.getElementById("month");
const bdate = document.getElementById("date");
const year = document.getElementById("year");
const email = document.getElementById("email");
const gender = document.getElementsByName("gender");
const luckyNo = document.getElementById("lucky-no");
const favFood = document.getElementsByName("fav-food");

const months = [
  "January",
  "February",
  "March",
  "April",
  "May",
  "June",
  "July",
  "August",
  "September",
  "October",
  "November",
  "December",
];

window.addEventListener("load", () => {
  for (let m of months)
    bmonth.innerHTML += `<option value="${m}">${m}</option>`;

  for (let i = 1; i <= 31; i++)
    bdate.innerHTML += `<option value="${i}">${i}</option>`;

  for (let i = 1950; i <= new Date().getFullYear(); i++)
    year.innerHTML += `<option value="${i}">${i}</option>`;
});

document.getElementById("btn").addEventListener("click", (e) => {
  e.preventDefault();
  if (validateData()) {
    document.getElementById("out").innerHTML = `You Entered: <br>
    Name: ${name1.value}<br>
    BirthDate: ${bmonth.options[bmonth.selectedIndex].value.slice(0, 3)}/${
      bdate.options[bdate.selectedIndex].value
    }/${year.options[year.selectedIndex].value}<br>
    Email Address: ${email.value}<br>
    Gender: ${getData(gender)}<br>
    Lucky Number: ${luckyNo.value}<br>
    Favourite Food: ${getData(favFood)}`;
  }
});

function validateData() {
  let flag = [true, true, true, true, true, true];
  let err = document.getElementsByClassName("err");
  for (let e of err) {
    e.style.color = "red";
    e.innerHTML = "";
  }
  if (name1.value.trim() === "") {
    flag[0] = false;
    document.getElementById("nameerr").innerHTML = `Please Enter Name`;
  }
  if (
    bmonth.selectedIndex === 0 ||
    bdate.selectedIndex === 0 ||
    year.selectedIndex === 0
  ) {
    flag[1] = false;
    document.getElementById("bdateerr").innerHTML = `Please Select Date`;
  }
  if (getData(gender) === "") {
    flag[2] = false;
    document.getElementById("gendererr").innerHTML = `Please Select Gender`;
  }
  if (email.value.trim() === "") {
    flag[3] = false;
    document.getElementById("mailerr").innerHTML = `Please Enter Mail`;
  }
  if (luckyNo.value.trim() === "") {
    flag[4] = false;
    document.getElementById("luckyerr").innerHTML = `Please Enter Lucky Number`;
  }
  if (getData(favFood) === "") {
    flag[5] = false;
    document.getElementById("faverr").innerHTML = `Please Select Fav Food`;
  }

  for (let bool of flag) {
    if (!bool) {
      return false;
    }
  }
  return true;
}

function getData(arr) {
  let str = "";
  for (let v of arr) {
    if (v.type === "radio" && v.checked) {
      str = v.value;
      return str;
    } else if (v.type === "checkbox" && v.checked) {
      str += v.value + ",";
    }
  }
  return str.slice(0, str.length - 1);
}
