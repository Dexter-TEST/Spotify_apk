package p.bz2;
import p.cz2;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class bz2 extends Enum implements cz2	// class@001163 from classes.dex
{
    public final int a;
    public final int b;
    public static final bz2 c;
    public static final bz2 t;
    public static final bz2[] v;

    static {
       bz2 uobz2 = new bz2("THUMBNAIL", 0, 4, 1);
       bz2.c = uobz2;
       bz2 uobz21 = new bz2("CARD", 1, 2, 3);
       bz2.t = uobz21;
       bz2[] uobz2Array = new bz2[]{uobz2,uobz21};
       bz2.v = uobz2Array;
    }
    public void bz2(String p0,int p1,int p2,int p3){
       super(p0, p1);
       if (!p2) {
          throw null;
       }
       this.a = p2;
       if (!p3) {
          throw null;
       }
       this.b = p3;
       return;
    }
    public static bz2 valueOf(String p0){
       return Enum.valueOf(bz2.class, p0);
    }
    public static bz2[] values(){
       return bz2.v.clone();
    }
}
