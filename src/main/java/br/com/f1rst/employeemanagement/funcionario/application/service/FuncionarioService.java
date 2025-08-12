package br.com.f1rst.employeemanagement.funcionario.application.service;

import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioAlteracaoRequest;
import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioListResponse;
import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioRequest;
import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioResponse;

import java.util.List;
import java.util.UUID;

public interface FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);

    List<FuncionarioListResponse> buscaTodosFuncionarios();

}
