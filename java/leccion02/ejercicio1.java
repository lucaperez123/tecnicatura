package leccion02;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un mes del año:: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estación desconocida";
        if(mes == 1 || mes == 2 || mes == 3){
            estacion = "Verano";
        }
        else if(mes == 3 || mes == 4 || mes == 5){
            estacion = "otoño";
        }
        else if(mes == 6 || mes == 7 || mes == 8){
            estacion = "invierno";
        }
        else if(mes == 9 || mes == 10 || mes == 11){
            estacion = "primavera";
        }
        System.out.println("estacion = " + estacion);
    }
}
