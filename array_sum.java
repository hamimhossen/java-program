import java.util.Scanner;
public class array_sum {
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    int n;
    System.out.print("Enter array size: ");
    n = input.nextInt();

    int[] arr = new int[n];
    int sum = 0;

    System.out.print("Enter any numbers: ");
    for(int i=0; i<n; i++){
      arr[i] = input.nextInt();
    }

    for(int i=0; i<n; i++){
      sum = sum + arr[i];
    }

    System.out.println("The sum is: "+sum);
  }
}
