import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto total de la compra: ");
        double montoCompra = scanner.nextDouble();

        if (montoCompra > 100) {
            double descuento = 0.20 * montoCompra;
            double montoFinal = montoCompra - descuento;
            System.out.println("El monto a pagar con el 20% de descuento es: $" + montoFinal);
        } else {
            System.out.println("El monto a pagar sin descuento es: $" + montoCompra);
        }
    }
}


