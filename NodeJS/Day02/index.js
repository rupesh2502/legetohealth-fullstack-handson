//Importing the http module

let http = require('http');
let port = 9090;
let url = require('url');

let Server = http.createServer((request,response)=>{
    if(request.url != '/favicon.ico'){
    let urlObject = url.parse(request.url,true);
    console.log(urlObject.query.username,urlObject.query.age);
    response.writeHead(200,{'content-type': 'text/html'});
    response.write('<h2>Welcome to web application using nodejs</h2>');
    response.end();
    }
});

Server.listen(port,()=>console.log(`Server Started on Port ${port}`));