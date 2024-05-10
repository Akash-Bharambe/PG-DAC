function getMyLocation() {
  const out = document.getElementById("out");

  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(
      (pos) => {
        out.innerHTML = ` Longitude: ${pos.coords.longitude}, Latitude: ${pos.coords.latitude}`;
        store1(pos);
      },
      (err) => {
        out.innerHTML = err;
      }
    );
  }
}

function store1(pos) {
  if (typeof Storage !== undefined) {
    if (localStorage.loc !== undefined) {
      localStorage.loc = JSON.stringify({
        longitude: pos.coords.longitude,
        latitude: pos.coords.latitude,
      });
    } else {
    }
  }
}

function getOBJ() {
  let obj = JSON.parse(localStorage.loc);
  const out2 = document.getElementById("out2");
  out2.innerHTML = obj.longitude;
}

function deleteOBJ() {
  localStorage.removeItem("loc");
}
