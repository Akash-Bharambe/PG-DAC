const amount = document.getElementById("amount");
const rate = document.getElementById("rate");
const time = document.getElementById("time");
const payment = document.getElementById("payment");
const total = document.getElementById("total");
const interest = document.getElementById("interest");

document.getElementById("compute").addEventListener("click", () => {
  if (Number(amount.value) < 1500000) {
    if (Number(time.value) > 7 && Number(time.value)) {
      const interestAmount =
        (Number(amount.value) * Number(rate.value) * Number(time.value)) / 100;
      const totalAmount = interestAmount + Number(amount.value);
      payment.value = totalAmount / (Number(time.value) * 12);
      total.value = totalAmount;
      interest.value = interestAmount;
    } else {
      document.getElementById(
        "yrs"
      ).innerHTML += `<td>Repayment period should be between 7 to 15</td>`;
      document.getElementById("yrs").style.color = "red";
    }
  } else {
    document.getElementById(
      "amt"
    ).innerHTML += `<td>Loan ammount must be less than 15 lakhs</td>`;
    document.getElementById("amt").style.color = "red";
  }
});
