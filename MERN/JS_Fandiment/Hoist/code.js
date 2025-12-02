console.log(hello); // print undifine
var hello ='world';



var needle ='haystack';
test(); // print magnet
function  test(){
var needle ='magnet'; 
console.log(needle);
}


var brendan ='super cool'; 
function print(){
    brendan = 'only okay';
    console.log(brendan);
} 
console.log(brendan); // print super cool


var food ='chicken';
console.log (food); // print chicken
eat(); // print half-checken
function eat(){
food ='half-chicken'; 
console.log(food); 
var food ='gone'; 
}


// mean(); // runtime error
// console.log(food);
// var mean=function(){
//     food ="chicken"; 
//     console.log(food); 
//     var food ="fish";
//     console.log(food);
// } 
// console.log(food);


console.log(genre);
var genre ="disco";
rewind();// rook, r&b
function rewind(){
    genre ="rock"; 
    console.log(genre); 
    var genre ="r&b";
    console.log(genre);
}
console.log(genre); // disco



dojo ="san jose";
console.log(dojo); // san jois 
learn(); // seattle, burbank
function learn(){
    dojo ="seattle";
    console.log(dojo);
    var dojo ="burbank";
    console.log(dojo);
} 
console.log(dojo); // san jose


console.log(makeDojo("Chicago",65)); // {nsme: "Chicago", students: 65, hiring: true}
console.log(makeDojo("Berkeley",0)); // runtime error
function makeDojo(name,students){ 
    const dojo ={}; 
    dojo.name= name; 
    dojo.students= students; 
    if(dojo.students>50){ 
        dojo.hiring=true; 
    } 
    else if(dojo.students<=0){ 
        dojo = "closed for now"; 
    } 
    return dojo; 
}