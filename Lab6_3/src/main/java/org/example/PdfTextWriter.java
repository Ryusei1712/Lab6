package org.example;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Qualifier("pdfTextWriter")
public class PdfTextWriter implements TextWriter {
    @Override
    public void write(String fileName, String text) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, Files.newOutputStream(Paths.get(fileName)));
            document.open();
            document.add(new Paragraph(text));
            document.close();
            System.out.println("PDF content written to file: " + fileName);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}



