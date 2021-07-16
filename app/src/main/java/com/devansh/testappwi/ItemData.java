package com.devansh.testappwi;

public class ItemData {
    private String name,mrp,extras;

    public String getName() {
        return name;
    }

    public String getMrp() {
        return mrp;
    }

    public String getExtras() {
        return extras;
    }

    public ItemData(String name, String mrp, String extras) {
        this.name = name;
        this.mrp = mrp;
        this.extras = extras;
    }
}
