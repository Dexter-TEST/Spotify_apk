package p.sb4;
import p.pb4;
import p.fu0;
import p.lb4;
import java.lang.Object;
import p.j93;
import p.er7;
import java.lang.Class;
import p.os3;
import p.qb4;
import p.ju0;
import p.xo0;
import p.hu0;
import p.lu0;

public final class sb4 implements pb4, fu0	// class@0025f7 from classes.dex
{
    public final ob4 a;
    public final Object b;
    public final j93 c;
    public final er7 d;
    public hu0 e;

    public void sb4(lb4 p0,Object p1,j93 p2,er7 p3){
       super();
       this.a = p0;
       p1.getClass();
       this.b = p1;
       j93 oj93 = (p2 == null)? null: new os3(p2, p0.g);
       this.c = oj93;
       this.d = p3;
       _monitor_enter(this);
       this.e = new ju0(this, p1);
       _monitor_exit(this);
       return;
    }
    public synchronized final void a(xo0 p0){
       this.e.b(p0);
    }
    public synchronized final void b(){
       this.e.c();
    }
    public synchronized final Object c(){
       return this.e.e();
    }
    public synchronized final boolean d(){
       sb4 te = this.e;
       te.getClass();
       return te instanceof lu0;
    }
    public synchronized final void e(Object p0){
       p0.getClass();
       this.e.f(p0);
    }
    public synchronized final void f(){
       this.e.g();
    }
    public synchronized final void g(){
       this.e.h();
    }
}
