package p.ti6;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.core.SingleObserver;
import p.si6;
import p.uj6;

public final class ti6 extends Single	// class@00277b from classes.dex
{
    public final int a;
    public final SingleSource b;

    public void ti6(SingleSource p0,int p1){
       this.a = p1;
       this.b = p0;
    }
    public final void subscribeActual(SingleObserver p0){
       ti6 tb = this.b;
       switch (this.a){
           case 0:
             tb.subscribe(new si6(p0));
             return;
           case 1:
             tb.subscribe(p0);
             return;
           default:
             tb.subscribe(new uj6(p0));
             return;
       }
    }
}
