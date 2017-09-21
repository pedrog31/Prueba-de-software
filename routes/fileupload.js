var express = require('express');
var fs = require('fs');
var multer = require('multer');
var upload = multer();
var router = express.Router();

/* GET users listing. */
/*router.post('/', function(req, res, next) {







    res.render('index', { title: 'Express' });
});*/


router.post('/', upload.single('datos'), function(req, res, next) {
    var datos = req.file.buffer.toString();
    var matriz = leerArchivo(datos);


    res.send(matriz);
});

function leerArchivo(datos) {
    var lineas = datos.split('\n');
    var matriz = [];
    for(var i = 0; i < lineas.length-1; i++){
        var fila = stringToFloatArray(lineas[i]);
        console.log(fila);
        matriz[i] = fila;
    }

    //TODO: Hacer que se guarden como numeros y no como strings

    return matriz;
}

function stringToFloatArray(linea) {
    var error = false;
    var fila = linea.split(' ');
    for (var i = 0; i < fila.length; i++) {
        fila[i] = parseFloat(fila[i]);
        if(isNaN(fila[i])){
            error = true;
        }
    }

    if (error) {
        errorMalFormato();
    } else{
        return fila;
    }
}

function errorMalFormato() {

}





module.exports = router;
