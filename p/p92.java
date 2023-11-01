package p.p92;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import p.iv6;
import p.lv6;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Throwable;
import p.co5;
import java.lang.Object;
import p.kv6;

public final class p92 extends AtomicInteger implements FlowableSubscriber	// class@002217 from classes.dex
{
    public final iv6 a;
    public final lv6 b;
    public final bn5 c;
    public long t;

    public void p92(iv6 p0,lv6 p1,Flowable p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onComplete(){
       throw null;
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.t = this.t + 1;
       this.a.onNext(p0);
    }
    public final void onSubscribe(kv6 p0){
       this.b.e(p0);
    }
}
