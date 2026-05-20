import java.util.Scanner;
public class array_max_min {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int n;
    System.out.print("Enter array size: ");
    n = input.nextInt();

    int[] arr = new int[n];

    System.out.print("Enter any numbers: ");
    for(int i=0; i<n; i++){
      arr[i] = input.nextInt();
    }
    int max = arr[0];
    int min = arr[0];

    for(int i=1; i<n; i++){
      if(max < arr[i]){
        max = arr[i];
      }
      if(min > arr[i]){
        min = arr[i];
      }
    }
    System.out.println("Maximum number: "+max);
    System.out.println("Minimum number: "+min);
  }
}
