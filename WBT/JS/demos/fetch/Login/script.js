var API_DATA = [];
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
const rememberMe = document.getElementById("remember-me");

window.addEventListener("load", main);
loginBtn.addEventListener("click", login);
logoutBtn.addEventListener("click", logout);
searchBox.addEventListener("keyup", searchData);
logoutBtn.style.display = "none";
searchDiv.style.display = "none";

async function fetchData() {
  fetch("https://jsonplaceholder.org/users")
    .then((result) => {
      return result.json();
    })
    .then((r) => {
      API_DATA = r;
      if (Boolean(localStorage.isRemember) === true) {
        login();
        logoutBtn.style.display = "";
        searchDiv.style.display = "";
      } else {
        logoutBtn.style.display = "none";
        searchDiv.style.display = "none";
      }
    })
    .catch((err) => {
      console.log(err);
    });
}

async function store() {
  if (localStorage.isRemember === undefined) {
    localStorage.setItem("isRemember", "");
  }
  if (localStorage.username === undefined) {
    localStorage.setItem("username", "");
  } else {
    if (rememberMe.checked) {
      username.value = localStorage.getItem("username");
    }
  }
  if (localStorage.password === undefined) {
    localStorage.setItem("password", "");
  } else {
    if (rememberMe.checked) {
      password.value = localStorage.getItem("password");
    }
  }
}

async function main() {
  await store();
  await fetchData();
}

function login() {
  let username1 = username.value;
  let password1 = password.value;
  let name = "";
  if (localStorage.isRemember) {
    const foundUser = API_DATA.find(
      (user) => user.login.username === localStorage.username
    );
    console.log(foundUser);
    if (foundUser) {
      username1 = foundUser.login.username;
      password1 = foundUser.login.password;
    }
  }

  API_DATA.forEach((element) => {
    if (
      username1 === element.login.username &&
      password1 === element.login.password
    ) {
      name = element.firstname + " " + element.lastname;
      isLoggedIn = true;
      if (rememberMe.checked) {
        localStorage.isRemember = true;
        localStorage.username = element.login.username;
        localStorage.password = element.login.password;
      }
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
    $('#out').css("color", "red")
    setTimeout(() => {
      out.innerHTML = "";
      $('#out').css("color", "")
    }, 2000);
  }
  clearBoxes();
}

function searchData() {
  tableout.innerHTML = "";
  let text = searchBox.value;
  let searchResultArr = API_DATA.filter((user) => {
    if (searchBy.value === "username")
      return (user.login[searchBy.value] + "")
        .toLowerCase()
        .includes(text.toLowerCase());
    return (user[searchBy.value] + "")
      .toLowerCase()
      .includes(text.toLowerCase());
  });

  tableout.innerHTML = displayTable(searchResultArr);
}

function clearBoxes() {
  username.value = password.value = "";
}

function logout() {
  if (isLoggedIn) {
    isLoggedIn = false;
    out.innerHTML = "Successfully Logged out";
    setTimeout(() => {
      out.innerHTML = "";
    }, 2000);
    tableout.innerHTML = "";
    loginDiv.style.display = "";
    logoutBtn.style.display = "none";
    searchDiv.style.display = "none";
    rememberMe.checked = false;
    localStorage.removeItem("isRemember");
    localStorage.removeItem("username");
    localStorage.removeItem("password");
    username.focus();
  } else {
    out.innerHTML = "Please login first";
  }
}

function addHead(arr) {
  let str = "<thead><tr>";
  if (Array.isArray(arr) && arr != null) {
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
    arr = [arr];
  }
  let str = "<table border = '1' >";

  str += addHead(arr);

  str += addBody(arr);
  str += `</table>`;
  return str;
}
