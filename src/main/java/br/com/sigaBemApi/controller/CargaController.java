package br.com.sigaBemApi.controller;

import br.com.sigaBemApi.entity.DAO.Analise;
import br.com.sigaBemApi.repository.CargaRepository;
import br.com.sigaBemApi.service.CargaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/carga")
public class CargaController {

    @Autowired
    private CargaService cargaService;

    @PostMapping("/testar")
    public Analise buscarCepCalcularFreteESalvar(@RequestBody Analise analise){
        return cargaService.buscarCepCalcularFreteESalvar(analise);
    }
}
