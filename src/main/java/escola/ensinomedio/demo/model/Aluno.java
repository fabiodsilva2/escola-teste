package escola.ensinomedio.demo.model;

public class Aluno {
    private String matricula;
    private String nome;

    private Turma turma;
    public Aluno(String matricula,String nome,Turma turma){
        this.matricula=matricula;
        this.nome=nome;
        this.turma=turma;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
