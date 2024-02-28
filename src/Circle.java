public class Circle extends Shape{
    private double radius;
    double total;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        total= radius*radius*3.14;
return total;
    }

    @Override
    public double calculateCircumference() {
      total = 2*radius*3.14;
      return total;
    }

    public String toString(){
        return "The Area of circle  = "+calculateArea()+"\t"+"The Circumference of circle = "+calculateCircumference() ;
    }
}
