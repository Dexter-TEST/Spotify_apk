package p.re3;
import p.bd1;
import p.z83;
import p.zf2;
import kotlinx.coroutines.internal.a;
import p.ij4;
import p.ve3;
import java.lang.Object;
import p.ox7;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.lang.String;
import p.co5;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.Class;
import p.w51;

public abstract class re3 extends a implements bd1, z83, zf2	// class@0024ce from classes.dex
{
    public ve3 t;

    public void re3(){
       super();
    }
    public final boolean b(){
       return true;
    }
    public final ij4 c(){
       return null;
    }
    public final void dispose(){
       ve3 ove3 = this.k();
       do {
          Object obj = ove3.t();
          if (obj instanceof re3) {
             if (obj == this) {
                dl1 b = ox7.B;
                while (true) {
                   AtomicReferenceFieldUpdater a = ve3.a;
                   if (a.compareAndSet(ove3, obj, b)) {
                      obj = 1;
                      break ;
                   }else {
                      if (a.get(ove3) != obj) {
                         obj = 0;
                         break ;
                      }
                   }
                }
             }
          }else if(obj instanceof z83 && obj.c() != null){
             this.j();
             break ;
          }
          break ;
       } while (obj);
       return;
    }
    public final ve3 k(){
       re3 tt;
       if ((tt = this.t) != null) {
          return tt;
       }
       co5.N("job");
       throw null;
    }
    public abstract void l(Throwable p0);
    public final String toString(){
       return this.getClass().getSimpleName()+'@'+w51.x(this)+"[job@"+w51.x(this.k())+']';
    }
}
