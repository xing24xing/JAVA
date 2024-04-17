/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICAL;

import javax.swing.*;

public class JScrollPaneEx {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("JscrollPaneEx");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        for (int i = 0; i < 50; i++) {
            JLabel label = new JLabel("JScrollPane " + i);
            panel.add(label);
        }
        JScrollPane ex = new JScrollPane(panel);
        frame.add(ex);
        frame.setVisible(true);
    }

}
