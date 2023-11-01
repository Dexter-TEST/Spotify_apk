package p.ts6;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ts6 extends Enum	// class@0027d4 from classes.dex
{
    public static final ts6 a;
    public static final ts6 b;
    public static final ts6 c;
    public static final ts6 t;
    public static final ts6 v;
    public static final ts6 w;
    public static final ts6 x;
    public static final ts6 y;
    public static final ts6[] z;

    static {
       ts6 ots6 = new ts6("StorageManagerCache", 0);
       ts6.a = ots6;
       ts6 ots61 = new ts6("StorageManagerSettings", 1);
       ts6.b = ots61;
       ts6 ots62 = new ts6("InternalCache", 2);
       ts6.c = ots62;
       ts6 ots63 = new ts6("ExternalCache", 3);
       ts6.t = ots63;
       ts6 ots64 = new ts6("InternalFiles", 4);
       ts6.v = ots64;
       ts6 ots65 = new ts6("ExternalFiles", 5);
       ts6.w = ots65;
       ts6 ots66 = new ts6("SharedPreferences", 6);
       ts6.x = ots66;
       ts6 ots67 = new ts6("Unknown", 7);
       ts6.y = ots67;
       ts6[] ots6Array = new ts6[]{ots6,ots61,ots62,ots63,ots64,ots65,ots66,ots67};
       ts6.z = ots6Array;
    }
    public void ts6(String p0,int p1){
       super(p0, p1);
    }
    public static ts6 valueOf(String p0){
       return Enum.valueOf(ts6.class, p0);
    }
    public static ts6[] values(){
       return ts6.z.clone();
    }
}
