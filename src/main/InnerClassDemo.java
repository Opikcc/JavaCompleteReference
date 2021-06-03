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

class OuterClass {
  int outer_x = 100;

  OuterClass () {
    Inner inner = new Inner();
    inner.display();
  }
  
  class Inner {
    void display() {
      System.out.println("display : outer_x : " + outer_x);
    }
  }
}

public class InnerClassDemo {
  public static void main(String[] args) {
    OuterClass Outer = new OuterClass();
  }
}
