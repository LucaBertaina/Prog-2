import java.util.Date;

public class TicketSoporte {
    private int id;
    private String descripcion;
    private String estado;
    private Date fechaDeCreacion;
    static private int idTicketSoporte = 1;

    public TicketSoporte(String descripcion) {
        this.id = idTicketSoporte;
        idTicketSoporte++;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaDeCreacion = new Date();
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

    public void cerrarTicket() {
        this.estado = "Cerrado";
        System.out.println("ticket "+this.id+" cerrado");
    }

    public void mostrarDetalle() {
        System.out.println("_______________________\n  INFORMACION TICKET \n Id Ticket: "+this.id+"\n Descripcion: "+descripcion+"\n Estado: "+estado+"\n Fecha de creacion:"+this.fechaDeCreacion+"\n_______________________");
    }
}
