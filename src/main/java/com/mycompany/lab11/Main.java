/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab11;

import java.io.IOException;

/**
 *
 * @author sethp
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Formatter formatter = new Formatter();
        
        formatter.format("testIn1.txt", "testOut1.txt");
    }
}
