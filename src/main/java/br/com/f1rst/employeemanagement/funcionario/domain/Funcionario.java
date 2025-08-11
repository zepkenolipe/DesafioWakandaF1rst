package br.com.f1rst.employeemanagement.funcionario.domain;

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
    @NotBlank
    private String designacao;
    @NotBlank
    private double salario;
    @NotBlank
    @Column(unique = true)
    private String telefone;
    @NotBlank
    private String endereco;
}

