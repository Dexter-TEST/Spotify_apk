package p.nk5;
import android.util.SparseArray;
import java.util.EnumMap;
import p.kk5;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Enum;
import java.lang.Object;
import java.util.Set;
import java.util.Iterator;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalArgumentException;
import p.tp2;

public abstract class nk5	// class@001ff7 from classes.dex
{
    public static final SparseArray a;
    public static final EnumMap b;

    static {
       nk5.a = new SparseArray();
       EnumMap uEnumMap = new EnumMap(kk5.class);
       nk5.b = uEnumMap;
       uEnumMap.put(kk5.a, Integer.valueOf(0));
       uEnumMap.put(kk5.b, Integer.valueOf(1));
       uEnumMap.put(kk5.c, Integer.valueOf(2));
       Iterator iterator = uEnumMap.keySet().iterator();
       while (iterator.hasNext()) {
          kk5 okk5 = iterator.next();
          nk5.a.append(nk5.b.get(okk5).intValue(), okk5);
       }
    }
    public static int a(kk5 p0){
       Integer integer;
       if ((integer = nk5.b.get(p0)) != null) {
          return integer.intValue();
       }
       throw new IllegalStateException("PriorityMapping is missing known Priority value "+p0);
    }
    public static kk5 b(int p0){
       kk5 okk5;
       if ((okk5 = nk5.a.get(p0)) != null) {
          return okk5;
       }
       throw new IllegalArgumentException(tp2.k("Unknown Priority for value ", p0));
    }
}
