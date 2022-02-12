package br.com.sigaBemApi.service;

import br.com.sigaBemApi.entity.DAO.Analise;
import br.com.sigaBemApi.entity.Postal;
import br.com.sigaBemApi.repository.CargaRepository;
import com.google.common.base.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class CargaService {

    @Autowired
    private BuscarPostal buscarPostal;

    @Autowired
    private CargaRepository repository;

    public Analise buscarCepCalcularFreteESalvar(Analise analise){

        analise.setDataConsulta(LocalDate.now());
        Postal postalOrigem = buscarPostal.buscarPostal(analise.getCepOrigem());
        Postal postalDestino = buscarPostal.buscarPostal(analise.getCepDestino());

        Double totalDesconto = CalcularDesconto(postalOrigem, postalDestino);
        analise.setVlTotalFrete(analise.getPeso() * totalDesconto);

        Long diasParaEntrega = calcularPrazoEntrega(postalOrigem, postalDestino);
        LocalDate dataPrevistaEntrega = LocalDate.now();
        analise.setDataPrevistaEntrega(dataPrevistaEntrega.plusDays(diasParaEntrega));

        Analise saved = this.repository.save(analise);

        return saved;
    }

    private Double CalcularDesconto(Postal cepOrigem, Postal cepDestino) {
        if (Objects.equal(cepOrigem.getUf(), cepDestino.getUf())) {

            return 0.25;
        }
        if (Objects.equal(cepOrigem.getUf(), cepDestino.getUf())) {
            return 0.5;

        }
        return 1.0;
    }

    private Long calcularPrazoEntrega(Postal cepOrigem, Postal cepDestino) {
        if (Objects.equal(cepOrigem.getUf(), cepDestino.getUf())) {
            return 1L;
        }
        if (Objects.equal(cepOrigem.getUf(), cepDestino.getUf())) {
            return 3L;
        }
        return 10L;
    }
}