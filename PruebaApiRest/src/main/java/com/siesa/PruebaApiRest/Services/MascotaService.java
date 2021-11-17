package com.siesa.PruebaApiRest.Services;

import com.siesa.PruebaApiRest.Model.Mascota;
import com.siesa.PruebaApiRest.Repository.MascotaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService {
    private final MascotaDao mascotaDao;
    @Autowired
    public MascotaService(MascotaDao mascotaDao){
        this.mascotaDao = mascotaDao;
    }

    public List<Mascota> findAllMascotas(){
        return mascotaDao.findAll();
    }

    public List<Mascota> findAllByPropietarioIsNull(){
        return mascotaDao.findAllByPropietarioIsNull();
    }
}

