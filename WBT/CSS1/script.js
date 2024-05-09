
function togglePass() {
    const passBtn = document.getElementById("pass");
    passBtn.type = passBtn.type === `password`? `text`: `password`;
}