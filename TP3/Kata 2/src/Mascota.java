public class Mascota {

    private String nombre;
    private String raza;
    private int edad;

    public Mascota(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre + "\nRaza: " + this.raza + "\nEdad: " + this.edad);
    }
    public void cumplirAnios(){
        this.edad += 1;
        System.out.println( this.nombre + "Ahora tiene " + this.edad + " años");
    }
}
