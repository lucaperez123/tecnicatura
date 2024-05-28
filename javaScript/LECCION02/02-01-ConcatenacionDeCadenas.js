var nombre = 'Jose';
var apellido =  'Montes';
var nombreCompleto = nombre +' '+ apellido; // primera concatenacion
console.log(nombreCompleto)
var nombreCompleto2 = 'Luca' + ' ' + "Perez" // segunda concatenacion
console.log (nombreCompleto2)

var juntos = nombre + 219; // lee de izquierda a derecha siguiendo la cadena
console.log(juntos)
juntos = nombre + 78 + 17;
console.log(juntos)
juntos = 78 + 17 + nombre;1
console.log(juntos)

nombre += apellido // tercera concatenacion usando el operador simplificado
console.log(nombre)

//hoy ya no se usa var , se utiliza let y const
let nombre2= "PEDRO";
console.log(nombre2);

const apellido2 = "Leperes";
//apellido2 = "Perez"; //una constante no puede ser modificada
console.log(apellido2);

let x , y // se puede crear varias variables dentro de una misma linea
x = 17 , y = 21;y 
let z = x+ y;
console.log(z)

let _1num = 31;// no utilizar numeros para iniciar el nombre de una variable
let rompiendo = "Rompe"; // no utilizar palabras reservadas para variables

console.log(_1num);
console.log (rompiendo);