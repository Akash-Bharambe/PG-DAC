$("#submit").on("click", () => {
  if ($("input").val() === "") {
    alert("Please Fill All Fields");
    return;
  }
  if ($("#email").val() !== $("#cemail").val()) {
    $("#email").val("");
    $("#cemail").val("");
    alert("Email Does Not Match");
    return;
  }
  if (
    !$("#email")
      .val()
      .match(/^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$/)
  ) {
    $("#email").val("");
    $("#cemail").val("");
    alert("Invalid Email");
    return;
  }
  if($("#title").val() === 'Title'){
    alert("Please Select Title");
    return
  }
console.log(getName());
});

$("#display-cost").on("click", () => {
  let level = $('input[type="radio"]:checked').val();
  let seminar = $("#seminars").val();
  $("#Cost").val(calculateCost(seminar, level));
});

const costMap = {
  SOA: {
    Introductory: 2500,
    Intermediate: 3500,
    Advanced: 6000,
  },
  "Design Patterns": {
    Introductory: 4000,
    Intermediate: 5500,
    Advanced: 8000,
  },
  "Business Intelligence": {
    Introductory: 2500,
    Intermediate: 3500,
    Advanced: 6000,
  },
};
function calculateCost(seminar, level) {
  return costMap[seminar][level];
}

function getName() {

  return $("#title").val() +" "+ $("#fname").val() +" " + $("#lname").val();
}
$("#display").on("click",()=>{
    let name = getName();
    let email = $("#email").val();
    let seminar = $("#seminars").val();
    let level = $("input[type='radio']:checked").val();
    let cost = $("#Cost").val();
    
    $("#out").html(
        `Name: ${name} <br>
         Email: ${email} <br>
         Seminar: ${seminar}<br>
         Level: ${level}<br>
         Cost: ${cost}`
    )
})