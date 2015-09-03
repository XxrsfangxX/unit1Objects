import java.awt.Color;


public class Turt
{
    public static void main(String Args[])
    {
        World turtleWorld= new World();
        Turtle turt1= new Turtle(turtleWorld);
        Turtle turt2= new Turtle(turtleWorld);
        turt1.setPenColor(Color.RED);
        turt1.setColor(Color.RED);
        turt2.setPenColor(Color.BLUE);
        turt2.setPenWidth(5);
        turt2.turn(90);
        turt1.turn(270);
        int x= 1;
        for (int i=1; i<=10000; i++){
            turt1.forward(x);
            turt2.forward(2^x);
            turt1.turn(90);
            turt2.turn(30);
            x+=1;
        }
    }
}
      