import javax.swing.*;
import java.awt.Graphics;
public class WordleGUI extends JPanel {
    public void paint (Graphics g){
        g.drawRect(150, 235, 150, 150);
    }
    public static void main(String[] args) {
        JFrame f=new JFrame("Wordle");//creating instance of JFrame
        JLabel title;
        title = new JLabel("WORDLE");
        title.setBounds(570,30,100,40);

        JButton button=new JButton("ENTER");//creating instance of JButton
        button.setBounds(570,550,100, 40);//x axis, y axis, width, height

        f.add(button);//adding button in JFrame
        f.add(title);//adding the title in JFrame
        f.getContentPane().add(new WordleGUI());

        f.setSize(1500,1500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true); //makes the window visible
       // f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //code stops when window closes
    }
}