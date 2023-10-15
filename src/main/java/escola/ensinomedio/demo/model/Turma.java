package escola.ensinomedio.demo.model;

public class Turma {
    private int codTurma;
    private String descricao;


    public Turma(int codTurma,String descricao){
        this.codTurma=codTurma;
        this.descricao=descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(int codTurma) {
        this.codTurma = codTurma;
    }
}
