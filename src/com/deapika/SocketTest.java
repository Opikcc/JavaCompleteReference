/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapika;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * This program makes a socket connection to the atomic clock in Boulder, Colorado, and prints
 * the time that the server sends.
 * @author Opick
 */
public class SocketTest {
  public static void main(String[] args) throws IOException {
    try (Socket s = new Socket("time-a.nist.gov", 13);
         Scanner in = new Scanner(s.getInputStream(), "UTF-8")) {
      while (in.hasNextLine()) {
        String line = in.nextLine();
        System.out.println(line);
      }
    }
  }
}
