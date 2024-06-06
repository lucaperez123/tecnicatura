package ejercicios;
import java.util.Scanner;

public class ejercicio07 {
    public static void main(String[] args) {
        // Definir constantes
        final double SALARIO_BASE = 1000.00;
        final double COMISION_POR_CARRO = 150.00;
        final double PORCENTAJE_COMISION = 0.05;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Leer la cantidad de carros vendidos
        System.out.print("Ingrese la cantidad de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        // Leer el valor total de la venta de carros
        System.out.print("Ingrese el valor total de la venta de carros: ");
        double valorTotalVenta = scanner.nextDouble();

        // Calcular el salario total
        double salarioTotal = SALARIO_BASE +
                (COMISION_POR_CARRO * carrosVendidos) +
                (PORCENTAJE_COMISION * valorTotalVenta);

        // Imprimir el salario total
        System.out.printf("El salario mensual del vendedor es: $%.2f%n", salarioTotal);
    
    }

}