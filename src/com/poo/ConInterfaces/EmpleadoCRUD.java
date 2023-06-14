package com.poo.ConInterfaces;

import com.poo.interfaces.Empleado;

import java.util.List;

/**
 * Se declaran los metodos, pero nos se implementan
 * Se como un contrado
 *
 */
public interface EmpleadoCRUD {
    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);

}