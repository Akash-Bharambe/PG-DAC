function storeNames() {
  const ip = document.getElementById("name").value;

  if (typeof Storage !== undefined) {
    if (sessionStorage.names !== undefined) {
      let storedNames = sessionStorage.getItem("names");
      if (!storedNames.includes(ip)) {
        sessionStorage.names = [storedNames, ip];
        getNames();
      } else console.log("Name already exists");
    } else sessionStorage.setItem("names", [ip]);
  }
}

function getNames() {
  const out = document.getElementById("out");
  if (typeof Storage !== undefined) {
    if (sessionStorage.names !== undefined)
      out.innerHTML = sessionStorage.getItem("names");
    else out.innerHTML = "No names Found";
  }
}
