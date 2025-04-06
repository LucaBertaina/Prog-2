public class Main {
    public static void main(String[] args) {
        empleado.mostrarEmpleados();
        empleado luis = new empleado(12,"Luis","Programador", 500000.00);
        empleado juan = new empleado("Juan","celador");
        System.out.println(luis.toString());
        System.out.println(juan.toString());
        luis.aumentarSalario();
        System.out.println(luis.toString());
        juan.aumentarSalario(100000);
        System.out.println(juan.toString());
        empleado.mostrarEmpleados();
    }
}
