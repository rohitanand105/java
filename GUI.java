import javax.swing.*;
import java.awt.*;


public class GUI {



        public GUI() {
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
            panel.setLayout(new GridLayout(0, 1));

            JButton button = new JButton("Click me");
            panel.add(button);

            
    
            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Our GUI");
            frame.pack();
            frame.setVisible(true);
        }
    
        public static void main(String[] args) {
            // Ensure the GUI is created on the Event Dispatch Thread
            SwingUtilities.invokeLater(() -> {
                new GUI();
            });
        }
    }

