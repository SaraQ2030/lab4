//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circle c=new Circle(2,3,2.1);
        Rectangle r=new Rectangle(3,4,2,2);
        Tringle t =new Tringle(2,2,3,4);

//print the output ------------------------------------------------------------------------------------
        System.out.println(t.toString());
        System.out.println(r.toString());
        System.out.println( c.toString());
    }
}