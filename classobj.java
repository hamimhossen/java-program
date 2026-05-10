class student {
  String name, gender;
  int id;
  
}
public class classobj{
  public static void main(String[] args){

    student s1 = new student();
    s1.name ="Hamim";
    s1.gender = "Male";
    s1.id = 172;

    System.out.println("First student information:");
    System.out.println("My name is: "+s1.name);
    System.out.println("My gender is: "+s1.gender);
    System.out.println("My id is: "+s1.id);
    System.out.println();

    student s2 = new student();
    s2.name = "Hossen";
    s2.gender = "Male";
    s2.id = 100;

    System.out.println("Second student information:");
    System.out.println("My name is: "+s2.name);
    System.out.println("My gender is: "+s2.gender);
    System.out.println("My id is: "+s2.id);
  }
}
