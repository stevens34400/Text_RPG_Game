package edu.psu.cmpsc221.view.gui;

import edu.psu.cmpsc221.model.CompassDirection;
import edu.psu.cmpsc221.view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiView extends View implements ActionListener {
    public GuiView() {
        initializeFrame();
    }

    @Override
    public String getUserCommand() {
        boolean gotAUserCommand = false;

        while (!gotAUserCommand) {
            try {
                // Reentrant synchronization
                synchronized (this) {
                    wait();
                }

                gotAUserCommand = true;
            } catch (InterruptedException e) {
                // No-op.  Since we're in a loop, we don't care
            }
        }

        return userCommand;
    }

    private void initializeFrame() {
        frame = new JFrame("CMPSC 221 Adventure");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adventurePanel = new AdventurePanel(this);
        frame.getContentPane().add(adventurePanel);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void inventory() {

    }

    @Override
    public void look() {
        adventurePanel.setText(getLookString());
    }

    @Override
    public void processCantGoDirection(String directionName) {
        adventurePanel.addText(getCantGoDirectionString(directionName));
    }

    @Override
    public void processDropItemNotInInventory(String itemName) {

    }

    @Override
    public void processDropSuccessful(String itemName) {
        // TODO : Write me
    }

    @Override
    public void processGetItemNotInInventory(String itemName) {
        // TODO : Write me
    }

    @Override
    public void processGetSuccessful(String itemName) {
        // TODO : Write me
    }

    @Override
    public void processInventoryFullException(String message) {
        // TODO : Write me
    }

    @Override
    public void processQuitCommand() {
        // TODO : Write me
    }

    @Override
    public void processUnknownCommand(String command) {
        // TODO : Write me
    }

    private AdventurePanel adventurePanel;
    private JFrame frame;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(adventurePanel.eastButton)) {
            userCommand = CompassDirection.EAST_NAME;
        } else if (e.getSource().equals(adventurePanel.southButton)) {
            userCommand = CompassDirection.SOUTH_NAME;
        }

        // YOU DO NOT NEED THIS FOR TEH FINAL -- Reentrant synchronization
        synchronized (this) {
            notify();
        }
    }

    private String userCommand;
} /* end GuiView */
