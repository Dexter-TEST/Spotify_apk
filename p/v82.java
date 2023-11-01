package p.v82;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import java.lang.Runnable;
import p.a00;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import java.util.concurrent.atomic.AtomicLong;
import p.mv6;
import p.vv7;
import p.kv6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import p.yh6;
import p.iv6;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Object;
import p.ya4;
import java.lang.String;

public abstract class v82 extends a00 implements FlowableSubscriber, Runnable	// class@00299f from classes.dex
{
    public Throwable A;
    public int B;
    public long C;
    public boolean D;
    public final Scheduler$Worker a;
    public final boolean b;
    public final int c;
    public final int t;
    public final AtomicLong v;
    public kv6 w;
    public yh6 x;
    public boolean y;
    public boolean z;

    public void v82(Scheduler$Worker p0,boolean p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.v = new AtomicLong();
       this.t = p2 - (p2 >> 2);
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          vv7.a(this.v, p0);
          this.h();
       }
       return;
    }
    public final int b(int p0){
       if (!((p0 & 2))) {
          return 0;
       }
       this.D = true;
       return 2;
    }
    public final void cancel(){
       if (this.y != null) {
          return;
       }
       this.y = true;
       this.w.cancel();
       this.a.dispose();
       if (this.D == null && !this.getAndIncrement()) {
          this.x.clear();
       }
       return;
    }
    public final void clear(){
       this.x.clear();
    }
    public final boolean d(boolean p0,boolean p1,iv6 p2){
       v82 tA;
       if (this.y != null) {
          this.clear();
          return true;
       }else if(p0){
          if (this.b != null) {
             if (p1) {
                this.y = true;
                if ((tA = this.A) != null) {
                   p2.onError(tA);
                }else {
                   p2.onComplete();
                }
                this.a.dispose();
                return true;
             }
          }else if((tA = this.A) != null){
             this.y = true;
             this.clear();
             p2.onError(tA);
             this.a.dispose();
             return true;
          }else if(p1){
             this.y = true;
             p2.onComplete();
             this.a.dispose();
             return true;
          }
       }
       return false;
    }
    public abstract void e();
    public abstract void f();
    public abstract void g();
    public final void h(){
       if (this.getAndIncrement()) {
          return;
       }
       this.a.a(this);
       return;
    }
    public final boolean isEmpty(){
       return this.x.isEmpty();
    }
    public final void onComplete(){
       if (this.z == null) {
          this.z = true;
          this.h();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.z != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.A = p0;
          this.z = true;
          this.h();
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.z != null) {
          return;
       }
       if (this.B == 2) {
          this.h();
          return;
       }else if(!this.x.offer(p0)){
          this.w.cancel();
          this.A = new ya4("Queue is full?!");
          this.z = true;
       }
       this.h();
       return;
    }
    public final void run(){
       if (this.D != null) {
          this.f();
       }else if(this.B == 1){
          this.g();
       }else {
          this.e();
       }
       return;
    }
}
