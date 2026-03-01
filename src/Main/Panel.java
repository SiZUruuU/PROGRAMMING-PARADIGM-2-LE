package Main;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;

public class Panel extends JPanel {

    JLabel label;

    //SCREEN SETTINGS
    final int screenWidth = 720;
    final int screenHeight = 1280;

    public Panel(){

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.WHITE);
        
        this.setLayout(null);
        this.setDoubleBuffered(true);
        Pressable();
    }

    public void Pressable(){

        label = new JLabel();
        label.setBounds(310,590,100,50);
        label.setBackground(Color.blue);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);
    }
    
}
