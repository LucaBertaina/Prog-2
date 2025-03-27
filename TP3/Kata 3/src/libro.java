public class libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion<=2025 && añoPublicacion >= 1900) {
            this.añoPublicacion = añoPublicacion;
        }else {
            this.añoPublicacion = 2025;
            System.out.println("No se pudo establecer el Año de publicacion de "+this.titulo+" y se establecio como base el 2025 \n Error:No se puede modificar si el año es menor a 1900 o mayor al año actual.");
        }
    }
    public void mostrarInfo() {
        System.out.println("Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nFecha de Publicacion:"+ this.añoPublicacion);
    }
}
