class Card{
    constructor(name, cost){
        this.name = name;
        this.cost = cost;
    }
}

class Unit extends  Card{
    constructor(name, cost, power, resilience) {
        super(name, cost);
        this.resilience = resilience;
        this.power = power;
    }

    attack(unit){
        if(this.power > unit.power){
            unit.power -= (this.power - unit.power);
            if(unit.power === 0){
                console.log("the enemy unit is destroyed");
            }
            else if(unit.power < 0){
               let num = -1 * unit.power;
               console.log("the enemy unit is destroyed, and the enemy lose " + num + " from his life");
            }
        }
        else if(this.power === unit.power){
            this.power = 0;
            unit.power = 0;
            console.log("the enemy unit and your unit is destroyed");
        }
        else{
            this.power -= (unit.power - this.power);
            if(this.power === 0){
                console.log("your unit is destroyed");
            }
            else if(this.power < 0){
                let num = -1 * this.power;
                console.log("your unit is destroyed, and you lose " + num + " from your life");
            }
        }
    }
}


class Effect extends Card{
    constructor(name, cost, text, stat, value) {
        super(name, cost);
        this.text = text;
        this.stat = stat;
        this.value = value;
    }

    choose(target){
        if(this.stat === "resilience"){
            if(this.value > 0){
            target.resilience += this.value;
            }
            else{
                target.resilience -= this.value;
            }
        }
        else{
            if(this.value > 0){
                target.power += this.value;
            }
            else{
                target.power -= this.value;
            }
        }
    }
}



