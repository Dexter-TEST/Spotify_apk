package p.gg;
import p.u94;
import java.lang.Object;
import p.jg;
import p.pb4;
import p.sb4;
import p.vt;
import p.r45;
import android.content.BroadcastReceiver;
import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import p.q06;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import p.s02;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.ti3;
import android.content.IntentFilter;
import p.fg;
import android.content.Intent;

public abstract class gg implements u94	// class@001706 from classes.dex
{
    public Object a;
    public final Object b;

    public void gg(Object p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void gg(jg p0){
       this.b = p0;
       super();
    }
    public final Object a(){
       return this.a.c().c.f();
    }
    public final void b(){
       gg ta = this.a;
       if (ta != null) {
          try{
             this.b.B.unregisterReceiver(ta);
             this.a = null;
          }catch(java.lang.IllegalArgumentException e0){
          }
       }
       return;
    }
    public final Observable c(){
       return Observable.create(new q06(this.a, Observable.empty())).compose(new s02(17)).compose(this.b.get()).distinctUntilChanged();
    }
    public abstract IntentFilter d();
    public abstract int f();
    public abstract void g();
    public final void h(){
       IntentFilter intentFilter;
       this.b();
       if ((intentFilter = this.d()) != null && intentFilter.countActions()) {
          if (this.a == null) {
             this.a = new fg(0, this);
          }
          this.b.B.registerReceiver(this.a, intentFilter);
       }
       return;
    }
}
