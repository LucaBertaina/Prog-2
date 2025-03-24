import java.util.Scanner;

public class EjercicioIX {
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona=="Nacional") {
            return 5 * peso;
        } else if (zona=="Internacional") {
            return 10 * peso;
        } else {
            System.out.println("Zona de envío inválida.");
            return 0;
        }
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.next();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envío es: " + costoEnvio);

        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
    }
}





