package p.nw2;
import p.fu2;
import p.ru2;
import java.lang.Enum;
import p.jw2;
import p.kw2;
import p.lw2;
import p.mw2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.bu2;

public abstract class nw2 extends Enum implements fu2, ru2	// class@00205f from classes.dex
{
    public final String a;
    public static final int b;
    public static final int c;
    public static final int t;
    public static final int v;
    public static final int w;
    public static final int x;
    public static final nw2[] y;

    static {
       nw2[] onw2Array = new nw2[]{new jw2(),new kw2(),new lw2(),new mw2()};
       nw2.y = onw2Array;
       nw2.b = 0x7f0a022a;
       nw2.c = 0x7f0a022b;
       nw2.t = 0x7f0a022c;
       nw2.v = 0x7f0a022d;
       nw2.w = 0x7f0a022e;
       nw2.x = 0x7f0a023c;
    }
    public void nw2(String p0,int p1,String p2){
       super(p0, p1);
       this.a = p2;
    }
    public static nw2 valueOf(String p0){
       return Enum.valueOf(nw2.class, p0);
    }
    public static nw2[] values(){
       return nw2.y.clone();
    }
    public final String c(){
       return this.a;
    }
    public final String d(){
       return bu2.t.a;
    }
    public final String toString(){
       return this.a;
    }
}
