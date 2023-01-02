package com.ibik.pbo.praktikum;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame implements MouseListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int SIZE = 3; 
    private JButton[][] buttons; 
    private char currentPlayer; 
    public TicTacToe() {
        setTitle("Tic-Tac-Toe");
        setSize(250, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(SIZE, SIZE));
        buttons = new JButton[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                JButton button = new JButton();
                button.addMouseListener(this);
                panel.add(button);
                buttons[i][j] = button;
            }
        }
        add(panel);

        currentPlayer = 'X';
        }

        public void mouseClicked(MouseEvent e) {
            JButton button = (JButton) e.getSource();
            button.setText(String.valueOf(currentPlayer));
            button.setEnabled(false);


            if (checkWin()) {
                String message = String.format("Pemain %c menang!", currentPlayer);
                JOptionPane.showMessageDialog(this, message);
                System.exit(0);
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        private boolean checkWin() {
            for (int i = 0; i < SIZE; i++) {
                if (checkLine(buttons[i][0], buttons[i][1], buttons[i][2])) {
                    return true;
                }
            }
    
            for (int j = 0; j < SIZE; j++) {
                if (checkLine(buttons[0][j], buttons[1][j], buttons[2][j])) {
                    return true;
                }
            }
            
            return checkLine(buttons[0][0], buttons[1][1], buttons[2][2]) ||
                   checkLine(buttons[0][2], buttons[1][1], buttons[2][0]);
        }
      
        private boolean checkLine(JButton button1, JButton button2, JButton button3) {
            String text1 = button1.getText();
            String text2 = button2.getText();
            String text3 = button3.getText();
            return !text1.isEmpty() && text1.equals(text2) && text2.equals(text3);
        }

        public static void main(String[] args) {
            new TicTacToe().setVisible(true);
        }

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
}
