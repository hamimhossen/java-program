import java.util.Scanner;
class student{
  String name, department;
  int id;

  student(String n, String d, int i){
    name = n;
    department = d;
    id = i;
  }
  void display(){
    System.out.println("Name: "+name);
    System.out.println("Department: "+department);
    System.out.println("Id: "+id);
    System.out.println();
  }
}
public class constructor_userinput {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    String name, department;
    int id;

    System.out.print("Enter name: ");
    name = input.nextLine();

    System.out.print("Enter department: ");
    department = input.nextLine();

    System.out.print("Enter id: ");
    id = input.nextInt();
    
    student obj = new student(name, department, id);
    System.out.println("Student information:");
    obj.display();
  }
  
}
