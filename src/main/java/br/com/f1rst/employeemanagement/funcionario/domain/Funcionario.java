package br.com.f1rst.employeemanagement.funcionario.domain;

import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioAlteracaoRequest;
import br.com.f1rst.employeemanagement.funcionario.application.api.FuncionarioRequest;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Document(collection = "funcionarios")
public class Funcionario {
    @Id
    private UUID idFuncionario;
    @NotBlank
    private String nome;
    @NotBlank
    private String designacao;
    @NotBlank
    private String salario;
    @NotBlank
    @Indexed(unique = true)
    private String telefone;
    @NotBlank
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


