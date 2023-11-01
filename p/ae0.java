package p.ae0;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ae0 extends Enum	// class@000f63 from classes.dex
{
    public final int a;
    public final int b;
    public static final ae0 c;
    public static final ae0 t;
    public static final ae0 v;
    public static final ae0[] w;

    static {
       ae0 uoae0 = new ae0(0, 0x7f12034a, 0x7f120349, "DISABLED_ALWAYS");
       ae0.c = uoae0;
       ae0 uoae01 = new ae0(1, 0x7f12034e, 0x7f12034d, "ENABLED_ALWAYS");
       ae0.t = uoae01;
       ae0 uoae02 = new ae0(2, 0x7f12034c, 0x7f12034b, "ENABLED_MOBILE");
       ae0.v = uoae02;
       ae0[] uoae0Array = new ae0[]{uoae0,uoae01,uoae02};
       ae0.w = uoae0Array;
    }
    public void ae0(int p0,int p1,int p2,String p3){
       super(p3, p0);
       this.a = p1;
       this.b = p2;
    }
    public static ae0 valueOf(String p0){
       return Enum.valueOf(ae0.class, p0);
    }
    public static ae0[] values(){
       return ae0.w.clone();
    }
}
