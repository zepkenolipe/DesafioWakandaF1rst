package br.com.f1rst.employeemanagement.funcionario.application.repository;

import br.com.f1rst.employeemanagement.funcionario.domain.Funcionario;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);
}
