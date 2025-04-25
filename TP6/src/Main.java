public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.listarProductos();
        Producto pan1 = new Producto("PANHAM1",CategoriaProducto.ALIMENTOS,"Pan Hamburgesas La Española",1699.99, 120);
        Producto Tablet1 = new Producto("SAMTAB1",CategoriaProducto.ELECTRONICA,"Tablet Samsung A9",159999.99, 30);
        Producto Remera1 = new Producto("REMLAN1",CategoriaProducto.ROPA,"Remera Lana Basica",18999.99, 60);
 // kata 1
        inventario.añadirProducto(pan1);
        inventario.añadirProducto(Tablet1);
        inventario.añadirProducto(Remera1);
        inventario.listarProductos();
//kata 2
        inventario.buscarProductoPorId("PanHAM1");
        inventario.eliminarProducto("samtab1");
        inventario.listarProductos();
        inventario.actualizarStock("panham1", 108);
        inventario.buscarProductoPorId("PanHAM1");
        Producto pan2 = new Producto("PANHAM2",CategoriaProducto.ALIMENTOS,"Pan Hamburgesas La Veneciana",1199.99, 220);
        inventario.añadirProducto(pan2);
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
// kata 3
        Producto Espejo1 = new Producto("ESPMad1",CategoriaProducto.ALIMENTOS,"Espejo Borde Madera de Roble",26999.99, 100);
        inventario.añadirProducto(Espejo1);
        System.out.println("Total stock: " + inventario.obtenerTotalStock());
        inventario.obtenerProductoConMayorStock();
        inventario.filtrarProductosPorPrecio(1000,3000);
        inventario.mostrarCategorias();
    }
}