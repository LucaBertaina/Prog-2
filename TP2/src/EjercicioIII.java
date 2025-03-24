import java.util.Scanner;

public class EjercicioIII {
    public static void main(String[] args) {
        System.out.println("Ingrese su edad: ");
        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();
        if (edad <= 12) {
            System.out.println("Usted es un niño");
        } else if (edad >= 13 && edad <= 17 ) {
            System.out.println("Usted es un adolecente");
        } else if (edad >= 18 && edad <= 59 ) {
            System.out.println("Usted es un adulto");
        } else {
            System.out.println("Usted es un adulto mayor");
        }
    }
}
