package escola.ensinomedio.demo.service;

import escola.ensinomedio.demo.model.Aluno;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class AlunoService {

    public List<Aluno> cadastrarAluno(Aluno aluno, List<Aluno>alunos) throws Exception {

        if (aluno==null){
            throw new Exception("Aluno não pode ser nulo!");
        }
        if (aluno.getNome()==null || aluno.getNome().equals("")){
            throw new Exception("Aluno Faltando o nome!");
        }

        if (aluno.getMatricula()==null || aluno.getMatricula().equals("")){
            throw new Exception("Aluno Faltando matrícula!");
        }

        if (aluno.getTurma()==null){
            throw new Exception("Aluno Faltando Turma!");
        }

        if (alunos==null){
            alunos=new ArrayList<>();
        }
        alunos.add(aluno);
        return alunos;
    }
}
