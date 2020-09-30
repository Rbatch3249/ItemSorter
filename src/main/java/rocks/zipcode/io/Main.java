package rocks.zipcode.io;

import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(1L,"First item", 9.99);
        Item item2 = new Item(3L,"Second Item",20.00);
        Item item3 = new Item(2L,"Third item", 17.99);

        Item[] randomItems = {item1,item2,item3};
        ItemSorter itemSorter = new ItemSorter(randomItems);
        System.out.println("Unsorted " + Arrays.toString(randomItems));
        PriceComparator priceComparator = new PriceComparator();
        itemSorter.sort(priceComparator);
        System.out.println("Sorted " + Arrays.toString(randomItems));

    }
}
