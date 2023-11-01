package p.k34;
import p.t1;
import io.reactivex.rxjava3.core.MaybeSource;
import p.yf2;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.r34;
import p.j34;
import p.v34;

public final class k34 extends t1	// class@001b9b from classes.dex
{
    public final int b;
    public final yf2 c;

    public void k34(MaybeSource p0,yf2 p1,int p2){
       this.b = p2;
       this.c = p1;
    }
    public final void d(MaybeObserver p0){
       t1 ta = this.a;
       k34 tc = this.c;
       switch (this.b){
           case 0:
             ta.subscribe(new j34(p0, tc));
             return;
           case 1:
             ta.subscribe(new r34(p0, tc));
             return;
           default:
             ta.subscribe(new v34(p0, tc));
             return;
       }
    }
}
