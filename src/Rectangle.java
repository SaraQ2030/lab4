public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(int x, int y, double width,double length) {
        super(x, y);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width*length;
    }

    @Override
    public double calculateCircumference() {
        return 2*(length+width);
    }
    public String toString(){
        return "The Area of Rectangle = "+calculateArea()+"\t"+" The Circumference of Rectangle = "+calculateCircumference();
    }
}
