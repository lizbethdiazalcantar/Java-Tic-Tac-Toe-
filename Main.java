package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;

    public static class Border extends JFrame {

        int num = 0;

        public Border() {

            super("Tic Tac Toe");
            setSize(WIDTH, HEIGHT);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);

            setLayout(new BorderLayout());

            JLabel winner = new JLabel("The winner is player ");
            add(winner, BorderLayout.NORTH);

            JPanel board = new JPanel();
            board.setLayout(new GridLayout(3, 3));

            JButton[] btn = new JButton[9];
            for (int i = 0; i < 9; i++) {
                btn[i] = new JButton();
                board.add(btn[i]);
                btn[i].addActionListener(new Listener());
            }

            add(board, BorderLayout.CENTER);

        }


        public class Listener implements ActionListener {

            public void actionPerformed(ActionEvent e) {

                JButton letter = (JButton) e.getSource();
                   if (num % 2 == 0) {
                        letter.setText("X");
                        num++;
                    } else {
                        letter.setText("O");
                        num++;
                    }

            }
        }
    }

    public static void main(String[] args) {

        Border b = new Border();
        b.setVisible(true);



    }
}

