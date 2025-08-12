package br.com.f1rst.employeemanagement.funcionario.application.service;

import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioAlteracaoRequest;
import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioListResponse;
import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioRequest;
import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioResponse;
import br.com.f1rst.employeemanagement.funcionario.application.repository.FuncionarioRepository;
import br.com.f1rst.employeemanagement.funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    @Override
    public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia] FuncionarioApplicationService - criaFuncionario");
        Funcionario funcionario = funcionarioRepository.salva(new Funcionario(funcionarioRequest));
        log.info("[finaliza] FuncionarioApplicationService - criaFuncionario");
        return FuncionarioResponse.builder()
                .idFuncionario(funcionario.getIdFuncionario())
                .build();
    }

    @Override
    public List<FuncionarioListResponse> buscaTodosFuncionarios() {
        log.info("[inicia] FuncionarioApplicationService - buscaTodosFuncionarios");
        List<Funcionario> funcionarios = funcionarioRepository.buscaTodosFuncionarios();
        log.info("[finaliza] FuncionarioApplicationService - buscaTodosFuncionarios");
        return FuncionarioListResponse.converte(funcionarios);
    }

    @Override
    public void patchAlteraFuncionario(UUID idFuncionario, FuncionarioAlteracaoRequest funcionarioAlteracaoRequest) {
        log.info("[inicia] FuncionarioApplicationService - patchAlteraFuncionario");
        Funcionario funcionario = funcionarioRepository.buscaFuncionarioPorId(idFuncionario);
        funcionario.altera(funcionarioAlteracaoRequest);
        funcionarioRepository.salva(funcionario);
        log.info("[finaliza] FuncionarioApplicationService - patchAlteraFuncionario");
    }
}
