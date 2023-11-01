package p.em0;
import java.lang.Runnable;
import java.lang.Object;
import p.vc3;
import p.xy5;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.lang.String;
import p.co5;
import java.util.concurrent.locks.Lock;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicBoolean;
import p.rw6;
import p.nw6;
import p.ec6;
import java.lang.Throwable;
import android.util.Log;
import p.pl1;
import java.util.Collection;
import java.util.Iterator;
import p.a26;
import p.y16;
import java.util.Map$Entry;
import p.uc3;
import java.util.Set;
import p.sx7;
import p.q15;
import p.f52;
import p.b52;
import android.content.Context;
import p.si4;
import p.lu;
import p.fh5;
import p.la5;
import p.t67;
import p.e52;
import java.util.concurrent.ThreadPoolExecutor;
import p.zh6;
import p.tw6;
import android.os.CancellationSignal;
import android.database.Cursor;
import java.lang.Integer;
import java.io.Closeable;
import p.eb3;
import p.uw6;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import p.pv0;
import p.ld;
import java.util.HashSet;
import p.a47;
import p.w47;
import com.spotify.legacyglue.recyclerview.RecyclerViewFastScroller;
import p.rk2;
import com.spotify.legacyglue.contextmenu.glue.GlueContextMenuLayout;
import p.kd4;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import p.fj0;
import p.ly0;
import p.ey0;
import java.io.FilenameFilter;
import java.io.File;
import java.util.Objects;
import p.bp5;
import java.io.Serializable;
import p.wx0;
import java.lang.Boolean;
import java.lang.ThreadLocal;
import p.w08;
import p.jy7;
import p.i28;
import java.util.HashMap;
import p.dx7;
import java.util.ArrayList;
import p.jd;
import p.gx7;
import java.lang.Long;
import p.vj1;
import java.util.concurrent.Executor;
import p.vf;
import p.l18;
import p.zw7;
import p.m25;
import p.i70;
import p.e25;
import p.mz7;
import p.rz;
import p.ut7;
import p.fp0;
import p.nl2;
import p.uv1;
import p.ll2;
import p.bl2;
import p.sq7;
import p.u16;
import p.yx6;
import p.ye7;
import androidx.work.Worker;
import p.em3;
import p.pc6;
import androidx.viewpager2.adapter.a;
import androidx.lifecycle.b;
import p.bi7;
import p.yl3;
import android.view.animation.AnimationUtils;
import p.dr;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import p.zl3;
import p.wh7;
import p.dh7;
import java.lang.RuntimeException;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ActionMenuView;
import p.w5;
import p.ue1;
import p.ge1;
import android.graphics.drawable.Drawable;
import p.f67;
import android.view.Menu;
import p.e64;
import android.view.Window$Callback;
import androidx.activity.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.t50;
import p.hb6;
import p.ob6;

public final class em0 implements Runnable	// class@0014b2 from classes.dex
{
    public final int a;
    public final Object b;

    public void em0(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    private void b(){
       pl1 a;
       ReentrantReadWriteLock$ReadLock readLock = this.b.a.i.readLock();
       co5.l(readLock, "readWriteLock.readLock\(\)");
       readLock.lock();
       try{
          int i = 1;
          if (!this.b.b() || (!this.b.f.compareAndSet(i, false) || this.b.a.i().Y().G())) {
             readLock.unlock();
             this.b.getClass();
             return;
          }else {
             nw6 onw6 = this.b.a.i().Y();
             onw6.S();
             a = this.a();
             try{
                onw6.Q();
                onw6.g();
             }catch(android.database.sqlite.SQLiteException e2){
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                a = pl1.a;
             }
          }
          readLock.unlock();
          this.b.getClass();
          if ((a.isEmpty() ^ i)) {
             em0 tb = this.b;
             vc3 j = tb.j;
             _monitor_enter(j);
             Iterator iterator = tb.j.iterator();
             while (true) {
                Iterator iterator1 = iterator;
                if (iterator1.hasNext()) {
                   iterator1.next().getValue().a(a);
                }else {
                   break ;
                }
             }
             _monitor_exit(j);
          }
          return;
       }catch(java.lang.IllegalStateException e2){
          Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
          a = pl1.a;
       }catch(android.database.sqlite.SQLiteException e2){
       }
    }
    private final void c(){
       sx7 c = this.b.c;
       _monitor_enter(c);
       em0 tb = this.b;
       if (tb.t != null) {
          tb.t.a();
       }
       _monitor_exit(c);
       return;
    }
    private void d(){
       lu b;
       em0 tb = this.b;
       tb.getClass();
       Object l = f52.l;
       _monitor_enter(l);
       f52 a = tb.a;
       a.a();
       si4 osi4 = si4.a(a.a);
       lu olu = tb.c.j();
       int i = ((b = olu.b) != la5.b && b != la5.a)? 0: 1;
       if (i) {
          t67 ot67 = new t67(olu, 0);
          ot67.b = tb.e(olu);
          ot67.g(la5.c);
          olu = ot67.d();
          tb.c.f(olu);
       }
       if (osi4 != null) {
          osi4.e();
       }
       _monitor_exit(l);
       tb.h(olu);
       tb.i.execute(new e52(0, tb, 0));
       return;
    }
    public final ec6 a(){
       vc3 h;
       ec6 uoec6 = new ec6();
       Cursor uCursor = this.b.a.o(new zh6("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
       while (uCursor.moveToNext()) {
          uoec6.add(Integer.valueOf(uCursor.getInt(0)));
       }
       eb3.d(uCursor, null);
       co5.f(uoec6);
       if ((uoec6.isEmpty() ^ 0x01)) {
          if (this.b.h != null) {
             if ((h = this.b.h) != null) {
                h.u();
             }else {
                throw new IllegalArgumentException("Required value was null.".toString());
             }
          }else {
             throw new IllegalStateException("Required value was null.".toString());
          }
       }
       return uoec6;
    }
    public final void run(){
       em0 b1;
       Toolbar a;
       ActionMenuView k;
       yl3 a1;
       long l;
       int i1;
       int i2;
       HashMap hashMap1;
       Iterator iterator1;
       String str2;
       View view1;
       ld c1;
       em0 uoem0 = this;
       View view = null;
       boolean b = true;
       int i = 0;
       switch (uoem0.a){
           case 0:
             try{
                a.v(uoem0.b);
             }catch(java.lang.IllegalStateException e0){
                if (TextUtils.equals(e0.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                }else {
                   throw e0;
                }
             }
             return;
             break;
           case 1:
             b1 = uoem0.b;
             f67 g = b1.G;
             Menu menu = b1.D0();
             Menu menu1 = (menu instanceof e64)? menu: view;
             if (menu1 != null) {
                menu1.w();
             }
             menu.clear();
             if (!g.onCreatePanelMenu(i, menu) || !g.onPreparePanel(i, view, menu)) {
                menu.clear();
             }
             if (menu1 != null) {
                menu1.v();
             }
             return;
             break;
           case 2:
             b1 = uoem0.b;
             b1.a(b);
             b1.invalidateSelf();
             return;
           case 3:
             b1 = uoem0.b;
             b1.C = view;
             b1.drawableStateChanged();
             return;
           case 4:
             if ((a = uoem0.b.a) != null && (k = a.K) != null) {
                k.l();
             }
             return;
             break;
           case 5:
             b1 = uoem0.b;
             if (b1.F != null) {
                if (b1.D != null) {
                   b1.D = i;
                   a1 = b1.a;
                   a1.getClass();
                   l = AnimationUtils.currentAnimationTimeMillis();
                   a1.e = l;
                   a1.g = -1;
                   a1.f = l;
                   a1.h = 0x3f000000;
                }
                a1 = b1.a;
                i1 = 0;
                if ((a1.g - i1) <= 0 || (AnimationUtils.currentAnimationTimeMillis() - (a1.g + (long)a1.i)) <= 0) {
                   b = false;
                }
                if (!b && b1.f()) {
                   if (b1.E != null) {
                      b1.E = i;
                      long l1 = SystemClock.uptimeMillis();
                      MotionEvent motionEvent = MotionEvent.obtain(l1, l1, 3, 0, 0, 0);
                      b1.c.onTouchEvent(motionEvent);
                      motionEvent.recycle();
                   }
                   if (a1.f - i1) {
                      long l2 = AnimationUtils.currentAnimationTimeMillis();
                      float f = a1.a(l2);
                      float f1 = (-4.00f * f) * f;
                      f = (f * 4.00f) + f1;
                      a1.f = l2;
                      zl3.b(b1.H, (int)(((float)(l2 - a1.f) * f) * a1.d));
                      dh7.m(b1.c, uoem0);
                   }else {
                      throw new RuntimeException("Cannot compute scroll delta before calling start\(\)");
                   }
                }else {
                   b1.F = i;
                }
             }
             return;
             break;
           case 6:
             uoem0.b.p(i);
             return;
           case 7:
             b a2 = uoem0.b.a;
             _monitor_enter(a2);
             uoem0.b.f = b.k;
             _monitor_exit(a2);
             uoem0.b.k(uoem0.b.f);
             return;
           case 8:
             this.b();
             return;
           case 9:
             b1 = uoem0.b;
             b1.A = i;
             b1.z();
             return;
           case 10:
             em0 b2 = uoem0.b;
             b2.v.i(b2.g());
             return;
             break;
           case 11:
             try{
                uoem0.b.run();
             }catch(java.lang.Exception e0){
                Log.e(ye7.C("Executor"), "Background execution failure.", e0);
             }
             return;
             break;
           case 12:
             b1 = uoem0.b;
             b1.d.y(new vf(11, b1));
             return;
           case 13:
             uoem0.b.o();
             return;
           case 14:
             ll2 b3 = uoem0.b.b.b;
             b3.e(b3.getClass().getName().concat(" disconnecting because it was signed out."));
             return;
           case 15:
             uoem0.b.g.b(new fp0(4));
             return;
           case 16:
             this.c();
             return;
           case 17:
             uoem0.b.b.b();
             return;
           case 18:
             b1 = uoem0.b;
             Iterator iterator = b1.e().iterator();
             while (iterator.hasNext()) {
                File uFile = iterator.next();
                if (uFile.listFiles() != null) {
                   dx7.f(uFile);
                   l = dx7.b(uFile, i);
                   if ((long)b1.b.a() - l) {
                      File uFile1 = new File(uFile, String.valueOf(l));
                      String str = "stale.tmp";
                      try{
                         File uFile2 = new File(uFile1, str);
                         uFile2.createNewFile();
                      }catch(java.io.IOException e0){
                         Object[] objArray = new Object[i];
                         dx7.c.c("Could not write staleness marker.", objArray);
                      }
                   }
                   File[] uFileArray = uFile.listFiles();
                   int len = uFileArray.length;
                   for (i2 = 0; i2 < len; i2 = i2 + 1) {
                      dx7.f(uFileArray[i2]);
                   }
                }
             }
             return;
             break;
           case 19:
             em0 uoem01 = uoem0.b;
             Object obj = uoem01.b.c();
             w08 a3 = uoem01.a;
             a3.getClass();
             HashMap hashMap = new HashMap();
             jd c = dx7.c;
             try{
                hashMap1 = new HashMap();
                iterator1 = a3.e().iterator();
                while (iterator1.hasNext()) {
                   File uFile3 = iterator1.next();
                   if ((str2 = a3.m(uFile3.getName())) != null) {
                      File uFile4 = new File(str2, "assets");
                      if (!uFile4.isDirectory()) {
                         Object[] objArray2 = new Object[b];
                         objArray2[i] = uFile4;
                         c.c("Failed to find assets directory: %s", objArray2);
                      }else {
                         view1 = new gx7(str2, uFile4.getCanonicalPath());
                      label_012d :
                         if (view1 != null) {
                            hashMap1.put(uFile3.getName(), view1);
                         }
                      }
                   }
                   view1 = view;
                   goto label_012d ;
                }
             }catch(java.io.IOException e0){
                Object[] objArray1 = new Object[b];
                objArray1[i] = e0;
                c.c("Could not process directory while scanning installed packs: %s", objArray1);
             }
             iterator1 = hashMap1.keySet().iterator();
             while (iterator1.hasNext()) {
                String str1 = iterator1.next();
                hashMap.put(str1, Long.valueOf(a3.i(str1)));
             }
             vj1 ovj1 = obj.b(hashMap);
             w08 d = uoem01.d;
             ovj1.c.b(new zw7(d.c(), new vf(16, a3)));
             ovj1.g();
             ovj1.c.b(new zw7(d.c(), i70.F));
             ovj1.g();
             return;
             break;
           case 20:
             uoem0.b.d.set(Boolean.TRUE);
             return;
           case 21:
             b1 = uoem0.b;
             File[] uFileArray1 = b1.l(new ey0(2));
             HashSet hashSet = new HashSet();
             i2 = uFileArray1.length;
             i1 = 0;
             while (true) {
                String str3 = "FirebaseCrashlytics";
                if (i1 < i2) {
                   object oobject = uFileArray1[i1];
                   Objects.toString(oobject);
                   Log.isLoggable(str3, 3);
                   hashSet.add(ly0.i(oobject));
                   i1 = i1 + 1;
                }else if(hashSet.isEmpty()){
                   File[] uFileArray2 = b1.l(new bp5(b1, b, hashSet));
                   int len1 = uFileArray2.length;
                   for (; i < len1; i = i + 1) {
                      object oobject1 = uFileArray2[i];
                      Objects.toString(oobject1);
                      Log.isLoggable(str3, 3);
                      oobject1.delete();
                   }
                }
                return;
             }
             break;
           case 22:
             this.d();
             return;
           case 23:
             uoem0.b.getImageLoaderColorCallback();
             return;
           case 24:
             b1 = uoem0.b;
             if (b1.h != null) {
                b1.d.setProgressBarVisibility(i);
                b1.p.start();
             }
             return;
             break;
           case 25:
             b1 = uoem0.b;
             b1.A = i;
             b1.a();
             return;
           case 26:
             b1 = uoem0.b;
             if ((c1 = b1.c) != null) {
                Iterator iterator2 = b1.d.iterator();
                while (iterator2.hasNext()) {
                   c1.a(iterator2.next());
                }
                b1.d.clear();
             }
             return;
             break;
           case 27:
             pv0.a(uoem0.b);
             return;
           case 28:
             throw new NullPointerException(uoem0.b);
           default:
             b1 = uoem0.b;
             b1.f.e(hb6.v);
             b1.p();
             return;
       }
    }
}
