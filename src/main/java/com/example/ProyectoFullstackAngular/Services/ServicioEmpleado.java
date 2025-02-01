package com.example.ProyectoFullstackAngular.Services;

import com.example.ProyectoFullstackAngular.Entity.Empleado;
import com.example.ProyectoFullstackAngular.Respository.RepositorioEmpleado;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEmpleado implements ServiciosE {
    private final RepositorioEmpleado repositorioEmpleado;

    public ServicioEmpleado(RepositorioEmpleado repositorioEmpleado) {
        this.repositorioEmpleado = repositorioEmpleado;
    }

    @Override
    public Empleado save(Empleado empleado) {
        return repositorioEmpleado.save(empleado);
    }

    @Override
    public List<Empleado> findAll() {
        return repositorioEmpleado.findAll();
    }

    @Override
    public Empleado findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Empleado update(Empleado empleado) {
        return null;
    }
}
