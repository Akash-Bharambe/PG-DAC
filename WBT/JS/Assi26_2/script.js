$("#btn").on("click", function() {
  if (validateData()) {
    let trainingPrograms = "";
    $("input[name='program']:checked").each(() => {
      trainingPrograms += $(this).val() + ", ";
    });
    trainingPrograms = trainingPrograms.slice(0, trainingPrograms.length - 2);
    let str = `Name: ${$("#name").val()}<br>
                   Employee Code: ${Number($("#empcode").val())}<br>
                   Department: ${$(
                     "input[name='department']:checked"
                   ).val()}<br>
                   Date of Joining: ${$("#DoJ").val()}<br>
                   Address: ${$("#address").val()}<br>
                   Training Programs Attended: ${trainingPrograms}<br>
                   Training Program need to Attend: ${$("#prgrms").val()}`;
    $("#out").html(str);
  }
});

function validateData() {
  return (
    validateName() &&
    validateEmpCode() &&
    validateDept() &&
    validateDate() &&
    validateAddress() &&
    validateTraining() &&
    validatePrgrms()
  );
}

function validateName() {
  $("#nameerr").html("");
  if (!/^[a-zA-z]{2,10}$/.test($("#name").val().trim())) {
    $("#nameerr").html(
      $("#name").val().length <= 10
        ? `Please Enter Name`
        : `Name cannot be more than 10 characters`
    );
    return false;
  }
  return true;
}
function validateEmpCode() {
  $("#empcodeerr").html("");
  if (!/[0-9]{4}/.test(Number($("#empcode").val()))) {
    $("#empcodeerr").html(`Employee Code must be 4 digit Number`);
    return false;
  }
  return true;
}

function validateDept() {
  $("#depterr").html("");
  if ($("input[name='department']:checked").val() === undefined) {
    $("#depterr").html(`Please select department`);
    return false;
  }
  return true;
}

function validateDate() {
  $("#DoJerr").html("");
  if ($("#DoJ").val() === "") {
    $("#DoJerr").html(`Please select Joining Date`);
    return false;
  }
  return true;
}

function validateAddress() {
  $("#addresserr").html("");
  if ($("#address").val() === "") {
    $("#addresserr").html(`Please Enter Address`);
    return false;
  }
  return true;
}

function validateTraining() {
  $("#trainingerr").html("");
  if ($("input[name='program']:checked").val() === undefined) {
    $("#trainingerr").html(`Please select Training Programs`);
    return false;
  }
  return true;
}

function validatePrgrms() {
  $("#prgrmserr").html("");
  if (!($("#prgrms").val() === "") && $("#prgrms").val() === "select") {
    $("#prgrmserr").html(`Please select Training Program you want to attend`);
    return false;
  }
  return true;
}
