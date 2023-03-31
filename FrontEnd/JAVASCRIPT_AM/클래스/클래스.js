class Vehicle{
    constructor(maker, model, year, color, speed){
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.color = color;
        this.speed = 0;
    }
    getMaker(){
        return this.maker;
    }
    getModel(){
        return this.model;
    }
    getYear(){
        return this.year;
    }
    getColor(){
        return this.color;
    }
    getSpeed(){
        return this.speed;
    }

    accelerate(amount){
        this.speed += amount;
        console.log(`The ${this.maker} ${this.model} is now going ${this.speed}KM/h`);
    }

    break(amount){
        this.speed = Math.max(0, this.speed - amount);
        console.log(`The ${this.maker} ${this.model} is now going ${this.speed}KM/h`);
    }
    static getNmberOfWheels(){
        return 0;
    }
}

class Car extends Vehicle{
    constructor(maker, model, year, color, numDoors){
        super(maker, model, year, color)
            this.numDoors = numDoors;
    }
    getNumDoors(){
        return this.numDoors;
    }
    static getNumberOfWheels(){
        return 4;
    }
}
class Truck extends Vehicle{
    constructor(maker, model, year, color, towingCapacity){
        super(maker, model, year, color);
        this.towingCapacity = towingCapacity;
    }

    getTowingCapacity(){
        return this.towingCapacity;
    }

    static getNumberOfWheels(){
        return 6;
    }
}

const myCar = new Car("현대자동차", "Sonata", 2021, "실버", 4);
console.log(myCar.getMaker());
console.log(myCar.getModel());
console.log(myCar.getYear());
console.log(myCar.getColor());
console.log(myCar.getSpeed());
console.log(myCar.getNumDoors());
myCar.accelerate(30);
myCar.break(10);
console.log(Car.getNmberOfWheels());

const myTruck = new Truck('Kia', 'Sorento', 2022, 'red', 10000);
console.log(myTruck.getMaker()); // 출력 결과: "Kia"
console.log(myTruck.getModel()); // 출력 결과: "Sorento"
console.log(myTruck.getYear()); // 출력 결과: 2022
console.log(myTruck.getColor()); // 출력 결과: "red"
console.log(myTruck.getSpeed()); // 출력 결과: 0
console.log(myTruck.getTowingCapacity()); // 출력 결과: 10000
myTruck.accelerate(20); // 출력 결과: "The red Kia Sorento is now going 20 km/h."
myTruck.break(5); // 출력 결과: "The red Kia Sorento is now going 15 km/h."
console.log(Truck.getNumberOfWheels()); // 출력 결과: 6


