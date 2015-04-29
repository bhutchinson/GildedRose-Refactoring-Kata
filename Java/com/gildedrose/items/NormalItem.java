package com.gildedrose.items;

public class NormalItem extends AbstractItem {

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void adjustQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

}
