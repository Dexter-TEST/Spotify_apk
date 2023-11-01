package p.du0;
import p.ux;
import p.au0;
import p.xw0;
import java.lang.Object;
import p.co5;
import p.eu0;
import p.fv1;
import p.ww0;
import p.vw0;
import p.gc1;
import p.tl0;

public abstract class du0 extends ux	// class@0013b7 from classes.dex
{
    public final xw0 b;
    public au0 c;

    public void du0(au0 p0){
       xw0 context = (p0 != null)? p0.getContext(): null;
       super(p0, context);
       return;
    }
    public void du0(au0 p0,xw0 p1){
       super(p0);
       this.b = p1;
    }
    public final void g(){
       du0 tc;
       if ((tc = this.c) != null && tc != this) {
          du0 tb = this.b;
          co5.i(tb);
          co5.i(tb.f(fv1.t));
          tc.l();
       }
       this.c = tl0.a;
       return;
    }
    public final xw0 getContext(){
       du0 tb = this.b;
       co5.i(tb);
       return tb;
    }
}
