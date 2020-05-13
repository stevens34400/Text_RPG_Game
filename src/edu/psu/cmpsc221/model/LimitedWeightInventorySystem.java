package edu.psu.cmpsc221.model;

public class LimitedWeightInventorySystem extends InventorySystem {
    private int Weight; //Max value for weight of inventory
    private int sum; //Sum of weight for inventory


    LimitedWeightInventorySystem(){
        super();
        Weight = 7;
    }

    protected boolean canAddItem(Item item) {
        sum = 0; //reset sum

        for (int i=0; i<list.size();i++)
        {
            sum += list.get(i).getWeight(); //Add up Weight of inventory
        }
        sum += item.getWeight(); //Weight of inventory and possible item



        if (sum <= Weight){
            return true; //Return true if the sum of weight is less than max value for weight of inventory
        }
        else
        {
            return false;
        }
    } /* end canAddItem */

    protected String getInventoryFullMessage() {
        return "Full Inventory! Reduce the weight of whole inventory";
    }

}
