package com.baseDatos.FSteinaker.repository;

import com.baseDatos.FSteinaker.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository <Habilidad, Long> {
    
}
