/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapika;

import  java.lang.annotation.*;
import  java.lang.reflect.*;

// An annotation type declaration.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnos {
  String str();
  int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
  String description();
}

/**
 *
 * @author Opick
 */
@What(description = "An annotation test class")
@MyAnnos(str = "Meta2", val = 99)
public class Meta2 {
  // Annotate a method.
  @MyAnno(str = "Annotation Example", val = 100)
  @What(description = "Method Annotation")
  public static void myMeth(String str, int i) {
    Meta2 ob = new Meta2();
    
    // Obtain the annotation for this method
    // and display the values of the members.
    
    try {
      Annotation annos[] = ob.getClass().getAnnotations();
      
      // Display all annotations for Meta2.
      System.out.println("All annotations for Meta2:");
      for(Annotation a : annos)
        System.out.println(a);
      
      System.out.println();
      
      // Display all annotations for myMeth
      Method m = ob.getClass().getMethod("myMeth", String.class, int.class);
      annos = m.getAnnotations();
      
      System.out.println("All annotations for myMeth:");
      for(Annotation a : annos)
        System.out.println(a);
    } catch (NoSuchMethodException exc) {
      System.out.println("Method Not Found.");
    }
  }
  
  public static void main(String args[]) {
    myMeth("test", 100);
  }
}
