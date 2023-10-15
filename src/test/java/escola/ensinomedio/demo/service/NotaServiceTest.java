package escola.ensinomedio.demo.service;

import escola.ensinomedio.demo.exception.NotaException;
import escola.ensinomedio.demo.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



class NotaServiceTest {
    private List<Nota> notas;
    private NotaService notaService;

    private Disciplina disciplina;

    private Aluno aluno;

    @BeforeEach
    void cadastraNota() throws Exception {

        notaService=new NotaService();
        DisciplinaService disciplinaService=new DisciplinaService();
        disciplina=new Disciplina("Biologia");
        disciplina=disciplinaService.cadastrarDisciplina(disciplina,null).get(0);
        Turma turma=new Turma(1,"1º A");
        TurmaService turmaService=new TurmaService();
        turma=turmaService.cadastrarTurma(turma,null).get(0);
        AlunoService alunoService=new AlunoService();
        aluno=new Aluno("1234","Fabio Silva",turma);
        aluno=alunoService.cadastrarAluno(aluno,null).get(0);
        notas=new ArrayList<>();
    }


    @DisplayName("Deveria levantar uma exceção caso a nota seja menor que zero")
    @Test
    void cadastrarNotaMenorQueZero(){


        Nota nota=new Nota(aluno,disciplina,-1,"Teste","I");

        assertThrows(NotaException.class, () -> {
            notaService.cadastrarNota(nota,notas);
        });


    }

    @DisplayName("Deveria levantar uma exceção caso o aluno seja nulo")
    @Test
    void cadastrarComAlunoNulo(){


        Nota nota=new Nota(null,disciplina,10,"Teste","I");

        assertThrows(NotaException.class, () -> {
            notaService.cadastrarNota(nota,notas);
        });


    }


    @DisplayName("Deveria levantar uma exceção caso a disciplina seja nula")
    @Test
    void cadastrarComDisciplinaNula(){


        Nota nota=new Nota(aluno,null,10,"Teste","I");

        assertThrows(NotaException.class, () -> {
            notaService.cadastrarNota(nota,notas);
        });


    }


    @DisplayName("Deveria levantar uma exceção caso a Avaliação seja nula")
    @Test
    void cadastrarComAvaliacaoNula(){


        Nota nota=new Nota(aluno,disciplina,10,null,"I");

        assertThrows(NotaException.class, () -> {
            notaService.cadastrarNota(nota,notas);
        });


    }

    @DisplayName("Deveria levantar uma exceção caso a Unidade seja nula")
    @Test
    void cadastrarComUnidadeNula(){


        Nota nota=new Nota(aluno,disciplina,10,"Teste",null);

        assertThrows(NotaException.class, () -> {
            notaService.cadastrarNota(nota,notas);
        });


    }



    @DisplayName("Deveria retornar uma lista não vazia caso tudo esteja ok.")
    @Test
    void cadastrarNota(){


        Nota nota=new Nota(aluno,disciplina,10,"Teste","I");

        try {
            notas=notaService.cadastrarNota(nota, notas);
            assertFalse(notas.isEmpty());
        }catch (NotaException ex){

        }



    }


}