package com.escola.magia.payloads.Alunos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChaveChapeu {

    @JsonProperty("sorting-hat-choice")
    private String selecao_chapeu;

}
