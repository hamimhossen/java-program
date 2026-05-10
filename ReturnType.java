public class ReturnType {
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

  public static void main(String[] args){
    ReturnType obj = new ReturnType();

    int add = obj.sum(20, 10);
    int subtract = obj.sub(20, 10);
    int multiply = obj.mul(20, 10);
    int divide = obj.div(20, 10);

    System.out.println("Summation = "+add);
    System.out.println("Subtraction = "+subtract);
    System.out.println("Multiplication = "+multiply);
    System.out.println("Division = "+divide);

  }

}
