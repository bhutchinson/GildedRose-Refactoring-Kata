package com.gildedrose.items;

public class SulfurusItem extends QualityIncreasingItem {

    protected final static int MAX_QUALITY = 80;

    public SulfurusItem(String name, int sellIn, int quality) {
        super(name, 0, MAX_QUALITY);
    }

    @Override
    public void decrementSellIn() {
        // do nothing; this never changes
        // how do we avoid refused bequest here?
    }

}
