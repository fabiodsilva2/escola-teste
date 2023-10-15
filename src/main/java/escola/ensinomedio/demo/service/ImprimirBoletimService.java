package escola.ensinomedio.demo.service;


import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.element.Paragraph;
import escola.ensinomedio.demo.model.Boletim;
import escola.ensinomedio.demo.model.Nota;
import java.io.File;
import java.io.FileNotFoundException;
import com.itextpdf.layout.Document;


import java.util.List;

public class ImprimirBoletimService {

    public void imprimirBoletim(Boletim boletim, String caminhoDestino) throws FileNotFoundException {
        PdfWriter writer = new PdfWriter(new File(caminhoDestino));
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);

        document.add(new Paragraph("Aluno: "+boletim.getAluno().getNome()));
        document.add(new Paragraph("Média Geral: "+boletim.getMediaGeral()));
        document.add(new Paragraph("Turma: "+boletim.getAluno().getTurma().getDescricao()));
        document.add(new Paragraph("\n"));
        for (Nota nota : boletim.getNotas()) {
            document.add(new Paragraph("Disciplina: " + nota.getDisciplina().getNome()));
            document.add(new Paragraph("Avaliação: " + nota.getAvaliacao()));
            document.add(new Paragraph("Unidade: " + nota.getUnidade()));
            document.add(new Paragraph("Nota: " + nota.getNota()));
            document.add(new Paragraph("\n"));
        }
        document.close();

    }
}
