package escola.ensinomedio.demo.service;

import escola.ensinomedio.demo.model.Aluno;
import escola.ensinomedio.demo.model.Boletim;
import escola.ensinomedio.demo.model.Nota;
import escola.ensinomedio.demo.model.Turma;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ImprimirBoletimServiceTest {

    private static RetornaNotasService mockRetornaNotasService;
    private static final String caminhoArquivo="C:\\Users\\fabio\\Documents\\Boletim.pdf";

    @BeforeAll
    public static void init(){
        mockRetornaNotasService=new MockRetornaNotasService(10);
    }

    @Test
    void testarImpressaoBoletim() throws Exception {
        GeraBoletimService geraBoletimService=new GeraBoletimService(mockRetornaNotasService);
        Turma turma=new Turma(1,"1º A");
        Aluno aluno=new Aluno("1234","Fábio Silva",turma);
        Boletim boletim = geraBoletimService.constroiBoletimPorAluno(aluno);
        ImprimirBoletimService ibs=new ImprimirBoletimService();
        ibs.imprimirBoletim(boletim,caminhoArquivo);
        File arquivo = new File(caminhoArquivo);
        assertTrue(arquivo.exists());
    }

}