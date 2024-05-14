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

document.getElementById("btn").addEventListener("click", () => {
  document.getElementById("out").innerHTML = `You Entered: <br>
    Name: ${name1.value}<br>
    BirthDate: ${(bmonth.options[bmonth.selectedIndex].value).slice(0, 3)}/${bdate.options[bdate.selectedIndex].value}/${year.options[year.selectedIndex].value}<br>
    Email Address: ${email.value}<br>
    Gender: ${getData(gender)}<br>
    Lucky Number: ${luckyNo.value}<br>
    Favourite Food: ${getData(favFood)}`;
});

// document.getElementById("btn").addEventListener("click", () => {
//     const selectedGender = document.querySelector('input[name="gender"]:checked');
//     const selectedFavFoods = document.querySelectorAll('input[name="fav-food"]:checked');
    
//     document.getElementById("out").innerHTML = `You Entered: <br>
//       Name: ${name1.value}<br>
//       BirthDate: ${(bmonth.options[bmonth.selectedIndex].value).slice(0, 3)}/${bdate.options[bdate.selectedIndex].value}/${year.options[year.selectedIndex].value}<br>
//       Email Address: ${email.value}<br>
//       Gender: ${selectedGender ? selectedGender.value : ''}<br>
//       Lucky Number: ${luckyNo.value}<br>
//       Favourite Food: ${getData(selectedFavFoods)}`;
//   });
  

function getData(arr) {
    let str = "";
    for (let v of arr) {
      if (v.type === 'radio' && v.checked) {
        str = v.value;
        return str
      } else if (v.type === 'checkbox' && v.checked) {
        str += v.value + ",";
        return str.slice(0, str.length - 1);
      }
    }
  }
  
