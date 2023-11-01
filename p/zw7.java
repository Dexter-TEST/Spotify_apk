package p.zw7;
import p.c08;
import java.util.concurrent.Executor;
import p.e25;
import java.lang.Object;
import p.m25;
import p.mt7;
import p.vx5;
import p.vj1;
import p.iz7;
import java.lang.Runnable;

public final class zw7 implements c08	// class@002f7f from classes.dex
{
    public final int a;
    public final Executor b;
    public final Object c;
    public final Object d;

    public void zw7(Executor p0,e25 p1){
       this.a = 1;
       super();
       this.c = new Object();
       this.b = p0;
       this.d = p1;
    }
    public void zw7(Executor p0,m25 p1){
       this.a = 2;
       super();
       this.c = new Object();
       this.b = p0;
       this.d = p1;
    }
    public void zw7(mt7 p0,vx5 p1){
       this.a = 0;
       super();
       this.c = new Object();
       this.b = p0;
       this.d = p1;
    }
    private final void b(vj1 p0){
       if (p0.e()) {
          return;
       }
       zw7 tc = this.c;
       _monitor_enter(tc);
       if (this.d == null) {
          _monitor_exit(tc);
          return;
       }else {
          _monitor_exit(tc);
          this.b.execute(new iz7(this, p0, 3));
          return;
       }
    }
    private final void c(vj1 p0){
       if (!p0.e()) {
          return;
       }
       zw7 tc = this.c;
       _monitor_enter(tc);
       if (this.d == null) {
          _monitor_exit(tc);
          return;
       }else {
          _monitor_exit(tc);
          this.b.execute(new iz7(this, p0, 4));
          return;
       }
    }
    public final void a(vj1 p0){
       switch (this.a){
           case 0:
             zw7 tc = this.c;
             _monitor_enter(tc);
             if (this.d == null) {
                _monitor_exit(tc);
             }else {
                _monitor_exit(tc);
                this.b.execute(new iz7(this, p0, 2));
             }
             return;
             break;
           case 1:
           default:
             this.c(p0);
             return;
       }
       this.b(p0);
       return;
    }
}
