package com.gildedrose;

import com.gildedrose.items.AbstractItem;
import com.gildedrose.items.NormalItem;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];

            if ((!(item instanceof AbstractItem))) {
                item = new NormalItem(item.name, item.sellIn, item.quality);
            }
            updateItem((AbstractItem)item);
        }
    }

    private void updateItem(AbstractItem item) {
        item.decrementSellIn();
        item.adjustQuality();
        item.adjustQuantityIfPastSellByDate();
    }

}
