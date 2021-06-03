/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapika;

import java.io.*;

/**
 *
 * @author Opick
 */
public class BRRead {
  public static void main (String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char c;
    
    System.out.println("Type q to quit.");
    
    do {
      c = (char) br.read();
      System.out.println(c);
    } while (c != 'q');
  }
}
