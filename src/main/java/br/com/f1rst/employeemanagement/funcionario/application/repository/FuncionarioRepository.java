package br.com.f1rst.employeemanagement.funcionario.application.repository;

import br.com.f1rst.employeemanagement.funcionario.domain.Funcionario;

import java.util.List;
import java.util.UUID;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);

    List<Funcionario> buscaTodosFuncionarios();

    Funcionario buscaFuncionarioPorId(UUID idFuncionario);

    void deletaFuncionario(Funcionario funcionario);
}

