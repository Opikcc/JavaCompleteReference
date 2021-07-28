package JavaClass;

class Box {
  double length;
  double width;
  double depth;
}

class BoxDemo {
  public static void main(String ... args) {
    Box myBox = new Box();
    
    myBox.length  = 1.25;
    myBox.width   = 3.33;
    myBox.depth   = 2.51;
    
    System.out.println("Box Volume : " + (myBox.length * myBox.width * myBox.depth) + " m2");
  }
}
