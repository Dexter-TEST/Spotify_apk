package p.sn2;
import p.b91;
import p.tz3;
import android.os.Handler;
import java.lang.String;
import java.lang.Object;
import p.xw0;
import java.lang.Runnable;
import java.util.concurrent.CancellationException;
import java.lang.StringBuilder;
import p.gg1;
import p.ww0;
import p.vw0;
import p.me3;
import p.ve3;
import p.mc1;
import p.j71;
import android.os.Looper;
import p.co5;
import java.lang.System;
import p.vz3;
import p.kg4;

public final class sn2 extends tz3 implements b91	// class@002660 from classes.dex
{
    private sn2 _immediate;
    public final Handler c;
    public final String t;
    public final boolean v;
    public final sn2 w;

    public void sn2(Handler p0){
       super(p0, null, false);
    }
    public void sn2(Handler p0,String p1,boolean p2){
       sn2 t_immediate;
       super();
       this.c = p0;
       this.t = p1;
       this.v = p2;
       tz3 otz3 = (p2)? this: null;
       this._immediate = otz3;
       if ((t_immediate = this._immediate) == null) {
          t_immediate = new sn2(p0, p1, true);
          this._immediate = t_immediate;
       }
       this.w = t_immediate;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof sn2 && p0.c == this.c)? true: false;
       return b;
    }
    public final void g0(xw0 p0,Runnable p1){
       me3 ome3;
       if (!this.c.post(p1)) {
          CancellationException uCancellatio = new CancellationException("The task was rejected, the handler underlying the dispatcher \'"+this+"\' was closed");
          if ((ome3 = p0.f(gg1.y)) != null) {
             ome3.h(uCancellatio);
          }
          mc1.b.g0(p0, p1);
       }
       return;
    }
    public final boolean h0(){
       boolean b = (this.v != null && co5.c(Looper.myLooper(), this.c.getLooper()))? false: true;
       return b;
    }
    public final int hashCode(){
       return System.identityHashCode(this.c);
    }
    public final String toString(){
       String str;
       sn2 w;
       tz3 a = vz3.a;
       if (this == a) {
          str = "Dispatchers.Main";
       }else {
          int i = 0;
          try{
             w = a.w;
          }catch(java.lang.UnsupportedOperationException e0){
             w = i;
          }
          str = (this == w)? "Dispatchers.Main.immediate": i;
       }
       if (str == null) {
          if ((str = this.t) == null) {
             str = this.c.toString();
          }
          if (this.v != null) {
             str = kg4.l(str, ".immediate");
          }
       }
       return str;
    }
}
