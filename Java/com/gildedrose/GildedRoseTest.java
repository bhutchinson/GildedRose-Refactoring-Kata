package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    public void normalItem() {
        Item[] items = new Item[] { new NormalItem("foo", 2, 10) };
        GildedRose app = new GildedRose(items);
        Item item = app.items[0];
        assertEquals("foo", item.name);
        verifyItemSellInAndQuality(2, 10, item);

        app.updateQuality();
        verifyItemSellInAndQuality(1, 9, item);
        app.updateQuality();
        verifyItemSellInAndQuality(0, 8, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-1, 6, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-2, 4, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-3, 2, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-4, 0, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-5, 0, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-6, 0, item);
    }

    @Test
    public void agedBrie() {
        Item[] items = new Item[] { new AgedBrieItem("Aged Brie", 2, 46) };
        GildedRose app = new GildedRose(items);
        Item item = app.items[0];
        assertEquals("Aged Brie", item.name);
        verifyItemSellInAndQuality(2, 46, item);

        app.updateQuality();
        verifyItemSellInAndQuality(1, 47, item);
        app.updateQuality();
        verifyItemSellInAndQuality(0, 48, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-1, 50, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-2, 50, item);
    }

    @Test
    public void agedBrie2() {
        Item[] items = new Item[] { new AgedBrieItem("Aged Brie", 2, 47) };
        GildedRose app = new GildedRose(items);
        Item item = app.items[0];
        assertEquals("Aged Brie", item.name);
        verifyItemSellInAndQuality(2, 47, item);

        app.updateQuality();
        verifyItemSellInAndQuality(1, 48, item);
        app.updateQuality();
        verifyItemSellInAndQuality(0, 49, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-1, 50, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-2, 50, item);
    }

    @Test
    public void sulfuras() {
        Item[] items = new Item[] { new SulfurusItem("Sulfuras, Hand of Ragnaros", 2, 40) };
        GildedRose app = new GildedRose(items);
        Item item = app.items[0];
        assertEquals("Sulfuras, Hand of Ragnaros", item.name);
        verifyItemSellInAndQuality(0, 80, item);

        app.updateQuality();
        verifyItemSellInAndQuality(0, 80, item);
        app.updateQuality();
        verifyItemSellInAndQuality(0, 80, item);
    }

    @Test
    public void backstagePasses() {
        Item[] items = new Item[] { new BackstagePassItem("Backstage passes to a TAFKAL80ETC concert", 12, 10) };
        GildedRose app = new GildedRose(items);
        Item item = app.items[0];
        assertEquals("Backstage passes to a TAFKAL80ETC concert", item.name);
        verifyItemSellInAndQuality(12, 10, item);

        app.updateQuality();
        verifyItemSellInAndQuality(11, 11, item);
        app.updateQuality();
        verifyItemSellInAndQuality(10, 12, item);
        app.updateQuality();
        verifyItemSellInAndQuality(9, 14, item);
        app.updateQuality();
        verifyItemSellInAndQuality(8, 16, item);
        app.updateQuality();
        verifyItemSellInAndQuality(7, 18, item);
        app.updateQuality();
        verifyItemSellInAndQuality(6, 20, item);
        app.updateQuality();
        verifyItemSellInAndQuality(5, 22, item);
        app.updateQuality();
        verifyItemSellInAndQuality(4, 25, item);
        app.updateQuality();
        verifyItemSellInAndQuality(3, 28, item);
        app.updateQuality();
        verifyItemSellInAndQuality(2, 31, item);
        app.updateQuality();
        verifyItemSellInAndQuality(1, 34, item);
        app.updateQuality();
        verifyItemSellInAndQuality(0, 37, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-1, 0, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-2, 0, item);
    }

    @Test
    public void backstagePasses2() {
        Item[] items = new Item[] { new BackstagePassItem("Backstage passes to a TAFKAL80ETC concert", 12, 30) };
        GildedRose app = new GildedRose(items);
        Item item = app.items[0];
        assertEquals("Backstage passes to a TAFKAL80ETC concert", item.name);
        verifyItemSellInAndQuality(12, 30, item);

        app.updateQuality();
        verifyItemSellInAndQuality(11, 31, item);
        app.updateQuality();
        verifyItemSellInAndQuality(10, 32, item);
        app.updateQuality();
        verifyItemSellInAndQuality(9, 34, item);
        app.updateQuality();
        verifyItemSellInAndQuality(8, 36, item);
        app.updateQuality();
        verifyItemSellInAndQuality(7, 38, item);
        app.updateQuality();
        verifyItemSellInAndQuality(6, 40, item);
        app.updateQuality();
        verifyItemSellInAndQuality(5, 42, item);
        app.updateQuality();
        verifyItemSellInAndQuality(4, 45, item);
        app.updateQuality();
        verifyItemSellInAndQuality(3, 48, item);
        app.updateQuality();
        verifyItemSellInAndQuality(2, 50, item);
        app.updateQuality();
        verifyItemSellInAndQuality(1, 50, item);
        app.updateQuality();
        verifyItemSellInAndQuality(0, 50, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-1, 0, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-2, 0, item);
    }

    @Test
    public void conjuredItem() {
        Item[] items = new Item[] { new ConjuredItem("foo", 2, 10) };
        GildedRose app = new GildedRose(items);
        Item item = app.items[0];
        assertEquals("Conjured foo", item.name);
        verifyItemSellInAndQuality(2, 10, item);

        app.updateQuality();
        verifyItemSellInAndQuality(1, 8, item);
        app.updateQuality();
        verifyItemSellInAndQuality(0, 6, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-1, 2, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-2, 0, item);
        app.updateQuality();
        verifyItemSellInAndQuality(-3, 0, item);
    }

    private void verifyItemSellInAndQuality(int expectedSellIn, int expectedQuality, Item item) {
        assertEquals("SellIn wasn't what we expected ", expectedSellIn, item.sellIn);
        assertEquals("Quality wasn't what we expected ", expectedQuality, item.quality);
    }

}
