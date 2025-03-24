import java.util.Scanner;

public class EjercicioV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int sumaPares = 0;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = scanner.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                sumaPares += numero;
            }
        } while (numero != 0);

        System.out.println("La suma total de los números pares es: " + sumaPares);

    }
}
