let app = require('express')();
let port = 9090;
app.listen(port,()=>console.log(`Node Server is running on port : ${port}`));

const { response } = require('express');
// Importing module
var mysql = require('mysql')

var connection = mysql.createConnection({
	host:"localhost",
	user:"root",
	password:"root",
	database : "legato_db"
});


app.get("/employee",(request,response)=>{
    console.log('Entering into GET');
    connection.connect((err)=>{
        let sql = "SELECT * FROM EMPLOYEE";
        if (err) throw err;
        console.log("Connected!");
        connection.query(sql,(err, result)=> {
            if (err) throw err;
            console.log("Result: " + result);
            response.json(result);
        });
    })
});
   


