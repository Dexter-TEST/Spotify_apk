package p.mr3;
import p.kr3;
import p.lr3;
import java.util.EnumSet;
import java.lang.Object;
import p.wr3;
import java.util.AbstractCollection;
import p.zr3;

public final class mr3 implements kr3	// class@001eed from classes.dex
{
    public final zr3 a;
    public final zr3 b;
    public final zr3 c;
    public final zr3 d;
    public final zr3 e;
    public final zr3 f;
    public static final lr3 g;
    public static final lr3 h;
    public static final lr3 i;
    public static final lr3 j;
    public static final lr3 k;
    public static final lr3 l;
    public static final lr3 m;

    static {
       mr3.g = new lr3(0);
       mr3.h = new lr3(1);
       mr3.i = new lr3(2);
       mr3.j = new lr3(3);
       mr3.k = new lr3(4);
       mr3.l = new lr3(5);
       mr3.m = new lr3(6);
    }
    public void mr3(EnumSet p0){
       fv1 uofv1;
       super();
       p0.contains(wr3.a);
       fv1 n = zr3.n;
       lr3 g = (p0.contains(wr3.b))? mr3.g: n;
       this.a = g;
       g = (p0.contains(wr3.c))? mr3.i: n;
       this.b = g;
       g = (p0.contains(wr3.t))? mr3.j: n;
       this.c = g;
       g = (p0.contains(wr3.v))? mr3.k: n;
       this.d = g;
       g = (p0.contains(wr3.w))? mr3.l: n;
       this.e = g;
       if (p0.contains(wr3.x)) {
          n = mr3.m;
       }
       this.f = n;
       return;
    }
    public final zr3 a(){
       return this.d;
    }
    public final zr3 b(){
       return this.b;
    }
    public final zr3 c(){
       return this.c;
    }
    public final zr3 d(){
       return this.e;
    }
    public final zr3 e(){
       return this.f;
    }
    public final zr3 f(){
       return this.a;
    }
}
