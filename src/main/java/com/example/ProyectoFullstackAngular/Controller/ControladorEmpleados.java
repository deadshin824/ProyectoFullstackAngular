package com.example.ProyectoFullstackAngular.Controller;

import com.example.ProyectoFullstackAngular.Entity.Empleado;
import com.example.ProyectoFullstackAngular.Services.ServicioEmpleado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorEmpleados {
    private final ServicioEmpleado servicioEmpleado;

    public ControladorEmpleados(ServicioEmpleado servicioEmpleado) {
        this.servicioEmpleado = servicioEmpleado;

    }
    @GetMapping("/Bienvenida")
    public String mensajeBienvenida(){
        return "Este es un mensaje de bienvenida al backend";
    }
    @PostMapping
    public Empleado save(@RequestBody Empleado empleado){
        return servicioEmpleado.save(empleado);
    }
}
