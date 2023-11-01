package p.ck6;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import p.yf2;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.bk6;
import io.reactivex.rxjava3.core.SingleObserver;
import p.ri6;

public final class ck6 extends Maybe	// class@001226 from classes.dex
{
    public final int a;
    public final Single b;
    public final yf2 c;

    public void ck6(Single p0,yf2 p1,int p2){
       this.a = p2;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void d(MaybeObserver p0){
       ck6 tb = this.b;
       ck6 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tb.subscribe(new ri6(p0, tc));
             return;
       }
       tb.subscribe(new bk6(p0, tc));
       return;
    }
}
