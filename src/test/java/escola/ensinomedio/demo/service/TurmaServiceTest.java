package escola.ensinomedio.demo.service;

import escola.ensinomedio.demo.model.Aluno;
import escola.ensinomedio.demo.model.Turma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TurmaServiceTest {
    List<Turma> turmas;
    TurmaService turmaService;


    @BeforeEach
    void instanciaTurmaService(){
        turmaService=new TurmaService();
    }

    @DisplayName("Deveria levantar uma exceção caso a turma não tenha nome")
    @Test
    void cadastrarFaltandoNome(){

        Turma turma=new Turma(1,null);

        assertThrows(Exception.class, () -> {
            turmaService.cadastrarTurma(turma,turmas);
        });


    }

    @DisplayName("Deveria levantar uma exceção caso a turma não tenha código")
    @Test
    void cadastrarFaltandoCodigo(){

        Turma turma=new Turma(0,"1º A");

        assertThrows(Exception.class, () -> {
            turmaService.cadastrarTurma(turma,turmas);
        });


    }


    @DisplayName("Deveria cadastrar uma turma e retornar uma lista não vazia")
    @Test
    void cadastrarTurmaSemProblema(){

        Turma turma=new Turma(1,"1º A");


        try {
            turmas = turmaService.cadastrarTurma(turma,turmas);
            assertFalse(turmas.isEmpty());

        }catch (Exception ex){

        }

    }


}