class students {
  String name, gender;
  int id;

  void display(){
    System.out.println("My name is: "+name);
    System.out.println("My gender is: "+gender);
    System.out.println("My id is: "+id);
    System.out.println();
  }
  
}
public class method{
  public static void main(String[] args){

    students s1 = new students();
    s1.name = "Hamim";
    s1.gender = "Male";
    s1.id = 172;
    System.out.println("First student information:");
    s1.display();

    students s2 = new students();
    s2.name = "Khan";
    s2.gender = "Male";
    s2.id = 100;
    System.out.println("Second student information:");
    s2.display();
  
  }

}
