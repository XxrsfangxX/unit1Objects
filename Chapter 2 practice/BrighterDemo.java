import java.awt.Color;
import javax.swing.JFrame;

public class BrighterDemo
{
    public static void main(String Args[])
    {
        JFrame frame= new JFrame();
        frame.setSize(200,200);
        Color myColor= new Color(50, 10, 150);
        Color colorz =myColor.brighter();
        frame.getContentPane().setBackground(colorz);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}