package p.e1;
import p.qc7;
import p.en6;
import p.sd3;
import java.util.Iterator;
import java.lang.Object;
import p.ci5;
import p.mc6;
import java.util.Set;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;

public abstract class e1 extends qc7	// class@001400 from classes.dex
{
    public int a;
    public Object b;

    public void e1(){
       super();
       this.a = 2;
    }
    public final boolean hasNext(){
       int i3;
       Object obj;
       e1 ta = this.a;
       int i = 4;
       int i1 = 1;
       int i2 = (ta != i)? 1: 0;
       if (i2) {
          if (i3 = en6.A(ta)) {
             if (i3 != 2) {
                this.a = i;
                i3 = this;
                sd3 v = i3.v;
                sd3 t = i3.t;
                switch (i3.c){
                    case 0:
                      while (true) {
                         if (t.hasNext()) {
                            obj = t.next();
                            if (!v.apply(obj)) {
                               continue ;
                            }
                         }else {
                            i3.a = 3;
                         label_0054 :
                            obj = null;
                         }
                      }
                      break;
                    default:
                      do {
                         if (t.hasNext()) {
                         }else {
                            i3.a = 3;
                            goto label_0054 ;
                         }
                         obj = t.next();
                      } while (!v.c.contains(obj));
                }
                this.b = obj;
                if (this.a != 3) {
                   this.a = i1;
                }else {
                   i1 = false;
                }
                return i1;
             }else {
                return false;
             }
          }else {
             return i1;
          }
       }else {
          throw new IllegalStateException();
       }
    }
    public final Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       this.a = 2;
       e1 tb = this.b;
       this.b = null;
       return tb;
    }
}
