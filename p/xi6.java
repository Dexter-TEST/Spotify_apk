package p.xi6;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import p.b5;
import io.reactivex.rxjava3.core.SingleObserver;
import p.zi6;
import p.yi6;
import p.wi6;
import p.h34;

public final class xi6 extends Single	// class@002c85 from classes.dex
{
    public final int a;
    public final SingleSource b;
    public final b5 c;

    public void xi6(SingleSource p0,b5 p1,int p2){
       this.a = p2;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribeActual(SingleObserver p0){
       xi6 tc = this.c;
       xi6 tb = this.b;
       switch (this.a){
           case 0:
             tb.subscribe(new wi6(p0, tc));
             return;
           case 1:
             tb.subscribe(new yi6(p0, tc));
             return;
           case 2:
             tb.subscribe(new zi6(p0, tc));
             return;
           default:
             tb.subscribe(new h34(this, p0, 5));
             return;
       }
    }
}
