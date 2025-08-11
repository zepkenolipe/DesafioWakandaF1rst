package br.com.f1rst.employeemanagement.funcionario.application.repository;

import br.com.f1rst.employeemanagement.funcionario.domain.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);
}
