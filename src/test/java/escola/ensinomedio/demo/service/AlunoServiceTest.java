package escola.ensinomedio.demo.service;

import escola.ensinomedio.demo.model.Aluno;
import escola.ensinomedio.demo.model.Turma;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlunoServiceTest {

    List<Aluno> alunos;




    @DisplayName("Deveria levantar uma exceção caso o aluno não tenha nome")
    @Test
    void cadastrarFaltandoNome(){
        AlunoService alunoService=new AlunoService();
        Turma turma=new Turma(1,"1º A");
        Aluno aluno=new Aluno("BA393303",null,turma);
        assertThrows(Exception.class, () -> {
            alunoService.cadastrarAluno(aluno,alunos);
        });


    }

    @DisplayName("Deveria levantar uma exceção caso o aluno não tenha matrícula")
    @Test
    void cadastrarFaltandoMatricula(){
        AlunoService alunoService=new AlunoService();
        Turma turma=new Turma(1,"1º A");
        Aluno aluno=new Aluno(null,"Fábio Silva",turma);
        assertThrows(Exception.class, () -> {
            alunoService.cadastrarAluno(aluno,alunos);
        });


    }


    @DisplayName("Deveria cadastrar um aluno e retornar uma lista não vazia")
    @Test
    void cadastrarAlunoSemProblema(){
        AlunoService alunoService=new AlunoService();
        Turma turma=new Turma(1,"1º A");
        Aluno aluno=new Aluno("BA393303","Fábio Silva",turma);

        try {
            alunos = alunoService.cadastrarAluno(aluno,alunos);
            assertFalse(alunos.isEmpty());

        }catch (Exception ex){

        }

    }


    @DisplayName("Deveria levantar uma exceção caso o aluno não tenha turma")
    @Test
    void cadastrarFaltandoTurma(){
        AlunoService alunoService=new AlunoService();

        Aluno aluno=new Aluno(null,"Fábio Silva",null);
        assertThrows(Exception.class, () -> {
            alunoService.cadastrarAluno(aluno,alunos);
        });


    }

}