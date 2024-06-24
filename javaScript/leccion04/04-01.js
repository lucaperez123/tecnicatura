var nombre = "Luca";
nombre = "Carlos";
console.log(nombre);

function saludar(){
    var nombre3 = "Charly";
    console.log (nombre);
}

//console.log(nombre3) // aqui no lee el dato en la funcion

if(true){
    var edad = 34;
    console.log(edad);

}
console.log (edad);

function saludar2(){
    let nombre2 = "Noelia";
    console.log(nombre2);
}
console.log (nombre2);

if(true){
    let edad2 = 33;
    console.log (edad2)
}

console.log (edad2);

// const se utiliza para valores constantes que no pueden ser reasignadas

const fechaNacimiento = 2006;
console.log (fechaNacimiento);

//fechaNacimiento = 2003;
//console.log(fechaNacimiento); // solo se ejecuta en la consola anterior

//evitar repetir tu codigo
//dry dont' repat yourself

//let days =['Lunes','Martes','Miercoles' ,'Jueves', 'Vienres', 'Sabado', 'Domingo'];

let days = 1;
switch(days){
    case 1:
        console.log("Hoy es lunes" );
        break;
    case 2:
        console.log("Hoy es martes" );
        break;
    case 3:
        console.log("Hoy es miercoles" );
        break;
    case 4:
        console.log("Hoy es jueves" );
        break;
    case 5:
        console.log("Hoy es viernes" );
        break;
    case 6:
        console.log("Hoy es sabado");
        break;
    case 7:
        console.log("Hoy es domingo" );
        break;
    default:
        break;
}



// esta es la opcion mejorada
let days2 =['Lunes','Martes','Miercoles' ,'Jueves', 'Vienres', 'Sabado', 'Domingo'];
function getday(n){
    if(n<1 || n >7){
        throw new error ('out of range');
    }
    return days2[n-1];
}

console.log(getday(5));


// hacer un ejercicio similar al que esta hecho, pero ahora con los
//meses del año , debes hacerlo con la estructura switch y luego
//con la funcion en la opcion mejorada

let month = 11;
switch(month){
    case 1:
        console.log("Es enero");
        break;
    case 2:
        console.log("Es febrero");
        break;
    case 3:
        console.log("Es marzo");
        break;
    case 4 :
        console.log("Es abril");
        break;
    case 5:
        console.log("Es mayo");
        break;
    case 6:
        console.log("Es junio");
        break;
    case 7:
        console.log("Es julio");
        break;
    case 8:
        console.log("Es agosto");
        break;
    case 9:
        console.log("Es septiembre");
        break;
    case 10:
        console.log("Es octubre");
        break;
    case 11:
        console.log("Es noviembre");
        break;
    case 12:
        console.log("Es diciembre");
        break;
    default:
        console.log ("Error en el ingreso del mes del año");
        break;
}

// esta es la opcion mejorada

let Month2 = ['Enero','Febrero','Marzo' ,'Abril', 'Mayo', 'Junio', 'Julio' , 'Agosto','Septiembre','Octubre', 'Noviembre','Diciembre'];
function getMonth(n){
    if(n < 1 || n > 12){
        throw new error("out of range");
    }
    return Month2[n-1];
}

console.log(getMonth(1));