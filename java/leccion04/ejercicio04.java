import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los números son iguales, su multiplicación es: " + (numero1 * numero2));
        } else if (numero1 > numero2) {
            System.out.println("El primer número es mayor, su resta es: " + (numero1 - numero2));
        } else {
            System.out.println("Los números son diferentes, su suma es: " + (numero1 + numero2));
        }
    }
}
