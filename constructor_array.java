class Employee{
  String name;
  int id;
  Employee(String n, int i){
    name = n;
    id = i;
  }
  void displayEmployee(){
    System.out.println("Name: "+name);
    System.out.println("Id: "+id);
  }
}
class Teacher extends Employee{
  int[] marks;
  Teacher(String n, int i, int[] m){
    super(n,i);
    marks = m;
  }
  void displayTeacher(){
    displayEmployee();
    System.out.println("Training Evaluation Marks: ");
    for(int i=0; i<3; i++){
      System.out.println("Evaluation "+(i+1)+": "+marks[i]);
    }
  }
}
public class constructor_array {
  public static void main(String[] args){

  int[] evaluationMarks={80,90,75};

  Teacher obj = new Teacher("Tom",172,evaluationMarks);
  obj.displayTeacher();

  }
}
