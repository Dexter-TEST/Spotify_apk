package p.u9;
import p.yf2;
import p.y8;
import java.lang.Object;
import java.util.List;
import p.ea;
import java.lang.String;
import p.co5;
import java.lang.Iterable;
import p.dj0;
import p.nr0;

public final class u9 implements yf2	// class@00286d from classes.dex
{
    public final int a;
    public final y8 b;
    public final boolean c;

    public void u9(int p0,y8 p1,boolean p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final Object apply(Object p0){
       u9 tc;
       co5.l(p0, "it");
       u9 ta = this.a;
       List list = dj0.y0(p0, ta);
       u9 tb = this.b;
       String str = tb.a.a();
       y8 b = tb.b;
       int i = ((tc = this.c) == null && p0.size() <= ta)? 1: 0;
       ea v6 = new ea(list, str, b, tc, i);
       return v6;
    }
}
