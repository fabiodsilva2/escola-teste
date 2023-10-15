package escola.ensinomedio.demo.service;

import escola.ensinomedio.demo.model.Disciplina;
import escola.ensinomedio.demo.model.Turma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DisciplinaServiceTest {
private DisciplinaService disciplinaService;

    @BeforeEach
    void instanciaDisciplinaService(){
        disciplinaService=new DisciplinaService();
    }

    @DisplayName("Deveria levantar uma exceção caso a turma não tenha código")
    @Test
    void cadastrarFaltandoNome(){

        Disciplina disciplina=new Disciplina(null);

        assertThrows(Exception.class, () -> {
            disciplinaService.cadastrarDisciplina(disciplina,null);
        });


    }


    @DisplayName("Deveria cadastrar uma disciplina e retornar uma lista não vazia")
    @Test
    void cadastrarTurmaSemProblema(){

        Disciplina disciplina=new Disciplina("Física");


        try {
            List<Disciplina> disciplinas = disciplinaService.cadastrarDisciplina(disciplina,null);
            assertFalse(disciplinas.isEmpty());

        }catch (Exception ex){

        }

    }




}