abstract class MobileUser{
  abstract void send_message();
}
class Rahim extends MobileUser{
  @Override
  void send_message(){
    System.out.println("Hi, I am Rahim");
  }
}
class Karim extends MobileUser{
  @Override
  void send_message(){
    System.out.println("Hi, I am Karim");
  }
}
public class abstruction {
  public static void main(String[] args){
    MobileUser mu;

    mu = new Rahim();
    mu.send_message();

    mu = new Karim();
    mu.send_message();
  }
}
