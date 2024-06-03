package leccion3;
import java.util.Scanner;

public class leccion3 {
    public static void main(String args[]) {
        // var - interferteferencia de tipos en java
        /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "seguimos estudiando ";
        System.out.println("miVarialeEntera2 = " + miVariableEntera2);
        System.out.println("miVarialeCadena2 = " + miVariableCadena2);
        // soutv + tab
        // para ejecutar shift + f6

        // Reglas para definir una variable en java

        var usuario = "Luca";
        var titulo = "Tecnico";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));// prioridad de parentesis (realiza la suma)

        // Ejercicio : Caracteres Especiales con java

        var nombre = "Luca";
        System.out.println("\nNueva linea: \n" + nombre); // diagonal inversa y letra n
        System.out.println("Tabulador: \t" + nombre); // tabulador un espacio para centrar
        System.out.println("\t\t.:Menu:.");
        System.out.println("Retroceso: \b\b"+nombre); // caracter de retroceso
        System.out.println("Comillas simples: \'"+nombre+"\'");
        System.out.println("Comillas Dobles: \""+nombre+"\"");

        // clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre");
        var usuario2 = entrada.nextLine();// espera para que el usuario digite un valor
        System.out.println("usuario2 = "+ usuario2);
        System.out.println("Escriba ell titulo");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " + titulo2+" " + usuario2);*/

        /*byte numEnteroByte = 127;
        System.out.println("numEnteroByte =" + numEnteroByte);
        System.out.println("Valor minimo del byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte:" + Byte.MAX_VALUE);

        short numEnteroShort = 32767;
        System.out.println("numEnteroShort =" + numEnteroShort);
        System.out.println("Valor minimo del byte:" + Short.MIN_VALUE); // Clases inician con letra mayuscula
        System.out.println("Valor maximo del byte:" + Short.MAX_VALUE);

        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del int:"+ Integer.MIN_VALUE);
        System.out.println("Valor maximo del int:" + Integer.MAX_VALUE);

        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del long :" + Long.MIN_VALUE);
        System.out.println("Valor maximo del long:" + Long.MAX_VALUE);*/

        /* 
        float numFloat = (float)3.4028235E38;
        System.out.println("numFloat = "+ numFloat);
        System.out.println("El valor minimo de float:" + Float.MIN_VALUE);
        System.out.println("El valor maximo de float:" + Float.MAX_VALUE);

        double numDouble= 10;
        System.out.println("numDouble = "+ numDouble);
        System.out.println("El valor minimo de double:" + Double.MIN_VALUE);
        System.out.println("El valor maximo de double:" + Double.MAX_VALUE);
        */

        //Interferencia de tipos var y tipos primitivos
        /*var numEntero = 20; // Las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = " + numEntero );
        var numFloat = 10.0F; // automaticamente con el punto  se transforma en tipo double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);*/

        //TIPOS PRIMITIVOS CHAR
        /*char miVariableChar = 'a';
        System.out.println("miVariable = " + miVariableChar);

        char varCaracter = '\u0024'; //indicamos en java la asignacion con el codigo unicode
        System.out.println("varCaracter= "+ varCaracter);
        char varCaracterDecimal = 36; // valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal ="+ varCaracterDecimal);
        char varCaracterSimbolo = '$';// UN CARACTER ESPECIAL , PODEMOS COPIAR Y PEGAR DESDE UNICODE
        System.out.println("varCaracterSimbolo"+ varCaracterSimbolo);

        char varCaracter1 = '\u0024'; //indicamos en java la asignacion con el codigo unicode
        System.out.println("varCaracter= "+ varCaracter1);
        var varCaracterDecimal1 = (char)36; // valor ENTERO Y LE ASIGNA UN TIPO INT
        System.out.println("varCaracterDecimal ="+ varCaracterDecimal1);
        char varCaracterSimbolo1 = '$';// UN CARACTER ESPECIAL , PODEMOS COPIAR Y PEGAR DESDE UNICODE
        System.out.println("varCaracterSimbolo"+ varCaracterSimbolo1);

        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'l';
        System.out.println("caracterChar = "+ caracterChar);*/

        /*boolean varBool = true;
        System.out.println("varBool = "+ varBool);

        if (varBool){
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }

        //Algoritmo es mayor de edad ?
        var edad = 30; // Literal tener presente la inferencia de tipos
        //var adulto = edad >= 18; // esta es una expresion booleana

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
    }*/

    //Conversion de tipos primitivos

    //var edad = Integer.parseInt("20");
    //System.out.println("edad = " + (edad + 1));
    //var valorPI  = Double.parseDouble("3.1416");
    //System.out.println("valorPI = " + valorPI);

    //Pedir un valor
    var entrada = new Scanner(System.in);
    //System.out.println("Digite su edad");
    //edad =  Integer.parseInt( entrada.nextLine());
    //System.out.println("Entrada = " + entrada); // Revisar

    //conversion de tipos primitivos

    /* 
    var edadTexto = String.valueOf(10);
    System.out.println("edadTexto = " + edadTexto);

    var fraseChar = "Programadores".charAt(12); // mostrar letra dependiendo numero de posicion
    System.out.println("fraseChar = " + fraseChar);

    System.out.println("Digite un caracter");
    fraseChar = entrada.nextLine().charAt(0);
    System.out.println("fraseChar = " + fraseChar);

    int num1 = 5 ,num2 = 4;
    var solucion = num1 + num2;
    System.out.println("solucion de la suma = " + solucion);

    solucion = num1 - num2;
    System.out.println("solucion de la resta = " + solucion);

    solucion = num1 * num2;
    System.out.println("Solucion de la multiplicacion " + solucion);

    solucion = num1 / num2;
    System.out.println("Solucion de la division " + solucion);

    var solucion2 = 3.4 / num2;
    System.out.println("solucion2 resultado de la division =" + solucion2);

    solucion = num1 % num2 ; // guarda el residuo entero de la division
    System.out.println("solucion = "+ solucion );// 5/4

    if (num1 % 2 == 0)
        System.out.println("Es un numero par");
    else
        System.out.println("Es un numero impar");*/
    
    
    /* 
    int varNum1 = 1 , varNum2 = 4;
    int varNum3 = varNum1 + 6 - varNum2; // una operacion
    System.out.println("varNUm3 = "  + varNum3);

    varNum1 += 1; // varNum1 = varNum1 + 1;
    System.out.println("varNum1 =" + varNum1);

    varNum2 -= 2;
    System.out.println("varNum2 = " + varNum2);

    varNum1 *= 5;
    System.out.println("varNum1 = " + varNum1);

    varNum3 /= 4;
    System.out.println("varNum3 =" + varNum3);

    varNum1 %= 6;
    System.out.println("varNum1 = " + varNum1);

    int varNum1 = 1 , varNum2 = 4;
    int varNum3 = varNum1 + 6 - varNum2; // una operacion
    System.out.println("varNUm3 = "  + varNum3);

    varNum1 += 1; // varNum1 = varNum1 + 1;
    System.out.println("varNum1 =" + varNum1);

    varNum2 -= 2;
    System.out.println("varNum2 = " + varNum2);

    varNum1 *= 5;
    System.out.println("varNum1 = " + varNum1);

    varNum3 /= 4;
    System.out.println("varNum3 =" + varNum3);

    varNum1 %= 6;
    System.out.println("varNum1 = " + varNum1);*/

    /*
    //operadores unarios  cambio de signo
    var varA = 7;
    var varB = -varA;
    System.out.println("varA = " + varA);
    System.out.println("varB = " + varB); // EL RESULTADO SERA UN NUMERO NEGATIVO

    //operador de negacion
    var varC = true; // Esta literal por default en java es de tipo boolean
    var varD = !varC; // Aqui esta invirtiendo el valor
    System.out.println("varC = "+ varC);
    System.out.println("varD = " + varD);


    //opereadores unarios de incremento : preincremento
    var varE = 9; //  se va a modificar su valor
    var varF = ++varE; // simbolo antes de la variable
    // primero se incrementa la variable y despues se usa
    System.out.println("varE = " + varE);// se incrementa la unidad
    System.out.println("varF = " + varF);// va a sumar uno

    //posincremento (el ismbolo va despues de la variable)
    var varG = 3;
    var varH = varG++; // PRIMERO EL VALOR DE LA VARIABLE , LUEGO EL INCREMENTO
    System.out.println("varG = " + varG); // el incremento nomas afecta a la variable g 
    System.out.println("varH = " + varH);

    // operadores unarios de decremento
    var varI = 4;
    var varJ = --varI;
    System.out.println("varI = " + varI); // la variable ya esta con decremento
    System.out.println("varJ = " + varJ);

    //postdecremento
    var varK = 8;
    var varL = varK--; // primero el valor de la variable , luego queda el decremento
    System.out.println("varK = " + varK); // aqui va a decrementar en 1
    System.out.println("varL = " + varL); */

    //operadores de igualdad y relacionales
    var aNum =6;
    var bNum = 4;
    var cNum = (aNum == bNum);
    System.out.println("cNum = " + cNum);

    var dNum = aNum != bNum;
    System.out.println("dNum = " + dNum);

    var cadenaA = "Hello";
    var cadenaB = "Bye bye";
    var cVar = cadenaA == cadenaB ;
    System.out.println("cVar = " + cVar);

    var fVar = cadenaA.equals(cadenaB);
    System.out.println("fVar = " + fVar);

    }

}
