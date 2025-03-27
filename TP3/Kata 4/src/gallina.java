public class gallina {
    private static int nID = 1;

    private int id;
    private int edad;
    private int huevosPuestos;

    public gallina(int edad) {
        this.id = nID;
        nID += 1;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevos() {
        this.huevosPuestos++;
    }
    public void envejecer() {
        System.out.println("La gallina "+this.id+" envejecio un año y ahora tiene "+this.edad+" años");
        this.edad++;
    }
    public void mostrarEstado() {
        System.out.println("La gallina N° "+this.id+" a colocado esta cantidad de huevos: "+this.huevosPuestos+" a esta edad "+this.edad);
    }
}
