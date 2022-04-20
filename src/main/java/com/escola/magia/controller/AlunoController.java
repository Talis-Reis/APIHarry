package com.escola.magia.controller;

import com.escola.magia.model.Aluno;
import com.escola.magia.payloads.dto.AlunoRequest;
import com.escola.magia.payloads.dto.AlunoResponse;
import com.escola.magia.payloads.dto.InfoAlunoCompletoResponse;
import com.escola.magia.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @GetMapping
    public List<Aluno> getAllAlunos() {
        return alunoService.getAllAlunos();
    }

    @GetMapping("/{id}")
    public InfoAlunoCompletoResponse getAlunobyId(@PathVariable Integer id) {
        return alunoService.getAlunobyId(id);
    }

    @PostMapping
    public AlunoResponse create(@RequestBody AlunoRequest alunoRequest) {
        return alunoService.create(alunoRequest);
    }

}
