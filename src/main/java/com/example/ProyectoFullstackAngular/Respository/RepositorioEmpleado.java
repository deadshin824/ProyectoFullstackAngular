package com.example.ProyectoFullstackAngular.Respository;

import com.example.ProyectoFullstackAngular.Entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEmpleado extends JpaRepository<Empleado, Integer> {

}
