package common;

import net.minecraftforge.common.Configuration;

public class IDHandler {

    // Configuration categories
    public static String blockids = "Block IDs";
    public static String itemids = "Item IDs";
    public static String fluidids = "Fluid IDs";

    // Block IDs
    public static int AltarID;

    // Item IDs
    public static int CrossID;
    public static int TorahID;
    public static int BibleID;
    public static int QuranID;
    public static int BodyOfChristID;
    public static int WineBucketID;

    // Liquid IDs
    public static int WineID;

    public static void runConfiguration(Configuration config) {

        // Block IDs
        AltarID = config.get(blockids, "Altar", 2000).getInt();

        // Item IDs
        CrossID = config.get(itemids, "Cross ID", 1000).getInt();
        TorahID = config.get(itemids, "Torah ID", 1001).getInt();
        BibleID = config.get(itemids, "Bible ID", 1002).getInt();
        QuranID = config.get(itemids, "Quran ID", 1003).getInt();
        BodyOfChristID = config.get(itemids, "Body Of Christ ID", 1004).getInt();
        WineBucketID = config.get(itemids, "Wine Bucket ID", 1005).getInt();

        // Liquid IDs
        WineID = config.get(fluidids, "Wine ID", 3000).getInt();

    }

}
