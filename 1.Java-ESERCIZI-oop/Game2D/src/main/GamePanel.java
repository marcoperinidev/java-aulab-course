package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private int xDelta = 100, yDelta = 100;
    //va fuori dal GamePanel() sennò non si può usare nei metodi
    private BufferedImage img;

    public GamePanel() {
        
        importImage();
        
        //inizializzo la classe MouseInputs
        mouseInputs = new MouseInputs(this);
        setPanelSize();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);//lo posso passare uguale a tutte e due i Listener perché MouseInputs implementa entrambe le interfacce
        addMouseMotionListener(mouseInputs);
    }

    private void importImage() {
        InputStream is = getClass().getResourceAsStream("/player_sprites.png");

        //try catch per gestire l'eccezione è tipo un IF più forte per gestire l'import ed errori
        try {
            assert is != null;
            img = ImageIO.read(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void setPanelSize() {
        Dimension size = new Dimension(1280, 800);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    //incremento o decremento XDelta o YDelta
    public void changeXDelta(int value) {
        this.xDelta += value;
        repaint();
    }
    public void changeYDelta(int value) {
        this.yDelta += value;
        repaint();
    }

    public void setRectanglePosition(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(img, 0, 0, null);
    }
}

