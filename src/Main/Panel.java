package Main;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;

public class Panel extends JPanel {

    //SCREEN SETTINGS
    final int screenWidth = 720;
    final int screenHeight = 1280;

    public Panel(){

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }
    
}
