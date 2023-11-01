package p.yv7;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;

public abstract class yv7	// class@002e38 from classes.dex
{
    public static final HashMap a;
    public static final HashMap b;

    static {
       HashMap hashMap = new HashMap();
       yv7.a = hashMap;
       HashMap hashMap1 = new HashMap();
       yv7.b = hashMap1;
       Integer integer = Integer.valueOf(-2);
       hashMap.put(integer, "An unknown error occurred.");
       Integer integer1 = Integer.valueOf(-3);
       hashMap.put(integer1, "The API is not available on this device.");
       Integer integer2 = Integer.valueOf(-4);
       hashMap.put(integer2, "The request that was sent by the app is malformed.");
       Integer integer3 = Integer.valueOf(-5);
       hashMap.put(integer3, "The install is unavailable to this user or device.");
       Integer integer4 = Integer.valueOf(-6);
       hashMap.put(integer4, "The download/install is not allowed, due to the current device state \(e.g. low battery, low disk space, ...\).");
       Integer integer5 = Integer.valueOf(-7);
       hashMap.put(integer5, "The install/update has not been \(fully\) downloaded yet.");
       Integer integer6 = Integer.valueOf(-8);
       hashMap.put(integer6, "The install is already in progress and there is no UI flow to resume.");
       Integer integer7 = Integer.valueOf(-9);
       hashMap.put(integer7, "The Play Store app is either not installed or not the official version.");
       Integer integer8 = Integer.valueOf(-10);
       hashMap.put(integer8, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
       Integer integer9 = Integer.valueOf(-100);
       hashMap.put(integer9, "An internal error happened in the Play Store.");
       hashMap1.put(integer, "ERROR_UNKNOWN");
       hashMap1.put(integer1, "ERROR_API_NOT_AVAILABLE");
       hashMap1.put(integer2, "ERROR_INVALID_REQUEST");
       hashMap1.put(integer3, "ERROR_INSTALL_UNAVAILABLE");
       hashMap1.put(integer4, "ERROR_INSTALL_NOT_ALLOWED");
       hashMap1.put(integer5, "ERROR_DOWNLOAD_NOT_PRESENT");
       hashMap1.put(integer6, "ERROR_INSTALL_IN_PROGRESS");
       hashMap1.put(integer9, "ERROR_INTERNAL_ERROR");
       hashMap1.put(integer7, "ERROR_PLAY_STORE_NOT_FOUND");
       hashMap1.put(integer8, "ERROR_APP_NOT_OWNED");
       hashMap1.put(integer9, "ERROR_INTERNAL_ERROR");
    }
}
