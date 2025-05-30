public class EjercicioXIII {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");
        mostrarPrecio(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        mostrarPrecio(precios, 0);
    }

    public static void mostrarPrecio(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.printf("\nPrecio: "+ precios[indice]);
            mostrarPrecio(precios, indice + 1);
        }
    }
}
