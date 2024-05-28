
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite el nombre del libro"); // guarda el nombre del libro en la variable nombreLibro
        String nombreLibro = entrada.nextLine();

        System.out.println("Digite el id del libro");
        int idLibro = Integer.parseInt(entrada.nextLine());// guarda el numero de id en idLibro

        System.out.println("Ingrese el precio del libro");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        System.out.println("Confirme si el envio es grauito");
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());

        System.out.println(nombreLibro+ " #"+idLibro);
        System.out.println("Precio del libro: $"+ precioLibro);
        System.out.println("El envio del libro gratuito es: "+envioGratuito);



    }
}
