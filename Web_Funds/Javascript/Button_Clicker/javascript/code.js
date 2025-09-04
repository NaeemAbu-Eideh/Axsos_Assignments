function loginLogout(){
    var button = document.querySelector("#login-button");
    if(button.innerText == "Login"){
        button.innerText = "Logout";
    }
    else{
        button.innerText = "Login";
    }
}

function hide(){
    var button = document.querySelector("#addDefinition");
    button.remove();
}

function printAlert(){
    alert("Ninja was liked");
}