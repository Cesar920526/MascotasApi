package com.siesa.PruebaApiRest.Controller;

import com.siesa.PruebaApiRest.Model.Mascota;
import com.siesa.PruebaApiRest.Services.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mascotas")
public class MascotasController {
    private final MascotaService mascotaService;

    @Autowired
    public MascotasController(MascotaService mascotaService){
        this.mascotaService = mascotaService;
    }

    @GetMapping(path = "/all")
    public List<Mascota> getMascotas(){
        return mascotaService.findAllMascotas();
    }

    @GetMapping(path = "/adopcion")
    public List<Mascota> getMascotasEnAdopcion(){
        return mascotaService.findAllByPropietarioIsNull();
    }
}
