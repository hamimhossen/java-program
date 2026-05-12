class teacher{
  String name, dept;
  int age;

  teacher(){
    name = "No Name";
    dept = "No Department";
    age = 00;
  }
  teacher(String n, String d){
    name = n;
    dept = d;
  }
  teacher(String n, String d, int a){
    name = n;
    dept = d;
    age = a;
  }
  void display(){
    System.out.println("Name: "+name);
    System.out.println("Department: "+dept);
    System.out.println("Age: "+age);
    System.out.println();
  }
}
public class constructor_overloading {
  public static void main(String[] args){

    teacher obj1 = new teacher();
    System.out.println("First teacher information:");
    obj1.display();

    teacher obj2 = new teacher("Jeri", "CSE");
    System.out.println("Second teacher information:");
    obj2.display();

    teacher obj3 = new teacher("Sara", "BBA", 25);
    System.out.println("Third teacher information:");
    obj3.display();
  }
  
}
