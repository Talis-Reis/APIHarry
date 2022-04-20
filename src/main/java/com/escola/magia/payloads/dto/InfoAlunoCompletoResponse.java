package com.escola.magia.payloads.dto;

import com.escola.magia.model.Aluno;
import com.escola.magia.payloads.Alunos.Casa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class InfoAlunoCompletoResponse {

    private Integer id;

    private String nome;

    private String serie;

    private String selecao_chapeu;

    private Casa casa;

    public InfoAlunoCompletoResponse(Aluno aluno, Casa casa) {
        this.id = aluno.getId();
        this.nome = aluno.getNome();
        this.serie = aluno.getSerie();
        this.selecao_chapeu = aluno.getSelecaoChapeu();
        this.casa = casa;
    }

}
