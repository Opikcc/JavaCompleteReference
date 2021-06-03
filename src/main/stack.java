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
public class stack {
  public static void main(String[] args) {
    stackTree stack1 = new stackTree();
    
    for (int i = 1; i <= 10; i++)
      stack1.push(i);
    
    for (int i = 1; i <= 10; i++)
      System.out.println("Stack " + i + " : " + stack1.pop());
  }
}

class stackTree {
  private int stck[] = new int[10];
  private int tos;
  
  stackTree () {
    tos = -1;
  }
  
  void push(int item) {
    if (tos == 9)
      System.out.println("Stack is full");
    else
      stck[++tos] = item;
  }
  
  public int pop() {
    if (tos == -1)
      System.out.println("You're at the bottom of stack");
    else
      return stck[tos--];
    return 0;
  }
}
