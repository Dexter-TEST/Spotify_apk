package p.hw4;
import p.zv4;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import p.z47;
import java.lang.Class;
import p.cw4;
import java.util.concurrent.atomic.AtomicReference;
import p.ak4;
import p.yj4;

public final class hw4 extends zv4	// class@0018d6 from classes.dex
{
    public final Scheduler t;
    public final long v;
    public final TimeUnit w;
    public final int x;

    public void hw4(int p0,long p1,TimeUnit p2,Scheduler p3,boolean p4){
       super(p4);
       this.t = p3;
       this.x = p0;
       this.v = p1;
       this.w = p2;
    }
    public final Object b(Object p0){
       this.t.getClass();
       hw4 tw = this.w;
       return new z47(p0, Scheduler.a(tw), tw);
    }
    public final cw4 e(){
       this.t.getClass();
       long l = Scheduler.a(this.w) - this.v;
       cw4 uocw4 = this.get();
       cw4 uocw41 = uocw4.get();
       while (true) {
          uocw41 = uocw4;
          if ((uocw4 = uocw41) == null) {
             break ;
          }else {
             cw4 a = uocw4.a;
             if (!ak4.c(a.a) && (!a.a instanceof yj4 && (a.b - l) <= 0)) {
                uocw41 = uocw4.get();
             }else {
                break ;
             }
          }
       }
       return uocw41;
    }
    public final Object f(Object p0){
       return p0.a;
    }
    public final void i(){
       zv4 tb;
       int i1;
       this.t.getClass();
       long l = Scheduler.a(this.w) - this.v;
       cw4 uocw4 = this.get();
       cw4 uocw41 = uocw4.get();
       int i = 0;
       while (true) {
          uocw41 = uocw4;
          uocw4 = uocw41;
          if ((tb = this.b) > 1) {
             if (tb > this.x) {
                i = i + 1;
                i1 = tb - 1;
                this.b = i1;
                uocw41 = uocw4.get();
             }else if((uocw4.a.b - l) <= 0){
                i = i + 1;
                i1 = tb - 1;
                this.b = i1;
                uocw41 = uocw4.get();
             }else if(i){
                this.h(uocw41);
                break ;
             }
             break ;
          }else {
          }
       }
       return;
    }
    public final void j(){
       zv4 tb;
       this.t.getClass();
       long l = Scheduler.a(this.w) - this.v;
       cw4 uocw4 = this.get();
       cw4 uocw41 = uocw4.get();
       int i = 0;
       while (true) {
          uocw41 = uocw4;
          uocw4 = uocw41;
          if ((tb = this.b) > 1 && (uocw4.a.b - l) <= 0) {
             i = i + 1;
             int i1 = tb - 1;
             this.b = i1;
             uocw41 = uocw4.get();
          }else if(i){
             this.h(uocw41);
          }
          return;
       }
    }
}
