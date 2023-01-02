package com.ibik.pbo.praktikum;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RocketGame extends JPanel implements KeyListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private int x, y;
    private int dx, dy; 
    private final int SPEED = 5; 
    private final int SIZE = 50; 
    private Image rocket; 

   
    public RocketGame() {
        x = 10;
        y = 0;
        setBackground(Color.blue);
        addKeyListener(this);
        setFocusable(true);

        ImageIcon icon = new ImageIcon("C:\\Praktikum-Maven\\PBO-212310010-PRAKTIKUM-8\\src\\main\\java\\com\\ibik\\pbo\\praktikum\\Rocket.png");
        rocket = icon.getImage();
    }

   
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(rocket, x, y, SIZE, SIZE, this);
    }

    public void move() {
        x += dx;
        y += dy;
        if (x < 0 || x > getWidth() - SIZE) {
            dx = -dx;
        }
        if (y < 0 || y > getHeight() - SIZE) {
            dy = -dy;
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            dx = -SPEED;
        }
        if (key == KeyEvent.VK_RIGHT) {
            dx = SPEED;
        }
        if (key == KeyEvent.VK_UP) {
            dy = -SPEED;
        }
        if (key == KeyEvent.VK_DOWN) {
            dy = SPEED;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }

    public void keyTyped(KeyEvent e) {}
    public static void main(String[] args) {
        JFrame window = new JFrame("Rocket Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 200);

        RocketGame game = new RocketGame();
        window.add(game);
        window.setVisible(true);

        while (true) {
            game.move();
            game.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

