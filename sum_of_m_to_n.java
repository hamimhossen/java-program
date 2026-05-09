import java.util.Scanner;
public class sum_of_m_to_n {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int m, n;
    System.out.print("Enter the initial number: ");
    m = input.nextInt();

    System.out.print("Enter the last value: ");
    n = input.nextInt();

    int sum = 0;
    for(int i=m; i<=n; i++){
      sum = sum + i;
    }
    System.out.println("The sum is :"+sum);

  }
}
