package escola.ensinomedio.demo.model;

import java.util.List;

public class Professor {

    private String nome;
    private List<Turma> turmas;
    private List<Disciplina> disciplinas;

    private String matricula;

    public Professor(String nome,String matricula,List<Turma> turmas,List<Disciplina> disciplinas){
        this.nome=nome;
        this.matricula=matricula;
        this.turmas=turmas;
        this.disciplinas=disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
