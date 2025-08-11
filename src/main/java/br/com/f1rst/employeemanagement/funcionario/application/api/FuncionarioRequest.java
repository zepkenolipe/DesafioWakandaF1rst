package br.com.f1rst.employeemanagement.funcionario.application.api;

import jakarta.validation.constraints.NotBlank;

public class FuncionarioRequest {
    @NotBlank
    private String nome;
    private String designacao;
    private String salario;
    private String telefone;
    private String endereco;
}
