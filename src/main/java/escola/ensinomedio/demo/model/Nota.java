package escola.ensinomedio.demo.model;

public class Nota {
    private Aluno aluno;
    private Disciplina disciplina;
    private float nota;
    private String avaliacao;
    private String unidade;

    public Nota(Aluno aluno, Disciplina disciplina, float nota, String avaliacao, String unidade) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.nota = nota;
        this.avaliacao = avaliacao;
        this.unidade = unidade;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
}
