function validateCheckBoxes() {
  let skill = document.getElementsByName("skill");
  let out = document.getElementById("out1");
  out.innerHTML = "";
  let count = 0;
  skill.forEach((a) => {
    if (a.checked) count++;
  });
  if (count >= 3) return true;
  out.innerHTML = "please select at least 3 skills";
  return false;
}

function validateData() {
  let flag1 = validateCheckBoxes();
  let flag2 = validateRadio();
  let flag3 = validateDropDown();
  return flag1 && flag2 && flag3;
}

function validateRadio() {
  let out = document.getElementById("out2");
  out.innerHTML = "";
  let gender = document.getElementsByName("gender");

  for (let i = 0; i < gender.length; i++) {
    if (gender[i].checked) return true;
  }
  out.innerHTML = "please select Gender";
  return false;
}

function validateDropDown(){
    let out = document.getElementById("out3");
    out.innerHTML = "";
    let branch = document.getElementById('branch').value;
    if(branch === 'select') out.innerHTML = `Please select branch`
    return branch !== 'select'
}