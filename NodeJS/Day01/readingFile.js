let fs = require('fs');

let data = fs.readFileSync("SimpleFile.txt");

let content = data.toString();

console.log(content);
