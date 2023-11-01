package p.u06;
import p.v90;
import java.lang.reflect.Type;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import p.e15;
import p.x90;
import p.d30;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Completable;

public final class u06 implements v90	// class@000359 from classes2.dex
{
    public final Type a;
    public final Scheduler b;
    public final boolean c;
    public final boolean t;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public void u06(Type p0,Scheduler p1,boolean p2,boolean p3,boolean p4,boolean p5,boolean p6,boolean p7,boolean p8){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
       this.y = p7;
       this.z = p8;
    }
    public final Type g(){
       return this.a;
    }
    public final Object m(e15 p0){
       d30 uod30;
       u06 tb;
       x90 ox90 = (this.c != null)? new x90(p0, 0): new x90(p0, 1);
       if (this.t != null) {
          uod30 = new d30(ox90, 1);
       }else if(this.v != null){
          uod30 = new d30(ox90, 0);
       }else if((tb = this.b) != null){
          ox90 = ox90.subscribeOn(tb);
       }
       if (this.w != null) {
          return ox90.toFlowable(BackpressureStrategy.c);
       }else if(this.x != null){
          return ox90.singleOrError();
       }else if(this.y != null){
          return ox90.singleElement();
       }else if(this.z != null){
          return ox90.ignoreElements();
       }else {
          return ox90;
       }
       ox90 = uod30;
    }
}
