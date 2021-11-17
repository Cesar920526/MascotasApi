package com.siesa.PruebaApiRest.Repository;

import com.siesa.PruebaApiRest.Model.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropietaioDao extends JpaRepository<Propietario, Integer> {
}
