package com.gildedrose.items;

public class QualityIncreasingItem extends AbstractItem {

    public QualityIncreasingItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void adjustQuality() {
        incrementQuality();
    }
}
