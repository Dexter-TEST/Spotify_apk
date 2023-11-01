package p.gr3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.ir3;

public class gr3	// class@001763 from classes.dex
{
    private Object _cur;
    public static final AtomicReferenceFieldUpdater a;

    static {
       gr3.a = AtomicReferenceFieldUpdater.newUpdater(gr3.class, Object.class, "_cur");
    }
    public void gr3(){
       super();
       this._cur = new ir3(8, false);
    }
    public final boolean a(Object p0){
       while (true) {
          gr3 t_cur = this._cur;
          int i = t_cur.a(p0);
          boolean b = true;
          if (!i) {
             return b;
          }
          if (i != b) {
             if (i != 2) {
                continue ;
             }else {
                break ;
             }
          }else {
             AtomicReferenceFieldUpdater a = gr3.a;
             ir3 oir3 = t_cur.e();
             do {
             } while (a.compareAndSet(this, t_cur, oir3) || a.get(this) != t_cur);
          }
       }
       return false;
    }
    public final void b(){
       while (true) {
          gr3 t_cur = this._cur;
          if (t_cur.b()) {
             break ;
          }else {
             AtomicReferenceFieldUpdater a = gr3.a;
             ir3 oir3 = t_cur.e();
             do {
             } while (a.compareAndSet(this, t_cur, oir3) || a.get(this) != t_cur);
          }
       }
       return;
    }
    public final int c(){
       return this._cur.c();
    }
    public final Object d(){
       AtomicReferenceFieldUpdater obj;
       while (true) {
          gr3 t_cur = this._cur;
          if ((obj = t_cur.f()) != ir3.g) {
             break ;
          }else {
             obj = gr3.a;
             ir3 oir3 = t_cur.e();
             do {
             } while (obj.compareAndSet(this, t_cur, oir3) || obj.get(this) != t_cur);
          }
       }
       return obj;
    }
}
