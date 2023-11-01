package p.p80;
import java.lang.Enum;
import p.l80;
import p.m80;
import p.n80;
import p.o80;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class p80 extends Enum	// class@00220c from classes.dex
{
    public static final l80 a;
    public static final m80 b;
    public static final n80 c;
    public static final o80 t;
    public static final p80[] v;

    static {
       l80 ol80 = new l80();
       p80.a = ol80;
       m80 om80 = new m80();
       p80.b = om80;
       n80 on80 = new n80();
       p80.c = on80;
       o80 oo80 = new o80();
       p80.t = oo80;
       p80[] op80Array = new p80[]{ol80,om80,on80,oo80};
       p80.v = op80Array;
    }
    public void p80(String p0,int p1){
       super(p0, p1);
    }
    public static long a(long p0,long p1,long p2){
       if ((p0 - p2) > 0) {
          p0 = Long.MAX_VALUE;
       }else if((p0 - (- p2)) < 0){
          p0 = Long.MIN_VALUE;
       }else {
          p0 = p0 * p1;
       }
       return p0;
    }
    public static p80 valueOf(String p0){
       return Enum.valueOf(p80.class, p0);
    }
    public static p80[] values(){
       return p80.v.clone();
    }
    public abstract long b(long p0);
}
