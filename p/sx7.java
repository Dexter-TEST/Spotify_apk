package p.sx7;
import p.p18;
import java.util.concurrent.Executor;
import p.bu0;
import p.a28;
import java.lang.Object;
import p.f25;
import p.n25;
import p.q15;
import p.mt7;
import p.r15;
import p.j07;
import p.t5;
import java.lang.Runnable;
import p.em0;

public final class sx7 implements p18	// class@0026bd from classes.dex
{
    public final int a;
    public final Executor b;
    public final Object c;
    public final Object t;

    public void sx7(Executor p0,bu0 p1,a28 p2){
       this.a = 0;
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
    }
    public void sx7(Executor p0,f25 p1){
       this.a = 3;
       super();
       this.c = new Object();
       this.b = p0;
       this.t = p1;
    }
    public void sx7(Executor p0,n25 p1){
       this.a = 4;
       super();
       this.c = new Object();
       this.b = p0;
       this.t = p1;
    }
    public void sx7(Executor p0,q15 p1){
       this.a = 1;
       super();
       this.c = new Object();
       this.b = p0;
       this.t = p1;
    }
    public void sx7(mt7 p0,r15 p1){
       this.a = 2;
       super();
       this.c = new Object();
       this.b = p0;
       this.t = p1;
    }
    private final void a(j07 p0){
       sx7 tc = this.c;
       _monitor_enter(tc);
       if (this.t == null) {
          _monitor_exit(tc);
          return;
       }else {
          _monitor_exit(tc);
          this.b.execute(new t5(this, 18, p0));
          return;
       }
    }
    private final void c(j07 p0){
       if (!p0.f() && p0.d == null) {
          sx7 tc = this.c;
          _monitor_enter(tc);
          if (this.t == null) {
             _monitor_exit(tc);
             return;
          }else {
             _monitor_exit(tc);
             this.b.execute(new t5(this, 19, p0));
          }
       }
       return;
    }
    private final void d(j07 p0){
       if (p0.f()) {
          sx7 tc = this.c;
          _monitor_enter(tc);
          if (this.t == null) {
             _monitor_exit(tc);
             return;
          }else {
             _monitor_exit(tc);
             this.b.execute(new t5(this, 20, p0));
          }
       }
       return;
    }
    public final void b(j07 p0){
       switch (this.a){
           case 0:
             this.b.execute(new t5(this, 16, p0));
             return;
           case 1:
             if (p0.d != null) {
                sx7 tc = this.c;
                _monitor_enter(tc);
                if (this.t == null) {
                   _monitor_exit(tc);
                }else {
                   _monitor_exit(tc);
                   this.b.execute(new em0(16, this));
                }
             }
             return;
             break;
           case 2:
             this.a(p0);
             return;
           case 3:
             this.c(p0);
             return;
           default:
             this.d(p0);
             return;
       }
    }
}
