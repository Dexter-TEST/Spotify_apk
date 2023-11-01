package p.hc1;
import p.d46;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p.du0;
import p.xw0;
import p.au0;
import java.lang.Object;
import java.lang.IllegalStateException;
import p.ye7;
import p.b17;
import p.zf2;
import p.w51;
import p.dx0;
import p.ve3;
import p.a93;
import p.ul0;

public final class hc1 extends d46	// class@001821 from classes.dex
{
    private int _decision;
    public static final AtomicIntegerFieldUpdater t;

    static {
       hc1.t = AtomicIntegerFieldUpdater.newUpdater(hc1.class, "_decision");
    }
    public void hc1(du0 p0,xw0 p1){
       super(p0, p1);
       this._decision = 0;
    }
    public final void M(Object p0){
       while (true) {
          hc1 t_decision = this._decision;
          int i = 1;
          if (t_decision != null) {
             if (t_decision == i) {
                i = 0;
             }else {
                throw new IllegalStateException("Already resumed".toString());
             }
          }else {
             if (!hc1.t.compareAndSet(this, 0, 2)) {
                continue ;
             }
          }
          if (i) {
             break ;
          }else {
             w51.O(ye7.E(this.c), b17.w(p0), null);
             return;
          }
       }
       return;
    }
    public final Object O(){
       a93 obj;
       while (true) {
          hc1 t_decision = this._decision;
          int i = 0;
          if (t_decision != null) {
             if (t_decision != 2) {
                throw new IllegalStateException("Already suspended".toString());
             }
          }else {
             if (hc1.t.compareAndSet(this, i, 1)) {
                obj = 1;
             }
          }
          if (i) {
             break ;
          }else {
             a93 uoa93 = this.t();
             obj = (uoa93 instanceof a93)? uoa93: null;
             if (obj != null && (obj = obj.a) != null) {
                uoa93 = obj;
             }
             if (!uoa93 instanceof ul0) {
                return uoa93;
             }else {
                throw uoa93.a;
             }
          }
       }
       return dx0.a;
    }
    public final void g(Object p0){
       this.M(p0);
    }
}
