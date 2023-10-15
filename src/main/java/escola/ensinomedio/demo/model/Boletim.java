package escola.ensinomedio.demo.model;

import java.util.List;

public class Boletim {

    List<Nota> notas;
    Aluno aluno;
    Float mediaGeral;

    public Boletim(List<Nota> notas, Aluno aluno, Float mediaGeral) {
        this.notas = notas;
        this.aluno = aluno;
        this.mediaGeral = mediaGeral;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Float getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(Float mediaGeral) {
        this.mediaGeral = mediaGeral;
    }
}
