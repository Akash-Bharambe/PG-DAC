function createtable(arr) {
  let str = `<table border='1' style= 'border-collapse:collapse'><thead><tr>`;
  for (let a of Object.getOwnPropertyNames(arr[0])) {
    let heading = a.slice(0, 1).toUpperCase() + a.slice(1);
    str += `<th>${heading}</th>`;
  }
  str += "</tr></thead><tbody>";

  for (let a of arr) {
    str += "<tr>";
    for (let i in a) {
      str += `<td>${a[i]}</td>`;
    }
    str += "</tr>";
  }
  str += "</tbody></table>";
  return str;
}

module.exports = createtable;
