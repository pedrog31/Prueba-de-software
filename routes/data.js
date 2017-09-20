var express = require('express');
var router = express.Router();
const matriz = require('./index');


var items = [
    [1, 2, 3, 4, 5],
    [3, 4, 5, 6, 7],
    [5, 6, 7, 8, 9]
];

/*function sum(vect) {
    var count = 0;
    for (var i = 0; i < vect.length; i++) {
        count = count + vect[i];
    }
    return count;
}

function sumpow(vect) {
    var count = 0;
    for (var i = 0; i < vect.length; i++) {
        count = count + Math.pow(vect[i],2);
    }
    return count;
}

function sumxy(vectx,vecty) {
    var count = 0;
    for (var i = 0; i < vectx.length; i++) {
        count = count + vectx[i]*vecty[i];
    }
    return count;
}*/

function correlation(vectx,vecty) {
    var n = vectx.length;
    var xsum=0,ysum=0,xsum2=0,ysum2=0,xysum = 0;

    for (var i = 0; i < vectx.length; i++) {
        xsum = xsum + vectx[i];
        ysum = ysum + vecty[i];
        xsum2 = xsum2 + Math.pow(vectx[i],2);
        ysum2 = ysum2 + Math.pow(vecty[i],2);
        xysum = xysum + vectx[i]*vecty[i];
    }

    var r = ((n*xysum)-(xsum*ysum))/(Math.sqrt((n*xsum2-Math.pow(xsum,2))(n*ysum2-Math.pow(ysum,2))));
    return r;
}




/* GET users listing. */
router.get('/', function(req, res, next) {
    console.log(matriz.matrix);
    res.send('lawea');
});

module.exports = router;
