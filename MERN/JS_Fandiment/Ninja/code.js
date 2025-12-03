class Ninja{
    constructor(name, health, speed = 3, strength = 3){
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.strength = strength;
    }

    sayName(){
        console.log(this.name);
    }

    showState(){
        console.log(this.name, this.health, this.speed, this.strength);
    }

    drinkSake(){
        this.health += 10;
    }
}


const ninja = new Ninja("naeem", 10);
ninja.sayName();
ninja.showState();