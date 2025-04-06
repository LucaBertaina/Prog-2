public class empleado {
    //-----------------------------Atributos-----------------------------//
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int cantEmpleados;
    private static int idEmpleado=1;

    //-----------------------------Constructores-----------------------------//
    public empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        cantEmpleados = cantEmpleados + 1;

        if (id >= idEmpleado) {
            idEmpleado = id + 1;
        }
    }
    public empleado(String nombre, String puesto) {
        this.id = idEmpleado++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 292446;
        cantEmpleados = cantEmpleados + 1;
    }

    //-----------------------------G&S-----------------------------//
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //-----------------------------metodos-----------------------------//
    @Override
    public String toString() {
        return "Empleado Nonmbre= " + this.nombre + "\n Puesto= " + this.puesto + "\n Salario= " + this.salario + "\n Id= " + this.id ;
    }
    public void aumentarSalario(){
        this.salario = this.salario+10000;
        System.out.println("El salario aumento $10000 y es de "+this.salario);
    }
    public void aumentarSalario(double salario){
        this.salario = this.salario+salario;
        System.out.println("El salario aumento $"+salario+" y es de "+this.salario);
    }
    static void mostrarEmpleados(){
        System.out.println("Cantidad de Empleados:"+cantEmpleados);
    }
}
