let app = require("express")();
let bodyparser = require("body-parser");
let port = 9090;

//handle HTTP GET
//to extrace json / text from body of the request
app.use([bodyparser.text(),bodyparser.json()]);

app.get('/employee/:id',(request,response)=>{
    console.log(request.params.id);
    let employee = {id:101,name:"Raj",salary:3663};
    response.json(employee);
});

//handle HTTP POST
// app.post('/employee/:id/:name/:salary',(request,response)=>{
//     let p = request.params;
//     let employee = {id:p.id,name:p.name,salary:p.salary};
//     response.json(employee);
// });
app.post('/employee',(request,response)=>{
    console.log(request.body);
    let content = request.body;
    response.json(content);
});

//handle HTTP PUT
app.put('/',(request,response)=>{
    console.log(request.params.id);
    let employee = {id:101,name:"Raj",salary:3663};
    response.json(employee);
});

//handle HTTP DELETE
app.delete('/',(request,response)=>{
    console.log(request.params.id);
    let employee = {id:101,name:"Raj",salary:3663};
    response.json(employee);
});

app.listen(port,()=>console.log(`Server is listining on port : ${port}`));




