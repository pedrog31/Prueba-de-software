var express = require('express');
var router = express.Router();



router.post('/calculate/', function(req, res, next) {

    res.send('hi');
});

router.get('/data', function(req, res, next) {
    //res.render('results', { title: 'Express' });
    res.send('hello');
});

module.exports = router;
