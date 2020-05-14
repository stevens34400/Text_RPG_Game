package edu.psu.cmpsc221.view.gui;

import javax.swing.*;
import java.awt.*;

public class AdventurePanel extends JPanel {
    AdventurePanel(GuiView holder) {
        super(new BorderLayout());
        initializeButtons(holder);
        initializeTextArea();
    }

    void addText(String text) {
        textArea.append(System.lineSeparator());
        textArea.append(text);
    }

    private void initializeButtons(GuiView holder) {
        eastButton = new JButton("East");
        southButton = new JButton("South");

        add(eastButton, BorderLayout.EAST);
        add(southButton, BorderLayout.SOUTH);

        eastButton.addActionListener(holder);
        southButton.addActionListener(holder);
    }

    private void initializeTextArea() {
        textArea = new JTextArea(25, 80);
        textArea.setEditable(false);
        textArea.setLineWrap(true);

        scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);
    }

    void setText(String text) {
        textArea.setText(text);
    }

    JButton eastButton;
    JScrollPane scrollPane;
    JButton southButton;
    JTextArea textArea;
}
