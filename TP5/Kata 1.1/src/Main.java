public class Main {
    public static void main(String[] args) {

        TicketSoporte caidaSistema = new TicketSoporte("Informo de una caida de sistema el dia de la fecha");
        caidaSistema.mostrarDetalle();
        caidaSistema.cerrarTicket();
        caidaSistema.mostrarDetalle();
    }
}