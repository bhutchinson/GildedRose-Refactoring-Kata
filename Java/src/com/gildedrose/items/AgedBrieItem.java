package com.gildedrose.items;

public class AgedBrieItem extends AbstractItem {

    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void adjustQuality() {
        incrementQuality();
    }

}
