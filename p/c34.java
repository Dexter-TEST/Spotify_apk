package p.c34;
import p.t1;
import io.reactivex.rxjava3.core.MaybeSource;
import p.bi5;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.b34;
import p.u34;

public final class c34 extends t1	// class@00118b from classes.dex
{
    public final int b;
    public final bi5 c;

    public void c34(MaybeSource p0,bi5 p1,int p2){
       this.b = p2;
       this.c = p1;
    }
    public final void d(MaybeObserver p0){
       t1 ta = this.a;
       c34 tc = this.c;
       switch (this.b){
           case 0:
           default:
             ta.subscribe(new u34(p0, tc));
             return;
       }
       ta.subscribe(new b34(p0, tc));
       return;
    }
}
