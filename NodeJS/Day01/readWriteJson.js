let fs = require('fs');

var data = fs.readFileSync('user.json');
var myObject = JSON.parse(data);

var newObject = [ {"name":"Amit", "age":24}, {"name":"Ashish", "age":25}, {"name":"Rupesh", "age":28}];


myObject.push(newObject);
var newData = JSON.stringify(myObject);

fs.writeFile('user.json', newData, err => {
    // error checking
    if(err) throw err;
    
    console.log("New data added");
});



