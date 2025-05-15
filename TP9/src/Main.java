import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // kata 1
        Producto papa = new Producto<String>("papa", 200.00, "Papa" );
        Producto leche = new Producto<Integer>(001, 200.01, "Leche" );
        // kata 2
        Carrito carrito = new Carrito();
        carrito.agregarProducto(papa);
        carrito.agregarProducto(leche);
        carrito.agregarProducto(leche);
        carrito.mostrarProductos();
        System.out.println("Total del carrito $" + carrito.obtenerTotal());;
        // kata 3
        Pedido pedido1 = new Pedido(LocalDate.of(2024,8,12),1);
        Pedido pedido2 = new Pedido(LocalDate.of(2025,5,8),2);
        Pedido pedido3 = new Pedido(LocalDate.of(2025,4,19),3);
        pedido1.agregarProducto(leche);
        pedido2.agregarProducto(papa);
        pedido3.agregarProducto(leche);
        pedido1.agregarProducto(papa);
        ArrayList<Pedido> Pedidos = new ArrayList<>();

        Pedidos.add(pedido1);
        Pedidos.add(pedido2);
        Pedidos.add(pedido3);
        System.out.println("añadida");
        for (Pedido p : Pedidos) {
            System.out.println(p.toString());
        }
        Collections.sort(Pedidos);
        System.out.println("Total");
        for (Pedido p : Pedidos) {
            System.out.println(p.toString());
        }
        System.out.println("fecha");
        Collections.sort(Pedidos,new ComparadorPedidosPorFecha());
        for (Pedido p : Pedidos) {
            System.out.println(p.toString());
        }
        // kata 4
        Buscador<Pedido, Integer> buscadorPedidoId = new Buscador<>();
        System.out.println("Pedido Buscado: " + buscadorPedidoId.buscar(Pedidos,2));

    }
}