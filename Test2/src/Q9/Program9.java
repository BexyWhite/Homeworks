package Q9;
class Cycle{
	private int num=0;
	public int ride(Cycle c){
		return c.wheel();
	}
	public int wheel(){
		return this.num;
	}
}

class Unicycle extends Cycle {
  private int num=1;
	public int wheel(){
		return num;
	}
	public void balance(){
		System.out.printf("This is Unicycle3");
	}
}

class Bicycle extends Cycle {
  private int num=2;
	public int wheel(){
		return this.num;
	}	
	public void balance(){
		System.out.printf("This is Bicycle3");
	}
}

class Tricycle extends Cycle {
  private int num=3;
  public int wheel(){
		return this.num;
	}
}

public class Program9{
	public static void main(String args[])
	{

		Cycle C=new Cycle();
		Bicycle B=new Bicycle();
		Tricycle T=new Tricycle();
		Unicycle U=new Unicycle();
		System.out.println("Bicycle has "+C.ride(B)+" wheels");
		System.out.println("Tricycle has "+C.ride(T)+" wheels");
		System.out.println("Unicycle has "+C.ride(U)+" wheels");

	}
}