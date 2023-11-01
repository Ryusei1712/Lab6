package org.example;

import org.springframework.beans.factory.annotation.Qualifier;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Qualifier("plainTextWriter")
public class PlainTextWriter implements TextWriter {
    @Override
    public void write(String fileName, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
            System.out.println("Text content written to file: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



