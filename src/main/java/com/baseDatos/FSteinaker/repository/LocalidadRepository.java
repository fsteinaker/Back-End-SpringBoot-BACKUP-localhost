package com.baseDatos.FSteinaker.repository;

import com.baseDatos.FSteinaker.model.Localidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends JpaRepository <Localidad, Long> {
    
}