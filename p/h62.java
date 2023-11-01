package p.h62;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.lv6;
import p.bn5;
import p.iv6;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Throwable;
import p.hn0;
import java.util.List;
import java.lang.NullPointerException;
import java.lang.String;
import p.kv6;

public final class h62 extends lv6 implements FlowableSubscriber	// class@0017ec from classes.dex
{
    public final bn5[] A;
    public final boolean B;
    public final AtomicInteger C;
    public int D;
    public ArrayList E;
    public long F;
    public final iv6 z;

    public void h62(bn5[] p0,boolean p1,iv6 p2){
       super();
       this.z = p2;
       this.A = p0;
       this.B = p1;
       this.C = new AtomicInteger();
    }
    public final void onComplete(){
       object oobject;
       ArrayList uArrayList;
       h62 tC = this.C;
       if (!tC.getAndIncrement()) {
          h62 tA = this.A;
          int len = tA.length;
          h62 tD = this.D;
          while (true) {
             int i = 1;
             h62 tz = this.z;
             if (tD == len) {
                if ((tC = this.E) != null) {
                   if (tC.size() == i) {
                      tz.onError(tC.get(0));
                   }else {
                      tz.onError(new hn0(tC));
                   }
                }else {
                   tz.onComplete();
                }
                return;
             }else if((oobject = tA[tD]) == null){
                NullPointerException nullPointerE = new NullPointerException("A Publisher entry is null");
                if (this.B != null) {
                   if ((tz = this.E) == null) {
                      int i1 = len - tD;
                      i1 = i1 + i;
                      uArrayList = new ArrayList(i1);
                      this.E = uArrayList;
                   }
                   uArrayList.add(nullPointerE);
                   tD = tD + 1;
                }else {
                   tz.onError(nullPointerE);
                   return;
                }
             }else {
                h62 tF = this.F;
                long l = 0;
                if (tF - l) {
                   this.F = l;
                   this.d(tF);
                }
                oobject.subscribe(this);
                tD = tD + 1;
                this.D = tD;
                if (tC.decrementAndGet()) {
                }
             }
          }
       }
       return;
    }
    public final void onError(Throwable p0){
       h62 tE;
       if (this.B != null) {
          if ((tE = this.E) == null) {
             tE = new ArrayList(((this.A.length - this.D) + 1));
             this.E = tE;
          }
          tE.add(p0);
          this.onComplete();
       }else {
          this.z.onError(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       this.F = this.F + 1;
       this.z.onNext(p0);
    }
    public final void onSubscribe(kv6 p0){
       this.e(p0);
    }
}
