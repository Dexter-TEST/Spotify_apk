package p.qn;
import p.c45;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.lv1;
import p.bx6;

public abstract class qn extends c45	// class@0023de from classes.dex
{
    private Object _consensus;
    public static final AtomicReferenceFieldUpdater a;

    static {
       qn.a = AtomicReferenceFieldUpdater.newUpdater(qn.class, Object.class, "_consensus");
    }
    public void qn(){
       super();
       this._consensus = lv1.a;
    }
    public final Object a(Object p0){
       qn t_consensus = this._consensus;
       bx6 a = lv1.a;
       if (t_consensus == a) {
          bx6 uobx6 = this.c(p0);
          if ((t_consensus = this._consensus) == a) {
             AtomicReferenceFieldUpdater a1 = qn.a;
             while (true) {
                if (a1.compareAndSet(this, a, uobx6)) {
                   t_consensus = 1;
                }else {
                   if (a1.get(this) != a) {
                      t_consensus = 0;
                   }
                }
                if (t_consensus) {
                   t_consensus = uobx6;
                   break ;
                }else {
                   t_consensus = this._consensus;
                   break ;
                }
             }
          }
       }
       this.b(p0, t_consensus);
       return t_consensus;
    }
    public abstract void b(Object p0,Object p1);
    public abstract bx6 c(Object p0);
}
