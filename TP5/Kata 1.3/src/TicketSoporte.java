import java.util.Date;

public class TicketSoporte {
    private int id;
    private String descripcion;
    private String estado;
    private Date fechaDeCreacion;
    static private int idTicketSoporte = 0;
    private Usuario usuario;
    private Tecnico tecnicoAsociado;

    public TicketSoporte(String descripcion) {
        idTicketSoporte++;
        this.id = idTicketSoporte;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaDeCreacion = new Date();
    }
    public TicketSoporte(String descripcion, Usuario usuario) {
        this.id = idTicketSoporte;
        idTicketSoporte++;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaDeCreacion = new Date();
        this.usuario = usuario;

    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public Tecnico getTecnicoAsociado() {
        return tecnicoAsociado;
    }

    public void setTecnicoAsociado(Tecnico tecnicoAsociado) {
        this.tecnicoAsociado = tecnicoAsociado;
    }

    public static int getIdTicketSoporte() {
        return idTicketSoporte;
    }

    public void cerrarTicket() {
        this.estado = "Cerrado";
        System.out.println("ticket "+this.id+" cerrado");
    }

    public void mostrarDetalle() {
        System.out.println("_______________________\n  INFORMACION TICKET \n Id Ticket: "+this.id+"\n Usuario:"+ this.usuario.getNombre()+"\n Descripcion: "+descripcion+"\n Estado: "+estado+"\n Fecha de creacion:"+this.fechaDeCreacion+"\n_______________________");
    }

    public void asignarTecnico(Tecnico tecnico) {
        this.tecnicoAsociado = tecnico;
    }
}
