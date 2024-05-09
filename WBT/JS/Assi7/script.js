function minNumber(x){
    let min = x[0];
    x.forEach(e => {
        if(min > e) min = e;
    });
    return min;
}
console.log(minNumber([1,5,3,-7,8,3,0,2,4]));