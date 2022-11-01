import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Q6 extends JFrame{
    public Q6(){
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c =getContentPane();
        c.setLayout(null);
        setSize(300,300);
        for(int i=0; i<20; i++){
            
            JLabel temp = new JLabel();
            
            temp.setLocation((int)(Math.random()*200) + 50,(int)(Math.random()*200) + 50);    
            temp.setSize(10, 10);
            temp.setBackground(Color.blue);
            temp.setOpaque(true);
            c.add(temp);
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q6();
    }
}