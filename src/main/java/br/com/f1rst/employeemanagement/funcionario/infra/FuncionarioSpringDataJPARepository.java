package br.com.f1rst.employeemanagement.funcionario.infra;

import br.com.f1rst.employeemanagement.funcionario.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FuncionarioSpringDataJPARepository extends JpaRepository<Funcionario, UUID> {
}
