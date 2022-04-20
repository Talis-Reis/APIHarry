package com.escola.magia.service.impl;

import com.escola.magia.Alunos.GetCasa;
import com.escola.magia.Alunos.GetSelecaoChapeu;
import com.escola.magia.model.Aluno;
import com.escola.magia.payloads.Alunos.Casa;
import com.escola.magia.payloads.dto.AlunoRequest;
import com.escola.magia.payloads.dto.AlunoResponse;
import com.escola.magia.payloads.dto.InfoAlunoCompletoResponse;
import com.escola.magia.repository.AlunoRepository;
import com.escola.magia.service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    @Autowired
    private final GetSelecaoChapeu getSelecaoChapeu;

    @Autowired
    private final GetCasa getCasa;


    @Override
    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }

    @Override
    public InfoAlunoCompletoResponse getAlunobyId(Integer id) {
        Aluno aluno = alunoRepository.findById(id).orElseThrow();

        String chave = aluno.getSelecaoChapeu();

        Casa casa = getCasa.execute(chave);

        InfoAlunoCompletoResponse infoAluno = new InfoAlunoCompletoResponse(aluno, casa);

        return infoAluno;
    }


    @Override
    public AlunoResponse create(AlunoRequest studentRequest) {

        Aluno aluno = new Aluno();
        aluno.setNome(studentRequest.getNome());
        aluno.setSerie(studentRequest.getSerie());

        aluno.setSelecaoChapeu(getSelecaoChapeu.execute().getSelecao_chapeu());

        aluno = alunoRepository.save(aluno);

        return new AlunoResponse(aluno);
    }
}
