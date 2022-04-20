package com.escola.magia.Alunos;

import com.escola.magia.payloads.Alunos.ChaveChapeu;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetSelecaoChapeu {

    public ChaveChapeu execute() {

        RestTemplate restTemplate = new RestTemplate();

        String url = "https://api-harrypotter.herokuapp.com/sortinghat";

        return restTemplate.getForObject(url, ChaveChapeu.class);
    }
}
