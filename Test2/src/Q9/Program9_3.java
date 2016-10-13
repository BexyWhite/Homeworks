package Q9;
class Cycle3 {
  private int num=0;
  public void ride(Cycle3 c){
    if(c instanceof Unicycle3)
    {
      Unicycle3 u = (Unicycle3)c;
      u.balance();
    }
    else if(c instanceof Bicycle3){
      Bicycle3 b=(Bicycle3)c;
      b.balance();
    }
    else{
      System.out.println("Error");
    }
  }
  public void balance(){
    System.out.println("This is Cycle");
  }
  public int wheel(){
    return this.num;
  }
}

class Unicycle3 extends Cycle3 {
  private int num=1;
  public int wheel(){
    return num;
  }
  public void balance(){
    System.out.println("This is Unicycle");
  }
}

class Bicycle3 extends Cycle3 {
  private int num=2;
  public int wheel(){
    return this.num;
  }
  public void balance(){
    System.out.println("This is Bicycle");
  }
}

class Tricycle3 extends Cycle3 {
  private int num=3;
  public int wheel(){
    return this.num;
  }
}

public class Program9_3{
  public static void main(String args[]) {

    Cycle3 C3 = new Cycle3();
    Bicycle3 B3 = new Bicycle3();
    Tricycle3 T3 = new Tricycle3();
    Unicycle3 U3 = new Unicycle3();
    C3.ride(B3);
    C3.ride(U3);
    C3.ride(T3);
  }
}