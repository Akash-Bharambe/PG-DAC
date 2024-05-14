const orderid = document.getElementById("orderid");
const name1 = document.getElementById("name");
const billingDate = document.getElementById("billing-date");
const shippingDate = document.getElementById("shipping-date");
const total = document.getElementById("total");
const btn = document.getElementById("btn");
const out = document.getElementById("out");

billingDate.addEventListener("input", () => {
  shippingDate.min = billingDate.value;
  shippingDate.disabled = false;
});

btn.addEventListener("click", () => {
  if (validateData()) {
    out.innerHTML = `Order ID: ${orderid.value}<br>
                     Customer Name: ${name1.value}<br>
                     Billing Date: ${billingDate.value}<br>
                     Shipping Date: ${shippingDate.value}<br>
                     Order Total: ${Number(total.value).toLocaleString(
                       "hi-IN",
                       { style: "currency", currency: "INR" }
                     )}`;
  }
});

function validateData() {
  const flag1 = validateName();
  if (!flag1)
    document.getElementById(
      "err"
    ).innerHTML = `Name should be more than 5 characters`;
  else document.getElementById("err").innerHTML = ``;

  const flag2 = validateDates();
  return flag1 && flag2;
}

function validateName() {
  return /^[a-zA-Z]{5,20}$/.test(name1.value);
}

function validateDates() {
  return (
    new Date(billingDate.value).getTime() <
    new Date(shippingDate.value).getTime()
  );
}
