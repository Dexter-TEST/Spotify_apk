package p.wv7;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;

public abstract class wv7	// class@002bb7 from classes.dex
{
    public static final HashMap a;
    public static final HashMap b;

    static {
       HashMap hashMap = new HashMap();
       wv7.a = hashMap;
       HashMap hashMap1 = new HashMap();
       wv7.b = hashMap1;
       Integer integer = Integer.valueOf(-1);
       hashMap.put(integer, "The requesting app is unavailable \(e.g. unpublished, nonexistent version code\).");
       Integer integer1 = Integer.valueOf(-2);
       hashMap.put(integer1, "The requested pack is not available.");
       Integer integer2 = Integer.valueOf(-3);
       hashMap.put(integer2, "The request is invalid.");
       Integer integer3 = Integer.valueOf(-4);
       hashMap.put(integer3, "The requested download is not found.");
       Integer integer4 = Integer.valueOf(-5);
       hashMap.put(integer4, "The Asset Delivery API is not available.");
       Integer integer5 = Integer.valueOf(-6);
       hashMap.put(integer5, "Network error. Unable to obtain the asset pack details.");
       Integer integer6 = Integer.valueOf(-7);
       hashMap.put(integer6, "Download not permitted under current device circumstances \(e.g. in background\).");
       Integer integer7 = Integer.valueOf(-10);
       hashMap.put(integer7, "Asset pack download failed due to insufficient storage.");
       Integer integer8 = Integer.valueOf(-11);
       hashMap.put(integer8, "The Play Store app is either not installed or not the official version.");
       Integer integer9 = Integer.valueOf(-12);
       hashMap.put(integer9, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.");
       Integer integer10 = Integer.valueOf(-13);
       hashMap.put(integer10, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
       Integer integer11 = Integer.valueOf(-100);
       hashMap.put(integer11, "Unknown error downloading an asset pack.");
       hashMap1.put(integer, "APP_UNAVAILABLE");
       hashMap1.put(integer1, "PACK_UNAVAILABLE");
       hashMap1.put(integer2, "INVALID_REQUEST");
       hashMap1.put(integer3, "DOWNLOAD_NOT_FOUND");
       hashMap1.put(integer4, "API_NOT_AVAILABLE");
       hashMap1.put(integer5, "NETWORK_ERROR");
       hashMap1.put(integer6, "ACCESS_DENIED");
       hashMap1.put(integer7, "INSUFFICIENT_STORAGE");
       hashMap1.put(integer8, "PLAY_STORE_NOT_FOUND");
       hashMap1.put(integer9, "NETWORK_UNRESTRICTED");
       hashMap1.put(integer10, "APP_NOT_OWNED");
       hashMap1.put(integer11, "INTERNAL_ERROR");
    }
}
