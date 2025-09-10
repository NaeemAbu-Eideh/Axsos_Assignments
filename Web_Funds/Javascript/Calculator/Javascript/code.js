var dec = {
    "nums": [],
    "operations": [],
    "count": 0,
    "number": ""
};

var number = document.querySelector("#display");


function press(num) {
    if (dec['count'] === 0) {
        if (number.innerText === "0") {
            number.innerText = `${num}`;
            dec['number']+= num;
        }
        else {
            number.innerText += `${num}`;
            dec['number']+= num;
        }
    }
    else {
        number.innerText = `${num}`;
        dec['number']+= num;
        dec['count'] = 0;
    }
}

function setOP(op) {
    let num = Number(dec['number']);
    dec['nums'].push(num);
    dec['number'] = "";
    if (dec['operations'].length === 0) {
        dec['operations'].push(op);
        dec['count'] = 1;
    }
    else {
        dec['operations'][0] = op;
        dec['count'] = 1;
    }
}

function clr() {
    dec['nums'] = [];
    dec['operations'] = [];
    number.innerText = `${0}`;
}

function calculate() {

    let num = Number(dec['number']);
    dec['nums'].push(num);
    dec['number'] = "";

    if (dec['nums'].length === 0) {
        number.innerText = `${0}`;
    }
    else if (dec['nums'].length === 1) {
        console.log('naeem');
        number.innerText = `${dec['nums'][0]}`;
    }
    else {

        var op = dec['operations'][0];
        var num2 = dec['nums'][dec['nums'].length - 1];
        var num1 = dec['nums'][dec['nums'].length - 2];

        if (op === "/") {
            if (num2 === 0) {
                number.innerText = "error(no number devide by 0)";
            }
            else {
                number.innerText = `${num1 / num2}`;
            }
        }
        else if (op === "*") {
            number.innerText = `${num1 * num2}`;
        }

        else if (op === "+") {
            number.innerText = `${num1 + num2}`
        }

        else {
            number.innerText = `${num1 - num2}`
        }
    }

    dec['nums'] = [];
    dec['operations'] = [];
    dec['count'] = 1;
}