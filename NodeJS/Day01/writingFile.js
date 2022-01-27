let fs = require('fs');

let text = "This is simple text\n";

fs.writeFileSync('msg.txt' , text , {flag : 'a+'});

console.log("Done !!");