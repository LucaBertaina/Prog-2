import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private List<TicketSoporte> tickets;

    public SistemaSoporte() {
        this.tickets = new ArrayList<>();
    }

    public TicketSoporte crearTicket(String descripcion, Usuario usuario) {
        TicketSoporte nuevo = new TicketSoporte(descripcion, usuario);
        tickets.add(nuevo);
        return nuevo;
    }

    public void asignarTecnicoATicket(int idTicket, Tecnico tecnico) {
        for (TicketSoporte t : tickets) {
            if (t.getId() == idTicket) {
                t.asignarTecnico(tecnico);
                break;
            }
        }
    }

    public void listarTicketsPorEstado(String estado) {
        for (TicketSoporte t : tickets) {
            if (t.getEstado().equalsIgnoreCase(estado)) {
                System.out.println(t.getDescripcion() + "\n");
            }
        }
    }

    public void mostrarResumenSistema() {
        System.out.println("Total de tickets creados: " + TicketSoporte.getIdTicketSoporte());
    }
}
