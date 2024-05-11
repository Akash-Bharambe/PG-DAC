let employee = {
  101: {
    name: "Chinmay",
    age: 22,
    salary: 8000000,
  },
  102: {
    name: "Abhijeet",
    age: 23,
    salary: 500000,
  },
  103: {
    name: "Akash",
    age: 21,
    salary: 7000000,
  },
};

function displayEmployeeDetils() {
  const out = document.getElementById("out");
  out.innerHTML = "";
  let str = `<table border="1">
    <thead>
            <tr>
                <th>Employee ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Salary</th>
            </tr>
        </thead>
    <tbody>`;

  for (const e in employee) {
    str += `<tr>
        <td>${e}</td>
        <td>${employee[e].name}</td>
        <td>${employee[e].age}</td>
        <td>${employee[e].salary}</td></tr> `;
  }
  str += `</tbody>
  </table>`;
  out.innerHTML = str;
}
