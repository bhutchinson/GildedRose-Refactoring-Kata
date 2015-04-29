package com.gildedrose;

public class SulfurusItem extends AbstractItem {

    public SulfurusItem(String name, int sellIn, int quality) {
        super(name, 0, 80);
    }

    @Override
    public void decrementSellIn() {
        // do nothing; this never changes
        // how do we avoid refused bequest here?
    }

    @Override
    public void adjustQuality() {
        // do nothing; this never changes
        // how do we avoid refused bequest here?
    }

}
