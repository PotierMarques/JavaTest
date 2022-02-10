package br.com.sigaBemApi.repository;

import br.com.sigaBemApi.DTO.Request.Carga;
import br.com.sigaBemApi.DTO.Response.AnaliseResponse;
import br.com.sigaBemApi.entity.DAO.Analise;
import br.com.sigaBemApi.entity.Postal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.DoubleStream;

@Repository
public interface CargaRepository extends JpaRepository<Carga,Long> {}
