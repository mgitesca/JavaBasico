package com.poo.interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadosCRUD empleadoCRUD = new EmpleadosCRUD();

        Empleado juan = new Empleado("juan", 19,1000, true);
        Empleado patrcia = new Empleado("patricia", 29,3000, true);
        Empleado roberto = new Empleado("roberto", 24,2000, true);

        // guardar empleados
        empleadoCRUD.guardar(juan);
        empleadoCRUD.guardar(patrcia);
        empleadoCRUD.guardar(roberto);

        // devolver empleados
        List <Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);





    }
}
