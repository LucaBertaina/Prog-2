public class Main {
    public static void main(String[] args) {
        gallina lisa = new gallina(1);
        gallina berta = new gallina(3);
        for (int i = 0; i < 3; i++) {
            lisa.ponerHuevos();
            berta.ponerHuevos();
            lisa.ponerHuevos();
            berta.envejecer();
            lisa.envejecer();
        }
        lisa.mostrarEstado();
        berta.mostrarEstado();
    }
}