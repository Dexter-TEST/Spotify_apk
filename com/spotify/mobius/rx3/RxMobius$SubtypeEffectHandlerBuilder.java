package com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import java.lang.Object;
import java.util.HashMap;
import com.spotify.mobius.rx3.a;
import java.lang.Class;
import p.b5;
import com.spotify.mobius.rx3.Transformers$1;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.ir0;
import com.spotify.mobius.rx3.Transformers$2;
import p.yf2;
import com.spotify.mobius.rx3.Transformers$3;
import p.i76;
import p.oa0;
import java.util.Set;
import java.util.Iterator;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import p.b16;
import com.spotify.mobius.rx3.MobiusEffectRouter;
import java.util.Collection;

public class RxMobius$SubtypeEffectHandlerBuilder	// class@000a8b from classes.dex
{
    public final HashMap a;
    public final a b;

    private void RxMobius$SubtypeEffectHandlerBuilder(){
       super();
       this.a = new HashMap();
       this.b = new a();
    }
    public void RxMobius$SubtypeEffectHandlerBuilder(int p0){
       super();
    }
    public final void a(Class p0,b5 p1){
       p1.getClass();
       this.g(p0, new Transformers$1(null, p1));
    }
    public final void b(Class p0,b5 p1,Scheduler p2){
       p1.getClass();
       this.g(p0, new Transformers$1(p2, p1));
    }
    public final void c(Class p0,ir0 p1){
       p1.getClass();
       this.g(p0, new Transformers$2(p1, null));
    }
    public final void d(Class p0,ir0 p1,Scheduler p2){
       this.g(p0, new Transformers$2(p1, p2));
    }
    public final void e(Class p0,yf2 p1){
       this.g(p0, new Transformers$3(p1, null));
    }
    public final void f(i76 p0,Scheduler p1){
       this.g(oa0.class, new Transformers$3(p0, p1));
    }
    public final void g(Class p0,ObservableTransformer p1){
       Class uClass;
       RxMobius$SubtypeEffectHandlerBuilder ta = this.a;
       Iterator iterator = ta.keySet().iterator();
       while (true) {
          if (iterator.hasNext()) {
             uClass = iterator.next();
             if (!uClass.isAssignableFrom(p0) && !p0.isAssignableFrom(uClass)) {
                continue ;
             }else {
                break ;
             }
          }else {
             ta.put(p0, new b16(this, p0, p1));
             return;
          }
       }
       throw new IllegalArgumentException("Effect classes may not be assignable to each other, collision found: "+p0.getSimpleName()+" <-> "+uClass.getSimpleName());
    }
    public final ObservableTransformer h(){
       RxMobius$SubtypeEffectHandlerBuilder ta = this.a;
       Set set = ta.keySet();
       return new MobiusEffectRouter(set, ta.values());
    }
}
