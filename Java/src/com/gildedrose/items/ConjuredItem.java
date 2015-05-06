package com.gildedrose.items;

public class ConjuredItem extends NormalItem {

    private static final int AMOUNT_TO_DECREASE = 2;

    public ConjuredItem(String name, int sellIn, int quality) {
        super("Conjured "+name, sellIn, quality);
    }

    @Override
    public void adjustQuality() {
        super.adjustQuality();
        if (quality < MIN_QUALITY) {
            quality = MIN_QUALITY;
        }
    }

    @Override
    protected int getAmountToDecrease() {
        return AMOUNT_TO_DECREASE;
    }

}
