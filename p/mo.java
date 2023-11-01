package p.mo;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class mo extends Enum	// class@001ed9 from classes.dex
{
    public final int a;
    public final int b;
    public final int c;
    public static final mo t;
    public static final mo v;
    public static final mo w;
    public static final mo x;
    public static final mo[] y;

    static {
       mo v6 = new mo("LOW", 0, 0x7f1202b9, 0x7f120058, 0);
       mo.t = v6;
       v6 = new mo("NORMAL", 1, 0x7f1202ba, 0x7f12005a, 1);
       mo.v = v6;
       mo v1 = new mo("HIGH", 2, 0x7f1202b8, 0x7f120057, 2);
       mo.w = v1;
       mo v2 = new mo("VERY_HIGH", 3, 0x7f1202bb, 0x7f120059, 3);
       mo.x = v2;
       mo[] omoArray = new mo[]{v6,v6,v1,v2};
       mo.y = omoArray;
    }
    public void mo(String p0,int p1,int p2,int p3,int p4){
       super(p0, p1);
       this.a = p2;
       this.b = p3;
       this.c = p4;
    }
    public static mo valueOf(String p0){
       return Enum.valueOf(mo.class, p0);
    }
    public static mo[] values(){
       return mo.y.clone();
    }
}
