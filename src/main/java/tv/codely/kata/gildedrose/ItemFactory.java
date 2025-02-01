package tv.codely.kata.gildedrose;

public class ItemFactory {
    public static Item create (String name, int sellIn, int quality) {
            if("Aged Brie".equals(name)) {
                return new ItemAgedBrie(name, sellIn, quality);
            }
            if("Sulfuras, Hand of Ragnaros".equals(name)) {
                return new ItemSufures(name, sellIn, quality);
            }
            if("whatever".equals(name)) {
                return new ItemWhatever(name, sellIn, quality);
            }
            if("Backstage passes to a TAFKAL80ETC concert".equals(name)) {
                return new ItemBackstagePasses(name, sellIn, quality);
            }
        //"Conjured Mana Cake"
        return new ItemDefault(name, sellIn, quality);
    }
}
