import java.util.Scanner;
public class circle_calculation {
  public static void main(String[] args){

    Scanner num = new Scanner(System.in);

    int radius;
    double area;

    System.out.print("Enter the radius: ");
    radius = num.nextInt();

    area = 3.1416 * radius * radius;

    System.out.println("Area of circle: "+area);

  }
  
}
