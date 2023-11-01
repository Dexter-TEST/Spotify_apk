package p.v18;
import java.lang.Enum;
import java.lang.String;
import android.util.SparseArray;
import java.lang.Object;

public final class v18 extends Enum	// class@002965 from classes.dex
{
    public static final SparseArray a;

    static {
       v18 ov18 = new v18("MOBILE_EMERGENCY", 15, 15);
       SparseArray sparseArray = new SparseArray();
       ov18.a = sparseArray;
       sparseArray.put(0, new v18("MOBILE", 0, 0));
       sparseArray.put(1, new v18("WIFI", 1, 1));
       sparseArray.put(2, new v18("MOBILE_MMS", 2, 2));
       sparseArray.put(3, new v18("MOBILE_SUPL", 3, 3));
       sparseArray.put(4, new v18("MOBILE_DUN", 4, 4));
       sparseArray.put(5, new v18("MOBILE_HIPRI", 5, 5));
       sparseArray.put(6, new v18("WIMAX", 6, 6));
       sparseArray.put(7, new v18("BLUETOOTH", 7, 7));
       sparseArray.put(8, new v18("DUMMY", 8, 8));
       sparseArray.put(9, new v18("ETHERNET", 9, 9));
       sparseArray.put(10, new v18("MOBILE_FOTA", 10, 10));
       sparseArray.put(11, new v18("MOBILE_IMS", 11, 11));
       sparseArray.put(12, new v18("MOBILE_CBS", 12, 12));
       sparseArray.put(13, new v18("WIFI_P2P", 13, 13));
       sparseArray.put(14, new v18("MOBILE_IA", 14, 14));
       sparseArray.put(15, ov18);
       sparseArray.put(16, new v18("PROXY", 16, 16));
       sparseArray.put(17, new v18("VPN", 17, 17));
       sparseArray.put(-1, new v18("NONE", 18, -1));
    }
    public void v18(String p0,int p1,int p2){
       super(p0, p1);
    }
}
