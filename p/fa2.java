package p.fa2;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.x81;
import p.iv6;
import java.lang.Object;
import p.kv6;
import java.util.NoSuchElementException;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.mv6;

public final class fa2 extends x81 implements FlowableSubscriber	// class@00158b from classes.dex
{
    public final Object c;
    public final boolean t;
    public kv6 v;
    public boolean w;

    public void fa2(iv6 p0,Object p1,boolean p2){
       super(p0);
       this.c = p1;
       this.t = p2;
    }
    public final void cancel(){
       super.cancel();
       this.v.cancel();
    }
    public final void onComplete(){
       if (this.w != null) {
          return;
       }
       this.w = true;
       x81 tb = this.b;
       this.b = null;
       if (tb == null) {
          tb = this.c;
       }
       if (tb == null) {
          x81 ta = this.a;
          if (this.t != null) {
             ta.onError(new NoSuchElementException());
          }else {
             ta.onComplete();
          }
       }else {
          this.d(tb);
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.w != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.w = true;
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.w != null) {
          return;
       }
       if (this.b != null) {
          this.w = true;
          this.v.cancel();
          this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
          return;
       }else {
          this.b = p0;
          return;
       }
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.v, p0)) {
          this.v = p0;
          this.a.onSubscribe(this);
          p0.a(Long.MAX_VALUE);
       }
       return;
    }
}
