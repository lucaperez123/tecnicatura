import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las tres calificaciones del alumno:");
        double calificacion1 = scanner.nextDouble();
        double calificacion2 = scanner.nextDouble();
        double calificacion3 = scanner.nextDouble();

        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        if (promedio >= 70) {
            System.out.println("El alumno ha aprobado el curso con un promedio de: " + promedio);
        } else {
            System.out.println("El alumno ha reprobado el curso con un promedio de: " + promedio);
        }
    }
}