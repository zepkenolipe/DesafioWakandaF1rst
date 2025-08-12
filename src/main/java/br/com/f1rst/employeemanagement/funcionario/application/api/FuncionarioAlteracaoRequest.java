package br.com.f1rst.employeemanagement.funcionario.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class FuncionarioAlteracaoRequest {
    @NotBlank
    private String nome;
    private String designacao;
    @NotBlank
    private String salario;
    @NotBlank
    private String telefone;
    private String endereco;
}
