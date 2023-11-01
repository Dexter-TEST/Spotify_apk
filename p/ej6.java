package p.ej6;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import p.yf2;
import io.reactivex.rxjava3.core.SingleObserver;
import p.h34;
import java.lang.Object;
import p.dj6;
import p.gk6;

public final class ej6 extends Single	// class@00149d from classes.dex
{
    public final int a;
    public final SingleSource b;
    public final yf2 c;

    public void ej6(SingleSource p0,yf2 p1,int p2){
       this.a = p2;
       super();
       this.c = p1;
       this.b = p0;
    }
    public final void subscribeActual(SingleObserver p0){
       ej6 tb = this.b;
       ej6 tc = this.c;
       switch (this.a){
           case 0:
             tb.subscribe(new dj6(p0, tc));
             return;
           case 1:
             tb.subscribe(new h34(p0, 6, tc));
             return;
           default:
             tb.subscribe(new gk6(p0, tc));
             return;
       }
    }
}
