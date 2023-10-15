package escola.ensinomedio.demo.service;

import escola.ensinomedio.demo.model.Professor;
import escola.ensinomedio.demo.model.Turma;

import java.util.ArrayList;
import java.util.List;

public class ProfessorService {


    public List<Professor> cadastrarProfessor(Professor professor, List<Professor>professores) throws Exception {

        if (professor==null){
            throw new Exception("Professor não pode ser nulo!");
        }
        if (professor.getNome() ==null || professor.getNome().equals("")){
            throw new Exception("Professor faltando nome");
        }

        if (professor.getDisciplinas().isEmpty() ){
            throw new Exception("Professor sem disciplina");
        }

        if (professor.getTurmas().isEmpty() ){
            throw new Exception("Professor sem Turma");
        }

        if (professores==null){
            professores=new ArrayList<>();
        }
        professores.add(professor);
        return professores;
    }
}
