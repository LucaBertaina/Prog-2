import java.util.Date;

public class TicketSoporte {
    private int id;
    private String descripcion;
    private String estado;
    private Date fechaDeCreacion;
    static private int idTicketSoporte = 1;
    private Usuario usuario;
    private String tecnicoAsociado;

    public TicketSoporte(String descripcion) {
        this.id = idTicketSoporte;
        idTicketSoporte++;
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

    public String getTecnicoAsociado() {
        return tecnicoAsociado;
    }

    public void cerrarTicket() {
        this.estado = "Cerrado";
        System.out.println("ticket "+this.id+" cerrado");
    }

    public void mostrarDetalle() {
        System.out.println("_______________________\n  INFORMACION TICKET \n Id Ticket: "+this.id+"\n Usuario:"+ this.usuario.getNombre()+"\n Descripcion: "+descripcion+"\n Estado: "+estado+"\n Fecha de creacion:"+this.fechaDeCreacion+"\n_______________________");
    }
    public void añadirTecnico(Usuario usuarioTecnico) {
        if(usuarioTecnico.getTecnico() >= 1) {}
        this.tecnicoAsociado = usuarioTecnico.getNombre();
    }
}
