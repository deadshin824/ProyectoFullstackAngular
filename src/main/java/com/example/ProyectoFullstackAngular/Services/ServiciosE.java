package com.example.ProyectoFullstackAngular.Services;

import com.example.ProyectoFullstackAngular.Entity.Empleado;

import java.util.List;

public interface ServiciosE {
    Empleado save(Empleado empleado);
    List<Empleado> findAll();
    Empleado findById(Integer id);
    void deleteById(Integer id);
    Empleado update(Empleado empleado);
}
