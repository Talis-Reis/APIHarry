package com.escola.magia.payloads.Alunos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Casa {

    @JsonProperty("id")
    String id;

    @JsonProperty("name")
    String nome;

    @JsonProperty("animal")
    String animal;

    @JsonProperty("founder")
    String fundador;

}
