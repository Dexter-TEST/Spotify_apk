package p.zx2;
import java.lang.Enum;
import p.cc0;
import java.lang.String;
import p.zt2;
import p.ty0;
import p.a23;
import java.lang.Class;
import java.lang.Object;

public final class zx2 extends Enum	// class@002f83 from classes.dex
{
    public final String a;
    public final cc0 b;
    public static final zx2 c;
    public static final zx2[] t;

    static {
       zx2 ozx2 = new zx2("DEFAULT", 0, "default", cc0.a);
       zx2.c = ozx2;
       zx2[] ozx2Array = new zx2[]{ozx2,new zx2("DOUBLE_LINE_TITLE", 1, "doubleLineTitle", cc0.b),new zx2("DOUBLE_LINE_SUBTITLE", 2, "doubleLineSubtitle", cc0.c)};
       zx2.t = ozx2Array;
    }
    public void zx2(String p0,int p1,String p2,cc0 p3){
       super(p0, p1);
       this.a = p2;
       this.b = p3;
       ty0.b().r("textLayout", p2).d();
    }
    public static zx2 valueOf(String p0){
       return Enum.valueOf(zx2.class, p0);
    }
    public static zx2[] values(){
       return zx2.t.clone();
    }
}
