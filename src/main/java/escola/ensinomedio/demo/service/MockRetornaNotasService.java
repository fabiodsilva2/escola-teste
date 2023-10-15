package escola.ensinomedio.demo.service;

import escola.ensinomedio.demo.exception.NotaException;
import escola.ensinomedio.demo.model.Aluno;
import escola.ensinomedio.demo.model.Disciplina;
import escola.ensinomedio.demo.model.Nota;

import java.util.ArrayList;
import java.util.List;

public class MockRetornaNotasService implements RetornaNotasService {
    private float mediaGeral;

    public MockRetornaNotasService(float mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    @Override
    public List<Nota> gerarBoletim(Aluno aluno) throws NotaException,Exception {
        List<Nota> notas = new ArrayList<>();
        List<Disciplina> disciplinas = null;
        DisciplinaService disciplinaService = new DisciplinaService();
        Disciplina disciplinaBiologia = new Disciplina("Biologia");
        disciplinas = disciplinaService.cadastrarDisciplina(disciplinaBiologia, disciplinas);
        Disciplina disciplinaFisica = new Disciplina("Física");
        disciplinas = disciplinaService.cadastrarDisciplina(disciplinaFisica, disciplinas);
        NotaService notaService = new NotaService();
        for (Integer i = 0; i < 4; i++) {
            for (Disciplina disciplina : disciplinas) {
                Nota nota = new Nota(aluno, disciplina, mediaGeral, "Prova", (i+1) + "ª");
                notas = notaService.cadastrarNota(nota, notas);
            }

        }
        return notas;
    }

    public float getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(float mediaGeral) {
        this.mediaGeral = mediaGeral;
    }
}
