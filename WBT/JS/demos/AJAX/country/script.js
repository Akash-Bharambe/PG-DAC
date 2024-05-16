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
    console.log(res);
  },
  error: function (err) {
    console.log(err);
  },
});

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
  console.log(`Country: ${selectedCountry}
State: ${selectedState}
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

navigator.geolocation.getCurrentPosition(
  (loc) => {
    console.log(loc.coords.latitude);
    console.log(loc.coords.longitude);
  },
  (err) => {
    console.log(err);
  }
);
