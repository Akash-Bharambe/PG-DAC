function storeNames() {
  const ip = document.getElementById("name").value;

  if (typeof Storage !== undefined) {
    if (sessionStorage.name !== undefined) {
      let name = [];
      name = sessionStorage.getItem("name");
      const flag = false;
      for (let index = 0; index < name.length; index++) {
        if (name[i] !== ip) {
          flag = true;
        }
      }
    }
    if (falg) {
      let names = [name, ip];
    }
    sessionStorage.setItem("name", [names]);
    getNames();
  } else {
    sessionStorage.setItem("name", [ip]);
  }
}

function getNames() {
  const out = document.getElementById("out");
  if (typeof Storage !== undefined) {
    if (sessionStorage.name !== undefined) {
      let name = sessionStorage.getItem("name");
      out.innerHTML = name;
    } else {
      out.innerHTML = "No names Found";
    }
  }
}
