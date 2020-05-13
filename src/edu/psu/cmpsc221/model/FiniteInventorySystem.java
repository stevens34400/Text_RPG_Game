package edu.psu.cmpsc221.model;

public class FiniteInventorySystem extends InventorySystem {
    private int MaxNumber;


    FiniteInventorySystem(){ //Constructor
        super();
        MaxNumber = 3;    //Set max number of items in inventory
    }

    protected boolean canAddItem(Item item) {
        if (list.size() < MaxNumber) {
            return true; //Allow addition of item if size of list is less than or equal to max number
        }
        else
        {
            return false; //Will return getInventoryFullMessage if greater than max number of items
        }
    } /* end canAddItem */



    protected String getInventoryFullMessage() {
        //Return message if cannot pick up another item
        return "Inventory full, cannot pick up another item.";
    }
}

/*
Sources:
https://www.homeandlearn.co.uk/java/java_inheritance.html
 */
