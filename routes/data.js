var express = require('express');
var router = express.Router();
const index = require('./index');
const fileU = require('./fileupload')

var matrix = fileU.matrix;
/*

router.post('/data/', function(req, res, next) {



    res.redirect('/results/');
});
*/

/*function calcular() {
    var beta0 = parametrosRegresion()
}

function parametrosRegresion(matrix,column1,column2) {
    var columnax = ;
    var columnay;
}


var parametrosRegresion = function() {
    return function(tipoPrueba, matrix) {
        var columnax;
        var columnay;
        var mensaje;
        switch (tipoPrueba) {
            case 1:
                mensaje = "between estimated proxy size and actual added and modified size";
                console.log(mensaje);
                columnax  = 1;
                columnay = 2;
                break;
            case 2:
                mensaje = "between estimated proxy size and actual development time";
                console.log(mensaje);
                columnax  = 1;
                columnay = 4;
                break;
            case 3:
                mensaje = "between plan added and modified size and actual added and modified size";
                console.log(mensaje);
                columnax  = 2;
                columnay = 3;
                break;
            case 4:
                mensaje = "between plan added and modified size and actual development time in";
                console.log(mensaje);
                columnax  = 2;
                columnay = 4;
                break;
            default:
                console.log ("Error, solo hay 4 tipos de pruebas");
        }

        var contadorFilas = 0;
        var sumatoriaxy = 0;
        var sumatoriaxdos = 0;
        var promediox = 0;
        var promedioy = 0;
        var sumatoriaydos = 0;
        var sumatoriax = 0;
        var sumatoriay = 0;

        while (contadorFilas < matrix.length) {
            var fila  = matrix[contadorFilas];
            console.log(fila.toString())
            console.log(matrix.toString())
            console.log(matrix[contadorFilas].toString())

            sumatoriax = sumatoriax + fila[columnax];
            sumatoriay = sumatoriay + fila[columnay];
            sumatoriaxy = sumatoriaxy + (fila[columnax]  * fila[columnay]);
            sumatoriaxdos = sumatoriaxdos + (fila[columnax] * fila[columnax]);
            sumatoriaydos = sumatoriaydos + (fila[columnay] * fila[columnay]);
            promediox = promediox + fila[columnax];
            promedioy = promedioy + fila[columnay];
            contadorFilas++;
        }
        promediox = promediox/contadorFilas;
        promedioy = promedioy/contadorFilas;
        var beta1 = (sumatoriaxy - (contadorFilas * promediox * promedioy)) / (sumatoriaxdos - (contadorFilas *  promediox * promediox));
        var beta2 = promedioy - (beta1 * promediox);
        var betas =  [beta1,beta2];
        return betas;

        var yk = beta1 + (beta2 * 386);
        var r = ((n*sumatoriaxy)-(xsum*ysum))/(Math.sqrt((n*xsum2-Math.pow(xsum,2))(n*ysum2-Math.pow(ysum,2))));

    }
}();
var miTriangulo = new calcularRegresion(1,matrix);*/



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


    res.render('data', { items: matrix });
    console.log(matrix);
    //res.send(`data`);
    //res.sendFile('./data.jade')
});

module.exports = router;
