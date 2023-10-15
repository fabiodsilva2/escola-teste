package escola.ensinomedio.demo.service;

import escola.ensinomedio.demo.model.Disciplina;
import escola.ensinomedio.demo.model.Turma;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaService {

    public List<Disciplina> cadastrarDisciplina(Disciplina disciplina, List<Disciplina>disciplinas) throws Exception {

        if (disciplina==null){
            throw new Exception("Disciplina não pode ser nula!");
        }
        if (disciplina.getNome()==null || disciplina.getNome().equals("")){
            throw new Exception("Disciplina Faltando o nome!");
        }

        if (disciplinas==null){
            disciplinas=new ArrayList<>();
        }
        disciplinas.add(disciplina);
        return disciplinas;
    }

}
