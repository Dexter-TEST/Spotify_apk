package p.jr6;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class jr6 extends Enum	// class@001b30 from classes.dex
{
    public static final jr6 a;
    public static final jr6 b;
    public static final jr6 c;
    public static final jr6 t;
    public static final jr6[] v;

    static {
       jr6 ojr6 = new jr6("Ready", 0);
       jr6.a = ojr6;
       jr6 ojr61 = new jr6("NotReady", 1);
       jr6.b = ojr61;
       jr6 ojr62 = new jr6("Done", 2);
       jr6.c = ojr62;
       jr6 ojr63 = new jr6("Failed", 3);
       jr6.t = ojr63;
       jr6[] ojr6Array = new jr6[]{ojr6,ojr61,ojr62,ojr63};
       jr6.v = ojr6Array;
    }
    public void jr6(String p0,int p1){
       super(p0, p1);
    }
    public static jr6 valueOf(String p0){
       return Enum.valueOf(jr6.class, p0);
    }
    public static jr6[] values(){
       return jr6.v.clone();
    }
}
