package com.baseDatos.FSteinaker.repository;

import com.baseDatos.FSteinaker.model.Tecnologias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiasRepository extends JpaRepository <Tecnologias, Long> {
    
}
