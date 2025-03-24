import java.util.Scanner;

public class EjercicioIV {
    public static void main(String[] args) {
        System.out.println("Ingrese el precio del producto:");
        Scanner scanner = new Scanner(System.in);
        int precio = scanner.nextInt();
        System.out.println("Ingrese el descuento aplicado A, B, C:");
        String desc = scanner.next().toUpperCase();
        switch (desc) {
            case "A":
                System.out.println("El descuento aplicado es: 10% \nSu producto queda en: " + (precio * 0.90));
                break;
            case "B":
                System.out.println("El descuento aplicado es: 15% \nSu producto queda en: " + (precio * 0.85));
                break;
            case "C":
                System.out.println("El descuento aplicado es: 20% \nSu producto queda en: " + (precio * 0.80));
                break;
            default:
                System.out.println("El descuento no es válido");
                break;
        }

    }
}
