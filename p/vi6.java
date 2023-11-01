package p.vi6;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import p.ir0;
import io.reactivex.rxjava3.core.SingleObserver;
import p.bj6;
import p.h34;
import p.ui6;

public final class vi6 extends Single	// class@002a01 from classes.dex
{
    public final int a;
    public final SingleSource b;
    public final ir0 c;

    public void vi6(SingleSource p0,ir0 p1,int p2){
       this.a = p2;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribeActual(SingleObserver p0){
       vi6 tc = this.c;
       vi6 tb = this.b;
       switch (this.a){
           case 0:
             tb.subscribe(new ui6(p0, tc));
             return;
           case 1:
             tb.subscribe(new h34(this, p0, 2));
             return;
           case 2:
             tb.subscribe(new bj6(p0, tc));
             return;
           default:
             tb.subscribe(new h34(this, p0, 4));
             return;
       }
    }
}
