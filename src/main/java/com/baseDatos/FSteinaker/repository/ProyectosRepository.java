package com.baseDatos.FSteinaker.repository;

import com.baseDatos.FSteinaker.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository <Proyectos, Long> {
    
}
