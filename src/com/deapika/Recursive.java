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
public class Recursive {
  public static void main (String args[]) {
    Recursive rec = new Recursive();
    System.out.println("5! = " + rec.fact(5));
  }

  private int fact (int x) {
    System.out.println("x : " + x);
    if (x == 1)
      return 1;
    else
      return fact(x - 1) * x;
  }
}
