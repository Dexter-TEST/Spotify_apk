package p.co5;
import p.c65;
import p.bx6;
import java.lang.String;
import p.vt5;
import p.lj1;
import p.lb;
import p.mb;
import p.fv1;
import p.ir2;
import p.mh2;
import p.ps3;
import java.lang.Object;
import java.util.HashSet;
import p.xe7;
import java.util.AbstractSet;
import p.uk;
import java.util.Set;
import java.lang.Class;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map$Entry;
import com.spotify.useraccount.v1.AccountAttribute;
import p.r4;
import p.fl5;
import java.lang.Enum;
import p.cd2;
import java.lang.IllegalStateException;
import p.xo5;
import java.util.AbstractMap;
import java.util.List;
import p.dj0;
import p.mm2;
import p.dr0;
import p.j80;
import com.spotify.player.esperanto.proto.EsRestrictions$Restrictions;
import p.dv;
import p.cv;
import p.qx5;
import p.bc3;
import com.google.common.collect.d;
import java.lang.RuntimeException;
import java.lang.StackTraceElement;
import java.lang.Throwable;
import java.util.Arrays;
import p.pl1;
import java.util.LinkedHashSet;
import android.view.inputmethod.EditorInfo;
import java.lang.CharSequence;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.os.BaseBundle;
import java.lang.StringBuilder;
import java.lang.Exception;
import p.au0;
import p.vh3;
import p.dx0;
import p.eb3;
import p.jc7;
import p.mc1;
import p.du0;
import p.iz7;
import p.xw0;
import java.lang.Runnable;
import p.m36;
import java.lang.VirtualMachineError;
import java.lang.ThreadDeath;
import java.lang.LinkageError;
import p.tp2;
import p.ic7;
import p.w00;
import p.mf1;
import p.l5;
import p.qt0;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import p.vy;
import p.ju2;
import p.uu2;
import p.p33;
import p.b2;
import android.view.View$OnClickListener;
import p.ec6;
import p.a14;
import java.lang.IllegalArgumentException;
import java.lang.NullPointerException;
import p.sc;
import java.lang.ArrayIndexOutOfBoundsException;
import com.spotify.player.esperanto.proto.EsProvidedTrack$ProvidedTrack;
import p.ur;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;
import p.lq5;
import p.nt0;
import p.m73;
import p.jp1;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.xf1;
import java.util.concurrent.TimeUnit;
import java.lang.Thread;
import p.je5;
import java.util.ArrayList;
import p.he5;
import p.de5;
import p.ee5;
import p.fe5;
import p.ye7;
import java.io.File;
import android.content.Context;
import p.sz1;
import p.v96;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Closeable;
import p.xj0;

public abstract class co5	// class@001249 from classes.dex
{
    public static final c65 a;
    public static final bx6 b;
    public static final String[] c;
    public static final vt5 d;
    public static final lj1 e;
    public static final lb f;
    public static final mb g;
    public static final mb h;
    public static final mb i;
    public static final fv1 j;
    public static final ir2 k;
    public static final ir2 l;
    public static final mh2 m;
    public static final ps3 n;
    public static final c65 o;
    public static final int[] p;

    static {
       co5.a = new c65(18);
       co5.b = new bx6("CLOSED");
       String[] stringArray = new String[0];
       co5.c = stringArray;
       co5.d = new vt5(4);
       co5.e = new lj1(1);
       co5.f = new lb(3);
       co5.g = new mb(9);
       co5.h = new mb(10);
       co5.i = new mb(12);
       co5.j = new fv1();
       co5.k = new ir2(13);
       co5.l = new ir2(12);
       co5.m = new mh2(0);
       co5.n = new ps3(0);
       co5.o = new c65(5);
       int[] ointArray = new int[]{0x7f03000e};
       co5.p = ointArray;
    }
    public void co5(){
       super();
    }
    public static final HashSet A(Object[] p0){
       HashSet hashSet = new HashSet(xe7.F(p0.length));
       uk.s0(hashSet, p0);
       return hashSet;
    }
    public static Set B(Set p0){
       p0.getClass();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().getClass();
       }
       return Collections.unmodifiableSet(new HashSet(p0));
    }
    public static LinkedHashMap C(Map p0){
       int i;
       Map$Entry uEntry;
       String str;
       int i2;
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p0.entrySet().iterator();
       while (true) {
          i = 1;
          if (iterator.hasNext()) {
             uEntry = iterator.next();
             if (uEntry.getValue().j() != r4.t) {
                i = 0;
             }
             if (!i) {
                linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
             }
          }else {
             break ;
          }
       }
       LinkedHashMap linkedHashMa1 = new LinkedHashMap(xe7.F(linkedHashMa.size()));
       Iterator iterator1 = linkedHashMa.entrySet().iterator();
       while (true) {
          if (!iterator1.hasNext()) {
             return linkedHashMa1;
          }
          uEntry = iterator1.next();
          Object key = uEntry.getKey();
          AccountAttribute value = uEntry.getValue();
          co5.o(value, "<this>");
          r4 or4 = value.j();
          int i1 = -1;
          or4 = (or4 == null)? -1: fl5.a[or4.ordinal()];
          if (or4 != i1) {
             if (or4 != i) {
                if (or4 != 2) {
                   if (or4 != 3) {
                      if (or4 != 4) {
                         break ;
                      }else {
                         throw new IllegalStateException("value not set".toString());
                      }
                   }else {
                      str = value.i().toString();
                   }
                }else {
                   str = String.valueOf(value.h());
                }
             }else if(value.f()){
                str = "1";
             }else {
                str = "0";
             }
             linkedHashMa1.put(key, str);
          }else {
             throw new IllegalStateException("valuecase is null".toString());
          }
       }
       throw new cd2(10);
    }
    public static xo5 D(xo5 p0,xo5 p1){
       mm2 "configurationAssignmentId";
       co5.o(p0, "fetchedConfig");
       co5.o(p1, "overriddenConfig");
       xo5 b = p0.b;
       co5.o(b, "<this>");
       p1 = p1.b;
       co5.o(p1, "map");
       LinkedHashMap linkedHashMa = new LinkedHashMap(b);
       linkedHashMa.putAll(p1);
       p0 = p0.a;
       mm2 a = p0.a;
       co5.o(a, "configurationAssignmentId");
       "configurationAssignmentId" = new mm2(a, p0.b, dj0.B0(linkedHashMa.values()), p0.d);
       return dr0.c("configurationAssignmentId");
    }
    public static final int E(j80 p0,int p1){
       co5.o(p0, "<this>");
       if (p1 == -1234567890) {
          return p0.d();
       }
       return p1;
    }
    public static final dv F(EsRestrictions$Restrictions p0){
       cv uocv = qx5.a();
       bc3 uobc3 = p0.G();
       co5.l(uobc3, "restrictions.disallowPausingReasonsList");
       uocv.a = d.o(dj0.F0(uobc3));
       uobc3 = p0.O();
       co5.l(uobc3, "restrictions.disallowResumingReasonsList");
       uocv.b = d.o(dj0.F0(uobc3));
       uobc3 = p0.P();
       co5.l(uobc3, "restrictions.disallowSeekingReasonsList");
       uocv.c = d.o(dj0.F0(uobc3));
       uobc3 = p0.I();
       co5.l(uobc3, "restrictions.disallowPeekingPrevReasonsList");
       uocv.d = d.o(dj0.F0(uobc3));
       uobc3 = p0.H();
       co5.l(uobc3, "restrictions.disallowPeekingNextReasonsList");
       uocv.e = d.o(dj0.F0(uobc3));
       uobc3 = p0.S();
       co5.l(uobc3, "restrictions.disallowSkippingPrevReasonsList");
       uocv.f = d.o(dj0.F0(uobc3));
       uobc3 = p0.R();
       co5.l(uobc3, "restrictions.disallowSkippingNextReasonsList");
       uocv.g = d.o(dj0.F0(uobc3));
       uobc3 = p0.T();
       co5.l(uobc3, "restrictions.disallowTog…gRepeatContextReasonsList");
       uocv.h = d.o(dj0.F0(uobc3));
       uobc3 = p0.U();
       co5.l(uobc3, "restrictions.disallowTog…ingRepeatTrackReasonsList");
       uocv.i = d.o(dj0.F0(uobc3));
       uobc3 = p0.V();
       co5.l(uobc3, "restrictions.disallowTogglingShuffleReasonsList");
       uocv.j = d.o(dj0.F0(uobc3));
       uobc3 = p0.Q();
       co5.l(uobc3, "restrictions.disallowSetQueueReasonsList");
       uocv.k = d.o(dj0.F0(uobc3));
       uobc3 = p0.C();
       co5.l(uobc3, "restrictions.disallowAddToQueueReasonsList");
       uocv.l = d.o(dj0.F0(uobc3));
       uobc3 = p0.F();
       co5.l(uobc3, "restrictions.disallowInt…uptingPlaybackReasonsList");
       uocv.m = d.o(dj0.F0(uobc3));
       uobc3 = p0.W();
       co5.l(uobc3, "restrictions.disallowTra…erringPlaybackReasonsList");
       uocv.n = d.o(dj0.F0(uobc3));
       uobc3 = p0.J();
       co5.l(uobc3, "restrictions.disallowRemoteControlReasonsList");
       uocv.o = d.o(dj0.F0(uobc3));
       uobc3 = p0.E();
       co5.l(uobc3, "restrictions.disallowIns…IntoNextTracksReasonsList");
       uocv.p = d.o(dj0.F0(uobc3));
       uobc3 = p0.D();
       co5.l(uobc3, "restrictions.disallowIns…oContextTracksReasonsList");
       uocv.q = d.o(dj0.F0(uobc3));
       uobc3 = p0.N();
       co5.l(uobc3, "restrictions.disallowReo…ngInNextTracksReasonsList");
       uocv.r = d.o(dj0.F0(uobc3));
       uobc3 = p0.M();
       co5.l(uobc3, "restrictions.disallowReo…nContextTracksReasonsList");
       uocv.s = d.o(dj0.F0(uobc3));
       uobc3 = p0.L();
       co5.l(uobc3, "restrictions.disallowRem…FromNextTracksReasonsList");
       uocv.t = d.o(dj0.F0(uobc3));
       uobc3 = p0.K();
       co5.l(uobc3, "restrictions.disallowRem…mContextTracksReasonsList");
       uocv.u = d.o(dj0.F0(uobc3));
       bc3 uobc31 = p0.X();
       co5.l(uobc31, "restrictions.disallowUpdatingContextReasonsList");
       uocv.v = d.o(dj0.F0(uobc31));
       return uocv.a();
    }
    public static void G(String p0,RuntimeException p1){
       StackTraceElement[] stackTrace = p1.getStackTrace();
       int len = stackTrace.length;
       int i = -1;
       int i1 = 0;
       while (i1 < len) {
          if (p0.equals(stackTrace[i1].getClassName())) {
             i = i1;
          }
          i1 = i1 + 1;
       }
       p1.setStackTrace(Arrays.copyOfRange(stackTrace, (i + 1), len));
       return;
    }
    public static final Set H(Object p0){
       p0 = Collections.singleton(p0);
       co5.l(p0, "singleton\(element\)");
       return p0;
    }
    public static final Set I(Object[] p0){
       int len;
       pl1 a = pl1.a;
       if (p0.length > 0 && (len = p0.length)) {
          if (len != 1) {
             a = new LinkedHashSet(xe7.F(p0.length));
             uk.s0(a, p0);
          }else {
             a = co5.H(p0[0]);
          }
       }
       return a;
    }
    public static void J(EditorInfo p0,CharSequence p1,int p2,int p3){
       if (p0.extras == null) {
          p0.extras = new Bundle();
       }
       SpannableStringBuilder spannableStr = (p1 != null)? new SpannableStringBuilder(p1): null;
       p0.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStr);
       p0.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", p2);
       p0.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", p3);
       return;
    }
    public static String K(Object p0,String p1){
       return p1+p0;
    }
    public static final Object L(Exception p0,au0 p1){
       vh3 ovh3;
       if (p1 instanceof vh3) {
          ovh3 = p1;
          vh3 v = ovh3.v;
          int i = Integer.MIN_VALUE;
          if ((v & i)) {
             ovh3.v = v - i;
          label_0018 :
             vh3 t = ovh3.t;
             dx0 a = dx0.a;
             vh3 v1 = ovh3.v;
             int i1 = 1;
             if (v1 != null) {
                if (v1 == i1) {
                   eb3.G(t);
                   return jc7.a;
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                eb3.G(t);
                ovh3.getClass();
                ovh3.v = i1;
                du0 b = ovh3.b;
                co5.i(b);
                mc1.a.g0(b, new iz7(ovh3, 27, p0));
                return a;
             }
          }
       }
       ovh3 = new vh3(p1);
       goto label_0018 ;
    }
    public static void M(Throwable p0){
       if (p0 instanceof VirtualMachineError) {
          throw p0;
       }
       if (p0 instanceof ThreadDeath) {
          throw p0;
       }
       if (!p0 instanceof LinkageError) {
          return;
       }
       throw p0;
    }
    public static void N(String p0){
       ic7 oic7 = new ic7(tp2.m("lateinit property ", p0, " has not been initialized"));
       co5.G(co5.class.getName(), oic7);
       throw oic7;
    }
    public static mf1 O(w00 p0){
       return new mf1(14, p0);
    }
    public static final void a(l5 p0,qt0 p1){
       if (p0.getVisibility()) {
          p0.setVisibility(0);
          AlphaAnimation uAlphaAnimat = new AlphaAnimation(0, 0x3f800000);
          uAlphaAnimat.setDuration(1000);
          uAlphaAnimat.setFillAfter(true);
          uAlphaAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
          p0.startAnimation(uAlphaAnimat);
          p1.invoke();
       }
       return;
    }
    public static int b(vy p0,boolean p1){
       vy c = (p1)? p0.c: p0.b;
       vy b = (p1)? p0.b: p0.c;
       p0 = p0.d;
       int i = 0;
       int i1 = 0;
       while (i < c) {
          int i2 = -1;
          int i3 = 0;
          int i4 = 0;
          while (i3 < b) {
             byte b1 = (p1)? p0[i][i3]: p0[i3][i];
             if (b1 == i2) {
                i4 = i4 + 1;
             }else if(i4 >= 5){
                i4 = i4 - 5;
                i4 = i4 + 3;
                i1 = i1 + i4;
             }
             i2 = b1;
             i4 = 1;
             i3 = i3 + 1;
          }
          if (i4 >= 5) {
             i4 = i4 - 5;
             i4 = i4 + 3;
             i4 = i4 + i1;
             i1 = i4;
          }
          i = i + 1;
       }
       return i1;
    }
    public static boolean c(Object p0,Object p1){
       boolean b;
       if (p0 == null) {
          b = (p1 == null)? true: false;
       }else {
          b = p0.equals(p1);
       }
       return b;
    }
    public static final boolean d(int p0,int p1,int p2,byte[] p3,byte[] p4){
       co5.o(p3, "a");
       co5.o(p4, "b");
       int i = 0;
       while (true) {
          if (i >= p2) {
             return true;
          }
          int i1 = i + p0;
          int i2 = i + p1;
          if (p3[i1] != p4[i2]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static void e(View p0,ju2 p1,uu2 p2){
       int i;
       boolean b = false;
       b2 uob2 = (p1.D() == null && !p1.m().containsKey("click"))? 0: 1;
       uob2 = (i)? new b2(p1, p2, 2): null;
       p0.setOnClickListener(uob2);
       if (p1.D() != null || p1.m().containsKey("click")) {
          b = true;
       }
       p0.setClickable(b);
       p0.setFocusable(b);
       return;
    }
    public static final ec6 f(ec6 p0){
       ec6 a = p0.a;
       a.b();
       a.C = true;
       return p0;
    }
    public static void g(boolean p0){
       if (p0) {
          return;
       }
       throw new IllegalArgumentException();
    }
    public static void h(Object p0,String p1){
       if (p0 != null) {
          return;
       }
       p0 = new IllegalStateException(p1.concat(" must not be null"));
       co5.G(co5.class.getName(), p0);
       throw p0;
    }
    public static void i(Object p0){
       if (p0 != null) {
          return;
       }
       p0 = new NullPointerException();
       co5.G(co5.class.getName(), p0);
       throw p0;
    }
    public static void j(Object p0,String p1){
       if (p0 != null) {
          return;
       }
       p0 = new NullPointerException(p1);
       co5.G(co5.class.getName(), p0);
       throw p0;
    }
    public static void k(sc p0,Class p1,String p2){
       if (p0 != null) {
          return;
       }
       String str = "%s";
       if (!p2.contains(str)) {
          throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
       }
       if (p2.indexOf(str) == p2.lastIndexOf(str)) {
          throw new NullPointerException(p2.replace(str, p1.getCanonicalName()));
       }
       throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
    }
    public static void l(Object p0,String p1){
       if (p0 != null) {
          return;
       }
       p0 = new NullPointerException(p1.concat(" must not be null"));
       co5.G(co5.class.getName(), p0);
       throw p0;
    }
    public static void m(Object p0){
       if (p0 != null) {
          return;
       }
       throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
    public static void n(Object p0){
       if (p0 != null) {
          return;
       }
       throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    public static void o(Object p0,String p1){
       if (p0 != null) {
          return;
       }
       p0 = new NullPointerException(co5.v(p1));
       co5.G(co5.class.getName(), p0);
       throw p0;
    }
    public static final void p(long p0,long p1,long p2){
       if (((p1 | p2)) >= 0 && ((p1 - p0) <= 0 && ((p0 - p1) - p2) >= 0)) {
          return;
       }
       throw new ArrayIndexOutOfBoundsException("size="+p0+" offset="+p1+" byteCount="+p2);
    }
    public static void q(Object p0,String p1){
       if (p0 != null) {
          return;
       }
       p0 = new IllegalArgumentException(co5.v(p1));
       co5.G(co5.class.getName(), p0);
       throw p0;
    }
    public static int r(int p0,int p1){
       if (p0 < p1) {
          p0 = -1;
       }else if(p0 == p1){
          p0 = 0;
       }else {
          p0 = 1;
       }
       return p0;
    }
    public static final ur s(EsProvidedTrack$ProvidedTrack p0){
       String str1;
       co5.o(p0, "protoTrack");
       EsContextTrack$ContextTrack uContextTrac = p0.f();
       co5.l(uContextTrac, "protoTrack.contextTrack");
       lq5 olq5 = nt0.a(uContextTrac.m());
       String str = ((str = uContextTrac.l()) != null && str.length())? 0: 1;
       if (!str) {
          olq5.l(uContextTrac.l());
       }
       if (uContextTrac.j() > 0) {
          olq5.t = m73.b(uContextTrac.k());
       }
       olq5 = new lq5(olq5.e());
       if ((str1 = p0.h()) != null) {
          olq5.v = str1;
          return olq5.e();
       }else {
          throw new NullPointerException("Null provider");
       }
    }
    public static final EsContextTrack$ContextTrack t(nt0 p0){
       ur a;
       ur c;
       co5.o(p0, "track");
       ur our = EsContextTrack$ContextTrack.n();
       int i = 1;
       int i1 = ((a = p0.a) != null && a.length())? 0: 1;
       if (!i1) {
          our.e(a);
       }
       i1 = ((a = p0.b) != null && a.length())? 0: 1;
       if (!i1) {
          our.d(a);
       }
       if ((c = p0.c) != null && !c.isEmpty()) {
          i = 0;
       }
       if (!i) {
          our.c(c);
       }
       c uoc = our.build();
       co5.l(uoc, "newBuilder\(\).apply {\n   …)\n        }\n    }.build\(\)");
       return uoc;
    }
    public static final long u(long p0,xf1 p1,xf1 p2){
       co5.o(p1, "sourceUnit");
       co5.o(p2, "targetUnit");
       return p2.a.convert(p0, p1.a);
    }
    public static String v(String p0){
       StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
       String name = co5.class.getName();
       int i = 0;
       while (!stackTrace[i].getClassName().equals(name)) {
          i = i + 1;
       }
       while (stackTrace[i].getClassName().equals(name)) {
          i = i + 1;
       }
       object oobject = stackTrace[i];
       name = oobject.getClassName();
       StringBuilder str = "Parameter specified as non-null is null: method "+name;
       return str+"."+oobject.getMethodName()+", parameter "+p0;
    }
    public static final ArrayList w(List p0,je5 p1){
       co5.o(p0, "<this>");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (true) {
          int i = 1;
          if (iterator.hasNext()) {
             Object obj = iterator.next();
             Object obj1 = obj;
             if (p1 != null && obj1 instanceof de5) {
                i = obj1.w.contains(p1.b);
             }
             if (i) {
                uArrayList.add(obj);
             }
          }else {
             break ;
          }
       }
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator1 = uArrayList.iterator();
       int i1 = 0;
       while (true) {
          if (!iterator1.hasNext()) {
             return uArrayList1;
          }
          Object obj2 = iterator1.next();
          int i2 = i1 + 1;
          if (i1 >= 0) {
             Object obj3 = obj2;
             i1 = (obj3 instanceof ee5 && (!dj0.m0(i2, uArrayList) instanceof de5 || (obj3 instanceof fe5 && !(i1 = i1 - 1))))? 0: 1;
             if (i1) {
                uArrayList1.add(obj2);
             }
             i1 = i2;
          }else {
             break ;
          }
       }
       ye7.W();
       throw null;
    }
    public static final File x(){
       File uFile = new File(sz1.a().getFilesDir(), "facebook_ml/");
       if (!uFile.exists() && !uFile.mkdirs()) {
          uFile = null;
       }
       return uFile;
    }
    public static final v96 y(Object p0){
       if (p0 != co5.b) {
          return p0;
       }
       throw new IllegalStateException("Does not contain segment".toString());
    }
    public static void z(File p0,InputStream p1){
       int i;
       byte[] uobyteArray = new byte[8192];
       GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(new FileOutputStream(p0));
       while ((i = p1.read(uobyteArray)) > 0) {
          gZIPOutputSt.write(uobyteArray, 0, i);
       }
       gZIPOutputSt.finish();
       xj0.m(gZIPOutputSt);
       return;
    }
}
