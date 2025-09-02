
var sigma = "";
var sum = 0;

for(let i = 1 ; i <= 100; i++){
    if(i === 100){
        sigma+= i;
    }
    else{
        sigma += i + "+ ";
    }
    sum += i;
}

console.log(sigma + "which total = " + sum);