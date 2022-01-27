let fs = require('fs');

fs.readFile('SimpleFile.txt',(err,data)=>{
    if(err){
        console.log(err);
    }else{
        let content = data.toString();
        console.log(`Data is : ${content}`);
    }
});

console.log("Read Completed !!");