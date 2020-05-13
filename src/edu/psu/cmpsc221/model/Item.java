package edu.psu.cmpsc221.model;

public class Item {
    public Item(String name, String lookDescription, int weight, int bulkiness) {
        this.lookDescription = lookDescription;
        this.name = name;
        this.weight = weight;
        this.bulkiness = bulkiness;
    } /* end Item */

    public String getLookDescription() {
        return lookDescription;
    } /* end getLookDescription */

    public String getName() {
        return name;
    } /* end getName */

    //two accessors for weight and bulkiness
    public int getWeight() { return weight; }

    public int getBulkiness() {return bulkiness; }

    private int weight; //new adjustment
    private int bulkiness; //new adjustment
    private String lookDescription;
    private String name;
} /* end Item */
