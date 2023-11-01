package p.nl0;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Object;
import p.iv6;
import io.reactivex.rxjava3.core.MaybeSource;
import p.b44;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.bn5;
import io.reactivex.rxjava3.core.ObservableSource;
import p.h82;
import io.reactivex.rxjava3.core.Observer;
import p.zn0;
import p.y72;
import p.kv6;
import io.reactivex.rxjava3.core.CompletableSource;
import p.b82;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.SingleSource;
import p.uk6;
import io.reactivex.rxjava3.core.SingleObserver;

public final class nl0 extends Flowable	// class@001ffb from classes.dex
{
    public final int b;
    public final Object c;

    public void nl0(int p0,Object p1){
       this.b = p0;
       this.c = p1;
    }
    public final void u(iv6 p0){
       nl0 tc = this.c;
       switch (this.b){
           case 0:
             tc.subscribe(new b82(p0));
             return;
           case 1:
             if (p0 instanceof zn0) {
                p0.onSubscribe(new y72(p0, tc, 0));
             }else {
                p0.onSubscribe(new y72(p0, tc, 1));
             }
             return;
             break;
           case 2:
             tc.subscribe(new h82(p0));
             return;
           case 3:
             tc.subscribe(p0);
             return;
           case 4:
             tc.subscribe(new b44(p0));
             return;
           default:
             tc.subscribe(new uk6(p0));
             return;
       }
    }
}
