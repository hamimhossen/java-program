import java.util.Scanner;
public class triangle_calculation {
  public static void main(String[] args){

    Scanner num = new Scanner(System.in);

    int base, height;
    double area;

    System.out.print("Enter the base: ");
    base = num.nextInt();

    System.out.print("Enter the height: ");
    height = num.nextInt();

    area = 0.5 * base * height;

    System.out.println("Area of Triangle: "+area);

  }
  
}
