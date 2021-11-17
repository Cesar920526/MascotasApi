package com.siesa.PruebaApiRest.Repository;

import com.siesa.PruebaApiRest.Model.TipoMascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoMascotaDao extends JpaRepository<TipoMascota, Integer> {
}
