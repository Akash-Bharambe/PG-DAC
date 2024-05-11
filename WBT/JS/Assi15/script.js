let arr = ["akash", "jayesh", "pratik", "sakshi", "reshma"];
document.write(arr+'<br>');

arr.forEach((e) => {
    let e1 = e.split("").reverse().join("");
    arr.splice(arr.indexOf(e), 1, e1);
});
arr.sort((a, b) => {
    return a.localeCompare(b);
});
document.write(arr+'<br>');

