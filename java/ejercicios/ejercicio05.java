package ejercicios;

import java.util.Scanner;

public class ejercicio05 {
    public static void main(String[] args) {
        
    int notaUno, notaDos, notaTres, resultado;
    Scanner entrada = new Scanner(System.in);

    System.out.println("Escriba la primer nota");
    notaUno = entrada.nextInt();

    System.out.println("Escriba la segunda nota");
    notaDos = entrada.nextInt();

    System.out.println("Escriba la tercer nota");
    notaTres = entrada.nextInt();

    resultado = notaUno + notaDos + notaTres;

    System.out.println("El total de las notas es " + resultado);
    }
    
}
