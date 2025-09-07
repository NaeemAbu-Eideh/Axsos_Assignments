function pizzaOven(name, type, cheese, extras){
    var pizza = {}
    pizza.name = name;
    pizza.type = type;
    pizza.cheese = cheese;
    pizza.extras = extras
    return pizza;
}

console.log(pizzaOven("deep dish", "traditional", ["mozzarella"], ["pepperoni","sausage"]))
console.log(pizzaOven("hand tossed", "marinarella", ["mozzarella", "feta"], ["mushrooms","olives", "onions"]))
console.log(pizzaOven("italian pizza", "traditional",  ["feta"],  ["tobmato","basel"]));
console.log(pizzaOven("white pizza", "traditional", ["mozzarella","feta"], ["white sose"]));