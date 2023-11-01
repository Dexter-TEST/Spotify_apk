package p.ty0;
import p.ps3;
import p.b00;
import java.lang.Object;
import p.wq0;
import p.iq0;
import p.xq0;
import p.bq0;
import p.cq0;
import java.util.Iterator;
import java.util.HashSet;
import p.jn2;
import p.a43;
import p.z23;
import java.lang.Class;
import p.zt2;
import p.a23;
import p.o13;
import android.content.Context;
import android.util.AttributeSet;
import p.lv1;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import java.lang.String;
import java.lang.IllegalArgumentException;
import p.tp2;
import p.st2;
import p.n13;
import p.iu2;
import p.k23;
import p.c23;
import p.co5;
import p.b23;
import p.i13;
import p.s23;
import p.gu2;
import p.g23;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import p.bf3;
import p.zd7;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import p.xd7;
import java.lang.Math;
import p.su2;
import p.o23;
import java.util.concurrent.TimeUnit;
import p.wx5;
import p.x0;
import p.s0;
import p.w0;
import android.graphics.Typeface;
import java.lang.Thread;

public abstract class ty0	// class@002804 from classes.dex
{
    public static final ps3 a;
    public static final b00 b;
    public static final int c;
    public static final ps3 d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;

    static {
       ty0.a = new ps3(25);
       ty0.b = new b00();
       ty0.d = new ps3(9);
       ty0.e = new int[20]{0x7f03056d,0x7f03056e,0x7f03056f,0x7f030570,0x7f030571,0x7f030572,0x7f030573,0x7f030574,0x7f030575,0x7f030576,0x7f030577,0x7f030578,0x7f030579,0x7f03057a,0x7f03057b,0x7f03057c,0x7f03057d,0x7f03057e,0x7f03057f,0x7f030580};
       ty0.f = new int[5]{0x10101a5,0x101031f,0x1010647,0x7f030035,0x7f030330};
       ty0.g = new int[7]{0x7f03028b,0x7f03028c,0x7f03028d,0x7f03028e,0x7f03028f,0x7f030290,0x7f030291};
       ty0.h = new int[10]{0x1010532,0x1010533,0x101053f,0x101056f,0x1010570,0x7f030289,0x7f030292,0x7f030293,0x7f030294,0x7f03068a};
       ty0.i = new int[12]{0x101019d,0x101019e,0x10101a1,0x10101a2,0x10101a3,0x10101a4,0x1010201,0x101020b,0x1010510,0x1010511,0x1010512,0x1010513};
       ty0.j = new int[2]{0x10101a5,0x1010514};
       int[] ointArray = new int[]{0x7f030153};
       ty0.k = ointArray;
       int[] ointArray1 = new int[]{0x7f030158};
       ty0.l = ointArray1;
    }
    public void ty0(){
       super();
    }
    public void ty0(int p0){
       super();
    }
    public static void A(int p0,wq0 p1,iq0 p2){
       cq0 a;
       Iterator iterator;
       cq0 d;
       int i2;
       wq0 l;
       int i3;
       int i4;
       boolean i5;
       cq0 d1;
       int i6;
       wq0 owq0 = p1;
       iq0 oiq0 = p2;
       if (owq0.n != null) {
          return;
       }
       if (!owq0 instanceof xq0 && (p1.A() && ty0.c(p1))) {
          xq0.V(owq0, oiq0, new b00());
       }
       cq0 uocq0 = owq0.j(bq0.b);
       cq0 uocq01 = owq0.j(bq0.t);
       int i = uocq0.d();
       int i1 = uocq01.d();
       if ((a = uocq0.a) != null && uocq0.c != null) {
          iterator = a.iterator();
          while (iterator.hasNext()) {
             a = iterator.next();
             d = a.d;
             i2 = p0 + 1;
             boolean b = ty0.c(d);
             if (d.A() && b) {
                xq0.V(d, oiq0, new b00());
             }
             wq0 j = d.J;
             l = d.L;
             cq0 f = (a == j && ((f = l.f) != null && (f.c != null || (a == l && ((f = j.f) != null && f.c != null)))))? 1: 0;
             if ((i3 = d.T[1]) == 3 && !b) {
                if (i3 == 3 && (d.y >= null && (d.x >= null && (d.h0 == 8 && (d.s != null && (!(0 - d.X) || (d.z() && (d.F == null && (f && !d.z()))))))))) {
                   ty0.y(i2, owq0, oiq0, d);
                }
             }else if(d.A()){
                continue ;
             }else if(a == j && l.f == null){
                i4 = j.e() + i;
                i5 = d.l() + i4;
                d.K(i4, i5);
                ty0.A(i2, d, oiq0);
             }else if(a == l && j.f == null){
                i4 = i - l.e();
                i5 = i4 - d.l();
                d.K(i5, i4);
                ty0.A(i2, d, oiq0);
             }else if(f && !d.z()){
                ty0.x(i2, d, oiq0);
             }
          }
       }
       if (owq0 instanceof jn2) {
          return;
       }else if((uocq0 = uocq01.a) != null && uocq01.c != null){
          iterator = uocq0.iterator();
          while (iterator.hasNext()) {
             uocq01 = iterator.next();
             d1 = uocq01.d;
             i4 = p0 + 1;
             i5 = ty0.c(d1);
             if (d1.A() && i5) {
                xq0.V(d1, oiq0, new b00());
             }
             wq0 j1 = d1.J;
             l = d1.L;
             d = (uocq01 == j1 && ((d = l.f) != null && (d.c != null || (uocq01 == l && ((d = j1.f) != null && d.c != null)))))? 1: 0;
             if ((i2 = d1.T[1]) == 3 && !i5) {
                if (i2 == 3 && (d1.y >= null && d1.x >= null)) {
                   if (d1.h0 != 8) {
                      if (d1.s == null) {
                         if (0 - d1.X) {
                         }
                      }
                   }else {
                      i2 = 0;
                   }
                   if (!d1.z() && (d1.F == null && (d && !d1.z()))) {
                      ty0.y(i4, owq0, oiq0, d1);
                   }
                }else {
                   i5 = 8;
                }
                i2 = 0;
             }else if(d1.A()){
                continue ;
             }else if(uocq01 == j1 && l.f == null){
                i6 = j1.e() + i1;
                i3 = d1.l() + i6;
                d1.K(i6, i3);
                ty0.A(i4, d1, oiq0);
             }else if(uocq01 == l && j1.f == null){
                i6 = i1 - l.e();
                i3 = i6 - d1.l();
                d1.K(i3, i6);
                ty0.A(i4, d1, oiq0);
             }else if(d && !d1.z()){
                ty0.x(i4, d1, oiq0);
             }
          }
       }
       uocq0 = owq0.j(bq0.v);
       if (uocq0.a != null && uocq0.c != null) {
          i6 = uocq0.d();
          iterator = uocq0.a.iterator();
          while (iterator.hasNext()) {
             d1 = iterator.next();
             cq0 d2 = d1.d;
             i4 = p0 + 1;
             i5 = ty0.c(d2);
             if (d2.A() && i5) {
                xq0.V(d2, oiq0, new b00());
             }
             if (d2.T[1] == 3 && (!i5 || d2.A())) {
                continue ;
             }else {
                wq0 m = d2.M;
                if (d1 == m) {
                   i = d1.e() + i6;
                   if (d2.E != null) {
                      i3 = i - d2.b0;
                      int i7 = d2.W + i3;
                      d2.a0 = i3;
                      d2.J.l(i3);
                      d2.L.l(i7);
                      m.l(i);
                      d2.l = true;
                   }
                   ty0.A(i4, d2, oiq0);
                }
             }
          }
       }
       owq0.n = true;
       return;
    }
    public static final a43 B(){
       z23.c.getClass();
       return z23.t.a();
    }
    public static final zt2 b(){
       a23.b.getClass();
       return o13.a();
    }
    public static boolean c(wq0 p0){
       wq0 u;
       int i3;
       wq0 t = p0.T;
       int i = 0;
       int i1 = t[i];
       int i2 = t[1];
       if ((u = p0.U) != null) {
       }else {
          u = null;
       }
       if (u != null) {
          i3 = u.T[i];
       }
       if (u != null) {
          int i4 = u.T[1];
       }
       i3 = 2;
       i1 = (i1 != 1 && (!p0.B() && (i1 != i3 && (i1 != 3 && (p0.r == null && (!(0 - p0.X) && (p0.u(i) && (i1 != 3 && (p0.r == 1 && p0.v(i, p0.r()))))))))))? 0: 1;
       i2 = (i2 != 1 && (!p0.C() && (i2 != i3 && (i2 != 3 && (p0.s == null && (!(0 - p0.X) && (p0.u(1) && (i2 != 3 && (p0.s == 1 && p0.v(1, p0.l()))))))))))? 0: 1;
       if ((0 - p0.X) > 0 && (i1 && !i2)) {
          return 1;
       }else if(i1 && i2){
          i = true;
       }
       return i;
    }
    public static void g(Context p0,AttributeSet p1,int p2,int p3){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, lv1.L, p2, p3);
       p3 = 1;
       typedArray.recycle();
       if (typedArray.getBoolean(p3, false)) {
          TypedValue typedValue = new TypedValue();
          if (!p0.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, p3) || (typedValue.type == 18 || typedValue.data != null)) {
             ty0.i(p0, ty0.l, "Theme.MaterialComponents");
          }
       }
       ty0.i(p0, ty0.k, "Theme.AppCompat");
       return;
    }
    public static void h(Context p0,AttributeSet p1,int[] p2,int p3,int p4,int[] p5){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, lv1.L, p3, p4);
       boolean b = false;
       if (!typedArray.getBoolean(2, b)) {
          typedArray.recycle();
          return;
       }else if(!p5.length){
          if (typedArray.getResourceId(b, -1) != -1) {
          label_0037 :
             b = true;
          }
       }else {
          TypedArray typedArray1 = p0.obtainStyledAttributes(p1, p2, p3, p4);
          int len = p5.length;
          int i = 0;
          while (true) {
             if (i < len) {
                if (typedArray1.getResourceId(p5[i], -1) == -1) {
                   typedArray1.recycle();
                }else {
                   i++;
                }
             }else {
                typedArray1.recycle();
                goto label_0037 ;
             }
          }
          return;
       }
       typedArray.recycle();
       if (b) {
       }else {
          throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents \(or a descendant\).");
       }
    }
    public static void i(Context p0,int[] p1,String p2){
       TypedArray typedArray = p0.obtainStyledAttributes(p1);
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i1 < p1.length) {
             if (!typedArray.hasValue(i1)) {
                typedArray.recycle();
             label_001a :
                if (!i) {
                   throw new IllegalArgumentException(tp2.m("The style on this component requires your app theme to be ", p2, " \(or a descendant\)."));
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             typedArray.recycle();
             i = 1;
             goto label_001a ;
          }
       }
       return;
    }
    public static final st2 j(){
       n13.v.getClass();
       return n13.c().a();
    }
    public static final iu2 k(){
       k23.c.getClass();
       return k23.L().a();
    }
    public static final c23 l(String p0,String p1){
       co5.o(p1, "category");
       c23.t.getClass();
       return b23.a(p0, p1);
    }
    public static void m(int p0,wq0 p1,iq0 p2,boolean p3){
       cq0 a;
       Iterator iterator;
       cq0 d;
       int i2;
       wq0 i3;
       cq0 f;
       Iterator iterator1;
       int i4;
       boolean i5;
       int i8;
       int i9;
       wq0 owq0 = p1;
       iq0 oiq0 = p2;
       boolean b = p3;
       if (owq0.m != null) {
          return;
       }
       if (!owq0 instanceof xq0 && (p1.A() && ty0.c(p1))) {
          xq0.V(owq0, oiq0, new b00());
       }
       cq0 uocq0 = owq0.j(bq0.a);
       cq0 uocq01 = owq0.j(bq0.c);
       int i = uocq0.d();
       int i1 = uocq01.d();
       if ((a = uocq0.a) != null && uocq0.c != null) {
          iterator = a.iterator();
          while (iterator.hasNext()) {
             a = iterator.next();
             d = a.d;
             i2 = p0 + 1;
             boolean b1 = ty0.c(d);
             if (d.A() && b1) {
                xq0.V(d, oiq0, new b00());
             }
             i3 = d.I;
             wq0 k = d.K;
             if (a == i3 && ((f = k.f) != null && (f.c != null || (a == k && ((f = i3.f) != null && f.c != null))))) {
                iterator1 = iterator;
                f = 1;
             }else {
                iterator1 = iterator;
                f = 0;
             }
             if ((i4 = d.T[0]) == 3 && !b1) {
                if (i4 == 3 && (d.v >= null && (d.u >= null && (d.h0 == 8 && (d.r != null && (!(0 - d.X) || (d.y() && (d.F == null && (f && !d.y()))))))))) {
                   ty0.w(i2, owq0, oiq0, d, b);
                }
             }else if(d.A()){
                if (a == i3 && k.f == null) {
                   i4 = i3.e() + i;
                   i5 = d.r() + i4;
                   d.J(i4, i5);
                   ty0.m(i2, d, oiq0, b);
                }else if(a == k && i3.f == null){
                   i4 = i - k.e();
                   i5 = i4 - d.r();
                   d.J(i5, i4);
                   ty0.m(i2, d, oiq0, b);
                }else if(f && !d.y()){
                   ty0.v(i2, d, oiq0, b);
                }
             }
             iterator = iterator1;
          }
       }
       if (owq0 instanceof jn2) {
          return;
       }else if((uocq0 = uocq01.a) != null && uocq01.c != null){
          iterator = uocq0.iterator();
          while (iterator.hasNext()) {
             uocq01 = iterator.next();
             cq0 d1 = uocq01.d;
             int i6 = p0 + 1;
             i5 = ty0.c(d1);
             if (d1.A() && i5) {
                xq0.V(d1, oiq0, new b00());
             }
             wq0 i7 = d1.I;
             i3 = d1.K;
             d = (uocq01 == i7 && ((d = i3.f) != null && (d.c != null || (uocq01 == i3 && ((d = i7.f) != null && d.c != null)))))? 1: 0;
             if ((i2 = d1.T[0]) == 3 && !i5) {
                if (i2 == 3 && (d1.v >= null && d1.u >= null)) {
                   if (d1.h0 != 8) {
                      if (d1.r == null) {
                         if (0 - d1.X) {
                         }
                      }
                   }else {
                      i2 = 0;
                   }
                   if (!d1.y() && (d1.F == null && (d && !d1.y()))) {
                      ty0.w(i6, owq0, oiq0, d1, b);
                   }
                }else {
                   i5 = 8;
                }
                i2 = 0;
             }else if(d1.A()){
                continue ;
             }else if(uocq01 == i7 && i3.f == null){
                i8 = i7.e() + i1;
                i9 = d1.r() + i8;
                d1.J(i8, i9);
                ty0.m(i6, d1, oiq0, b);
             }else if(uocq01 == i3 && i7.f == null){
                i8 = i1 - i3.e();
                i9 = i8 - d1.r();
                d1.J(i9, i8);
                ty0.m(i6, d1, oiq0, b);
             }else if(d && !d1.y()){
                ty0.v(i6, d1, oiq0, b);
             }
          }
       }
       owq0.m = true;
       return;
    }
    public static final i13 n(){
       s23.c.getClass();
       return s23.d().u();
    }
    public static final gu2 o(){
       g23.c.getClass();
       return g23.j().a();
    }
    public static final boolean p(Type p0){
       int len;
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0 instanceof ParameterizedType) {
          Type[] actualTypeAr = p0.getActualTypeArguments();
          co5.l(actualTypeAr, "type.actualTypeArguments");
          len = actualTypeAr.length;
          int i = 0;
          while (i < len) {
             if (ty0.p(actualTypeAr[i])) {
                return true;
             }
             i = i + 1;
          }
       }else if(p0 instanceof Class){
          try{
             if (p0.isAnnotationPresent(bf3.class) || p0.isAnnotationPresent(zd7.class)) {
                len = 1;
             label_0049 :
                if (len || xd7.class.isAssignableFrom(p0)) {
                   b = true;
                }
             }
          }catch(java.lang.NoClassDefFoundError e1){
             Object[] objArray = new Object[b];
             Logger.c(e1, "Error reading annotation", objArray);
          }
          len = 0;
          goto label_0049 ;
       }
       return b;
    }
    public static TypedArray q(Context p0,AttributeSet p1,int[] p2,int p3,int p4,int[] p5){
       ty0.g(p0, p1, p3, p4);
       ty0.h(p0, p1, p2, p3, p4, p5);
       return p0.obtainStyledAttributes(p1, p2, p3, p4);
    }
    public static void v(int p0,wq0 p1,iq0 p2,boolean p3){
       wq0 e0 = p1.e0;
       wq0 i = p1.I;
       int i1 = i.f.d();
       wq0 k = p1.K;
       int i2 = k.f.d();
       int i3 = i.e() + i1;
       int i4 = i2 - k.e();
       if (i1 == i2) {
          e0 = 0x3f000000;
       }else {
          i1 = i3;
          i2 = i4;
       }
       i3 = p1.r();
       i4 = (i2 - i1) - i3;
       if (i1 > i2) {
          i4 = (i1 - i2) - i3;
       }
       float f = (i4 > 0)? (e0 * (float)i4) + 0x3f000000: e0 * (float)i4;
       int i5 = (int)f + i1;
       i4 = i5 + i3;
       if (i1 > i2) {
          i4 = i5 - i3;
       }
       p1.J(i5, i4);
       p0++;
       ty0.m(p0, p1, p2, p3);
       return;
    }
    public static void w(int p0,wq0 p1,iq0 p2,wq0 p3,boolean p4){
       int i2;
       wq0 r;
       int i4;
       wq0 e0 = p3.e0;
       wq0 i = p3.I;
       int i1 = i.e() + i.f.d();
       wq0 k = p3.K;
       if ((i2 = k.f.d() - k.e()) >= i1) {
          int i3 = p3.r();
          if (p3.h0 != 8) {
             if ((r = p3.r) == 2) {
                i4 = (p1 instanceof xq0)? p1.r(): p1.U.r();
                i3 = (int)((p3.e0 * 0x3f000000) * (float)i4);
             }else if(r == null){
                i3 = i2 - i1;
             }
             i3 = Math.max(p3.u, i3);
             if ((i4 = p3.v) > null) {
                i3 = Math.min(i4, i3);
             }
          }
          i1 = i1 + (int)((e0 * (float)((i2 - i1) - i3)) + 0x3f000000);
          p3.J(i1, (i3 + i1));
          p0++;
          ty0.m(p0, p3, p2, p4);
       }
       return;
    }
    public static void x(int p0,wq0 p1,iq0 p2){
       wq0 owq0 = p1.f0;
       wq0 j = p1.J;
       int i = j.f.d();
       wq0 l = p1.L;
       int i1 = l.f.d();
       int i2 = j.e() + i;
       int i3 = i1 - l.e();
       float f = 0x3f000000;
       if (i == i1) {
          owq0 = 0x3f000000;
       }else {
          i = i2;
          i1 = i3;
       }
       i2 = p1.l();
       i3 = (i1 - i) - i2;
       if (i > i1) {
          i3 = (i - i1) - i2;
       }
       float f1 = (i3 > 0)? (owq0 * (float)i3) + f: owq0 * (float)i3;
       int i4 = (int)f1;
       i3 = i + i4;
       int i5 = i3 + i2;
       if (i > i1) {
          i3 = i - i4;
          i5 = i3 - i2;
       }
       p1.K(i3, i5);
       p0++;
       ty0.A(p0, p1, p2);
       return;
    }
    public static void y(int p0,wq0 p1,iq0 p2,wq0 p3){
       int i1;
       wq0 s;
       int i3;
       wq0 owq0 = p3.f0;
       wq0 j = p3.J;
       int i = j.e() + j.f.d();
       wq0 l = p3.L;
       if ((i1 = l.f.d() - l.e()) >= i) {
          int i2 = p3.l();
          if (p3.h0 != 8) {
             if ((s = p3.s) == 2) {
                i3 = (p1 instanceof xq0)? p1.l(): p1.U.l();
                i2 = (int)((owq0 * 0x3f000000) * (float)i3);
             }else if(s == null){
                i2 = i1 - i;
             }
             i2 = Math.max(p3.x, i2);
             if ((i3 = p3.y) > null) {
                i2 = Math.min(i3, i2);
             }
          }
          i = i + (int)((owq0 * (float)((i1 - i) - i2)) + 0x3f000000);
          p3.K(i, (i2 + i));
          p0++;
          ty0.A(p0, p3, p2);
       }
       return;
    }
    public static final su2 z(){
       o23.c.getClass();
       return o23.b().a();
    }
    public abstract wx5 a(TimeUnit p0);
    public abstract boolean d(x0 p0,s0 p1,s0 p2);
    public abstract boolean e(x0 p0,Object p1,Object p2);
    public abstract boolean f(x0 p0,w0 p1,w0 p2);
    public abstract void r(int p0);
    public abstract void s(Typeface p0,boolean p1);
    public abstract void t(w0 p0,w0 p1);
    public abstract void u(w0 p0,Thread p1);
}
