package com.baseDatos.FSteinaker.repository;

import com.baseDatos.FSteinaker.model.ExpLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpLaboralRepository extends JpaRepository <ExpLaboral, Long> {
    
}
