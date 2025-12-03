import { Ninja } from "./ninja.js"

class Sensei extends Ninja{
    constructor(name, helth, speed = 3, strength = 3, wisdom=10){
        super(name, helth, speed, strength);
        this.wisdom = wisdom
    }

    speakWisdorm(){
        super.drinkSake();
        console.log("What one programmer can do in one month, two programmers can do in two months.")
    }

    showState(){
        console.log(this.name);
        super.showState();
    }
}

const sensei = new Sensei("nseem dojo", "naeem", 10);

sensei.speakWisdorm();

sensei.showState();


