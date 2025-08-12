package br.com.f1rst.employeemanagement.funcionario.domain;

import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioAlteracaoRequest;
import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idFuncionario", updatable = false, unique = true, nullable = false)
    private UUID idFuncionario;

    @NotBlank
    private String nome;
    private String designacao;
    private String salario;

    @Column(unique = true)
    private String telefone;
    private String endereco;

    public Funcionario(FuncionarioRequest funcionarioRequest) {
        this.nome = funcionarioRequest.getNome();
        this.designacao = funcionarioRequest.getDesignacao();
        this.salario = funcionarioRequest.getSalario();
        this.telefone = funcionarioRequest.getTelefone();
        this.endereco = funcionarioRequest.getEndereco();
    }

    public void altera(FuncionarioAlteracaoRequest funcionarioAlteracaoRequest) {
        this.nome = funcionarioAlteracaoRequest.getNome();
        this.designacao = funcionarioAlteracaoRequest.getDesignacao();
        this.salario = funcionarioAlteracaoRequest.getSalario();
        this.telefone = funcionarioAlteracaoRequest.getTelefone();
        this.endereco = funcionarioAlteracaoRequest.getEndereco();
    }
}

