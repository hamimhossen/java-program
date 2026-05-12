import java.util.Scanner;
class A{
  int sum(int a, int b){
    return a+b;
  }
  int sub(int a, int b){
    return a-b;
  }
  int mul(int a, int b){
    return a*b;
  }
  int div(int a, int b){
    return a/b;
  }
}

public class return_type_userinput {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int num1, num2;
    System.out.print("Enter first number: ");
    num1 = input.nextInt();

    System.out.print("Enter second number: ");
    num2 = input.nextInt();

    A obj = new A();
    int add = obj.sum(num1, num2);
    int subtract = obj.sub(num1, num2);
    int multiply = obj.mul(num1, num2);
    int divide = obj.div(num1, num2);

    System.out.println("Summation = "+add);
    System.out.println("Subtraction = "+subtract);
    System.out.println("Multiplication = "+multiply);
    System.out.println("Division = "+divide);
    
  }
  
}
