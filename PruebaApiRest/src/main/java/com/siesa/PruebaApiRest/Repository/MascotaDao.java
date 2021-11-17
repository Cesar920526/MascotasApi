package com.siesa.PruebaApiRest.Repository;

import com.siesa.PruebaApiRest.Model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MascotaDao extends JpaRepository<Mascota, Integer> {
    public List<Mascota> findAllByPropietarioIsNull();
}
