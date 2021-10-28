/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sethp
 */
public class FormatterTest {
    
   /**
     * @throws IOException
     * This test makes sure that if the file is formatted correctly it will change nothing
     */
    @Test
    public void testFormat() throws IOException{
        String inFile = "testIn.txt";
        String outFile = "testOut.txt";
        
        Formatter instance = new Formatter();
        instance.format(inFile, outFile);
        
        
        Path pathOut = Paths.get(outFile);
        Path pathBench = Paths.get("benchmark.txt");
        String out = Files.readString(pathOut);
        String benchmark = Files.readString(pathBench);
        assertEquals(out, benchmark);
    }
    
    

    /**
     * @throws IOException
     * This test removes the spaces in-between the words in line
     */
    @Test
    public void testFormat1() throws IOException{
        String inFile = "testIn1.txt";
        String outFile = "testOut1.txt";
        
        Formatter instance = new Formatter();
        instance.format(inFile, outFile);
        
        
        Path pathOut = Paths.get(outFile);
        Path pathBench = Paths.get("benchmark.txt");
        String out = Files.readString(pathOut);
        String benchmark = Files.readString(pathBench);
        assertEquals(out, benchmark);
    }
    
    /**
     * @throws IOException
     * This test removes the spaces before and after the line
     */
    @Test
    public void testFormat2() throws IOException{
        String inFile = "testIn2.txt";
        String outFile = "testOut2.txt";
        
        Formatter instance = new Formatter();
        instance.format(inFile, outFile);
        
        
        Path pathOut = Paths.get(outFile);
        Path pathBench = Paths.get("benchmark.txt");
        String out = Files.readString(pathOut);
        String benchmark = Files.readString(pathBench);
        assertEquals(out, benchmark);
    }
    
    /**
     * @throws IOException
     * This test removes the spaces before, after and in-between the line
     */
    @Test
    public void testFormat3() throws IOException{
        String inFile = "testIn3.txt";
        String outFile = "testOut3.txt";
        
        Formatter instance = new Formatter();
        instance.format(inFile, outFile);
        
        
        Path pathOut = Paths.get(outFile);
        Path pathBench = Paths.get("benchmark.txt");
        String out = Files.readString(pathOut);
        String benchmark = Files.readString(pathBench);
        assertEquals(out, benchmark);
    }
    
}
