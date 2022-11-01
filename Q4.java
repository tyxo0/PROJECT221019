import javax.swing.*;

import java.awt.*;

public class Q4 extends JFrame{
    public Q4(){
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(1,10);
        Container c = getContentPane();
        c.setLayout((grid));
        
        Color color[] = {Color.RED,Color.orange, Color.yellow,Color.green, Color.cyan,
             Color.blue, Color.MAGENTA, Color.darkGray, Color.pink, Color.gray};
        for(int i = 0; i < 10; i++) {
            JButton temp = new JButton(String.valueOf(i));
            temp.setBackground(color[i]);
            c.add(temp);
        }
        
        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args){
        new Q4();
    }
}