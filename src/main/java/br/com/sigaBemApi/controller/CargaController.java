package br.com.sigaBemApi.controller;

import br.com.sigaBemApi.entity.DAO.Analise;
import br.com.sigaBemApi.repository.CargaRepository;
import br.com.sigaBemApi.service.BuscarPostal;
import br.com.sigaBemApi.service.CargaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carga")
public class CargaController {

    @Autowired
    private CargaService cargaService;
    @Autowired
    private CargaRepository repository;

    @PostMapping("/testar")
    public Analise buscarCepCalcularFreteESalvar(@RequestBody Analise analise){
        return cargaService.buscarCepCalcularFreteESalvar(analise);
    }
    @GetMapping("/consulta")
    public List<Analise> buscarTodos(){

        return repository.findAll();
    }
    @GetMapping("/consulta/{id}")
    public Analise getAnaliseById(@PathVariable Long id){
//        throw new PostalNotFound("Student not found for Id: ");
        return repository.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deletarBusca(@PathVariable Long id){
        repository.deleteById(id);
    }

    @Autowired
    BuscarPostal buscarPostal;

    @GetMapping("/viacep/{cep}")
    public BuscarPostal getBuscarPostalById(@PathVariable String cep){
        return buscarPostal.buscarPostal(cep);
    }
}
