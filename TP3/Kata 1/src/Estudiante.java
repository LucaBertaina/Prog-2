import java.util.Objects;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String curso;
    private Double calificacion;
    private int legajo;
    private static int contador = 10000;
    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String curso, Double calificacion) {
        contador++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
        this.legajo = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarInfo(){
        System.out.println("Apellidos del estuiante: "+ apellido + "\n Nombre del estudiante: " + nombre + "\n Curso: " + curso + "\n Calificacion: "+ calificacion + "\n Legajo: "+ legajo);
    }

    public void subirCalificacion(double puntos){
        if(puntos >= 0){
            if(this.calificacion+puntos <= 10){
                this.calificacion += puntos;
            }else{
                this.calificacion = 10.0;
            }
        } else {
            System.out.println("El punto no puede ser negativo");
        }
    }

    public void bajarCalificacion(double puntos){
        if(puntos >= 0) {
            if (this.calificacion - puntos >= 0) {
                this.calificacion -= puntos;
            } else {
                this.calificacion = 0.0;
            }
        } else {
            System.out.println("El punto no puede ser negativo");
        }

    }

    // Compara los estudiantes por legajo
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Estudiante that = (Estudiante) obj;
        return legajo == that.legajo;
    }

    // Creo el codigo hash mediante el legajo
    @Override
    public int hashCode() {
        return Objects.hash(legajo);
    }

}
