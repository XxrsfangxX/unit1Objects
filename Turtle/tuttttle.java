import java.awt.Color;

public class tuttttle
{
    public static void main(String args[])
    {
        World tuttttle = new World();
        Turtle cat = new Turtle(tuttttle);
        cat.setPenColor(Color.BLUE);
        int monkey=0;
        for(int i=1; i<=1000; i++){
            cat.forward(monkey);
            cat.turn(monkey);
            monkey+=1;
        }           
        cat.forward(10);
        cat.backward(100);
        cat.turn(100);
        cat.backward(500);
    }
}