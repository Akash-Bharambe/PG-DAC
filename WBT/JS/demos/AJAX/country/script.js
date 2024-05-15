$(window).on("load", function () {
    var headers = new Headers();
headers.append("X-CSCAPI-KEY", "API_KEY");
  $.ajax({
    url: "https://api.countrystatecity.in/v1/countries",
    type: "GET",
    async: true,
    headers: headers,
    redirect: 'follow',
    success: function (result) {console.log(result);},
    error: function (err) {console.log(err);},
  });
});

