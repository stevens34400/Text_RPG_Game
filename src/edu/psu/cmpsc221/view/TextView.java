package edu.psu.cmpsc221.view;

import java.util.Scanner;

public class TextView extends View {
    public TextView() {
        scanner = new Scanner(System.in);
    } /* end TextView */

    private Scanner getScanner() {
        return scanner;
    } /* end getScanner */

    public String getUserCommand() {
        return getScanner().nextLine();
    } /* end getUserCommand */

    public void inventory() {
        output(getInventoryString());
    } /* end inventory */

    public void look() {
        output(getLookString());
    } /* end look */

    private void output(String string) {
        System.out.println();
        System.out.println(string);
    } /* end output */

    public void processCantGoDirection(String directionName) {
        output(getCantGoDirectionString(directionName));
    } /* end processCantGoDirection */

    public void processDropItemNotInInventory(String itemName) {
        output(getDropItemNotInInventoryString(itemName));
    } /* end processDropItemNotInInventory */

    public void processDropSuccessful(String itemName) {
        output("You drop the " + itemName);
    } /* end processDropSuccessful */

    public void processGetItemNotInInventory(String itemName) {
        if (itemName.equals("")) {
            output("Get what now?");
        } else {
            output("There's no " + itemName + " here to get!");
        } /* end if */
    } /* end processGetItemNotInInventory */

    public void processGetSuccessful(String itemName) {
        output("You pick up the " + itemName);
    } /* end processGetSuccessful */

    public void processInventoryFullException(String message) {
        output(message);
    } /* end processInventoryFullException */

    public void processQuitCommand() {
        output("Bye bye");
    } /* end processQuitCommand */

    public void processUnknownCommand(String command) {
        output("I don't understand what you mean by \"" + command + "\"");
    } /* end processUnknownCommand */

    private Scanner scanner;
} /* end TextView */
