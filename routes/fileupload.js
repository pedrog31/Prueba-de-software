var express = require('express');
var fs = require('fs');
var multer = require('multer');
var upload = multer();
var router = express.Router();

var errorMalFormato = false;

/* GET users listing. */
/*router.post('/', function(req, res, next) {







    res.render('index', { title: 'Express' });
});*/


router.post('/', upload.single('datos'), function(req, res, next) {
    var datos = req.file.buffer.toString();
    var matriz = leerArchivo(datos);

    if(errorMalFormato){
        res.send("El archivo no posee el formato correcto.");
    } else {
        res.send(matriz);
        //TODO: REEMPLAZAR POR UNA VISTA EN LA QUE SE VEA BIEN LA MATRIZ Y EL BOTÓN DE RESULTADOS
    }
});

function leerArchivo(datos) {
    var lineas = datos.split('\n');
    var matriz = [];
    for(var i = 0; i < lineas.length-1; i++){
        var fila = lineas[i].split(' ');
        fila = stringToFloatArray(fila);
        console.log(fila);
        matriz[i] = fila;
    }

    return matriz;
}

function stringToFloatArray(array) {
    for (var i = 0; i < array.length; i++) {
        array[i] = parseFloat(array[i]);
        if(isNaN(array[i])){
            errorMalFormato = true;
        }
    }
    return array;
}

module.exports = router;
