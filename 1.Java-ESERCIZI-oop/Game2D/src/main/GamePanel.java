package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private int xDelta = 100, yDelta = 100;
    //va fuori dal GamePanel() sennò non si può usare nei metodi

    public GamePanel() {

        //inizializzo la classe MouseInputs
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);//lo posso passare uguale a tutte e due i Listener perché MouseInputs implementa entrambe le interfacce
        addMouseMotionListener(mouseInputs);
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

        g.fillRect(xDelta, yDelta, 200, 50);
        g.setColor(Color.RED );

    }
}
