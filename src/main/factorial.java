/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Opick
 */
public class factorial {
  private int fact (int i) {
    if ((i - 1) > 0)
      return i * fact(i - 1);
    else
      return 1;
  }
  
  public static void main(String[] args) {
    int x = 20;
    factorial facts = new factorial();
    System.out.println("factorial " + x + " : " + facts.fact(x));
  }
}
