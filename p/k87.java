package p.k87;
import p.fr;
import java.lang.ThreadLocal;
import java.util.ArrayList;
import android.view.ViewGroup;
import p.h87;
import java.lang.Object;
import p.wh7;
import android.view.View;
import p.gh7;
import p.pk;
import p.wh6;
import java.util.Iterator;
import p.tp2;
import p.j87;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;

public abstract class k87	// class@001bc8 from classes.dex
{
    public static final fr a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
       k87.a = new fr();
       k87.b = new ThreadLocal();
       k87.c = new ArrayList();
    }
    public static void a(ViewGroup p0,h87 p1){
       fr a;
       ArrayList c = k87.c;
       if (!c.contains(p0) && gh7.c(p0)) {
          c.add(p0);
          if (p1 == null) {
             a = k87.a;
          }
          a = a.k();
          if ((c = k87.b().getOrDefault(p0, null)) != null && c.size() > 0) {
             Iterator iterator = c.iterator();
             while (iterator.hasNext()) {
                iterator.next().v(p0);
             }
          }
          if (a != null) {
             a.i(p0, true);
          }
          int i = 0x7f0a0648;
          tp2.v(p0.getTag(i));
          p0.setTag(i, null);
          if (a != null) {
             j87 oj87 = new j87(p0, a);
             p0.addOnAttachStateChangeListener(oj87);
             p0.getViewTreeObserver().addOnPreDrawListener(oj87);
          }
       }
       return;
    }
    public static pk b(){
       WeakReference weakReferenc;
       pk opk;
       ThreadLocal b = k87.b;
       if ((weakReferenc = b.get()) != null && (opk = weakReferenc.get()) != null) {
          return opk;
       }
       opk = new pk();
       b.set(new WeakReference(opk));
       return opk;
    }
}
