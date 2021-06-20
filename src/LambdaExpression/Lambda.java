package LambdaExpression;

public class Lambda {
  public static void main(String[] args) {
    MyNumber myNum;
    myNum = () -> 1234.5;
    System.out.println("myNum : " + myNum.getValue());
  }
}
