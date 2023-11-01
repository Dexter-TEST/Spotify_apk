package p.p62;
import p.p0;
import p.y82;
import p.mf1;
import p.ro1;
import io.reactivex.rxjava3.core.Flowable;
import p.iv6;
import p.yf2;
import java.lang.Enum;
import p.l62;
import p.k62;
import p.eo5;

public final class p62 extends p0	// class@0021fc from classes.dex
{
    public final yf2 c;
    public final int t;
    public final ro1 v;

    public void p62(y82 p0,mf1 p1){
       super(p0);
       this.c = p1;
       this.t = 2;
       this.v = ro1.a;
    }
    public static iv6 subscribe(iv6 p0,yf2 p1,int p2,ro1 p3){
       int i = p3.ordinal();
       boolean b = true;
       if (i == b) {
          return new k62(p2, p1, p0, false);
       }
       if (i != 2) {
          return new l62(p0, p1, p2);
       }
       return new k62(p2, p1, p0, b);
    }
    public final void u(iv6 p0){
       p0 tb = this.b;
       p62 tc = this.c;
       if (eo5.W(tb, p0, tc)) {
          return;
       }
       tb.subscribe(p62.subscribe(p0, tc, this.t, this.v));
       return;
    }
}
