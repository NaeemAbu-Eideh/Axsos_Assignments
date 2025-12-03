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
            target.resilience += this.value;
        }
        else{
            target.power += this.value;
        }
    }
}



// unit cards

 const redBeltNinja = new Unit("Red Belt Ninja", 3, 3, 4);
 const blackBeltNinja = new Unit("Black Belt Ninja", 4, 5, 4);

 //------------

//------- Effect Cards


const hardAlgorithm = new Effect("Hard Algorithm", 2, "increase target's resilience by 3", "resilience", 3);
const unhandledPromiseRejection = new Effect("Unhandled Promise Rejection", 1, "reduce target's resilience by 2", "resilience", -2);
const pairProgramming = new Effect("Pair Programming", 2, "increase target's power by 2", "power", 2);

//-----------

//------Play out the following scenario

hardAlgorithm.choose(redBeltNinja);
unhandledPromiseRejection.choose(redBeltNinja);
pairProgramming.choose(redBeltNinja);
redBeltNinja.attack(blackBeltNinja);

