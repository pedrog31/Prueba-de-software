var express = require('express');
var router = express.Router();
const index = require('./index');
const fileU = require('./fileupload')

var matrix = fileU.matrix;


var calcularRegresion = function() {
    return function(tipoPrueba, datos) {
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
        var sumatoria = 0;


        while (contadorFilas < datos.length) {
            var fila  = datos[contadorFilas];
            console.log(fila.toString())
            console.log(datos.toString())
            console.log(datos[contadorFilas].toString())

            sumatoriaxy = sumatoriaxy + (fila[columnax]  * fila[columnay]);
            sumatoriax2 = sumatoriaxdos + (fila[columnax] * fila[columnax]);
            promediox = promediox + fila[columnax];
            promedioy = promedioy + fila[columnay];
            contadorFilas++;
        }
        promediox = promediox/contadorFilas;
        promedioy = promedioy/contadorFilas;
        var beta1 = (sumatoriaxy - (contadorFilas * promediox * promedioy)) / (sumatoriaxdos - (contadorFilas *  promediox * promediox));
        var beta2 = promedioy - (beta1 * promediox);
        var yk = beta1 + (beta2 * 386);
    }
}();
var miTriangulo = new calcularRegresion(1,leerArchivo(datos));



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


    //res.render('data', { items: matrix });
    console.log(matrix);
    res.send('lawea');
});

module.exports = router;
