package com.gildedrose;

public class BackstagePassItem extends AbstractItem {

    public BackstagePassItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void adjustQuality() {
        incrementQuality();
        incrementBackstagePassQuality();
    }

    @Override
    public void adjustQuantityIfPastSellByDate() {
        if (pastSellByDate()) {
            quality = 0;
        }
    }

    private void incrementQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    private void incrementBackstagePassQuality() {
        if (quality < 50) {
            if (sellIn < 10) {
                incrementQuality();
            }

            if (sellIn < 5) {
                incrementQuality();
            }
        }
    }

}
