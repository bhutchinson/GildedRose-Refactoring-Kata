package com.gildedrose.items;

public class BackstagePassItem extends QualityIncreasingItem {

    public BackstagePassItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void adjustQuality() {
        super.incrementQuality();
        incrementBackstagePassQuality();
    }

    @Override
    public void adjustQualityIfPastSellByDate() {
        if (pastSellByDate()) {
            quality = MIN_QUALITY;
        }
    }

    private void incrementBackstagePassQuality() {
        if (quality < MAX_QUALITY) {
            incrementQualityIfNecessary(10);
            incrementQualityIfNecessary(5);
        }
    }

    private void incrementQualityIfNecessary(int days) {
        if (sellIn < days) {
            incrementQuality();
        }
    }

}
