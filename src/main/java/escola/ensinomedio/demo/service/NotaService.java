package escola.ensinomedio.demo.service;

import escola.ensinomedio.demo.exception.NotaException;
import escola.ensinomedio.demo.model.Nota;


import java.util.ArrayList;
import java.util.List;

public class NotaService {

    public List<Nota> cadastrarNota(Nota nota, List<Nota>notas) throws NotaException {

        if (nota==null){
            throw new NotaException("Nota não pode ser nula!");
        }
        if (nota.getAluno()==null ){
            throw new NotaException("Nota faltando aluno");
        }

        if (nota.getNota()<0 ){
            throw new NotaException("Nota não pode ser negativa!");
        }

        if (nota.getDisciplina()==null ){
            throw new NotaException("Disciplina não pode ser nula!");
        }

        if (nota.getUnidade()==null || nota.getUnidade().equals("") ){
            throw new NotaException("Nota sem Unidade!");
        }

        if (nota.getAvaliacao()==null || nota.getAvaliacao().equals("") ){
            throw new NotaException("Nota sem Avaliação!");
        }

        if (notas==null){
            notas=new ArrayList<>();
        }
        notas.add(nota);
        return notas;
    }
}
