let pug = require('pug');
let compiledFunction = pug.compileFile('template.pug');
console.log(compiledFunction({name:'Timothy'}));