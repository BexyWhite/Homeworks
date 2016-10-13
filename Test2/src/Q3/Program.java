import java.lang.Math;

class Point{
	double x,y;
	public Point(){
		x=0.0;
		y=0.0;
	}

	public Point(double x,double y){
		this.x=x;
		this.y=y;
	}

	public double distance(Point p){
		double dis;
		double x1=this.x;
		double x2=p.x;
		double y1=this.y;
		double y2=p.y;
		dis = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return dis;
	}
}

class NewRectangle {
	private double width;
	private double height;
	static Point p=new Point();
	private double x;
	private double y;
	public NewRectangle(){
		width = 0.0;
		height = 0.0;
		p = new Point(0.0,0.0);
	}

	public NewRectangle(double width,double height,double x,double y){
		this.width = width;
		this.height = height;
		p.x=x;
		p.y=y;
	}

	public boolean bPointIn(Point p){
		if((p.x>x&&p.x<this.x+width)&&(p.y>this.y&&p.y<this.y+height))
			return true;
		else
			return false;
	}

}

public class Program{
	public static void main(String[] args)
	{
		Point p1=new Point(4.0,5.0);
		Point p2=new Point(5.0,6.0);
		Point targetPoint=new Point(1,1);
		System.out.println(p1.distance(p2));
		NewRectangle rec=new NewRectangle(3.0,5.0,0.0,0.0);
		System.out.println(rec.bPointIn(targetPoint));
	}
}