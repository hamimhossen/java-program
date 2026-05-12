class student{
  String name, department;
  int id;

  student(String n, String d, int i){
    name = n;
    department = d;
    id = i;
  }

  void display(){
    System.out.println("My name is: "+name);
    System.out.println("My department is: "+department);
    System.out.println("My id is: "+id);
    System.out.println();
  }
}

public class parametarized_constructor {
  public static void main(String[] args){
    student obj1 = new student("Hamim", "CSE", 172);
    System.out.println("First student information:");
    obj1.display();

    student obj2 = new student("Sara", "BBA", 200);
    System.out.println("Second student information:");
    obj2.display();

  }
  
}
