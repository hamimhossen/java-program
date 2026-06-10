class Person{
  String name;
  int age;

  void display_information1(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
  }
}
class Teacher extends Person{
  String qualification;

  void display_information2(){
    display_information1();
    System.out.println("Qualification: "+qualification);
  }
} 
public class first_inheritance {
  public static void main(String[] args){
    Teacher ob1 = new Teacher();
    ob1.name = "Rah";
    ob1.age = 24;
    ob1.qualification = "B.sc. in CSE";
    ob1.display_information2();

    System.out.println();
    
    Teacher ob2 = new Teacher();
    ob2.name = "Hamm";
    ob2.age = 10;
    ob2.qualification = "M.sc. in CSE";
    ob2.display_information2();
  }
}
