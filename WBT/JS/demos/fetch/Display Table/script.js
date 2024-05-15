function getData() {
  let response = fetch("https://jsonplaceholder.org/users")
    .then((result) => {
      return result.json();
    })
    .catch(() => {
      throw "cannot fetch data";
    });
  response
    .then((response) => {
      document.getElementById("out").innerHTML = displayTable(response);
    })
    .catch((err) => {
      console.log(err);
    });
}

function addHead(arr) {
  let str = "<thead><tr>";
  if (arr instanceof Object && !Array.isArray(arr))
    for (let k of Object.getOwnPropertyNames(arr)) str += `<th>${k}</th>`;
  else for (let k of Object.getOwnPropertyNames(arr[0])) str += `<th>${k}</th>`;
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
  return str
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


// function addHead(arr, str) {
//   if (arr instanceof Object) for (let k in arr) str += `<th>${k}</th>`;
//   else for (let k of Object.getOwnPropertyNames(arr[0])) str += `<th>${k}</th>`;
// }

// function displayTable(arr) {
//   const out = document.getElementById("out");
//   out.innerHTML = "";
//   let str = "<table><thead><tr>";
//   addHead(arr, str);

//   str += "</tr></thead><tbody>";
//   for (let k of arr) {
//     str += `<tr>`;
//     for (let i in k) {
//       if (k[i] instanceof Object) {
//         displayTable(k[i]);
//       } else {
//         str += `<td>${k[i]}</td>`;
//       }
//     }
//     str += `</tr>`;
//   }
//   str += `</tbody></table>`;
//   out.innerHTML = str;
// }
