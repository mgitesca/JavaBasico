package com.poo.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Create
 * Read
 * Update
 * Delete
 */

public class EmpleadosCRUD {

    List<Empleado> empleados = new ArrayList<>();

    // guardar empleados
    public void guardar(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
        return empleados;
    }



}
