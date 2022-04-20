package com.escola.magia.Alunos;

import com.escola.magia.payloads.Alunos.Casa;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import org.springframework.http.HttpHeaders;

@Service
public class GetCasa {
    public Casa execute(String chavecasa) {
        String api = "https://api-harrypotter.herokuapp.com/house/{chavecasa}";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<Casa> casaResponseEntity = restTemplate.exchange(api, HttpMethod.GET, entity, Casa.class, chavecasa);

        return casaResponseEntity.getBody();
    }
}
