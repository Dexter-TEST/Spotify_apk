package p.yn0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.v96;
import p.co5;

public abstract class yn0	// class@002ded from classes.dex
{
    private Object _next;
    private Object _prev;
    public static final AtomicReferenceFieldUpdater a;
    public static final AtomicReferenceFieldUpdater b;

    static {
       yn0.a = AtomicReferenceFieldUpdater.newUpdater(yn0.class, Object.class, "_next");
       yn0.b = AtomicReferenceFieldUpdater.newUpdater(yn0.class, Object.class, "_prev");
    }
    public void yn0(yn0 p0){
       super();
       this._next = null;
       this._prev = p0;
    }
    public static final Object a(v96 p0){
       return p0._next;
    }
    public abstract boolean b();
    public final boolean c(){
       yn0 t_next;
       if ((t_next = this._next) == co5.b) {
          t_next = null;
       }else {
       }
       boolean b = (t_next == null)? true: false;
       return b;
    }
    public final void d(){
       yn0 t_prev;
       yn0 t_next;
       do {
          t_prev = this._prev;
          while (t_prev != null && t_prev.b()) {
             t_prev = t_prev._prev;
          }
          t_next = this._next;
          bx6 b = co5.b;
          if (t_next == b) {
             t_next = null;
          }else {
          }
          co5.i(t_next);
          while (t_next.b()) {
             if ((t_next = t_next._next) == b) {
                t_next = null;
             }else {
             }
             co5.i(t_next);
          }
          t_next._prev = t_prev;
          if (t_prev != null) {
             t_prev._next = t_next;
          }
       } while (!t_next.b() && (t_prev == null && t_prev.b()));
       return;
    }
}
