package com.gildedrose.items;

public class ConjuredItem extends AbstractItem {

    public ConjuredItem(String name, int sellIn, int quality) {
        super("Conjured "+name, sellIn, quality);
    }

    @Override
    public void adjustQuality() {
        if (quality > 0) {
            quality = quality - 2;
        }
        if (quality < 0) {
            quality = 0;
        }
    }

}
