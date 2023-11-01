package p.d28;
import java.lang.Enum;
import java.lang.String;
import android.util.SparseArray;
import java.lang.Object;

public final class d28 extends Enum	// class@0012c9 from classes.dex
{
    public static final d28 a;

    static {
       d28 uod28 = new d28("DEFAULT", 0);
       d28.a = uod28;
       SparseArray sparseArray = new SparseArray();
       sparseArray.put(0, uod28);
       sparseArray.put(1, new d28("UNMETERED_ONLY", 1));
       sparseArray.put(2, new d28("UNMETERED_OR_DAILY", 2));
       sparseArray.put(3, new d28("FAST_IF_RADIO_AWAKE", 3));
       sparseArray.put(4, new d28("NEVER", 4));
       sparseArray.put(-1, new d28("UNRECOGNIZED", 5));
    }
    public void d28(String p0,int p1){
       super(p0, p1);
    }
}
