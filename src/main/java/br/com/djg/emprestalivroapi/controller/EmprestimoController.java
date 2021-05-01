package br.com.djg.emprestalivroapi.controller;

import br.com.djg.emprestalivroapi.dominio.Emprestimo;
import br.com.djg.emprestalivroapi.servico.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;

    @PostMapping("/emprestimo")
    public void salvaEmprestimo(@RequestBody Emprestimo emprestimo) {
        emprestimoService.salvarEmprestimo(emprestimo);
    }

}
