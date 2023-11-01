package p.t60;
import io.reactivex.rxjava3.core.Observable;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import p.co5;
import io.reactivex.rxjava3.core.Observer;
import p.jl1;
import p.zv6;
import p.nt4;
import p.w00;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Throwable;
import p.kg4;
import p.s60;
import java.lang.Iterable;
import java.util.Iterator;
import java.util.Objects;
import p.wz4;

public final class t60 extends Observable	// class@002708 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object t;

    public void t60(Context p0,IntentFilter p1,Boolean p2){
       this.a = 0;
       co5.o(p0, "context");
       co5.o(p1, "intentFilter");
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
    }
    public void t60(Object p0,Object p1,Object p2,int p3){
       this.a = p3;
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
    }
    public final void subscribeActual(Observer p0){
       jl1 a = jl1.a;
       switch (this.a){
           case 0:
             co5.o(p0, "observer");
             p0.onSubscribe(new s60(p0, this.b, this.c, this.t));
             return;
           case 1:
             t60 tc = this.c;
             nt4 ont4 = new nt4(p0, tc, this.t, this.b.get());
             p0.onSubscribe(ont4);
             nt4 c = ont4.c;
             if (ont4.t != null) {
                ont4.c = null;
                ont4.a(c);
             }else if(ont4.t != null){
                ont4.c = null;
                ont4.a(c);
             }else {
                ont4.w = false;
                boolean b = true;
                c = tc.apply(c, ont4);
                if (ont4.v != null) {
                   ont4.t = b;
                   ont4.c = null;
                   ont4.a(c);
                }
             }
             break;
           default:
             Iterator iterator = this.c.iterator();
             Objects.requireNonNull(iterator, "The iterator returned by other is null");
             if (!iterator.hasNext()) {
                p0.onSubscribe(a);
                p0.onComplete();
             }else {
                this.b.subscribe(new wz4(p0, iterator, this.t));
             }
             return;
       }
    }
}
