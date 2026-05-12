class Student{
  String name;
  int id;
  static String UniversityName = "BUBT";

  Student(String n, int i){
    name = n;
    id = i;
  }
  void display(){
    System.out.println("Name: "+name);
    System.out.println("Id: "+id);
    System.out.println("University Name: "+UniversityName);
    System.out.println();
  }

}
public class static_variable {
  public static void main(String[] args){
    Student obj1 = new Student("Hamim", 172);
    System.out.println("First student information:");
    obj1.display();

    Student obj2 = new Student("Jerin", 500);
    System.out.println("Second student information:");
    obj2.display(); 
  }
}
