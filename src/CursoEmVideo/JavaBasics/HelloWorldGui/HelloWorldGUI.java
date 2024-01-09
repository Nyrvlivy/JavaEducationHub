package CursoEmVideo.JavaBasics.HelloWorldGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldGUI {
    public JPanel panelMain;
    private JButton btnClick;
    private JLabel lblMessage;

    public HelloWorldGUI() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMessage.setText("Hello World!");
            }
        });
    }
}

class HelloWorldGUIApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorldGUIApp");
        frame.setContentPane(new HelloWorldGUI().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
