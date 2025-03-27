public class NaveEspacial {
    private String nombre;
    private int combustible;
    private int metrosAvanzados;
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        setCombustible(combustible);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        if (combustible > 0 && combustible < 100) {
            this.combustible = combustible;
        } else {
            System.out.println("El combustible es menor a 100 o mayor a 100 y se seteo en 0, recarga combustible para continuar.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (this.combustible+cantidad >= 100) {
            this.combustible = 100;
        }else {
            this.combustible = this.combustible+cantidad;
        }
    }
    public void avanzar(int mAvanzar) {
        if (this.combustible > mAvanzar) {
            System.out.println("El combustible alcanzo para recorrer los metros solicitados");
            this.metrosAvanzados+=mAvanzar;
            this.combustible = this.combustible-mAvanzar;
        } else {
            System.out.println("el combustible no alcanzo para recorrer los metros solicitados, pruebe recargar el combustible");
        }
    }
    public void despegar() {
        if (this.combustible >= 10) {
            this.combustible -= 10;
            System.out.println("El despegue fue exitoso");
        }else {
            System.out.println("el combustible no basto para el despege");
        }
    }
    public void mostrarEstadoNave() {
        System.out.println("El estado de nave: " + this.nombre+ "\ncombustible: " + this.combustible+ "\nmetrosAvanzados: " + this.metrosAvanzados);
    }
}
