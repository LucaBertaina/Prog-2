import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AplicacionAdmin admin = new AplicacionAdmin();
        EmpSalarioFijo empsalfij1 = new EmpSalarioFijo(46520867, "Juan","Perez", 2020);
        EmpSalarioFijo empsalfij2 = new EmpSalarioFijo(43220867, "Luca","Paez", 2023);
        EmpSalarioFijo empsalfij3 = new EmpSalarioFijo(41520372, "Pedro","Boloni", 2019);

        EmpComision empcom1 = new EmpComision(43309123, "Jero","Lorca",2021,10);
        EmpComision empcom2 = new EmpComision(43309123, "Valentino","Tussi",2021,15);
        EmpComision empcom3 = new EmpComision(43309123, "Enzo","Zambrano",2023,5);

        admin.agregarEmpleado(empsalfij1);
        admin.agregarEmpleado(empsalfij2);
        admin.agregarEmpleado(empsalfij3);
        admin.agregarEmpleado(empcom1);
        admin.agregarEmpleado(empcom2);
        admin.agregarEmpleado(empcom3);

        admin.mostarSalarios();

        admin.obtenerEmpleadoConMasComisiones();


    }


}