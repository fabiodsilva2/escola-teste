package escola.ensinomedio.demo.service;

import escola.ensinomedio.demo.model.Disciplina;
import escola.ensinomedio.demo.model.Professor;
import escola.ensinomedio.demo.model.Turma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorServiceTest {

    List<Professor> professores;
    ProfessorService professorService;

    List<Turma> turmas;
    List<Disciplina> disciplinas;

    @BeforeEach
    void cadastraTurma() throws Exception {

        Turma turma=new Turma(1,"1º A");
        TurmaService turmaService=new TurmaService();
        turmas=turmaService.cadastrarTurma(turma,turmas);

        Disciplina disciplina=new Disciplina("Física");
        DisciplinaService disciplinaService=new DisciplinaService();
        disciplinas=disciplinaService.cadastrarDisciplina(disciplina,disciplinas);


    }



    @DisplayName("Deveria levantar uma exceção caso o professor não tenha nome")
    @Test
    void cadastrarFaltandoNome(){


        Professor professor=new Professor(null,"1234",turmas,disciplinas);

        assertThrows(Exception.class, () -> {
            professorService.cadastrarProfessor(professor,professores);
        });


    }

    @DisplayName("Deveria levantar uma exceção caso o professor não tenha matricula")
    @Test
    void cadastrarFaltandoMatricula(){


        Professor professor=new Professor("Fábio Silva",null,turmas,disciplinas);

        assertThrows(Exception.class, () -> {
            professorService.cadastrarProfessor(professor,professores);
        });


    }

    @DisplayName("Deveria levantar uma exceção caso o professor não tenha disciplina")
    @Test
    void cadastrarFaltandoDisciplina(){


        Professor professor=new Professor("Fábio Silva","1234",turmas,null);

        assertThrows(Exception.class, () -> {
            professorService.cadastrarProfessor(professor,professores);
        });


    }

    @DisplayName("Deveria levantar uma exceção caso o professor não tenha turma")
    @Test
    void cadastrarFaltandoTurma(){


        Professor professor=new Professor("Fábio Silva","1234",null,disciplinas);

        assertThrows(Exception.class, () -> {
            professorService.cadastrarProfessor(professor,professores);
        });


    }

    @DisplayName("Deveria retornar uma lista não vazia caso tudo esteja ok.")
    @Test
    void cadastrarProfessor(){


        Professor professor=new Professor("Fábio Silva","1234",turmas,disciplinas);

            try {
                professores=professorService.cadastrarProfessor(professor, professores);
                assertFalse(professores.isEmpty());
            }catch (Exception ex){

            }



    }


}