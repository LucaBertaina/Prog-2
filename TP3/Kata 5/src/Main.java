public class Main {
    public static void main(String[] args) {

        NaveEspacial andromeda = new NaveEspacial("Andromeda", 50);

        andromeda.despegar();
        andromeda.avanzar(60);
        andromeda.recargarCombustible(40);
        andromeda.avanzar(60);
        andromeda.mostrarEstadoNave();
    }
}