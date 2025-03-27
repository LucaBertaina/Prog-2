public class Main {
    public static void main(String[] args) {

        libro libro1 = new libro("2000 leguas de viaje submarino","Julio Verne", 1870);

        libro libro2 = new libro("Hechicero","Sebastian de Castlle", 2018);

        libro2.mostrarInfo();
        libro1.mostrarInfo();

    }
}