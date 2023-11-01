package p.hw2;
import p.fu2;
import p.ru2;
import java.lang.Enum;
import p.cw2;
import p.bu2;
import p.dw2;
import p.ew2;
import p.fw2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class hw2 extends Enum implements fu2, ru2	// class@0018d4 from classes.dex
{
    public final String a;
    public final String b;
    public static final int c;
    public static final int t;
    public static final int v;
    public static final int w;
    public static final int x;
    public static final hw2[] y;

    static {
       bu2 t = bu2.t;
       cw2 uocw2 = new cw2(t);
       ew2 uoew2 = new ew2(t);
       hw2[] ohw2Array = new hw2[]{uocw2,new dw2(bu2.b),uoew2,new fw2(bu2.c)};
       hw2.y = ohw2Array;
       hw2.c = 0x7f0a021f;
       hw2.t = 0x7f0a0220;
       hw2.v = 0x7f0a0221;
       hw2.w = 0x7f0a0222;
       hw2.x = 0x7f0a0235;
    }
    public void hw2(String p0,int p1,String p2,bu2 p3){
       super(p0, p1);
       this.a = p2;
       p3.getClass();
       this.b = p3.a;
    }
    public static hw2 valueOf(String p0){
       return Enum.valueOf(hw2.class, p0);
    }
    public static hw2[] values(){
       return hw2.y.clone();
    }
    public final String c(){
       return this.a;
    }
    public final String d(){
       return this.b;
    }
}
