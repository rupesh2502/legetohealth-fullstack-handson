let fs = require('fs');
let text = "This is async text\n";

fs.appendFile('msg.txt',text,function(err){
    if(err){
        console.log(err);
    }
    console.log('Write Completed !!');
});