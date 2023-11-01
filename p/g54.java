package p.g54;
import p.b74;
import p.c64;
import p.va7;
import p.vi2;
import p.l4;
import p.t16;
import p.rb0;
import p.jy0;
import p.bu0;
import p.a56;
import p.kp6;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import p.c0;
import java.util.concurrent.ConcurrentLinkedQueue;
import android.content.Context;
import p.ld3;
import android.view.GestureDetector;
import android.view.GestureDetector$OnGestureListener;
import android.os.Handler;
import android.net.Uri;
import android.content.ClipDescription;
import android.os.Build$VERSION;
import p.v93;
import p.ce7;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.Class;
import java.lang.Math;
import p.f54;
import p.fz3;
import p.tm5;
import p.wi7;
import p.tp2;
import p.hb7;
import p.lp6;
import p.e64;
import p.jg;
import p.ig;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p.eb3;
import p.k07;
import java.lang.String;
import android.graphics.Paint;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import p.uj7;
import p.dc2;
import p.wh0;
import p.bc6;
import p.k80;
import p.j07;
import java.util.concurrent.CountDownLatch;
import p.if7;
import androidx.appcompat.widget.ActionMenuView;
import android.view.MenuItem;
import p.vf;
import androidx.core.widget.NestedScrollView;
import java.io.Writer;
import p.vg3;
import p.gf3;
import java.util.HashMap;
import p.cf3;
import android.util.JsonWriter;
import p.c46;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.Window$Callback;
import android.view.Menu;
import android.graphics.Typeface;
import p.pi0;
import p.sb0;
import p.ej7;
import p.vi7;
import p.qo5;
import p.aj7;
import p.vx5;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;

public final class g54 implements b74, c64, va7, vi2, l4, t16, rb0, jy0, bu0, a56, kp6	// class@0016a3 from classes.dex
{
    public Object a;

    public void g54(int p0){
       if (p0 != 20) {
          if (p0 != 27) {
             super();
             this.a = new ConcurrentHashMap();
             return;
          }else {
             super();
             this.a = c0.a;
             return;
          }
       }else {
          super();
          this.a = new ConcurrentLinkedQueue();
          return;
       }
    }
    public void g54(Context p0,ld3 p1){
       super();
       this.a = new GestureDetector(p0, p1, null);
    }
    public void g54(Uri p0,ClipDescription p1,Uri p2){
       super();
       this.a = (Build$VERSION.SDK_INT >= 25)? new v93(p0, p1, p2): new ce7(p0, p1, p2);
       return;
    }
    public void g54(SwipeDismissBehavior p0){
       super();
       p0.getClass();
       p0.f = Math.min(Math.max(0, 0.10f), 0x3f800000);
       p0.g = Math.min(Math.max(0, 0x3f19999a), 0x3f800000);
       p0.d = 0;
    }
    public void g54(Object p0){
       this.a = p0;
       super();
    }
    public void g54(f54 p0){
       super();
    }
    public void g54(fz3 p0){
       super();
       this.a = p0;
    }
    public void g54(tm5 p0){
       super();
       this.a = new wi7(p0);
    }
    public void g54(tp2 p0){
       super();
       this.a = hb7.a;
    }
    public final int a(){
       return (int)Math.ceil((double)this.a.j);
    }
    public final void b(e64 p0,boolean p1){
       jg d0;
       object oobject;
       e64 uoe64 = p0.k();
       int i = 0;
       int i1 = (uoe64 != p0)? 1: 0;
       g54 ta = this.a;
       if (i1) {
          p0 = uoe64;
       }
       int len = ((d0 = ta.d0) != null)? d0.length: 0;
       while (true) {
          if (i < len) {
             if ((oobject = d0[i]) != null && oobject.h == p0) {
             label_0028 :
                if (oobject != null) {
                   if (i1) {
                      this.a.q(oobject.a, oobject, uoe64);
                      this.a.s(oobject, true);
                      break ;
                   }else {
                      this.a.s(oobject, p1);
                      break ;
                   }
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             oobject = null;
             goto label_0028 ;
          }
       }
       return;
    }
    public final void c(Canvas p0){
       int i = p0.save();
       Rect bounds = this.a.getBounds();
       this.a.getClass();
       p0.translate((float)bounds.centerX(), (float)bounds.centerY());
       this.a.getClass();
       p0.rotate(0);
       p0.translate(0, (- this.a.k));
       g54 ta = this.a;
       int i1 = 0;
       int i2 = ta.i[i1];
       lp6 j = ta.j;
       float f = ((((float)bounds.width() / (float)bounds.height()) - (i2 / j)) > 0)? i2 / (float)bounds.width(): j / (float)bounds.height();
       g54 ta1 = this.a;
       lp6 o = ta1.o;
       int i3 = 1;
       if (o == 3 || (o == i3 || eb3.o(ta1) != i3)) {
          i1 = 1;
       }
       if (i1 && this.a.c.b != null) {
          p0.scale((- f), f);
       }else {
          p0.scale(f, f);
       }
       p0.translate(((- i2) / 2.00f), ((- j) / 2.00f));
       this.a.getClass();
       p0.drawText(this.a.a(), 0, 1, 0, 0, this.a.f);
       p0.restoreToCount(i);
       return;
    }
    public final boolean d(View p0){
       int i = p0.getCurrentItem() - 1;
       uj7 w = this.a.w;
       if (w.I != null) {
          w.c(i, 1);
       }
       return 1;
    }
    public final boolean e(){
       return true;
    }
    public final int f(Object p0){
       return p0.c;
    }
    public final boolean g(Object p0){
       return p0.d;
    }
    public final void h(wh0 p0){
       k80 ok80 = k80.a(this.a);
       p0.o(7, 2);
       int i = wh0.a(2, ok80);
       p0.n(((wh0.b(i) + wh0.d(5)) + i));
       p0.o(5, 2);
       p0.n(i);
       p0.i(2, ok80);
    }
    public final int i(){
       return (int)Math.ceil((double)this.a.i[0]);
    }
    public final Object j(j07 p0){
       this.a.countDown();
       return null;
    }
    public final void k(e64 p0){
       ActionMenuView m;
       if ((m = this.a.M) != null) {
          m.k(p0);
       }
       return;
    }
    public final boolean l(e64 p0,MenuItem p1){
       g54 ta = this.a;
       boolean b = (ta.R != null && ta.R.u(p1))? true: false;
       return b;
    }
    public final void m(int p0){
       this.a.l(p0);
    }
    public final void n(Object p0,Writer p1){
       g54 ta = this.a;
       vg3 v6 = new vg3(p1, ta.a, ta.b, ta.c, ta.d);
       v6.b(p0);
       v6.e();
       v6.b.flush();
    }
    public final Object o(){
       return this.a.getWritableDatabase();
    }
    public final boolean p(e64 p0){
       Window$Callback uCallback;
       if (p0 == p0.k()) {
          g54 ta = this.a;
          if (ta.X != null && ((uCallback = ta.B()) != null && this.a.i0 == null)) {
             uCallback.onMenuOpened(108, p0);
          }
       }
       return true;
    }
    public final void q(Typeface p0){
       g54 ta = this.a;
       pi0 a = ta.A;
       boolean b = true;
       if (a != null) {
          a.o = b;
       }
       if (ta.y != p0) {
          ta.y = p0;
       }else {
          b = false;
       }
       if (b) {
          ta.i(false);
       }
       return;
    }
    public final vi7 r(ej7 p0,Class p1){
       return new qo5(p0, this.a).g(p1);
    }
    public final String s(String p0){
       return this.a.c().getString(p0, null);
    }
    public final void t(int p0,String p1){
       this.a.c().edit().putInt(p1, p0).apply();
    }
    public final void u(String p0,String p1){
       this.a.c().edit().putString(p0, p1).apply();
    }
}
