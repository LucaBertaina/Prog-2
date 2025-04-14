public class Main {
    public static void main(String[] args) {
        SistemaSoporte sistema = new SistemaSoporte();

        Usuario user1 = new Usuario( "Pepe", "pepe@gmail.com");
        Usuario user2 = new Usuario( "Miguel", "miguel@gmail.com");

        Tecnico tecnico1 = new Tecnico( "Luca", "Base de Datos");
        Tecnico tecnico2 = new Tecnico( "Valen", "Software");

        TicketSoporte t1 = sistema.crearTicket("Problema con conexión WiFi", user1);
        TicketSoporte t2 = sistema.crearTicket("Error al abrir Excel", user2);

        sistema.asignarTecnicoATicket(t1.getId(), tecnico1);
        sistema.asignarTecnicoATicket(t2.getId(), tecnico2);
        t1.mostrarDetalle();
        t2.mostrarDetalle();
        t2.cerrarTicket();

        System.out.println("TICKETS ABIERTOS:");
        sistema.listarTicketsPorEstado("abierto");

        System.out.println("TICKETS CERRADOS:");
        sistema.listarTicketsPorEstado("cerrado");

        sistema.mostrarResumenSistema();
    }
}