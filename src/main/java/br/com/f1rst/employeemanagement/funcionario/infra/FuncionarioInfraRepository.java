package br.com.f1rst.employeemanagement.funcionario.infra;

import br.com.f1rst.employeemanagement.funcionario.application.repository.FuncionarioRepository;
import br.com.f1rst.employeemanagement.funcionario.domain.Funcionario;
import br.com.f1rst.employeemanagement.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements FuncionarioRepository {
    private final FuncionarioSpringDataJPARepository funcionarioSpringDataJPARepository;

    @Override
    public Funcionario salva(Funcionario funcionario) {
        log.info("[inicia] FuncionarioInfraRepository - salva");
        funcionarioSpringDataJPARepository.save(funcionario);
        log.info("[finaliza] FuncionarioInfraRepository - salva");
        return funcionario;
    }

    @Override
    public List<Funcionario> buscaTodosFuncionarios() {
        log.info("[inicia] FuncionarioInfraRepository - buscaTodosFuncionarios");
        List<Funcionario> todosFuncionarios = funcionarioSpringDataJPARepository.findAll();
        log.info("[finaliza] FuncionarioInfraRepository - buscaTodosFuncionarios");
        return todosFuncionarios;
    }

    @Override
    public Funcionario buscaFuncionarioPorId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioInfraRepository - buscaFuncionarioPorId");
        Funcionario funcionario = funcionarioSpringDataJPARepository.findByIdFuncionario(idFuncionario)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Funcionario não encontrado com o ID: " + idFuncionario));
        log.info("[finaliza] FuncionarioInfraRepository - buscaFuncionarioPorId");
        return funcionario;
    }
}
