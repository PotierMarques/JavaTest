package br.com.sigaBemApi.controller;

import br.com.sigaBemApi.DTO.Response.AnaliseResponse;
import br.com.sigaBemApi.entity.DAO.Analise;
import br.com.sigaBemApi.entity.Postal;
import br.com.sigaBemApi.repository.CargaRepository;
import br.com.sigaBemApi.service.BuscarPostal;
import br.com.sigaBemApi.service.CargaService;
import ch.qos.logback.core.rolling.helper.MonoTypedConverter;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.concurrent.MonoToListenableFutureAdapter;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import static org.springframework.http.ResponseEntity.ok;

@AllArgsConstructor
@RestController
@RequestMapping("/carga")
public class CargaController {


    @Autowired
    private CargaService cargaService;

    @PostMapping
    public Analise buscar(Analise analise){
        return cargaService.buscarCepCalcularFreteESalvar(analise);
    }

//    CargaController cargaController;
//
//    @GetMapping("carga/cep")
//    public MonoToListenableFutureAdapter<AnaliseResponse> getAnaliseByCep(@PathVariable String Cep){


//    }




}




//    private final CargaService cargaService;
//
//    private final CargaRepository cargaRepository;
//
//    public CargaController(CargaRepository cargaRepository, CargaService cargaService) {
//        this.cargaRepository = cargaRepository;
//        this.cargaService = cargaService;
//    }
//
////    public CargaService getCargaService() {
////        return cargaService;
////
////    }
//
//    @PostMapping
////    @ResponseStatus(HttpStatus.CREATED)
//    public double analiseResponse(@RequestBody AnaliseResponse pacote) {
//        return cargaService.calcularValorTotalFrete(pacote);
//    }
//
//    //    @GetMapping
////    public List<Carga> BucarId(){
////        return cargaRepository.findAll();
////    }
//
//    @GetMapping("{carga}")
//    public <carga> HttpEntity<Object> buscarId(carga) {
//        return buscarId();
//    }
//
//    @GetMapping("{carga}")
//    public <carga> HttpEntity<Object> buscarPostal(Postal postal, @PathVariable String carga) {
////        def i = Integer.parseInt("1");
//        return cargaRepository.findById(postal)
//                .map(encomenda -> ok(postal))
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PutMapping("/{idCarga}")
//    public ResponseEntity<AnaliseResponse> atualizarCarga(@Valid @PathVariable Long idCarga,
//                                                          @RequestBody AnaliseResponse analiseResponse) {
//
//        if (!cargaRepository.existsById(idCarga)) {
//            return ResponseEntity.notFound().build();
//        }
//
//        analiseResponse.setId(idCarga);
//        analiseResponse = cargaService.salvarcarga(analiseResponse);
//        return ok(analiseResponse);
//    }
//
//    @DeleteMapping("/{idcarga}")
//    public ResponseEntity<Void> excluirCarga(@PathVariable Long idCarga) {
//        if (!cargaRepository.existsById(idCarga)) {
//            return ResponseEntity.notFound().build();
//        }
//        cargaService.excluirCarga(idCarga);
//        return ResponseEntity.noContent().build();
//    }
//
//
//}