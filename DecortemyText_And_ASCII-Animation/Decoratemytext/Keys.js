function foo(x, y) {

    return function (z) {

        return x + y + z;

    };

}

function bar(f) {

    return f(10);

}

var result = bar(foo(5, 5));
 alert(result);