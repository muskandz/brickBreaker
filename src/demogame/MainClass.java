package demogame;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass {
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setTitle("Brick Breaker");
        f.setSize(700, 600);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);

        Gameplay gamePlay = new Gameplay();
        f.add(gamePlay);
    }
}
