import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class Practice extends JPanel
{

    static JLabel[][] letterBoxes = new JLabel[6][5];
    static JPanel grid = new JPanel(new GridLayout(6,5,5,5));

//    public void paint(Graphics g){
//        int x = 500,y = 150, width = 50, height = 50;
//        for(int i= 0; i < 6; i++) { // for rows
//            for (int j = 0; j < 5; j++) { //for columns
//                g.drawRect(x + (width * j), y+(height*i), width, height);
//            }
//        }
//    }
    public static void main(String[] args){
        JFrame f = new JFrame("Wordle");

        JLabel title;
        title = new JLabel("WORDLE");
        title.setBounds(600,30,100,100);
        f.add(title);//adding the title in JFrame

        // GRID
        styleGrid();
        addLabels();
        f.add(grid);
        JButton button = new JButton("ENTER");
        button.setBounds(200,900,100,50);
        f.add(button);
        listener(f);
        f.getContentPane().add(new Practice());
        f.setSize(1500, 1500);
        f.setVisible(true);
        f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.PAGE_AXIS));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setFocusable(true);
    }

    private static void listener(JFrame f) {
        f.addKeyListener(new KeyListener() {
            int i = 0, j = 0;
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("pressed " + e.getKeyChar());
                if(Character.isLetter(e.getKeyChar())) {
                    update(i, j, String.valueOf(e.getKeyChar()));
                    j = j < 5 ? j + 1 : j;
                }
                else if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE)
                    update(i, j = j > 0 ? j - 1 : j, "");
                else if (true) {
                    //TODO ENTER
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    private static void styleGrid() {
        Dimension size = new Dimension(600, 700);
        grid.setMaximumSize(size);
        grid.setPreferredSize(size);
    }

    public static void update(int i ,int j, String letter) {
        System.out.println("in update");
        if(j < 5 && i < 6 && j >= 0 && i >= 0)
            letterBoxes[i][j].setText(letter);
    }

    public static void addLabels() {
        for(int i = 0; i < 6; i++)
            for(int j = 0; j < 5; j++) {
                JLabel label = new JLabel();
                label.setOpaque(true);
                label.setBackground(Color.BLUE);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                grid.add(letterBoxes[i][j] = label);
            }
    }
}
