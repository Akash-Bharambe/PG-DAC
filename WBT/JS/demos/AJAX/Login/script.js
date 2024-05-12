let API_DATA = [];
var isLoggedIn = false;
const out = document.getElementById("out");
const tableout = document.getElementById("tableout");
const username = document.getElementById("username");
const password = document.getElementById("password");
const loginBtn = document.getElementById("login-btn");
const logoutBtn = document.getElementById("logout-btn");
const loginDiv = document.getElementById("login");
const searchDiv = document.getElementById("search-div");
const searchBox = document.getElementById("search-box");
const searchBy = document.getElementById("search-by");

loginBtn.addEventListener("click", login);
logoutBtn.addEventListener("click", logout);
searchBox.addEventListener("keyup", searchData);
logoutBtn.style.display = "none";
searchDiv.style.display = "none";
(function fetchData() {
  let response = fetch("https://jsonplaceholder.org/users")
    .then((result) => {
      return result.json();
    })
    .catch((err) => {
      console.log("catch1");
      throw err;
    });

  response
    .then((r) => {
      API_DATA = r;
      console.log(r);
    })
    .catch((err) => {
      console.log("catch2");

      console.log(err);
    });
})();

function login() {
  let username1 = username.value;
  let password1 = password.value;
  let name = "";
  API_DATA.forEach((element) => {
    if (
      username1 === element.login.username &&
      password1 === element.login.password
    ) {
      name = element.firstname + " " + element.lastname;
      isLoggedIn = true;
      return;
    }
  });
  if (isLoggedIn) {
    out.innerHTML = " Logged in as " + name;
    tableout.innerHTML = displayTable(API_DATA);
    loginDiv.style.display = "none";
    searchDiv.style.display = "";
    logoutBtn.style.display = "";
  } else {
    out.innerHTML = "Invalid Cerdentials";
  }
  clearBoxes();
}

function searchData() {
  let text = Number(searchBox.value);
  let searchResultArr = API_DATA.filter((user) => {
    user[searchBy] == text;
  });
  displayTable(searchResultArr);
}

function clearBoxes() {
  document.getElementById("username").value = document.getElementById(
    "password"
  ).value = "";
}

function logout() {
  let tableOut = tableout;
  if (isLoggedIn) {
    isLoggedIn = false;
    out.innerHTML = "Successfully Logged out";
    tableOut.innerHTML = "";
    loginDiv.style.display = "";
    logoutBtn.style.display = "none";
    username.focus();
  } else {
    out.innerHTML = "Please login first";
  }
}

function addHead(arr) {
  let str = "<thead><tr>";
  if (Array.isArray(arr)) {
    for (let k of Object.getOwnPropertyNames(arr[0])) {
      str += `<th>${k}</th>`;
    }
  } else {
    for (let k of Object.getOwnPropertyNames(arr)) {
      str += `<th>${k}</th>`;
    }
  }
  str += "</tr></thead>";

  return str;
}

function addBody(arr) {
  let str = "<tbody>";
  for (let k of arr) {
    str += `<tr>`;
    for (let i in k) {
      if (k[i] instanceof Object) {
        str += `<td>${displayTable(k[i])}</td>`;
      } else {
        str += `<td>${k[i]}</td>`;
      }
    }
    str += `</tr>`;
  }
  str += `</tbody>`;
  return str;
}

function displayTable(arr) {
  if (arr instanceof Object && !Array.isArray(arr)) {
    console.log("in if");
    arr = [arr];
  }
  let str = "<table border = '1' >";

  str += addHead(arr);

  str += addBody(arr);
  str += `</table>`;
  return str;
}
