package com.gildedrose.items;

public class NormalItem extends AbstractItem {

    protected static int AMOUNT_TO_DECREASE = 1;

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void adjustQuality() {
        if (quality > MIN_QUALITY) {
            quality = quality - getAmountToDecrease();
        }
    }

    protected int getAmountToDecrease() {
        return AMOUNT_TO_DECREASE;
    }

}
