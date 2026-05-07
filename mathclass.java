public class mathclass {
  public static void main(String[] args) {

    int x = 20;
    int y = -10;

    int max = Math.max(x, y);
    System.out.println("Maximum value: " + max);

    int min = Math.min(x, y);
    System.out.println("Minimum value: " + min);

    int absolute = Math.abs(y);
    System.out.println("Absolute value of y: " + absolute);

    double power = Math.pow(x, 2);
    System.out.println("x to the power 2: " + power);

    double round = Math.round(8.8);
    System.out.println("Round of 8.8: " + round);

  }

  
}
