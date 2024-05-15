$(window).on("load", function () {
  $.ajax({
    url: "https://restcountries.com/v3.1/all",
    type: "GET",
    async: true,
    success: function (result) {
      addCountries(result);
    },
    error: function (err) {
      console.log(err);
    },
  });
});
var arr = [];
function addCountries(result) {
  result.sort((a, b) => {
    return a.name.common > b.name.common
      ? 1
      : a.name.common < b.name.common
      ? -1
      : 0;
  });
  for (let country of result) {
    $("#country").html(
      $("#country").html() +
        `<option value="${country.name.common}">${country.name.common}</option>`
    );
  }
  arr = result;
}

$("#country").on("change", () => {
  showFlag("#country", arr);
});

function showFlag(id, result) {
  for (let country of result) {
    if (country.name.common === $(id).val()) {
      $("body").css({
        "background-image": `url("${country.flags.png}")`,
        "background-repeat": `no-repeat`,
        "background-size": "cover",
        "background-attachment": "fixed",
        "background-position": "center center",
      });
      return;
    }
  }
}


// $.ajax({
//   url: "./myfile.json",
//   type: "GET",
//   async : true,
//   success: function (res) {
//       console.log(res);
//   },
//   error:function (err) {
//       console.log(err);
//   }
// })

$.getJSON("myfile.json", function(data) {
  console.log(data);
}).fail(function() {
  console.log("An error has occurred.");
});
