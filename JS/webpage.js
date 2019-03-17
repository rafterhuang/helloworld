var web = require("http"), fs = require("fs");

fs.readFile('berlin.jpg', (err,data) => {
    if (err) throw err;
    web.createServer((req, res) => {
        res.writeHead(200, {'content-type':'berlin/jpeg'});
        res.end(data);
        //res.write("sending back image");
        //res.end();
    }).listen(2000);
    console.log("The server is listening on port 2000...");
})

// web.createServer((req, res) => {
//     res.write("This is a new world for Elliot.");
//     res.end();
// }).listen(2000);

//console.log("The server is listening on port 2000...");