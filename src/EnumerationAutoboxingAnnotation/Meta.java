package EnumerationAutoboxingAnnotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

// An annotation type declaration.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
  String str();
  int val();
}

public class Meta {
  
  // Annotate a method.
  @MyAnno(str = "Annotaion Example", val = 100)
  public static void myMeth(String str, int val) {
    Meta ob = new Meta();
    
    // Obtain the annotation for this method
    // and display the values of members.
    try {
      // First, get a Class object that represents
      // this class.
      Class<?> c = ob.getClass();
      
      // Now, get a Method object that represents
      // this method
      Method m = c.getMethod("myMeth", String.class, int.class);
      
      // Next, get the annotation for this class.
      MyAnno anno = m.getAnnotation(MyAnno.class);
      
      // Finally, display the values.
      System.out.println(anno.str() + " " + anno.val());
    }
    catch (NoSuchMethodException exc) {
      System.out.println("Method Not Found.");
    }
  }
  
  public static void main(String[] args) {
    myMeth("test", 10);
  }
}
