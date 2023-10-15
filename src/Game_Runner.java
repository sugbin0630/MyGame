import java.awt.*;
import javax.swing.*;

public class Game_Runner extends JFrame{
    private Container c = getContentPane();
    final int WIDTH = 600;
    final int HEIGHT = 600;

    Game_Runner() {
        c.setLayout(null);
        setTitle("Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        c.setBackground(new Color(0, 0, 0));
        setVisible(true);
    }
    public static void main(String[] args) {
        
    }
}
