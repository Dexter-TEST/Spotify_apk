package p.ic1;
import p.h07;
import p.x07;
import p.ir2;
import java.lang.Object;
import java.util.concurrent.CancellationException;
import p.au0;
import java.lang.Throwable;
import p.ul0;
import p.io2;
import p.xh3;
import java.lang.StringBuilder;
import java.lang.String;
import p.co5;
import p.xw0;
import p.is7;
import p.jc7;
import p.gc1;
import p.w51;
import p.zb7;
import p.vv7;
import p.gg1;
import p.ww0;
import p.vw0;
import p.me3;
import p.ve3;
import p.tx5;
import p.eb3;
import java.lang.Class;
import p.ux5;

public abstract class ic1 extends h07	// class@001965 from classes.dex
{
    public int c;

    public void ic1(int p0){
       super(0, x07.f);
       this.c = p0;
    }
    public abstract void b(Object p0,CancellationException p1);
    public abstract au0 c();
    public Throwable e(Object p0){
       Throwable throwable = null;
       if (p0 instanceof ul0) {
       }else {
          p0 = throwable;
       }
       if (p0 != null) {
          throwable = p0.a;
       }
       return throwable;
    }
    public Object f(Object p0){
       return p0;
    }
    public final void g(Throwable p0,Throwable p1){
       if (p0 == null && p1 == null) {
          return;
       }
       if (p0 != null && p1 != null) {
          io2.a(p0, p1);
       }
       if (p0 == null) {
          p0 = p1;
       }
       co5.i(p0);
       is7.r(this.c().getContext(), new xh3("Fatal exception in coroutines machinery for "+this+". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers", p0));
       return;
    }
    public abstract Object h();
    public final void run(){
       Object obj;
       Throwable throwable;
       me3 ome3;
       jc7 a = jc7.a;
       h07 tb = this.b;
       gc1 ogc1 = this.c();
       gc1 v = ogc1.v;
       xw0 context = v.getContext();
       zb7 ozb7 = ((obj = w51.W(context, ogc1.x)) != w51.C)? vv7.X(v, context, obj): null;
       xw0 context1 = v.getContext();
       Object obj1 = this.h();
       if ((throwable = this.e(obj1)) == null) {
          ic1 tc = this.c;
          int i = 1;
          if (tc != i && tc != 2) {
             i = 0;
          }
          if (i) {
             ome3 = context1.f(gg1.y);
          label_0045 :
             if (ome3 != null && !ome3.b()) {
                CancellationException uCancellatio = ome3.o();
                this.b(obj1, uCancellatio);
                v.d(eb3.h(uCancellatio));
             }else if(throwable != null){
                v.d(eb3.h(throwable));
             }else {
                v.d(this.f(obj1));
             }
             if (ozb7 == null || ozb7.O()) {
                w51.N(context, obj);
             }
             tb.getClass();
             this.g(null, ux5.a(a));
             return;
          }
       }
       ome3 = null;
       goto label_0045 ;
    }
}
