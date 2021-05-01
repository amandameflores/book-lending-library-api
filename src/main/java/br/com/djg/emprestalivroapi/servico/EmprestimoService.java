package br.com.djg.emprestalivroapi.servico;

import br.com.djg.emprestalivroapi.dominio.Emprestimo;
import br.com.djg.emprestalivroapi.repositorio.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    public void salvarEmprestimo(Emprestimo emprestimo) {
        if (validaDataDevolucao(emprestimo.getDataEmprestimo(), emprestimo.getDataDevolucao())) {
            emprestimoRepository.save(emprestimo);
        } else throw new IllegalArgumentException("A data de devolução é menor que a data do emprestimo");

    }

    private Boolean validaDataDevolucao(LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        if (dataDevolucao.isBefore(dataEmprestimo)) {
            return false;
        }
        return true;
    }
}

