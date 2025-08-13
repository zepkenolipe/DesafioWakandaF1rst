package br.com.f1rst.employeemanagement.funcionario.domain;

import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioAlteracaoRequest;
import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioRequest;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;


@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "funcionarios")
@ToString
public class Funcionario {

    @Id
    private UUID idFuncionario;

    @NotBlank
    private String nome;

    private String designacao;
    private String salario;

    @Field("telefone")
    private String telefone;

    private String endereco;

    public Funcionario(FuncionarioRequest funcionarioRequest) {
        this.idFuncionario = UUID.randomUUID();
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


