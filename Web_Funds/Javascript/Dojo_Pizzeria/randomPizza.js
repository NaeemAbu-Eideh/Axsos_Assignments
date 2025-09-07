function randomPizza(name, type, cheese, extras){
    let pizza = {}

    let randomName = Math.floor(Math.random() * name.length);
    let randomType = Math.floor(Math.random() * type.length);
    let randomCheese = Math.floor(Math.random() * cheese.length);
    let randomExtras = Math.floor(Math.random() * extras.length);

    pizza.name = name[randomName];
    pizza.type = type[randomType];
    pizza.cheese = cheese[randomCheese];
    pizza.extras = extras[randomExtras]

    return pizza;
}



let pizzaName = ["deep dish", "hand tossed", "italian pizza", "white pizza"];
let type = ["spetial", "marinarella", "traditional", "regular"];
let cheese = [["mozzarella"], ["mozzarella", "feta"], ["feta"], ["mozzarella", "sheder"]];
let extras = [["pepperoni","sausage"], ["mushrooms","olives", "onions"], ["tobmato","basel"], ["white sose"]];

console.log(randomPizza(pizzaName, type, cheese, extras));