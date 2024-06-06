package ejercicios;
import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de dolares de guillermo");
        double guille,luis,juan;
        Scanner entrada = new Scanner(System.in);
        guille = entrada.nextDouble();

        luis = guille / 2;
        System.out.println ("luis tiene " + luis);

        juan = (luis + guille)/ 2;

        System.out.println("juan tiene " + juan);
    }
}
