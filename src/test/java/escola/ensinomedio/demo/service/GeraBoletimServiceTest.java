package escola.ensinomedio.demo.service;

import escola.ensinomedio.demo.model.Aluno;
import escola.ensinomedio.demo.model.Turma;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeraBoletimServiceTest {

    private static RetornaNotasService mockRetornaNotasService;
    private static Turma turma;
    private static Aluno aluno;

    @BeforeAll
    public static void init(){
        mockRetornaNotasService=new MockRetornaNotasService(10);
        turma=new Turma(1,"1º A");
        aluno=new Aluno("1234","Fábio Silva",turma);
    }

    @Test
    @DisplayName("O aluno referenciado deve estar em qualquer nota do Boletim")
    void constroiBoletimPorAluno() throws Exception {
        GeraBoletimService geraBoletimService=new GeraBoletimService(mockRetornaNotasService);
        Aluno alunoTest=geraBoletimService.constroiBoletimPorAluno(aluno).getNotas().get(0).getAluno();
        assertEquals(aluno.getMatricula(),alunoTest.getMatricula());
    }


    @Test
    @DisplayName("A média Geral do Boletim deve ser, no caso do Mock, igual ao atributo estático final")
    void testaMediaGeralDoBoletim() throws Exception {
        GeraBoletimService geraBoletimService=new GeraBoletimService(mockRetornaNotasService);
        float mediaGeral=geraBoletimService.constroiBoletimPorAluno(aluno).getMediaGeral();
        assertEquals(mediaGeral,((MockRetornaNotasService)mockRetornaNotasService).getMediaGeral());
    }

}