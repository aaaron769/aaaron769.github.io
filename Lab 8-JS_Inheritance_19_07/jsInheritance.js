
// this is IIFE function
var objectCreators = (function () {
    "use strict";// the strick  mode
    // this is a function which return an object 
    var createBicyclePrototype = function () {
        return {
            speed: 0,
            applyBrake: function (x) {
                this.speed = this.speed - x;

            },
            speedUp: function (x) {
                this.speed = this.speed + x;
            }
        };
    }
    // this object will crate a new object using Object.create()
    var createMountainBikePrototype = function (x) {
        var newObj = Object.create(x);// we are creating object
        newObj.gear = 1; // assigning gear
        newObj.setGear = function (x) {
            this.gear = x;
        };
        return newObj;
    }
    // the start function
    var start = function () {
        var bicycle = createBicyclePrototype();
        console.log(bicycle.speed);
        bicycle.speedUp(5);
        bicycle.applyBrake(2);
        console.log(bicycle.speed);
        var mountainBike = createMountainBikePrototype(bicycle);
        mountainBike.setGear(30);
        console.log(mountainBike.speed);
    }
    start();
    // the biycle1 object
    var biycle1 = Object.create(createBicyclePrototype());
    console.log(biycle1.speed);
    biycle1.speedUp(10);
    biycle1.applyBrake(2);
    console.log(biycle1.speed);
    var mountain1 = Object.create(createMountainBikePrototype(biycle1));
    mountain1.setGear(2);
    console.log(mountain1.gear);
    mountain1.speedUp(5);
    console.log(mountain1.speed);

})();