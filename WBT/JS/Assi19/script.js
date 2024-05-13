const num = document.getElementById("num");
const out = document.getElementById("out");

num.addEventListener("input", () => {
    let numb = Number(num.value);
    if (numb<1000 && numb >0) {
        let sum = 0;
        while (numb > 0) {
            sum += numb%10
            numb = parseInt(numb/10)
        }
        out.innerHTML = `Sum of Digits: ${sum}`
    }else if(numb === 0){
        out.innerHTML = ``
    } else {
        out.innerHTML = `Entered Number is out of Range, Must be Between 0 to 1000`
    }
});