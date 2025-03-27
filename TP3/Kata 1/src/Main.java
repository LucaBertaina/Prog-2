public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Luca", "Bertaina", "Programacion", 7.5);
        Estudiante estudiante2 = new Estudiante("Luca", "Bertaina", "Programacion", 6.5);

        estudiante1.mostrarInfo();

        estudiante1.subirCalificacion(5.0);
        System.out.println("Calificacion: "+estudiante1.getCalificacion());

        estudiante1.bajarCalificacion(4.5);
        System.out.println("Calificacion: "+estudiante1.getCalificacion());
        estudiante1.mostrarInfo();
        estudiante2.mostrarInfo();
    }
}