/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapika;

/**
 *
 * @author newcomer
 */
public class InheritanceSample {
  public static void main(String[] Args) {
    A superOb = new A();
    B subOb   = new B();
    
    superOb.i = 10;
    superOb.j = 12;
    superOb.showij();
    
    subOb.i = 1;
    subOb.j = 2;
    subOb.k = 3;
    subOb.showij();
    subOb.showk();
    subOb.sum();
  }
}

class A {
    int i, j;
    
    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;
    
    void showk() {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println("i+j+k: " + (i+j+k));
    }
}