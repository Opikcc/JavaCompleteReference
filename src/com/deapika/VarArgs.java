/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapika;

/**
 *
 * @author Opick
 */
public class VarArgs {
  static void vaTest (int ... v) {
    System.out.print("Number of args : " + v.length + " Contents : ");
    for (int x : v)
      System.out.print(x + " ");
    System.out.println("");
  }
  
  public static void main (String args[]) {
    vaTest(1);
    vaTest(1, 2, 3);
    vaTest();
  }
}