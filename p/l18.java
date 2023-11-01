package p.l18;
import java.lang.Object;
import p.j07;
import java.util.ArrayDeque;
import p.p18;
import p.zw7;
import p.vj1;
import p.c08;

public final class l18	// class@001cc8 from classes.dex
{
    public final Object a;
    public ArrayDeque b;
    public boolean c;

    public void l18(int p0){
       if (p0 != 1) {
          super();
          this.a = new Object();
          return;
       }else {
          super();
          this.a = new Object();
          return;
       }
    }
    public final void a(j07 p0){
       l18 ta1;
       p18 op18;
       l18 ta = this.a;
       _monitor_enter(ta);
       if (this.b != null && this.c == null) {
          this.c = true;
          _monitor_exit(ta);
          while (true) {
             ta1 = this.a;
             _monitor_enter(ta1);
             if ((op18 = this.b.poll()) == null) {
                break ;
             }else {
                _monitor_exit(ta1);
                op18.b(p0);
             }
          }
          this.c = false;
          _monitor_exit(ta1);
          return;
       }else {
          _monitor_exit(ta);
          return;
       }
    }
    public final void b(zw7 p0){
       l18 ta = this.a;
       _monitor_enter(ta);
       if (this.b == null) {
          this.b = new ArrayDeque();
       }
       this.b.add(p0);
       _monitor_exit(ta);
       return;
    }
    public final void c(p18 p0){
       l18 ta = this.a;
       _monitor_enter(ta);
       if (this.b == null) {
          this.b = new ArrayDeque();
       }
       this.b.add(p0);
       _monitor_exit(ta);
       return;
    }
    public final void d(vj1 p0){
       l18 ta1;
       c08 uoc08;
       l18 ta = this.a;
       _monitor_enter(ta);
       if (this.b != null && this.c == null) {
          this.c = true;
          _monitor_exit(ta);
          while (true) {
             ta1 = this.a;
             _monitor_enter(ta1);
             if ((uoc08 = this.b.poll()) == null) {
                break ;
             }else {
                _monitor_exit(ta1);
                uoc08.a(p0);
             }
          }
          this.c = false;
          _monitor_exit(ta1);
          return;
       }else {
          _monitor_exit(ta);
          return;
       }
    }
}
