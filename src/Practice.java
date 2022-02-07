import java.awt.Graphics;
import javax.swing.*;
public class Practice extends JPanel
{
    public void paint(Graphics g){
        int x = 500,y = 150, width = 50, height = 50;
        for(int i= 0; i < 6; i++) { // for rows
            for (int j = 0; j < 5; j++) { //for columns
                g.drawRect(x + (width * j), y+(height*i), width, height);
            }
        }
    }
    public static void main(String[] args){
        JFrame f = new JFrame("Wordle");

        JLabel title;
        title = new JLabel("WORDLE");
        title.setBounds(600,30,100,100);
        f.add(title);//adding the title in JFrame

        JButton button = new JButton("ENTER");
        button.setBounds(200,900,100,50);
        f.add(button);

        f.getContentPane().add(new Practice());
        f.setSize(1500, 1500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
