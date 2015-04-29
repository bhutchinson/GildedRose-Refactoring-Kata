package com.gildedrose;

public class AgedBrieItem extends AbstractItem {

    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void adjustQuality() {
        incrementQuality();
    }

    private void incrementQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

}
