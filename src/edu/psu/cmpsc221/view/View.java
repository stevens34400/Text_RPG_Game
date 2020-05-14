package edu.psu.cmpsc221.view;

import edu.psu.cmpsc221.AdventureObject;

public abstract class View extends AdventureObject {
    public abstract String getUserCommand();
    public abstract void inventory();
    public abstract void look();
    public abstract void processCantGoDirection(String directionName);
    public abstract void processDropItemNotInInventory(String itemName);
    public abstract void processDropSuccessful(String itemName);
    public abstract void processGetItemNotInInventory(String itemName);
    public abstract void processGetSuccessful(String itemName);
    public abstract void processInventoryFullException(String message);
    public abstract void processQuitCommand();
    public abstract void processUnknownCommand(String command);

    protected String getCantGoDirectionString(String directionName) {
        return "OUCH!  You bang your nose on the wall trying to go " + directionName;
    } /* end getCantGoDirectionString */

    protected String getDropItemNotInInventoryString(String itemName) {
        String dropItemNotInInventoryString;

        if (itemName.equals("")) {
            dropItemNotInInventoryString = "Drop what now?";
        } else {
            dropItemNotInInventoryString = "You can't drop the " + itemName + " because you don't have it!";
        } /* end if */

        return dropItemNotInInventoryString;
    } /* end getDropItemNotInInventoryString*/

    protected String getInventoryString() {
        return getController().getInventoryString();
    } /* end getInventoryString */

    protected String getLookString() {
        return String.format("%s%n%s%s", getController().getCurrentRoomLookDescription(),
                getController().getCurrentRoomLookItems(),
                getController().getCurrentRoomLookExits());
    } /* end getLookString */
} /* end View */
