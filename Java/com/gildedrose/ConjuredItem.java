package com.gildedrose;

public class ConjuredItem extends AbstractItem {

    public ConjuredItem(String name, int sellIn, int quality) {
        super("Conjured "+name, sellIn, quality);
    }

    @Override
    public void adjustQuality() {
        if (quality > 0) {
            quality = quality - 2;
        }
    }

}
