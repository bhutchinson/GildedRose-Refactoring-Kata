package com.gildedrose.items;

import com.gildedrose.Item;

public abstract class AbstractItem extends Item {

    public AbstractItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void decrementSellIn() {
        sellIn = sellIn - 1;
    }

    public abstract void adjustQuality();

    public void adjustQualityIfPastSellByDate() {
        if (pastSellByDate()) {
           adjustQuality();
        }
    }

    protected boolean pastSellByDate() {
        return sellIn < 0;
    }

    protected void incrementQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
