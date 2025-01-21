package tv.codely.kata.gildedrose;

public class ItemAgedBrie extends Item{
    public ItemAgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        if (this.quality < 50) {
            this.quality = this.quality + 1;
        }
    }
}
