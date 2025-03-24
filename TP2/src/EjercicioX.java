import java.util.Scanner;

public class EjercicioX {
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        // Calcular el nuevo stock
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scanner.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();

        // Llamar al método actualizarStock
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Mostrar el resultado
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

}
