package Chapter3_Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// An Action Command in Java is a string identifier
// used to determine which GUI component triggered an action event.

public class ActCommand {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        JButton playButton = new JButton("Play");
        playButton.setBounds(230, 49, 362, 131);

        JButton pauseButton = new JButton("Pause");
        pauseButton.setBounds(230, 248, 362, 131);

        // Setting action commands
        playButton.setActionCommand("play");
        pauseButton.setActionCommand("pause");

        // Creating ActionListener
        ActionListener buttonActionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if ("play".equals(e.getActionCommand())) {

                    JOptionPane.showMessageDialog(null,
                            "Play button is clicked");

                } else if ("pause".equals(e.getActionCommand())) {

                    JOptionPane.showMessageDialog(null,
                            "Pause button is clicked");
                }
            }
        };

        // Adding listeners
        playButton.addActionListener(buttonActionListener);
        pauseButton.addActionListener(buttonActionListener);

        frame.setLayout(null);

        frame.add(playButton);
        frame.add(pauseButton);

        frame.setSize(877, 602);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}