import javax.swing.*;
import java.awt.*;

public class Q5 extends JFrame{
    public Q5(){
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4,4);
        Container c = getContentPane();
        c.setLayout((grid));
        
        Color color[] = {Color.RED,Color.orange, Color.yellow,Color.green, Color.cyan,
             Color.blue, Color.MAGENTA, Color.gray, Color.pink, Color.lightGray,
            Color.white, Color.darkGray,Color.black, Color.orange, Color.blue, Color.magenta};
        
        for(int i = 0; i < 16; i++) {
            JLabel temp = new JLabel(String.valueOf(i));
            temp.setBackground(color[i]);
            temp.setOpaque(true);
            c.add(temp);
        }
        
        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args){
        new Q5();
    }
}