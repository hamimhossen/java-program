import java.util.Scanner;
public class searching {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n;
    System.out.print("Enter array size: ");
    n = sc.nextInt();

    int[] array = new int[n];

    System.out.print("Enter array element: ");
    for(int i=0; i<n; i++){
      array[i] = sc.nextInt();
    }
    int value;
    System.out.print("Enter searching the value: ");
    value = sc.nextInt();

    boolean found = false;
    for(int i=0; i<n; i++){
      if(value==array[i]){
        found = true;
        break;
      }
    }
    if(found==true){
      System.out.println("Value is found");
    }
    else{
      System.out.println("Value is not found");
    }
  }
  
}
