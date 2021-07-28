package JavaClass;

class OuterClass {
  String outer;

  OuterClass() {
    this.outer = "Outer String";
  }
  
  void test() {
    InnerClass innerClass = new InnerClass();
    innerClass.display();
  }
  
  class InnerClass {
    String inner;
    
    InnerClass() {
      this.inner = "Inner String";
    }
    
    void display() {
      System.out.println("Outer Class : " + outer);
      System.out.println("Inner Class : " + inner);
    }
  }
}

public class InnerClassDemo {
  public static void main(String[] args) {
    OuterClass outer = new OuterClass();
    outer.test();
  }
}
