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
    private BufferedImage[][] animations; //array per l'animazione
    private int animationTick, animationIndex, animationSpeed = 15;

    public GamePanel() {
        
        importImage();
        loadAnimations();
        
        //inizializzo la classe MouseInputs
        mouseInputs = new MouseInputs(this);
        setPanelSize();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);//lo posso passare uguale a tutte e due i Listener perché MouseInputs implementa entrambe le interfacce
        addMouseMotionListener(mouseInputs);
    }

    //load array per l'animazione
    private void loadAnimations() {
        animations = new BufferedImage[9][6];

        for (int j = 0; j < animations.length; j++)
            for (int i = 0; i < animations[j].length; i++)
                animations[j][i] = img.getSubimage(i * 64, j*40, 64, 40);

    }

    //IMPORT IMAGE
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

    private void updateAnimationTick() {
        animationTick++;
        if (animationTick >= animationSpeed) {
            animationTick = 0;
            animationIndex++;
            if (animationIndex >= 6) {
                animationIndex = 0;
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        updateAnimationTick();
       g.drawImage(animations[1][animationIndex], xDelta, yDelta, 128, 80, null);
    }

}

