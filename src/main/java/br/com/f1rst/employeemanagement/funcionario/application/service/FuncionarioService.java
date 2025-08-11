package br.com.f1rst.employeemanagement.funcionario.application.service;

import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioRequest;
import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioResponse;

public interface FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
}
