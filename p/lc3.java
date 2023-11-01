package p.lc3;
import p.ox5;
import java.lang.Object;
import p.au0;
import p.ng2;
import java.lang.String;
import p.co5;
import p.eb3;
import java.lang.IllegalStateException;
import p.eo5;

public final class lc3 extends ox5	// class@001d27 from classes.dex
{
    public int b;
    public final ng2 c;
    public final Object t;

    public void lc3(Object p0,au0 p1,ng2 p2){
       this.c = p2;
       this.t = p0;
       co5.j(p1, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
       super(p1);
    }
    public final Object f(Object p0){
       lc3 tb;
       if ((tb = this.b) != null) {
          if (tb == 1) {
             this.b = 2;
             eb3.G(p0);
          }else {
             throw new IllegalStateException("This coroutine had already completed".toString());
          }
       }else {
          this.b = 1;
          eb3.G(p0);
          p0 = this.c;
          co5.j(p0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
          eo5.f(p0);
          p0 = p0.b(this.t, this);
       }
       return p0;
    }
}
