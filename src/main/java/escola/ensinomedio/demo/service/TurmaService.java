package escola.ensinomedio.demo.service;

import escola.ensinomedio.demo.model.Aluno;
import escola.ensinomedio.demo.model.Turma;

import java.util.ArrayList;
import java.util.List;

public class TurmaService {


    public List<Turma> cadastrarTurma(Turma turma, List<Turma>turmas) throws Exception {

        if (turma==null){
            throw new Exception("Turma não pode ser nula!");
        }
        if (turma.getDescricao()==null || turma.getDescricao().equals("")){
            throw new Exception("Turma Faltando o nome!");
        }

        if (turma.getCodTurma()<=0){
            throw new Exception("Turma Faltando código!");
        }

        if (turmas==null){
            turmas=new ArrayList<>();
        }
        turmas.add(turma);
        return turmas;
    }

}
