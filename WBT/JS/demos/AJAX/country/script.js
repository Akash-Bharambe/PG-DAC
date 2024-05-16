var countriesData = [];
var selectedCountry = "";
var selectedState = "";
var selectedCity = "";

$.ajax({
  url: "./countries+states+cities.json",
  type: "GET",
  async: true,
  success: function (res) {
    countriesData = res;
    addCountries(res);
    getLocation();
    // console.log(res);
  },
  error: function (err) {
    console.log(err);
  },
});

function getLocation() {
  navigator.geolocation.getCurrentPosition(
    (loc) => {
      let lat = loc.coords.latitude;
      let long = loc.coords.longitude;
      $('#coords').html(`latitude: ${lat}, longitude: ${long}`);
      getCity(lat, long);
    },
    (err) => {
      console.log(err);
    }
  );
}

// pk.594e3871c287ba0773821cf02ea575b9

function getCity(lat, lng) {
const AUTH_TOKEN = "pk.594e3871c287ba0773821cf02ea575b9"
  // Paste your LocationIQ token below.
  var url = "https://us1.locationiq.com/v1/reverse.php?key="+AUTH_TOKEN+"&lat=" + lat + "&lon=" + lng + "&format=json";

  $.ajax({
      url: url,
      type: 'GET',
      async: true,
      success: function(data) {
          // var city = data.address.city;
          console.log(data);
          $('#curLoc').html(`${data.address.road !== undefined ? data.address.road +", " : ""}${data.address.neighbourhood !== undefined ? data.address.neighbourhood +", " : ""}${data.address.suburb !== undefined ? data.address.suburb+", " : ""} ${data.address.city || data.address.village}, ${data.address.state}, ${data.address.country}`);
      },
      error: function(error) {
          console.log(error);
      }
  });
}

$("#country").on("change", function () {
  $("#city").html('<option value="select">Select City</option>');
  selectedCountry = $(this).val();

  for (let country of countriesData) {
    if (country.name === selectedCountry) {
      addStates(country.states);
      return;
    }
  }
});

$("#state").on("change", function () {
  selectedState = $(this).val();
  for (let country of countriesData) {
    if (country.name === selectedCountry) {
      for (let state of country.states) {
        if (state.name === selectedState) {
          addCities(state.cities);
          return;
        }
      }
    }
  }
});

$("#city").on("change", function () {
  selectedCity = $(this).val();
  $('#selLoc').html(`Country: ${selectedCountry}<br>
State: ${selectedState}<br>
City: ${selectedCity}`);
});

function addCountries(countries) {
  countries.sort((a, b) => {
    return a.name > b.name ? 1 : a.name < b.name ? -1 : 0;
  });

  for (let country of countries) {
    $("#country").html(
      $("#country").html() +
        `<option value="${country.name}">${country.name}</option>`
    );
  }
}

function addStates(states) {
  console.log(states);
  $("#state").html('<option value="select">Select State</option>');
  states.sort((a, b) => {
    return a.name > b.name ? 1 : a.name < b.name ? -1 : 0;
  });

  for (let state of states) {
    $("#state").html(
      $("#state").html() +
        `<option value="${state.name}">${state.name}</option>`
    );
  }
}

function addCities(cities) {
  console.log(cities);
  $("#city").html('<option value="select">Select City</option>');
  cities.sort((a, b) => {
    return a.name > b.name ? 1 : a.name < b.name ? -1 : 0;
  });

  for (let city of cities) {
    $("#city").html(
      $("#city").html() + `<option value="${city.name}">${city.name}</option>`
    );
  }
}
