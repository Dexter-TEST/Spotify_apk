package p.u18;
import java.lang.Enum;
import java.lang.String;
import android.util.SparseArray;
import java.lang.Object;

public final class u18 extends Enum	// class@002826 from classes.dex
{
    public static final SparseArray a;

    static {
       SparseArray sparseArray = new SparseArray();
       u18.a = sparseArray;
       sparseArray.put(0, new u18("UNKNOWN_MOBILE_SUBTYPE", 0, 0));
       sparseArray.put(1, new u18("GPRS", 1, 1));
       sparseArray.put(2, new u18("EDGE", 2, 2));
       sparseArray.put(3, new u18("UMTS", 3, 3));
       sparseArray.put(4, new u18("CDMA", 4, 4));
       sparseArray.put(5, new u18("EVDO_0", 5, 5));
       sparseArray.put(6, new u18("EVDO_A", 6, 6));
       sparseArray.put(7, new u18("RTT", 7, 7));
       sparseArray.put(8, new u18("HSDPA", 8, 8));
       sparseArray.put(9, new u18("HSUPA", 9, 9));
       sparseArray.put(10, new u18("HSPA", 10, 10));
       sparseArray.put(11, new u18("IDEN", 11, 11));
       sparseArray.put(12, new u18("EVDO_B", 12, 12));
       sparseArray.put(13, new u18("LTE", 13, 13));
       sparseArray.put(14, new u18("EHRPD", 14, 14));
       sparseArray.put(15, new u18("HSPAP", 15, 15));
       sparseArray.put(16, new u18("GSM", 16, 16));
       sparseArray.put(17, new u18("TD_SCDMA", 17, 17));
       sparseArray.put(18, new u18("IWLAN", 18, 18));
       sparseArray.put(19, new u18("LTE_CA", 19, 19));
    }
    public void u18(String p0,int p1,int p2){
       super(p0, p1);
    }
}
