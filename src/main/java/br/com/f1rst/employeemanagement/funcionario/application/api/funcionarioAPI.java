package br.com.f1rst.employeemanagement.funcionario.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/funcionario")
public interface funcionarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FuncionarioResponse postFuncionario(@Valid @RequestBody FuncionarioRequest funcionarioRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<FuncionarioListResponse> getTodosFuncionarios();

    @PatchMapping(value = "/{idFuncionario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void patchAlteraFuncionario(@PathVariable UUID idFuncionario, @Valid @RequestBody FuncionarioAlteracaoRequest funcionarioAlteracaoRequest);
}
