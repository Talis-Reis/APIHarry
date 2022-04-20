package com.escola.magia.service;

import com.escola.magia.model.Aluno;
import com.escola.magia.payloads.dto.AlunoRequest;
import com.escola.magia.payloads.dto.AlunoResponse;
import com.escola.magia.payloads.dto.InfoAlunoCompletoResponse;

import java.util.List;

public interface AlunoService {
    List<Aluno> getAllAlunos();
    InfoAlunoCompletoResponse getAlunobyId(Integer id);
    AlunoResponse create(AlunoRequest alunoRequest);
}
