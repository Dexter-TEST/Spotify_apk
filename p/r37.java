package p.r37;
import p.zf2;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p.me3;
import java.lang.Object;
import java.lang.Thread;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import p.bd1;
import p.ve3;
import java.lang.Throwable;
import p.jc7;

public final class r37 implements zf2	// class@00246e from classes.dex
{
    private int _state;
    public final me3 a;
    public final Thread b;
    public bd1 c;
    public static final AtomicIntegerFieldUpdater t;

    static {
       r37.t = AtomicIntegerFieldUpdater.newUpdater(r37.class, "_state");
    }
    public void r37(me3 p0){
       super();
       this.a = p0;
       this._state = 0;
       this.b = Thread.currentThread();
    }
    public static void b(int p0){
       throw new IllegalStateException("Illegal state "+p0.toString());
    }
    public final void a(){
       r37 t_state;
       while (true) {
          if ((t_state = this._state) != null) {
             if (t_state != 2) {
                if (t_state == 3) {
                   Thread.interrupted();
                   return;
                }else {
                   r37.b(t_state);
                   throw null;
                }
             }
          }else if(r37.t.compareAndSet(this, t_state, 1)){
             if ((t_state = this.c) != null) {
                t_state.dispose();
                break ;
             }
             break ;
          }
       }
       return;
    }
    public final void c(){
       r37 t_state;
       this.c = this.a.z(true, true, this);
       while (true) {
          if ((t_state = this._state) != null) {
             if (t_state != 2 && t_state != 3) {
                r37.b(t_state);
                throw null;
             }else {
                break ;
             }
          }else {
             if (r37.t.compareAndSet(this, t_state, 0)) {
                return;
             }
             continue ;
          }
       }
       return;
    }
    public final Object invoke(Object p0){
       while (true) {
          if ((p0 = this._state) != null) {
             if (p0 != 1 && (p0 != 2 && p0 != 3)) {
                r37.b(p0);
                throw null;
             }
          }else {
             if (r37.t.compareAndSet(this, p0, 2)) {
                this.b.interrupt();
                this._state = 3;
                break ;
             }
          }
          break ;
       }
       return jc7.a;
    }
}
