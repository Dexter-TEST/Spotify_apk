package p.xr2;
import p.el6;
import p.zr2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.e70;
import p.we7;
import p.pn;
import p.mo1;
import p.kp5;
import java.lang.Math;
import p.tr2;
import p.b57;

public final class xr2 implements el6	// class@0003c9 from classes2.dex
{
    public final boolean a;
    public final e70 b;
    public boolean c;
    public final zr2 t;

    public void xr2(zr2 p0,boolean p1){
       co5.o(p0, "this$0");
       this.t = p0;
       super();
       this.a = p1;
       this.b = new e70();
    }
    public final void I(e70 p0,long p1){
       co5.o(p0, "source");
       xr2 tb = this.b;
       tb.I(p0, p1);
       while ((tb.b - 0x4000) >= 0) {
          this.b(false);
       }
       return;
    }
    public final void b(boolean p0){
       xr2 tt = this.t;
       _monitor_enter(tt);
       tt.l.h();
       while ((tt.e - tt.f) >= 0 && (this.a == null && (this.c == null && tt.f() == null))) {
          tt.l();
       }
       tt.l.l();
       tt.b();
       long l = Math.min((tt.f - tt.e), this.b.b);
       tt.e = tt.e + l;
       boolean b = (p0 && !(l - this.b.b))? true: false;
       _monitor_exit(tt);
       this.t.l.h();
       xr2 tt1 = this.t;
       tt1.b.h0(tt1.a, b, this.b, l);
       this.t.l.l();
       return;
    }
    public final void close(){
       xr2 tt = this.t;
       _monitor_enter(tt);
       if (this.c != null) {
          _monitor_exit(tt);
          return;
       }else {
          int i = 0;
          int i1 = (tt.f() == null)? 1: 0;
          _monitor_exit(tt);
          tt = this.t;
          if (tt.j.a == null) {
             if ((this.b.b) > 0) {
                i = 1;
             }
             if (i) {
                while ((this.b.b) > 0) {
                   this.b(true);
                }
             }else if(i1){
                tt.b.h0(tt.a, true, null, 0);
             }
          }
          tt = this.t;
          _monitor_enter(tt);
          this.c = true;
          _monitor_exit(tt);
          this.t.b.flush();
          this.t.a();
          return;
       }
    }
    public final b57 e(){
       return this.t.l;
    }
    public final void flush(){
       xr2 tt = this.t;
       _monitor_enter(tt);
       tt.b();
       _monitor_exit(tt);
       while ((this.b.b) > 0) {
          this.b(false);
          this.t.b.flush();
       }
       return;
    }
}
