package escola.ensinomedio.demo.service;

import escola.ensinomedio.demo.model.Aluno;
import escola.ensinomedio.demo.model.Nota;

import java.util.List;

public interface RetornaNotasService {
    public List<Nota> gerarBoletim(Aluno aluno) throws Exception;
}
