package p.mc3;
import p.du0;
import p.au0;
import p.xw0;
import p.ng2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.eb3;
import java.lang.IllegalStateException;
import p.eo5;

public final class mc3 extends du0	// class@001e69 from classes.dex
{
    public int t;
    public final ng2 v;
    public final Object w;

    public void mc3(au0 p0,xw0 p1,ng2 p2,Object p3){
       this.v = p2;
       this.w = p3;
       co5.j(p0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
       super(p0, p1);
    }
    public final Object f(Object p0){
       mc3 tt;
       if ((tt = this.t) != null) {
          if (tt == 1) {
             this.t = 2;
             eb3.G(p0);
          }else {
             throw new IllegalStateException("This coroutine had already completed".toString());
          }
       }else {
          this.t = 1;
          eb3.G(p0);
          p0 = this.v;
          co5.j(p0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
          eo5.f(p0);
          p0 = p0.b(this.w, this);
       }
       return p0;
    }
}
