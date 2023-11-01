package p.z24;
import io.reactivex.rxjava3.core.Maybe;
import java.lang.Object;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleSource;
import p.lj6;
import p.yf2;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.ObservableSource;
import p.qv4;
import p.w00;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.MaybeSource;
import p.g34;
import p.d34;
import p.bi5;
import io.reactivex.rxjava3.core.CompletableSource;
import p.y24;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Single;
import p.u34;

public final class z24 extends Maybe	// class@002e75 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void z24(Object p0,int p1,Object p2){
       this.a = p1;
       super();
       this.b = p0;
       this.c = p2;
    }
    public final void d(MaybeObserver p0){
       z24 tb = this.b;
       z24 tc = this.c;
       switch (this.a){
           case 0:
             tc.subscribe(new y24(p0, tb));
             return;
           case 1:
             tb.subscribe(new d34(p0, tc));
             return;
           case 2:
             tb.subscribe(new g34(p0, tc));
             return;
           case 3:
             tb.subscribe(new qv4(p0, tc));
             return;
           case 4:
             tb.subscribe(new lj6(p0, tc));
             return;
           default:
             tb.subscribe(new u34(p0, tc));
             return;
       }
    }
}
