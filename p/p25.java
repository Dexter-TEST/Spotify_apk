package p.p25;
import java.lang.Object;
import p.c0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.widget.Button;
import androidx.constraintlayout.widget.Guideline;
import android.widget.ImageView;
import com.spotify.legacyglue.widgetstate.ViewPagerIndicator;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager2.widget.ViewPager2;
import p.b52;
import android.content.Context;
import p.u53;
import p.i51;
import p.yy6;
import p.tv;
import java.lang.Long;
import java.lang.Boolean;
import p.vj;
import java.lang.String;
import p.es;
import java.util.concurrent.Executor;
import java.lang.Class;
import p.uj;
import p.yz0;
import p.xj0;
import p.e0;
import p.a28;
import java.lang.Throwable;
import android.util.Log;
import p.av;
import p.m73;
import p.r45;
import java.lang.IllegalStateException;
import p.kg4;
import java.io.File;
import p.et0;
import java.lang.NullPointerException;

public final class p25	// class@0021db from classes.dex
{
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    public void p25(int p0){
       if (p0 != 3) {
          super();
          return;
       }else {
          super();
          c0 a = c0.a;
          this.a = a;
          this.b = a;
          this.c = a;
          this.d = a;
          this.e = a;
          this.f = a;
          this.g = a;
          this.h = a;
          this.i = a;
          this.j = a;
          this.k = a;
          this.l = a;
          return;
       }
    }
    public void p25(CoordinatorLayout p0,Button p1,Button p2,CoordinatorLayout p3,Guideline p4,Guideline p5,ImageView p6,ViewPagerIndicator p7,ProgressBar p8,ConstraintLayout p9,TextView p10,NestedScrollView p11,ViewPager2 p12){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       this.k = p10;
       this.l = p11;
       this.m = p12;
    }
    public void p25(b52 p0,Context p1,u53 p2,i51 p3){
       super();
       this.a = new yy6(14);
       this.b = p0;
       this.c = p1;
       this.l = p2;
       this.m = p3;
    }
    public void p25(tv p0){
       super();
       this.e = p0.a;
       this.a = Long.valueOf(p0.b);
       this.b = Long.valueOf(p0.c);
       this.c = Long.valueOf(p0.d);
       this.d = Long.valueOf(p0.e);
       this.f = Boolean.valueOf(p0.f);
       this.g = Boolean.valueOf(p0.g);
       this.h = Boolean.valueOf(p0.h);
       this.i = p0.i;
       this.j = p0.j;
       this.k = p0.k;
       this.l = Boolean.valueOf(p0.l);
       this.m = Boolean.valueOf(p0.m);
    }
    public static void a(p25 p0,vj p1,String p2,es p3,Executor p4){
       uj ouj;
       int i;
       int i1;
       p0.getClass();
       String str = "";
       String str1 = "string";
       vj b = p1.b;
       vj e = p1.e;
       if ("new".equals(p1.a)) {
          ouj = p0.d(e, p2);
          p25 c = p0.c;
          if ((i = xj0.o0(c, "com.crashlytics.ApiEndpoint", str1)) > 0) {
             str = c.getString(i);
          }
          if (new yz0(str, b, p0.a, 0).c(ouj)) {
             p3.d(2, p4);
          }else {
             Log.e("FirebaseCrashlytics", "Failed to create app with Crashlytics service.", null);
          }
       }else if("configured".equals(p1.a)){
          p3.d(2, p4);
       }else if(p1.f != null){
          Log.isLoggable("FirebaseCrashlytics", 3);
          ouj = p0.d(e, p2);
          p25 c1 = p0.c;
          if ((i1 = xj0.o0(c1, "com.crashlytics.ApiEndpoint", str1)) > 0) {
             str = c1.getString(i1);
          }
          new yz0(str, b, p0.a, 1).c(ouj);
       }
       return;
    }
    public final av b(){
       p25 op25 = this;
       String str = (op25.m == null)? " configurationOverride": "";
       if (str.isEmpty()) {
          av str1 = new av(op25.a, op25.b, op25.c, op25.d, op25.e, op25.f, op25.g, op25.h, op25.i, op25.j, op25.k, op25.l, op25.m);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final tv c(){
       p25 op25 = this;
       String str = (op25.e == null)? " name": "";
       if (op25.a == null) {
          str = str.concat(" estimatedUsedSpace");
       }
       if (op25.b == null) {
          str = kg4.l(str, " estimatedFreeSpace");
       }
       if (op25.c == null) {
          str = kg4.l(str, " estimatedAppSize");
       }
       if (op25.d == null) {
          str = kg4.l(str, " estimatedCacheSize");
       }
       if (op25.f == null) {
          str = kg4.l(str, " selected");
       }
       if (op25.g == null) {
          str = kg4.l(str, " mounted");
       }
       if (op25.h == null) {
          str = kg4.l(str, " appInternal");
       }
       if (op25.i == null) {
          str = kg4.l(str, " cache");
       }
       if (op25.j == null) {
          str = kg4.l(str, " volatileCache");
       }
       if (op25.k == null) {
          str = kg4.l(str, " volume");
       }
       if (op25.l == null) {
          str = kg4.l(str, " emulated");
       }
       if (op25.m == null) {
          str = kg4.l(str, " removable");
       }
       if (str.isEmpty()) {
          tv str1 = new tv(op25.e, op25.a.longValue(), op25.b.longValue(), op25.c.longValue(), op25.d.longValue(), op25.f.booleanValue(), op25.g.booleanValue(), op25.h.booleanValue(), op25.i, op25.j, op25.k, op25.l.booleanValue(), op25.m.booleanValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final uj d(String p0,String p1){
       p25 op25 = this;
       int i = 4;
       String[] stringArray = new String[i];
       stringArray[0] = xj0.n0(op25.c);
       stringArray[1] = p1;
       stringArray[2] = op25.g;
       stringArray[3] = op25.f;
       String str = xj0.p(stringArray);
       if (op25.h != null) {
       }else {
          i = 1;
       }
       uj v1 = new uj(p0, p1, op25.l.c, op25.g, op25.f, str, op25.i, et0.h(i), op25.j);
       return v1;
    }
    public final void e(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null name");
       }
       this.e = p0;
       return;
    }
}
