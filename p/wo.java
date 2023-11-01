package p.wo;
import p.ir0;
import p.zo;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;
import java.lang.System;
import java.util.concurrent.atomic.AtomicLong;
import p.bx5;
import java.lang.String;
import p.co5;
import p.cx5;
import p.qb7;

public final class wo implements ir0	// class@002b7c from classes.dex
{
    public final int a;
    public final zo b;

    public void wo(zo p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       cx5 t;
       wo tb = this.b;
       switch (this.a){
           case 0:
           default:
             co5.o(p0, "response");
             tb.getClass();
             if ((t = p0.a.t) != 200 && (t != 404 && t != 429)) {
                throw new qb7(p0);
             }
             return;
       }
       tb.c.getClass();
       tb.h.set(System.currentTimeMillis());
       return;
    }
}
