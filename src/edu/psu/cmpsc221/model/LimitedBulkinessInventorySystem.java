package edu.psu.cmpsc221.model;

public class LimitedBulkinessInventorySystem extends InventorySystem {
    private int Bulkiness ;
    private int sum;

    LimitedBulkinessInventorySystem(){ //Constructor
        super();
        Bulkiness = 6; //Set max number of bulkiness
    }

    protected boolean canAddItem(Item item) {

        sum = 0; //reset sum

        for (int i=0; i<list.size();i++)
        {
            sum += list.get(i).getBulkiness(); //Add up bulkiness of inventory
        }
        sum += item.getBulkiness(); //Bulkiness of inventory and possible item


        if (sum<=Bulkiness){
            return true; //return true if sum value is less than or equal to max number of bulkiness
        }
        else
            {
            return false;
        }

    } /* end canAddItem */

    protected String getInventoryFullMessage() {
        return "Full Inventory! Reduce the amount of bulkiness in inventory!";
    }
}
