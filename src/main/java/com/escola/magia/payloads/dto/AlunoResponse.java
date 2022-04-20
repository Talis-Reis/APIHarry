package com.escola.magia.payloads.dto;

import com.escola.magia.model.Aluno;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
public class AlunoResponse {

    private Integer id;
    private String nome;
    private String serie;
    private String selecaoChapeu;

    public AlunoResponse(Aluno aluno){
        this.id = aluno.getId();
        this.nome = aluno.getNome();
        this.serie = aluno.getSerie();
        this.selecaoChapeu = aluno.getSelecaoChapeu();
    }

    public static List<AlunoResponse> toResponse(List<Aluno> alunos){
        return  alunos.stream().map(AlunoResponse::new).collect(Collectors.toList());
    }

}
