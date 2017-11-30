package com.example.cjcucsie.myapplication.dummy;

import com.example.cjcucsie.myapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample title for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class FoodContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<FoodItem> ITEMS = new ArrayList<FoodItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, FoodItem> ITEM_MAP = new HashMap<String, FoodItem>();

    private static final int COUNT = 5;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createFoodItem(i));
        }
    }

    private static void addItem(FoodItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static FoodItem createFoodItem(int position) {
        return new FoodItem(String.valueOf(position), makeContent(position),
                makeDetails(position), makeCal(position),
                makeImgID(position));
    }

    private static int makeImgID(int position) {
        int imgIDs[] = new int[] {
                R.drawable.beef,
                R.drawable.cake,
                R.drawable.coffee,
                R.drawable.noodle,
                R.drawable.wine
        };
        return imgIDs[position-1];
    }

    private static String makeContent(int position) {
        String content[] = new String[]{
                "牛肉",
                "蛋糕",
                "咖啡",
                "義大利麵",
                "好酒"
        };
        return content[position - 1];
    }

    private static int makeCal(int position) {
        int cals[] = new int[]{100, 150, 250, 350, 450};
        return cals[position-1];
    }

    private static String makeDetails(int position) {
        String details[] = new String[]{
                "牛肉好吃",
                "蛋糕好吃",
                "咖啡好喝",
                "義大利麵美味",
                "酒要多喝"
        };
        return details[position - 1];
    }

    /**
     * A dummy item representing a piece of title.
     */
    public static class FoodItem {
        public final String id;
        public final String title;
        public final String details;
        public final int cal;
        public final int imgID;

        public FoodItem(String id, String content, String details, int cal, int imgID) {
            this.id = id;
            this.title = content;
            this.details = details;
            this.cal = cal;
            this.imgID = imgID;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}
