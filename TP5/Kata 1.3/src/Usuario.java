public class Usuario {
    private int id;
    private String nombre;
    private String mail;
    static private int idUsuario = 0;

    public Usuario(String nombre, String mail) {
        idUsuario = idUsuario + 1;
        this.id = idUsuario;
        this.nombre = nombre;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMail() {
        return mail;
    }

    public static int getIdUsuario() {
        return idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

}
