package p.ct3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class ct3 extends Enum	// class@001272 from classes.dex
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean t;
    public final boolean v;
    public final boolean w;
    public static final ct3 x;
    public static final ct3[] y;

    static {
       ct3 v9 = new ct3("NATIVE_WITH_FALLBACK", 0, true, true, true, false, true, true);
       ct3.x = v9;
       v9 = new ct3("NATIVE_ONLY", 1, true, true, false, false, false, true);
       ct3 v1 = new ct3("KATANA_ONLY", 2, false, true, false, false, false, false);
       ct3 v4 = new ct3("WEB_ONLY", 3, false, false, true, false, true, false);
       ct3 v5 = new ct3("WEB_VIEW_ONLY", 4, false, false, true, false, false, false);
       ct3 v6 = new ct3("DIALOG_ONLY", 5, false, true, true, false, true, true);
       ct3 v7 = new ct3("DEVICE_AUTH", 6, false, false, false, true, 0, 0);
       ct3[] uoct3Array = new ct3[]{v9,v9,v1,v4,v5,v6,v7};
       ct3.y = uoct3Array;
    }
    public void ct3(String p0,int p1,boolean p2,boolean p3,boolean p4,boolean p5,boolean p6,boolean p7){
       super(p0, p1);
       this.a = p2;
       this.b = p3;
       this.c = p4;
       this.t = p5;
       this.v = p6;
       this.w = p7;
    }
    public static ct3 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(ct3.class, p0);
    }
    public static ct3[] values(){
       return Arrays.copyOf(ct3.y, 7);
    }
}
