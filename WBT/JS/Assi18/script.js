const string1 = document.getElementById("string");
const subString = document.getElementById("sub-string");
const replaceString = document.getElementById("replace-string");
const operations = document.getElementsByName("operation");
const out = document.getElementById("out");

document.getElementById("btn").addEventListener("click", () => {
  console.log(operations);
  let index = -1;
  for (let i = 0; i < operations.length; i++) {
    if (operations[i].checked) {
      index = i;
    }
  }
  console.log(index);
  switch (index) {
    case 0:
      out.innerHTML = `"${subString.value}" found in "${
        string1.value
      }" at index ${string1.value.indexOf(subString.value)}`;
      break;
    case 1:
      out.innerHTML = string1.value.toUpperCase();
      break;
    case 2:
      out.innerHTML = string1.value.toLowerCase();
      break;
    case 3:
      out.innerHTML = string1.value.trim();
      break;
    case 4:
      out.innerHTML = string1.value.concat(subString.value);
      break;
    case 5:
      out.innerHTML = string1.value.replace(
        subString.value,
        replaceString.value
      );
      break;
    default:
      out.innerHTML = `Please Select an operation`;
      break;
  }
});
