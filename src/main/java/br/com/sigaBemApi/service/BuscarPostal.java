package br.com.sigaBemApi.service;

import br.com.sigaBemApi.Util.PostalNotFound;
import br.com.sigaBemApi.entity.Postal;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class BuscarPostal {

    public Postal buscarPostal(String cep) {
        RestTemplate rt = new RestTemplate();

        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("viacep.com.br")
                .path("ws/"+cep+"/json")
                .build();

        ResponseEntity<Postal> response = rt.getForEntity(uri.toString(), Postal.class);
//        System.out.println(response.getBody().getCep());

        if (response.getBody().getCep() == null) {
            throw new PostalNotFound("postal: "+cep);
        }
        return response.getBody();
    }

}
