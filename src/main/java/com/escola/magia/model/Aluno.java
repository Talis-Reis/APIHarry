package com.escola.magia.model;

import com.escola.magia.payloads.dto.AlunoRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Table(name = "aluno")
@Entity
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "serie")
    private String serie;

    @Column(name = "selecao_Chapeu")
    private String selecaoChapeu;

    public Aluno(AlunoRequest alunoRequest) {
        this.nome = alunoRequest.getNome();
        this.serie = alunoRequest.getSerie();
    }

}
