package br.com.f1rst.employeemanagement.funcionario.application.service;

import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioListResponse;
import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioRequest;
import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioResponse;

import java.util.List;

public interface FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);

    List<FuncionarioListResponse> buscaTodosFuncionarios();
}
