const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split(/\s+/).map(Number);
let a = input[0];
let d = input[1];
let n = input[2];

// code here
console.log(a+(n-1)*d);
