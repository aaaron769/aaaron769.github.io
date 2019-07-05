

var objectCreators = (function () {
    "use strict";
    // the functional constructor
    function CreateBicyclePrototype() {

        this.speed = 0;
    }
    // we are adding function to createBicyclePrototype while it is running
    CreateBicyclePrototype.prototype.applyBrake = function (x) {
        this.speed = this.speed - x;

    };
    // we are adding function = speed up to createBicyclePrototype while it is running
    CreateBicyclePrototype.prototype.speedUp = function (x) {
        this.speed = this.speed + x;
    };
    // we are creatin a new object clled mountain bike for, function constructor\
    var createMountainBikePrototype = new CreateBicyclePrototype();
    //  we are adding a special type attribute callex gear belongs for mountain bike only
    createMountainBikePrototype.gear = 1;
    // this is specical type of function belongs only for mountainBike
    createMountainBikePrototype.setGear = function (x) {
        this.gear = x;
    };
            //   ------ end of declaration
    
    var start = function () {
        // we are crateing the new bicle called bycle 
        var bicycle = new createBicyclePrototype();

        console.log(bicycle.speed);// prints the initial speed 0
        bicycle.speedUp(5); // will call the speed up functaion
        bicycle.applyBrake(2);// reduce the speed 
        console.log(bicycle.speed);// will display speed =3 

        // we are creatin a mountain bicycle by the objectCreators.create(createMountainBikePrototype )
        var mountainBike = Object.create(createMountainBikePrototype);
        // we are taking the behaviour of createMountainBikePrototype
        mountainBike.setGear(13);
        console.log(mountainBike.gear);
    }
    // -------------------------------------------- end of start functiion
    start();

})();