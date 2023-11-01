package p.wd5;
import p.qc4;
import android.os.Looper;
import android.content.Context;
import p.lc1;
import p.iw3;
import p.vd5;
import java.util.ArrayList;
import p.xr6;
import android.graphics.Bitmap$Config;
import java.lang.Object;
import p.is0;
import java.util.Collection;
import p.lr0;
import p.t54;
import p.ml;
import p.z32;
import p.ii4;
import p.ae1;
import java.util.List;
import java.util.Collections;
import java.util.WeakHashMap;
import java.lang.ref.ReferenceQueue;
import p.td5;
import java.lang.Thread;
import p.lf7;
import p.a5;
import android.os.Message;
import android.os.Handler;
import android.widget.ImageView;
import p.tp2;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.e07;
import android.graphics.Bitmap;
import p.ud5;
import java.lang.Exception;
import p.cv5;
import java.lang.StringBuilder;
import java.lang.AssertionError;
import java.lang.Throwable;
import p.hv5;
import android.net.Uri;
import android.util.LruCache;
import p.hw3;

public final class wd5	// class@002b16 from classes.dex
{
    public final vd5 a;
    public final List b;
    public final Context c;
    public final lc1 d;
    public final iw3 e;
    public final xr6 f;
    public final WeakHashMap g;
    public final WeakHashMap h;
    public final ReferenceQueue i;
    public final Bitmap$Config j;
    public final boolean k;
    public boolean l;
    public static final qc4 m;

    static {
       wd5.m = new qc4(Looper.getMainLooper(), 1);
    }
    public void wd5(Context p0,lc1 p1,iw3 p2,vd5 p3,ArrayList p4,xr6 p5,Bitmap$Config p6){
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.a = p3;
       this.j = p6;
       int i = 0;
       int i1 = (p4 != null)? p4.size(): 0;
       ArrayList uArrayList = new ArrayList((i1 + 7));
       uArrayList.add(new is0(p0, 1));
       if (p4 != null) {
          uArrayList.addAll(p4);
       }
       uArrayList.add(new lr0(p0));
       uArrayList.add(new t54(p0));
       uArrayList.add(new is0(p0, i));
       uArrayList.add(new ml(p0));
       uArrayList.add(new z32(p0));
       uArrayList.add(new ii4(p1.c, p5));
       this.b = Collections.unmodifiableList(uArrayList);
       this.f = p5;
       this.g = new WeakHashMap();
       this.h = new WeakHashMap();
       this.k = i;
       this.l = i;
       ReferenceQueue referenceQue = new ReferenceQueue();
       this.i = referenceQue;
       new td5(referenceQue, wd5.m).start();
       return;
    }
    public final void a(Object p0){
       a5 uoa5;
       lf7.a();
       if ((uoa5 = this.g.remove(p0)) != null) {
          uoa5.a();
          lc1 h = this.d.h;
          h.sendMessage(h.obtainMessage(2, uoa5));
       }
       if (p0 instanceof ImageView) {
          tp2.v(this.h.remove(p0));
       }
       return;
    }
    public final void b(ImageView p0){
       if (p0 == null) {
          throw new IllegalArgumentException("view cannot be null.");
       }
       this.a(p0);
       return;
    }
    public final void c(e07 p0){
       if (p0 == null) {
          throw new IllegalArgumentException("target cannot be null.");
       }
       this.a(p0);
       return;
    }
    public final void d(Object p0){
       lf7.a();
       if (p0 == null) {
          throw new IllegalArgumentException("Cannot cancel requests with null tag.");
       }
       ArrayList uArrayList = new ArrayList(this.g.values());
       int i = uArrayList.size();
       int i1 = 0;
       while (i1 < i) {
          a5 uoa5 = uArrayList.get(i1);
          if (p0.equals(uoa5.j)) {
             this.a(uoa5.d());
          }
          i1 = i1 + 1;
       }
       p0 = new ArrayList(this.h.values());
       if (p0.size() <= 0) {
          return;
       }
       tp2.v(p0.get(0));
       throw null;
    }
    public final void e(Bitmap p0,ud5 p1,a5 p2,Exception p3){
       if (p2.l != null) {
          return;
       }
       if (p2.k == null) {
          this.g.remove(p2.d());
       }
       if (p0 != null) {
          if (p1 != null) {
             p2.b(p0, p1);
             if (this.l != null) {
                lf7.f("Main", "completed", p2.b.b(), "from "+p1);
             }
          }else {
             throw new AssertionError("LoadedFrom cannot be null.");
          }
       }else {
          p2.c(p3);
          if (this.l != null) {
             lf7.f("Main", "errored", p2.b.b(), p3.getMessage());
          }
       }
       return;
    }
    public final void f(a5 p0){
       lc1 obj;
       if ((obj = p0.d()) != null) {
          wd5 tg = this.g;
          if (tg.get(obj) != p0) {
             this.a(obj);
             tg.put(obj, p0);
          }
       }
       obj = this.d.h;
       obj.sendMessage(obj.obtainMessage(1, p0));
       return;
    }
    public final hv5 g(String p0){
       if (p0 == null) {
          return new hv5(this, null);
       }
       if (p0.trim().length()) {
          return new hv5(this, Uri.parse(p0));
       }
       throw new IllegalArgumentException("Path must not be empty.");
    }
    public final Bitmap h(String p0){
       hw3 ohw3 = ((ohw3 = this.e.a.get(p0)) != null)? ohw3.a: null;
       wd5 tf = this.f;
       if (ohw3 != null) {
          tf.b.sendEmptyMessage(0);
       }else {
          tf.b.sendEmptyMessage(1);
       }
       return ohw3;
    }
}
