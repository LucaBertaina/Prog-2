public enum CategoriaProducto {
    ALIMENTOS("Productos Consumibles"),
    ELECTRONICA("Apartos electrónicos"),
    ROPA("Prendas de vestir o Accesorios"),
    HOGAR("Muebleria y cristaleria");
    private final String descripcion;
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
}

