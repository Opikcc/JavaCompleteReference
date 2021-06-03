/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapika;

/*  Display a text file.
    To use this program, specify the name
    of the file that you want to see.
    For example, to see a file called TEST.TXT,
    use the following command line.

    java ShowFile TEST.TXT
*/

import  java.io.*;

/**
 *
 * @author Opick
 */
public class ShowFile {
  String testFile = this.getClass().getResource("").getPath();
  
  public static void main(String[] args) {
    int i;
//    FileInputStream   fin   = null;
//    FileOutputStream  fout  = null;
    ShowFile sf = new ShowFile();
    System.out.println(sf.testFile);
    
    // First, confirm that a filename has been specified.
//    if(args.length != 1) {
//      System.out.println("Usage : ShowFile filename");
//      return;
//    }
    
    // Attempt to open the file.
//    try {
//      fin = new FileInputStream   (sf.testFile + "test.txt");
//      fout  = new FileOutputStream(sf.testFile + "test_out.txt");
//    }
//    catch (FileNotFoundException e) {
//      System.out.println("Cannot Open File");
//      return;
//    }
    
    // At this point, the file is open and can be read.
    // The following reads characters until BOF is encountered.
    try (FileInputStream  fin   = new FileInputStream   (sf.testFile + "test.txt");
         FileOutputStream fout  = new FileOutputStream  (sf.testFile + "test_out.txt")) {
      do {
        i = fin.read();
        if (i != -1)
          fout.write(i);
      }
      while (i != -1);
    }
    catch (IOException e) {
      System.out.println("Error Reading File");
    }
//    finally {
//      // Close file in all cases.
//      try {
//        if (fin != null) fin.close();
//      }
//      catch (IOException e) {
//        System.out.println("Error Closing File");
//      }
//      
//      try {
//        if (fout != null) fout.close();
//      }
//      catch (IOException e) {
//        System.out.println("Error Closing File");
//      }
//    }
  }
}
