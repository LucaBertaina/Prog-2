public class EjercicioXII {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.print("\nPrecio: " + precio);
        }

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.print("\nPrecio: " + precio);
        }
    }
}
