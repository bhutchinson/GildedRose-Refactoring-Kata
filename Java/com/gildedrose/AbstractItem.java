package com.gildedrose;

public abstract class AbstractItem extends Item {

    public AbstractItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void decrementSellIn() {
        sellIn = sellIn - 1;
    }

    abstract void adjustQuality();

    public void adjustQuantityIfPastSellByDate() {
        if (pastSellByDate()) {
           adjustQuality();
        }
    }

    protected boolean pastSellByDate() {
        return sellIn < 0;
    }
}
