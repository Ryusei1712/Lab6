package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TextEditor {
    private String text;
    @Autowired
    @Qualifier("plainTextWriter")
    private TextWriter textWriter;

    public void save(String fileName) {
        textWriter.write(fileName, text);
    }

    public void input(String inputText) {
        this.text = inputText;
    }
}




