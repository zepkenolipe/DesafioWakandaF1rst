package br.com.f1rst.employeemanagement.funcionario.infra;

import br.com.f1rst.employeemanagement.funcionario.domain.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
import java.util.UUID;

public interface FuncionarioMongoSpringRepository extends MongoRepository<Funcionario, UUID> {
    Optional<Funcionario> findByIdFuncionario(UUID idFuncionario);
}
