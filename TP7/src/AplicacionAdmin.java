import java.util.ArrayList;

public class AplicacionAdmin {
    public ArrayList<Empleado> empleados;

    public AplicacionAdmin() {
        empleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
    }
    public void mostarSalarios() {
        for (Empleado empleado : empleados) {
            System.out.println("El empleado "+ empleado.getNombre() +" cobra: " + empleado.mostrarSalario());
        }
    }
    public void obtenerEmpleadoConMasComisiones() {
        int contador = 0;
        int contEmp=0;
        int clientesM=0;
        while (empleados.size() > contador) {
            if (empleados.get(contador).getClientes()>clientesM) {
                clientesM=empleados.get(contador).getClientes();
                contEmp=contador;
            }
            contador++;
        }
        System.out.println("El producto con mayor stock es: " + empleados.get(contEmp).getNombre()+ " con la siguiente cantidad de clientes: :"+empleados.get(contEmp).getClientes());
    }
}
