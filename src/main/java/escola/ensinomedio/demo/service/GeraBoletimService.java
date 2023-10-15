package escola.ensinomedio.demo.service;

import escola.ensinomedio.demo.model.Aluno;
import escola.ensinomedio.demo.model.Nota;
import escola.ensinomedio.demo.model.Boletim;

import java.util.List;

public class GeraBoletimService {



    private RetornaNotasService retornaNotasService;

    public GeraBoletimService(RetornaNotasService rns){
        this.retornaNotasService=rns;
    }

    public Boletim constroiBoletimPorAluno(Aluno aluno) throws Exception {
        List<Nota>notas=retornaNotasService.gerarBoletim(aluno);
        Float mediaGeral=0.0F;
        for(Nota nota:notas){
            mediaGeral+=nota.getNota();
        }
        mediaGeral=mediaGeral/notas.size();
        Boletim boletim =new Boletim(notas,aluno,mediaGeral);
        return boletim;


    }
}
