package p.w51;
import p.w54;
import p.bx6;
import java.lang.String;
import p.ps3;
import p.c65;
import java.lang.Object;
import java.lang.Iterable;
import java.util.Comparator;
import java.lang.Class;
import java.util.SortedSet;
import p.kf4;
import p.gn6;
import com.google.common.collect.e;
import java.util.Set;
import java.util.Iterator;
import android.os.Build$VERSION;
import java.util.Locale;
import android.content.Context;
import p.co5;
import java.io.File;
import p.es3;
import p.kq7;
import p.te;
import p.xe7;
import java.util.LinkedHashMap;
import java.lang.StringBuilder;
import java.util.Map;
import p.t65;
import java.util.AbstractMap;
import p.ml1;
import java.util.Map$Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import p.io2;
import p.xw0;
import p.q37;
import p.bo6;
import p.ng2;
import p.tp2;
import java.lang.NullPointerException;
import p.au0;
import p.zf2;
import p.gc1;
import java.lang.Throwable;
import p.ux5;
import p.vl0;
import p.ul0;
import p.zw0;
import p.ic1;
import java.lang.Runnable;
import p.nu1;
import p.p37;
import p.gg1;
import p.ww0;
import p.vw0;
import p.me3;
import p.ve3;
import java.util.concurrent.CancellationException;
import p.tx5;
import p.eb3;
import p.zb7;
import p.vv7;
import java.lang.Integer;
import java.lang.Math;
import java.lang.Number;
import java.lang.System;
import android.view.View;
import p.ni7;
import p.ma6;
import p.ye7;
import p.sh5;
import java.util.List;
import java.lang.IllegalArgumentException;
import p.nu7;
import android.os.Looper;
import android.os.Handler;
import java.lang.Thread;
import java.lang.IllegalStateException;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.p14;
import p.z77;
import p.wq0;
import p.bp7;
import p.sp2;
import p.jn2;
import p.cq0;
import p.zg0;
import p.vu2;
import p.mq5;
import p.au2;
import p.ju2;
import p.aq6;
import p.td7;
import p.yp6;
import p.tu2;
import p.ic;
import java.lang.Long;
import p.hu2;
import p.j13;
import android.widget.CompoundButton;
import android.graphics.drawable.Drawable;
import p.mn0;
import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import com.google.common.collect.d;
import androidx.appcompat.widget.Toolbar;
import android.widget.TextView;
import android.view.ViewGroup;
import p.fo2;
import p.ds1;
import java.nio.charset.Charset;

public abstract class w51 implements w54	// class@002aca from classes.dex
{
    public static final int[] A;
    public static final int[] B;
    public static final bx6 C;
    public static Field a;
    public static boolean b;
    public static final bx6 c;
    public static final bx6 t;
    public static final ps3 v;
    public static final c65 w;
    public static final ps3 x;
    public static final int[] y;
    public static final int[] z;

    static {
       w51.c = new bx6("UNDEFINED");
       w51.t = new bx6("REUSABLE_CLAIMED");
       w51.v = new ps3(11);
       w51.w = new c65(27);
       w51.x = new ps3(10);
       w51.y = new int[12]{0x7f03002f,0x7f030030,0x7f0301cb,0x7f0301cc,0x7f0301cd,0x7f03026a,0x7f03026b,0x7f03032c,0x7f0303e6,0x7f030585,0x7f030586,0x7f030587};
       w51.z = new int[10]{0x7f03033b,0x7f030372,0x7f030373,0x7f030374,0x7f030380,0x7f030381,0x7f030382,0x7f030383,0x7f030385,0x7f030389};
       w51.A = new int[3]{0x1010003,0x10100d0,0x10100d1};
       w51.B = new int[2]{0x1010003,0x10100d1};
       w51.C = new bx6("NO_THREAD_ELEMENTS");
    }
    public void w51(){
       super();
    }
    public static boolean A(Iterable p0,Comparator p1){
       Comparator uComparator;
       p1.getClass();
       p0.getClass();
       if (p0 instanceof SortedSet) {
          if ((uComparator = p0.comparator()) == null) {
             uComparator = kf4.a;
          }
       }else if(p0 instanceof gn6){
          uComparator = p0.t;
       }else {
          return false;
       }
       return p1.equals(uComparator);
    }
    public static int C(Set p0){
       Object obj;
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          int i1 = ((obj = iterator.next()) != null)? obj.hashCode(): 0;
          i = i + i1;
          i = ~ i;
          i = ~ i;
       }
       return i;
    }
    public static boolean D(){
       int sDK_INT = Build$VERSION.SDK_INT;
       boolean b = true;
       if (sDK_INT < 33) {
          if (sDK_INT >= 32) {
             String cODENAME = Build$VERSION.CODENAME;
             if (!"REL".equals(cODENAME)) {
                Locale rOOT = Locale.ROOT;
                if ((cODENAME = cODENAME.toUpperCase(rOOT)) >= 0) {
                   cODENAME = 1;
                label_002c :
                   if (!cODENAME) {
                   label_002f :
                      b = false;
                   }
                }
             }
             cODENAME = 0;
             goto label_002c ;
          }else {
             goto label_002f ;
          }
       }
       return b;
    }
    public static final void F(Context p0){
       Map map;
       co5.o(p0, "context");
       File uFile = w51.v(p0);
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 23;
       if (sDK_INT >= i && uFile.exists()) {
          es3.c().getClass();
          if (sDK_INT >= i) {
             uFile = w51.v(p0);
             File uFile1 = (sDK_INT < i)? w51.v(p0): new File(te.a.a(p0), "androidx.work.workdb");
             String[] a = kq7.a;
             if ((i = xe7.F(a.length)) < 16) {
                i = 16;
             }
             LinkedHashMap linkedHashMa = new LinkedHashMap(i);
             i = a.length;
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                object oobject = a[i1];
                linkedHashMa.put(new File("".append(uFile.getPath()).append(oobject).toString()), new File("".append(uFile1.getPath()).append(oobject).toString()));
             }
             t65 ot65 = new t65(uFile, uFile1);
             if (linkedHashMa.isEmpty()) {
                map = xe7.H(ot65);
             }else {
                LinkedHashMap linkedHashMa1 = new LinkedHashMap(linkedHashMa);
                linkedHashMa1.put(uFile, uFile1);
                map = linkedHashMa1;
             }
          }else {
             map = ml1.a;
          }
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             File key = uEntry.getKey();
             uFile = uEntry.getValue();
             if (key.exists()) {
                if (uFile.exists()) {
                   uFile.toString();
                   es3.c().getClass();
                }
                if (key.renameTo(uFile)) {
                   key.toString();
                   uFile.toString();
                }else {
                   key.toString();
                   uFile.toString();
                }
                es3.c().getClass();
             }
          }
       }
       return;
    }
    public static ArrayList G(Object[] p0){
       p0.getClass();
       int len = p0.length;
       w51.h(len, "arraySize");
       long l = ((long)len + 5) + (long)(len / 10);
       if ((l - 0x7fffffff) > 0) {
          len = Integer.MAX_VALUE;
       }else if((l - -2147483648) < 0){
          len = Integer.MIN_VALUE;
       }else {
          len = (int)l;
       }
       ArrayList uArrayList = new ArrayList(len);
       Collections.addAll(uArrayList, p0);
       return uArrayList;
    }
    public static int M(Object p0,Object p1,int p2,Object p3,int[] p4,Object[] p5,Object[] p6){
       int i2;
       int i6;
       int i = w51.Q(p0);
       int i1 = i & p2;
       if (!(i2 = w51.R(i1, p3))) {
          return -1;
       }
       int i3 = ~ p2;
       i = i & i3;
       int i4 = -1;
       while (true) {
          i2 = i2 - 1;
          int i5 = p4[i2];
          if ((i6 = i5 & i3) == i && (io2.j(p0, p5[i2]) && (p6 == null && !io2.j(p1, p6[i2])))) {
             int i7 = i5 & p2;
             if (i4 == -1) {
                w51.S(i1, i7, p3);
                break ;
             }else {
                p4[i4] = (i7 & p2) | (p4[i4] & i3);
                break ;
             }
          }else if(!(i4 = i5 & p2)){
             return -1;
          }else {
             i4 = i2;
             i2 = i4;
          }
       }
       return i2;
    }
    public static final void N(xw0 p0,Object p1){
       int i;
       if (p1 == w51.C) {
          return;
       }
       if (p1 instanceof q37) {
          q37 b = p1.b;
          if ((i = b.length - 1) < 0) {
             return;
          }
          co5.i(null);
          throw null;
       }else if((p0 = p0.J(null, bo6.z)) != null){
          tp2.v(p0);
          throw null;
       }else {
          throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
       }
    }
    public static final void O(au0 p0,Object p1,zf2 p2){
       vl0 ovl0;
       me3 ome3;
       CancellationException uCancellatio;
       ul0 obj;
       if (p0 instanceof gc1) {
          Throwable throwable = ux5.a(p1);
          boolean b = false;
          if (throwable == null) {
             ovl0 = (p2 != null)? new vl0(p1, p2): p1;
          }else {
             obj = new ul0(throwable, b);
          }
          gc1 v = p0.v;
          p0.getContext();
          int i = 1;
          if (p0.t.h0()) {
             p0.w = ovl0;
             p0.c = i;
             p0.t.g0(p0.getContext(), p0);
          }else {
             nu1 onu1 = p37.a();
             int i1 = ((onu1.c - 0x100000000) >= 0)? 1: 0;
             if (i1) {
                p0.w = ovl0;
                p0.c = i;
                onu1.k0(p0);
             }else {
                onu1.m0(i);
                if ((ome3 = p0.getContext().f(gg1.y)) != null && !ome3.b()) {
                   uCancellatio = ome3.o();
                   p0.b(ovl0, uCancellatio);
                   p0.d(eb3.h(uCancellatio));
                   uCancellatio = 1;
                }
                if (!uCancellatio) {
                   xw0 context = v.getContext();
                   zb7 ozb7 = ((obj = w51.W(context, p0.x)) != w51.C)? vv7.X(v, context, obj): null;
                   v.d(p1);
                   if (ozb7 == null || ozb7.O()) {
                      w51.N(context, obj);
                   }
                }
                do {
                } while (!onu1.n0());
                onu1.j0();
             }
          }
       }else {
          p0.d(p1);
       }
       return;
    }
    public static int P(int p0){
       return (int)((long)Integer.rotateLeft((int)((long)p0 * -862048943), 15) * 0x1b873593);
    }
    public static int Q(Object p0){
       int i = (p0 == null)? 0: p0.hashCode();
       return w51.P(i);
    }
    public static int R(int p0,Object p1){
       if (p1 instanceof byte[]) {
          return (p1[p0] & 0x00ff);
       }
       if (p1 instanceof short[]) {
          return (p1[p0] & 0xffff);
       }
       return p1[p0];
    }
    public static void S(int p0,int p1,Object p2){
       if (p2 instanceof byte[]) {
          p2[p0] = (byte)p1;
       }else if(p2 instanceof short[]){
          p2[p0] = (short)p1;
       }else {
          p2[p0] = p1;
       }
       return;
    }
    public static final Object T(xw0 p0){
       p0 = p0.J(Integer.valueOf(0), bo6.y);
       co5.i(p0);
       return p0;
    }
    public static final String U(au0 p0){
       String str;
       if (p0 instanceof gc1) {
          str = p0.toString();
       }else {
          String str1 = p0+'@'+w51.x(p0);
          if (ux5.a(str1) != null) {
             str1 = p0.getClass().getName()+'@'+w51.x(p0);
          }
          str = str1;
       }
       return str;
    }
    public static String V(Map p0){
       int i = p0.size();
       w51.h(i, "size");
       StringBuilder str = new StringBuilder((int)Math.min(((long)i * 8), 0x40000000))+'{';
       Iterator iterator = p0.entrySet().iterator();
       i = 1;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!i) {
             str = str.append(", ");
          }
          str = str.append(uEntry.getKey()).append('=').append(uEntry.getValue());
          i = 0;
       }
       return str+'}';
    }
    public static final Object W(xw0 p0,Object p1){
       bx6 c;
       if (p1 == null) {
          p1 = w51.T(p0);
       }
       if (p1 == Integer.valueOf(0)) {
          c = w51.C;
       }else if(p1 instanceof Integer){
          c = p0.J(new q37(p0, p1.intValue()), bo6.A);
       }else {
          tp2.v(p1);
          throw null;
       }
       return c;
    }
    public static boolean X(int p0,int p1,int p2,int p3){
       p0 = (p2 != 1 && (p2 != 2 && (p2 != 4 && p0 != 2)))? 0: 1;
       p1 = (p3 != 1 && (p3 != 2 && (p3 != 4 && p1 != 2)))? 0: 1;
       if (!p0 && !p1) {
          return false;
       }else {
          return 1;
       }
    }
    public static void a(Object p0,StringBuilder p1){
       int i;
       if (p0 == null) {
          p1+"null";
       }else {
          String simpleName = p0.getClass().getSimpleName();
          if (simpleName.length() <= 0) {
             simpleName = p0.getClass().getName();
             if ((i = simpleName.lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring((i + 1));
             }
          }
          p1+simpleName+'{'+Integer.toHexString(System.identityHashCode(p0));
       }
       return;
    }
    public static final void b(View p0){
       int i;
       sh5 tag;
       sh5 a;
       co5.o(p0, "<this>");
       ma6 oma6 = new ma6();
       oma6.t = ye7.p(oma6, oma6, new ni7(p0, null));
       while (true) {
          if (!oma6.hasNext()) {
             return;
          }
          View view = oma6.next();
          i = 0x7f0a050b;
          if ((tag = view.getTag(i)) == null) {
             tag = new sh5();
             view.setTag(i, tag);
          }
          a = tag.a;
          i = ye7.B(a);
          if (-1 >= i) {
          }else {
             break ;
          }
       }
       tp2.v(a.get(i));
       throw null;
    }
    public static int c(int p0){
       if (p0 < 3) {
          w51.h(p0, "expectedSize");
          p0++;
          return p0;
       }else if(p0 < 0x40000000){
          return (int)Math.ceil(((double)p0 / 0x3fe8000000000000));
       }else {
          return Integer.MAX_VALUE;
       }
    }
    public static void d(String p0,boolean p1){
       if (p1) {
          return;
       }
       throw new IllegalArgumentException(p0);
    }
    public static void e(int p0,Object[] p1){
       int i = 0;
       while (true) {
          if (i >= p0) {
             return;
          }
          if (p1[i] != null) {
             i = i + 1;
          }else {
             break ;
          }
       }
       throw new NullPointerException(tp2.k("at index ", i));
    }
    public static void f(Object p0,Object p1){
       if (p0 == null) {
          throw new NullPointerException("null key in entry: null="+p1);
       }
       if (p1 != null) {
          return;
       }
       throw new NullPointerException("null value in entry: "+p0+"=null");
    }
    public static void g(nu7 p0){
       Looper looper;
       if ((looper = Looper.myLooper()) == p0.getLooper()) {
          return;
       }
       String name = (looper != null)? looper.getThread().getName(): "null current looper";
       String name1 = p0.getLooper().getThread().getName();
       StringBuilder str = new StringBuilder((String.valueOf(name).length() + (String.valueOf(name1).length() + 36)))+"Must be called on "+name1;
       throw new IllegalStateException(str+" thread, but got "+name+".");
    }
    public static void h(int p0,String p1){
       if (p0 >= 0) {
          return;
       }
       throw new IllegalArgumentException(p1+" cannot be negative but was: "+p0);
    }
    public static void i(String p0){
       if (!TextUtils.isEmpty(p0)) {
          return;
       }
       throw new IllegalArgumentException("Given String is empty or null");
    }
    public static void j(String p0,String p1){
       if (!TextUtils.isEmpty(p1)) {
          return;
       }
       throw new IllegalArgumentException(p0);
    }
    public static void k(Object p0){
       if (p0 != null) {
          return;
       }
       throw new NullPointerException("null reference");
    }
    public static void l(Object p0,String p1){
       if (p0 != null) {
          return;
       }
       throw new NullPointerException(p1);
    }
    public static void m(String p0,boolean p1){
       if (p1) {
          return;
       }
       throw new IllegalStateException(String.valueOf(p0));
    }
    public static void n(Iterator p0){
       p0.getClass();
       while (p0.hasNext()) {
          p0.next();
          p0.remove();
       }
       return;
    }
    public static boolean o(p14 p0,Object p1){
       if (p1 == null) {
          while (p0.hasNext()) {
             if (p0.next() == null) {
                return true;
             }
          }
       }else {
          while (p0.hasNext()) {
             if (p1.equals(p0.next())) {
                return true;
             }
          }
       }
       return false;
    }
    public static Object p(int p0){
       if (p0 < 2 || (p0 > 0x40000000 || Integer.highestOneBit(p0) != p0)) {
          throw new IllegalArgumentException(tp2.k("must be power of 2 between 2^1 and 2^30: ", p0));
       }
       if (p0 <= 256) {
          byte[] uobyteArray = new byte[p0];
          return uobyteArray;
       }else if(p0 <= 0x10000){
          short[] oshortArray = new short[p0];
          return oshortArray;
       }else {
          int[] ointArray = new int[p0];
          return ointArray;
       }
    }
    public static boolean q(Map p0,Object p1){
       if (p0 == p1) {
          return true;
       }
       if (p1 instanceof Map) {
          return p0.entrySet().equals(p1.entrySet());
       }
       return false;
    }
    public static bp7 r(wq0 p0,int p1,ArrayList p2,bp7 p3){
       wq0 o01;
       jn2 ojn2;
       wq0 o0 = (!p1)? p0.o0: p0.p0;
       int i = -1;
       int i1 = 0;
       if (o0 != i && (p3 == null && o0 == p3.b)) {
          int i2 = 0;
          while (i2 < p2.size()) {
             bp7 uobp7 = p2.get(i2);
             if (uobp7.b == o0) {
                if (p3 != null) {
                   p3.c(p1, uobp7);
                   p2.remove(p3);
                }
                p3 = uobp7;
                break ;
             }
             i2 = i2 + 1;
          }
       }else if(o0 != i){
          return p3;
       }
       int i3 = 1;
       if (p3 == null) {
          if (p0 instanceof sp2) {
             sp2 osp2 = p0;
             int i4 = 0;
             while (true) {
                if (i4 < osp2.r0) {
                   object oobject = osp2.q0[i4];
                   if (!p1 && ((o01 = oobject.o0) != i || (p1 == i3 && (o01 = oobject.p0) != i))) {
                   label_0057 :
                      if (o01 != i) {
                         i = 0;
                         while (i < p2.size()) {
                            bp7 uobp71 = p2.get(i);
                            if (uobp71.b == o01) {
                               p3 = uobp71;
                            }
                            i = i + 1;
                         }
                      }
                   }else {
                      i4 = i4 + 1;
                   }
                }else {
                   o01 = -1;
                   goto label_0057 ;
                }
             }
          }
          if (p3 == null) {
             p3 = new bp7(p1);
          }
          p2.add(p3);
       }
       bp7 a = p3.a;
       if (a.contains(p0)) {
          a = 0;
       }else {
          a.add(p0);
          ojn2 = 1;
       }
       if (a) {
          if (p0 instanceof jn2) {
             ojn2 = p0;
             jn2 t0 = ojn2.t0;
             if (ojn2.u0 == null) {
                i1 = 1;
             }
             t0.c(i1, p3, p2);
          }
          bp7 b = p3.b;
          if (!p1) {
             p0.o0 = b;
             p0.I.c(p1, p3, p2);
             p0.K.c(p1, p3, p2);
          }else {
             p0.p0 = b;
             p0.J.c(p1, p3, p2);
             p0.M.c(p1, p3, p2);
             p0.L.c(p1, p3, p2);
          }
          p0.P.c(p1, p3, p2);
       }
       return p3;
    }
    public static mq5 s(zg0 p0,vu2 p1){
       aq6 uoaq6;
       String str;
       j13 oj13;
       vu2 b = p1.b;
       mq5 omq5 = null;
       if (b.b().y("recentSearch:omit", false)) {
          return omq5;
       }
       p1 = p1.a;
       if ((uoaq6 = td7.d(p1)) == null || ((uoaq6 = uoaq6.b) != yp6.t || uoaq6 == yp6.b)) {
          return omq5;
       }
       mq5 omq51 = new mq5();
       omq51.c = p1;
       omq51.e = b.y().d();
       if ((str = b.b().q("searchHistorySubtitle")) == null) {
          str = b.y().m();
       }
       omq51.f = str;
       p0.getClass();
       omq51.b = Long.valueOf(System.currentTimeMillis());
       omq51.g = b.b().q("label");
       if ((oj13 = b.u().e()) != null) {
          omq51.d = oj13.a();
       }
       return omq51;
    }
    public static mq5 t(zg0 p0,vu2 p1){
       String str;
       j13 oj13;
       vu2 b = p1.b;
       if (b.b().y("recentSearch:omit", false)) {
          return null;
       }
       mq5 omq5 = new mq5();
       omq5.c = p1.a;
       omq5.e = b.y().d();
       if ((str = b.b().q("searchHistorySubtitle")) == null) {
          str = b.y().m();
       }
       omq5.f = str;
       p0.getClass();
       omq5.b = Long.valueOf(System.currentTimeMillis());
       omq5.g = b.b().q("label");
       if ((oj13 = b.u().e()) != null) {
          omq5.d = oj13.a();
       }
       return omq5;
    }
    public static Drawable u(CompoundButton p0){
       Field declaredFiel;
       Field a;
       if (Build$VERSION.SDK_INT >= 23) {
          return mn0.a(p0);
       }
       if (!w51.b) {
          boolean b = true;
          try{
             declaredFiel = CompoundButton.class.getDeclaredField("mButtonDrawable");
             w51.a = declaredFiel;
             declaredFiel.setAccessible(b);
             w51.b = e0;
          }catch(java.lang.NoSuchFieldException e0){
          }
       }
       if ((a = w51.a) != null) {
          try{
             return a.get(p0);
          }catch(java.lang.IllegalAccessException e0){
             w51.a = declaredFiel;
          }
          return declaredFiel;
       }else {
       }
    }
    public static File v(Context p0){
       co5.o(p0, "context");
       File databasePath = p0.getDatabasePath("androidx.work.workdb");
       co5.l(databasePath, "context.getDatabasePath\(WORK_DATABASE_NAME\)");
       return databasePath;
    }
    public static Object w(Collection p0){
       Iterator iterator = p0.iterator();
       iterator = (iterator.hasNext())? iterator.next(): null;
       return iterator;
    }
    public static final String x(Object p0){
       return Integer.toHexString(System.identityHashCode(p0));
    }
    public static Object y(d p0){
       Object obj;
       Iterator iterator = p0.iterator();
       if (iterator.hasNext()) {
          obj = iterator.next();
          if (iterator.hasNext()) {
             StringBuilder str = "expected one element but was: <"+obj;
             for (int i = 0; i < 4 && iterator.hasNext(); i = i + 1) {
                str = str.append(", ").append(iterator.next());
             }
             if (iterator.hasNext()) {
                str = str+", ...";
             }
             throw new IllegalArgumentException(str+'>');
          }
       }else {
          obj = null;
       }
       return obj;
    }
    public static TextView z(Toolbar p0,CharSequence p1){
       View childAt;
       int i = 0;
       while (true) {
          if (i >= p0.getChildCount()) {
             return null;
          }
          childAt = p0.getChildAt(i);
          if (childAt instanceof TextView && TextUtils.equals(childAt.getText(), p1)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return childAt;
    }
    public abstract fo2 B();
    public abstract Object E(ds1 p0,ds1 p1,ds1 p2,ds1 p3,ds1 p4,ds1 p5);
    public w51 H(byte[] p0){
       return this.I(p0, p0.length);
    }
    public abstract w51 I(byte[] p0,int p1);
    public abstract w51 J(char p0);
    public w51 K(CharSequence p0,Charset p1){
       return this.H(p0.toString().getBytes(p1));
    }
    public abstract ju2 L();
}
