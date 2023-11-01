package p.sb7;
import p.ir0;
import p.ub7;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;
import java.lang.System;
import java.util.concurrent.atomic.AtomicLong;
import p.bx5;
import java.lang.String;
import p.co5;
import p.cx5;
import p.bw5;
import java.lang.StringBuilder;
import p.tp2;

public final class sb7 implements ir0	// class@0025fa from classes.dex
{
    public final int a;
    public final ub7 b;

    public void sb7(ub7 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       cx5 t;
       sb7 tb = this.b;
       switch (this.a){
           case 0:
           default:
             co5.o(p0, "response");
             tb.getClass();
             bx5 a = p0.a;
             if ((t = a.t) != 200 && (t != 404 && t != 429)) {
                throw new bw5(tp2.n("Unauth Resolve request failed: ", a.t, '!'), p0);
             }
             return;
       }
       tb.c.getClass();
       tb.f.set(System.currentTimeMillis());
       return;
    }
}
