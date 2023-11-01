package p.cb1;
import p.dh4;
import android.content.Context;
import androidx.fragment.app.o;
import java.util.LinkedHashSet;
import p.sf4;
import java.lang.Object;
import p.gg4;
import p.bb1;
import java.util.List;
import p.ng4;
import java.util.Iterator;
import p.qf4;
import java.lang.String;
import java.lang.StringBuilder;
import p.md2;
import java.lang.ClassLoader;
import androidx.fragment.app.Fragment;
import p.co5;
import java.lang.Class;
import androidx.fragment.app.f;
import android.os.Bundle;
import p.vj3;
import p.dk3;
import p.uf4;
import p.en6;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import p.fp5;
import java.util.Set;
import p.ab1;
import java.util.concurrent.CopyOnWriteArrayList;
import p.dj0;

public final class cb1 extends dh4	// class@0011d1 from classes.dex
{
    public final Context c;
    public final o d;
    public final LinkedHashSet e;
    public final sf4 f;

    public void cb1(Context p0,o p1){
       super();
       this.c = p0;
       this.d = p1;
       this.e = new LinkedHashSet();
       this.f = new sf4(1, this);
    }
    public final gg4 a(){
       return new bb1(this);
    }
    public final void d(List p0,ng4 p1){
       String str1;
       bb1 b2;
       cb1 td = this.d;
       if (td.L()) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          qf4 oqf4 = iterator.next();
          qf4 b = oqf4.b;
          bb1 b1 = b.B;
          String str = "DialogFragment class was not set";
          if (b1 == null) {
             throw new IllegalStateException(str.toString());
          }
          cb1 tc = this.c;
          if (b1.charAt(0) == '.') {
             b1 = "".append(tc.getPackageName()).append(b1).toString();
          }
          Fragment uFragment = td.G().a(tc.getClassLoader(), b1);
          co5.l(uFragment, "fragmentManager.fragment…ader, className\n        \)");
          if (f.class.isAssignableFrom(uFragment.getClass())) {
             uFragment.setArguments(oqf4.c);
             uFragment.getLifecycle().a(this.f);
             uFragment.B(td, oqf4.w);
             this.b().e(oqf4);
          }else {
             str1 = "Dialog destination ";
             if ((b2 = b.B) != null) {
                break ;
             }else {
                throw new IllegalStateException(str.toString());
             }
          }
       }
       throw new IllegalArgumentException(en6.p(str1, b2, " is not an instance of DialogFragment").toString());
    }
    public final void e(uf4 p0){
       cb1 td;
       f uof;
       vj3 lifecycle;
       this.a = p0;
       this.b = true;
       Iterator iterator = p0.e.getValue().iterator();
       while (true) {
          td = this.d;
          if (iterator.hasNext()) {
             qf4 oqf4 = iterator.next();
             if ((uof = td.D(oqf4.w)) != null && (lifecycle = uof.getLifecycle()) != null) {
                lifecycle.a(this.f);
             }else {
                this.e.add(oqf4.w);
             }
          }else {
             break ;
          }
       }
       td.n.add(new ab1(this));
       return;
    }
    public final void h(qf4 p0,boolean p1){
       Fragment uFragment;
       co5.o(p0, "popUpTo");
       cb1 td = this.d;
       if (td.L()) {
          return;
       }
       List value = this.b().e.getValue();
       Iterator iterator = dj0.w0(value.subList(value.indexOf(p0), value.size())).iterator();
       while (iterator.hasNext()) {
          if ((uFragment = td.D(iterator.next().w)) != null) {
             uFragment.getLifecycle().c(this.f);
             uFragment.u();
          }
       }
       this.b().c(p0, p1);
       return;
    }
}
