public class Usuario {
    private int id;
    private String nombre;
    private String mail;
    static private int idUsuario = 0;
    private int tecnico = 0;

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

    public int getTecnico() {
        return tecnico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void hacerTecnico() {
        if (tecnico == 0) {
            this.tecnico = 1;
            System.out.println("el usuario "+this.nombre+" se hizo tecnico");
        } else {
            System.out.println("El usuario ya es Tecnico");
        }
    }
}
