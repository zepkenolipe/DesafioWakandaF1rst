package br.com.f1rst.employeemanagement.funcionario.application.api;

import br.com.f1rst.employeemanagement.funcionario.domain.Funcionario;

import java.util.List;
import java.util.stream.Collectors;

public class FuncionarioListResponse {
    private String nome;
    private String designacao;
    private String salario;
    private String telefone;
    private String endereco;

    public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .map(FuncionarioListResponse::new)
                .collect(Collectors.toList());
    }
    public FuncionarioListResponse(Funcionario funcionario) {
        this.nome = funcionario.getNome();
        this.designacao = funcionario.getDesignacao();
        this.salario = funcionario.getSalario();
        this.telefone = funcionario.getTelefone();
        this.endereco = funcionario.getEndereco();
    }
}
