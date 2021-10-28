/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sethp
 */
public class Formatter {

    public void format(String inFile, String outFile) throws IOException {
        Path pathIn = Paths.get(inFile);
        Charset cs = Charset.forName("UTF-8");
        List<String> lines = Files.readAllLines(pathIn, cs);
        List<String> outLines = new ArrayList<>();

        for (String line : lines) {
            String outLine = line.replaceAll("\\s+", " ");
            outLines.add(outLine);
        }

        try ( PrintWriter out = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(outFile), "UTF-8"))) {
            int count = 0;
            int size = outLines.size();
            System.out.println(size);
            for (String line : outLines) {
                if (count == size - 1) {
                    out.print(line.strip());
                } else {
                    out.println(line.strip());
                }
                count++;
                System.out.println(line.strip());
            }
        }
    }
}
