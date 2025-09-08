function displayCityOnAlert(element){
    alert(element.innerText);
}

function removeCokie(element){
    let parent = element.closest('.cockie-div');
    parent.remove();
}

function changeTempreture(){
    let temp = document.querySelector(".combo-box");
    let arr = document.querySelectorAll(".temperature-number");
    if(temp.value === "celsius"){
        for(let i = 0; i < arr.length; i++){
            let num = parseInt(arr[i].innerText);
            let newNum = (num - 32)/1.8;
            arr[i].innerText = `${Math.ceil(newNum)}°`;
        }
    }
    else{
        for(let i = 0; i < arr.length; i++){
            let num = parseInt(arr[i].innerText);
            let newNum = (num * 1.8) + 32;
            arr[i].innerText = `${Math.floor(newNum)}°`;
        }
    }
}