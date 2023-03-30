package inputs;

import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {

    private GamePanel gamePanel;

    public KeyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        //enhanched switch very very fico. thankyou suggeritore di IntelliJ
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W, KeyEvent.VK_UP -> gamePanel.changeYDelta(-5);
            case KeyEvent.VK_A, KeyEvent.VK_LEFT -> gamePanel.changeXDelta(-5);
            case KeyEvent.VK_S, KeyEvent.VK_DOWN -> gamePanel.changeYDelta(5);
            case KeyEvent.VK_D, KeyEvent.VK_RIGHT -> gamePanel.changeXDelta(5);
        }

    }

}
