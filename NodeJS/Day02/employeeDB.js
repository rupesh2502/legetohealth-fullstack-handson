let express = require('express');
let app = express();
let MongoClient = require('mongodb').MongoClient;
let mongoUrl = 'mongodb://localhost:27017/';
let cors = require('cors');
let body = require('body-parser');

app.use(cors({origin : '*'}));

app.use(body.json());
app.use(body.urlencoded({ extended: true }));
let port = 9090;
app.listen(port,()=>console.log(`Node Server is running on port : ${port}`));


app.get('/employee/',(request,response)=>{
    MongoClient.connect(mongoUrl,{useNewUrlParser:true},(err,client)=>{
        if(!err){
            let myDb = client.db('mydb');
            let doc = myDb.collection("employee").find().toArray((err,result)=>{
                if (err) throw err;
                console.log(result);
                response.json(result);
                client.close();
            });   
        }
    });
 
 });

app.get('/employee/:id',(request,response)=>{
   console.log('Entering into get url');
   let id = parseInt(request.params.id);
   console.log(`Id is ${id}`);
   MongoClient.connect(mongoUrl,{useNewUrlParser:true},(err,client)=>{
       console.log(`Getting Connection`);
       console.log(`Error ${err}`);
       if(!err){
           console.log(`Getting Connection`);
           let myDb = client.db('mydb');
           let doc = myDb.collection("employee").find({_id: id});
           console.log(`Getting Connection ${doc}`);
           let x=0;
           doc.forEach((record)=>{
               x++;
               response.json(record);
               console.log(`Record ${record}`);
           },()=>{
               if(x==0){
                   response.status(404).json({error : `Sorry id ${id} is not found`});
               }
               client.close();
           });
       }
   });

});

app.post('/employees',(request,response)=>{
    console.log(`Entering into post method`);
    var _id = request.body._id;
    var name = request.body.name;
    var salary = request.body.salary;

    var data = {
        "_id" : _id,
        "name" : name,
        "salary" : salary
    };
    
    console.log(_id+" "+name+" "+salary);
    console.log(`Entering into post method`+data);
    MongoClient.connect(mongoUrl,{useNewUrlParser:true},(err,client)=>{
        if(!err){
        let myDb = client.db('mydb');
        myDb.collection('employee').insertOne(data,(err,result)=>{
            if(err) throw err;
            response.json(result);
            console.log('!! Records Inserted Successfully !!');
            client.close();
        });
    }});
});