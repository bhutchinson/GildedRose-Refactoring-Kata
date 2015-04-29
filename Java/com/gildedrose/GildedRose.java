package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            final Item item = items[i];

            decrementSellIn(item);

            adjustQuality(item);

            adjustQuantityIfPastSellByDate(item);
        }
    }

    private void adjustQuality(Item item) {
        if (isNormalItem(item)) {
            decrementQualityIfNecessary(item);
        } else {
            incrementQuality(item);

            if (isBackstagePass(item)) {
                incrementBackstagePassQuality(item);
            }
        }
    }

    private void decrementSellIn(Item item) {
        if (!isSulfuras(item)) {
            item.sellIn = item.sellIn - 1;
        }
    }

    private void decrementQualityIfNecessary(Item item) {
        if (item.quality > 0) {
            if (isConjuredItem(item)) {
                item.quality = item.quality - 2;
            } else if (!isSulfuras(item)) {
                item.quality = item.quality - 1;
            }
        }
    }

    private void incrementQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private void adjustQuantityIfPastSellByDate(Item item) {
        if (pastSellByDate(item)) {
            if (isAgedBrie(item)) {
                incrementQuality(item);
            } else {
                if (isBackstagePass(item)) {
                    item.quality = 0;
                } else {
                    decrementQualityIfNecessary(item);
                }
            }
        }
    }

    private void incrementBackstagePassQuality(Item item) {
        if (item.quality < 50) {
            if (item.sellIn < 10) {
                incrementQuality(item);
            }

            if (item.sellIn < 5) {
                incrementQuality(item);
            }
        }
    }

    private boolean pastSellByDate(Item item) {
        return item.sellIn < 0;
    }

    private boolean isNormalItem(Item item) {
        return !isAgedBrie(item)
                && !isBackstagePass(item)
                && !isSulfuras(item);
    }

    private boolean isConjuredItem(Item item) {
        return item.name.startsWith("Conjured");
    }

    private boolean isAgedBrie(Item item) {
        return item.name.equals("Aged Brie");
    }

    private boolean isSulfuras(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private boolean isBackstagePass(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }
}
