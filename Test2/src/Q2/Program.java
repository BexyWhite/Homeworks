package Q2;

public class Program{
  public static void main(String[] args)
  {
    double width = 5;
    double height = 8;
    NewRectangle rec = new NewRectangle();
    rec = new NewRectangle(width, height);
    double area= rec.getArea(width, height);
    double peri= rec.getPerimeter(width, height);
    System.out.println(area);
    System.out.println(peri);
  }
}

class NewRectangle {
  private double width;
  private double height;

  public NewRectangle(){
    width = 0.0;
    height = 0.0;
  }

  public NewRectangle(double width2,double height2){
    width = width2;
    height = height2;
  }

  public double getArea(double width2,double height2){
    double Area = width2*height2;
    return Area;
  }

  public double getPerimeter(double w,double h){
    double Preimeter = 2*(w + h);
    return Preimeter;
  }
}
