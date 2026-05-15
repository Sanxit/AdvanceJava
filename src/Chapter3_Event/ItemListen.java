package Chapter3_Event;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ItemListen {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Item Listener Example");
        frame.setLayout(null);

        JCheckBox checkBox = new JCheckBox("Enable Feature");
        checkBox.setBounds(6, 36, 150, 23);

        JLabel label = new JLabel("Feature is disabled");
        label.setBounds(160, 40, 200, 14);

        checkBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    label.setText("Feature is enabled");
                } else {
                    label.setText("Feature is disabled");
                }
            }
        });

        frame.add(checkBox);
        frame.add(label);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}