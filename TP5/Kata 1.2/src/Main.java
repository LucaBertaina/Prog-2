public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Luca","Luca@gmail.com");
        Usuario usuarioTec1 = new Usuario("Pepe","pepe@gmail.com");
        TicketSoporte caidaSistema = new TicketSoporte("Informo de una caida de sistema el dia de la fecha", usuario1);

        usuarioTec1.hacerTecnico();
        caidaSistema.mostrarDetalle();
        System.out.println(caidaSistema.getTecnicoAsociado());
        caidaSistema.cerrarTicket();
        caidaSistema.añadirTecnico(usuarioTec1);
        caidaSistema.mostrarDetalle();
        System.out.println(caidaSistema.getTecnicoAsociado());
    }
}