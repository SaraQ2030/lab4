public class Tringle extends Shape{
    private double base;
    private double height;

    public Tringle(int x, int y,double height,double base) {
        super(x, y);
        this.base=base;
        this.height=height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base*height/2 ;
    }

    @Override
    public double calculateCircumference() {
        return base*3 ;
    }
    public String toString(){
        return "\n"+"The Area of Tringle = "+calculateArea()+"\t"+" The Circumference of Tringle = "+calculateCircumference();
    }
}
