import java.util.Scanner;

public class EjercicioI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Intoduce un año para verificar si es bisiesto:");
            double año = scanner.nextDouble();

            if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
                System.out.println("Este año es bisiesto");
            } else {
                System.out.println("Este año no es bisiesto");
            }
        scanner.close();
    }
}
