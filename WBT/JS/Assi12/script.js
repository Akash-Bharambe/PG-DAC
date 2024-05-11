let nameArray = [];

function showArray() {
  document.getElementById("out").innerHTML = nameArray;
}
function addName() {
  nameArray.push(document.getElementById("ip").value);
  nameArray.sort((a, b) => {
    if (a.toLowerCase() > b.toLowerCase()) return 1;
    if (a.toLowerCase() < b.toLowerCase()) return -1;
    return 0;
  });
  showArray();
}

document.addEventListener('keypress',(k)=>{
    if (k.key === 'Enter') {
        addName();
        document.getElementById("ip").value = ''
    }
})