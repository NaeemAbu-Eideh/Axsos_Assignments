var factorial = ""
var fact = 1;

for(let i = 1 ; i <= 12; i++){
    if(i === 12){
        factorial += i;
    }
    else{
        factorial += i + "*";
    }
    fact *= i;
}

console.log(factorial + "which total = " + fact);