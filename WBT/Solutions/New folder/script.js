const accounts = [];
function saveInfo() {
  if ($("#acc-balance").val() < 5000) {
    $("#err").html("Account Balance should be greater than 5000");
    return;
  }

  accounts.push({
    accountId: $("#acc-id").val(),
    accountName: $("#acc-name").val(),
    accountType: $("#acc").val(),
    accountBalance: $("#acc-balance").val(),
    creationDate: $("#creation-date").val(),
  })
  console.log(accounts);
}

function accountInfo() {
    console.log(accounts);
}