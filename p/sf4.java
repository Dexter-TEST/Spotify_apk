package p.sf4;
import p.zj3;
import java.lang.Object;
import p.ek3;
import p.kj3;
import p.cb1;
import java.lang.String;
import p.co5;
import androidx.fragment.app.f;
import p.uf4;
import p.dh4;
import p.fp5;
import java.lang.Iterable;
import java.util.Collection;
import java.util.Iterator;
import p.qf4;
import androidx.fragment.app.Fragment;
import android.app.Dialog;
import java.util.List;
import java.util.ListIterator;
import p.dj0;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import p.lg4;
import p.uj3;
import java.util.AbstractCollection;
import java.lang.Class;
import p.t26;

public final class sf4 implements zj3	// class@00261a from classes.dex
{
    public final int a;
    public final Object b;

    public void sf4(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(ek3 p0,kj3 p1){
       Object obj;
       boolean b = true;
       String str = "this$0";
       sf4 tb = this.b;
       switch (this.a){
           case 0:
             co5.o(tb, str);
             tb.q = p1.a();
             if (tb.c != null) {
                Iterator iterator = tb.g.iterator();
                while (iterator.hasNext()) {
                   qf4 oqf4 = iterator.next();
                   oqf4.getClass();
                   oqf4.t = p1.a();
                   oqf4.c();
                }
             }
             break;
           case 1:
             co5.o(tb, str);
             if (p1 == kj3.ON_CREATE) {
                Iterable value = tb.b().e.getValue();
                if (!value instanceof Collection || !value.isEmpty()) {
                   Iterator iterator1 = value.iterator();
                   do {
                      if (iterator1.hasNext()) {
                      }
                   } while (co5.c(iterator1.next().w, p0.getTag()));
                   if (!b) {
                      p0.u();
                   }
                }
                b = 0;
             }else if(p1 == kj3.ON_STOP && !p0.y().isShowing()){
                List value1 = tb.b().e.getValue();
                ListIterator listIterator = value1.listIterator(value1.size());
                while (true) {
                   if (listIterator.hasPrevious()) {
                      obj = listIterator.previous();
                      if (!co5.c(obj.w, p0.getTag())) {
                         continue ;
                      }
                   }else {
                      obj = null;
                   }
                   if (obj != null) {
                      if (!co5.c(dj0.s0(value1), obj)) {
                         p0.toString();
                      }
                      tb.h(obj, false);
                      break ;
                   }else {
                      throw new IllegalStateException("Dialog "+p0+" has already been popped off of the Navigation back stack".toString());
                   }
                }
             }
             return;
             break;
           default:
             co5.o(tb, str);
             if (p1 == kj3.ON_START) {
                tb.f = b;
             }else if(p1 == kj3.ON_STOP){
                tb.f = false;
             }
             return;
       }
       return;
    }
}
