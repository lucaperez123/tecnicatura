//ejercicio 1 : calcular la estacion del año
/*
let mes = 4;
let estacion; // undefined
if (mes === 1 || mes === 2 || mes === 12) {
    estacion = "verano";
}
else if (mes === 3 || mes === 4 || mes === 5) {
    estacion = "otoño";
}
else if (mes === 6 || mes === 7 || mes === 8) {
    estacion = "invierno";
}
else if (mes === 9 || mes === 10 || mes === 11) {
    estacion = "primavera";
}
else {
    estacion = "valor incorrecto";
}
console.log("El valor corresponde a la estacion de :" + estacion);*/

//ejercicio 2 : hora del dia
/* 
de 6 a 11 nos saluda : good mornign
de 12 a 16 nos saluda: good afternoon
de 17 a19 nos saluda : good evening
de 20 a 23 nos saluda : good night
trabajemos con 24 horas
*/

let horaDia = 9;
let mensaje;
if (horaDia >= 6 && horaDia <= 11) {
    mensaje = "Good morning";
}
else if (horaDia >= 12 && horaDia <= 16) {
    mensaje = "Good afternoon";
}
else if (horaDia >= 17 && horaDia <= 19) {
    mensaje = "Good evening";
}
else if (horaDia >= 20 && horaDia <= 23) {
    mensaje = "Good night";
}
else {
    mensaje = "Valor incorrecto";
}
console.log(mensaje);