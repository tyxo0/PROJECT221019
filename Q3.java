import javax.swing.*;
import java.awt.*;

public class Q3 extends JFrame{
    public Q3(){
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(1,10);
        Container c = getContentPane();
        c.setLayout((grid));
        

        for(int i = 0; i <= 9; i++) {
            c.add(new JButton(Integer.toString(i)));
        }

        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args){
        new Q3();
    }
}