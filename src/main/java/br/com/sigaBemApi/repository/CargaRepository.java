package br.com.sigaBemApi.repository;

import br.com.sigaBemApi.entity.DAO.Analise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargaRepository extends JpaRepository<Analise,Long> {

}
