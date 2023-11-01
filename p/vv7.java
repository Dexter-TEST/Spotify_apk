package p.vv7;
import p.w54;
import p.lu2;
import p.c65;
import p.ps3;
import java.lang.String;
import p.ez2;
import java.lang.Object;
import p.ou2;
import java.util.ArrayList;
import java.lang.Class;
import p.mu2;
import java.util.List;
import java.util.Collection;
import p.tt2;
import p.st2;
import p.ty0;
import java.io.Serializable;
import p.n13;
import android.animation.Animator;
import p.wf2;
import p.zw3;
import android.animation.Animator$AnimatorListener;
import java.lang.Boolean;
import p.xw0;
import p.co5;
import p.il1;
import p.bo6;
import p.ng2;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.IllegalStateException;
import p.kg4;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.xy5;
import p.zy5;
import android.database.Cursor;
import p.tw6;
import android.os.CancellationSignal;
import android.database.AbstractWindowedCursor;
import android.database.AbstractCursor;
import android.database.CursorWindow;
import android.os.Build$VERSION;
import android.database.MatrixCursor;
import java.lang.Double;
import java.lang.Long;
import java.io.Closeable;
import p.eb3;
import java.nio.MappedByteBuffer;
import p.f94;
import java.nio.ByteBuffer;
import p.u44;
import java.nio.Buffer;
import java.nio.ByteOrder;
import p.oz6;
import java.io.IOException;
import java.util.Set;
import p.gs5;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Iterable;
import p.ri2;
import java.lang.Number;
import android.widget.TextView;
import p.is7;
import p.b37;
import android.text.TextPaint;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.Paint;
import p.u27;
import java.lang.Math;
import android.view.View;
import android.content.Context;
import p.sz1;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import p.fs3;
import p.ns3;
import p.jx1;
import p.vt;
import p.aq6;
import p.r45;
import java.lang.CharSequence;
import p.av6;
import java.net.InetAddress;
import p.e70;
import p.we7;
import java.lang.AssertionError;
import java.lang.StringBuilder;
import java.net.IDN;
import java.util.Locale;
import java.io.File;
import p.w32;
import p.ll1;
import p.aj0;
import java.util.Collections;
import p.dj0;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map$Entry;
import p.ml1;
import android.view.ActionMode$Callback;
import p.c37;
import p.au0;
import p.zb7;
import p.ex0;
import p.ac7;
import p.ww0;
import p.vw0;
import p.hc1;
import p.t65;
import java.lang.ThreadLocal;
import p.a28;
import p.j07;
import java.lang.NullPointerException;
import p.w07;
import p.o07;
import java.util.concurrent.Executor;
import p.n25;
import p.f25;
import p.q15;
import java.lang.IllegalArgumentException;
import p.tp2;
import p.v95;
import p.ib3;
import p.gb3;
import com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import p.uj0;
import p.gr1;
import p.vj0;
import java.lang.Enum;
import p.tj0;
import p.sj0;
import p.ej4;
import java.lang.System;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IndexOutOfBoundsException;
import p.ij1;
import p.b7;
import android.content.pm.PackageManager;
import p.gg1;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ApplicationInfo;
import p.ob2;
import java.lang.Float;
import java.lang.RuntimeException;
import android.graphics.Path;
import p.en6;
import java.util.Arrays;
import p.nf2;
import p.hl3;
import p.ye7;
import p.gl3;
import java.util.HashSet;
import java.lang.Character;
import p.ks5;
import p.zu6;
import p.oe0;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import android.util.Base64;
import p.ny1;
import p.lw3;
import p.zh5;
import android.text.PrecomputedText$Params;
import p.kb3;
import p.x27;
import android.text.method.TransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.TextDirectionHeuristics;
import p.v27;
import android.icu.text.DecimalFormatSymbols;
import p.y27;
import android.text.TextDirectionHeuristic;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import p.t91;
import p.he3;
import p.el;

public abstract class vv7 implements w54	// class@002a75 from classes.dex
{
    public static t67 a;
    public static boolean b;
    public static boolean c;
    public static final lu2 t;
    public static final int[] v;
    public static final c65 w;
    public static final c65 x;
    public static final ps3 y;

    static {
       vv7.t = new lu2();
       vv7.v = new int[2]{0x7f0304ec,0x7f0304ed};
       vv7.w = new c65(11);
       vv7.x = new c65(14);
       vv7.y = new ps3(19);
    }
    public static ez2 A(String p0){
       if (p0 != null) {
       }else {
          p0 = "";
       }
       int i = -1;
       switch (p0.hashCode()){
           case 0x82e0976d:
             if (p0.equals("rippleSquare")) {
                i = 0;
             }
             break;
           case 0xa6b5069f:
             if (p0.equals("circular")) {
                i = 1;
             }
             break;
           case 0x22d2f0ef:
             if (p0.equals("rippleCircular")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return ez2.v;
           case 1:
             return ez2.c;
           case 2:
             return ez2.t;
           default:
             return ez2.b;
       }
    }
    public static ou2 B(ou2[] p0){
       int i2;
       int len = p0.length;
       lu2 t = vv7.t;
       if (!len) {
          return t;
       }
       if (len == 1) {
          return p0[0];
       }
       ArrayList uArrayList = new ArrayList(p0.length);
       int len1 = p0.length;
       int i = 0;
       while (i < len1) {
          object oobject = p0[i];
          oobject.getClass();
          if (oobject instanceof mu2) {
             mu2 a = oobject.a;
             int i1 = a.size() + uArrayList.size();
             i1 = i1 - 1;
             uArrayList.ensureCapacity(i1);
             uArrayList.addAll(a);
          }else if(oobject != t){
             uArrayList.add(oobject);
          }
          i = i + 1;
       }
       if (!(i2 = uArrayList.size())) {
          return t;
       }
       if (i2 != 1) {
          return new mu2(uArrayList);
       }
       return uArrayList.get(0);
    }
    public static tt2 C(String p0){
       return ty0.j().d("navigate").a("uri", p0).b();
    }
    public static final void D(Animator p0,wf2 p1){
       p0.addListener(new zw3(p1, 0));
    }
    public static final void E(Animator p0,wf2 p1){
       p0.addListener(new zw3(p1, 1));
    }
    public static tt2 F(String p0,String p1,boolean p2,String p3){
       st2 ost2 = ty0.j().d("playFromContext").a("uri", p0);
       if (p2) {
          ost2 = ost2.a("mobile_on_demand", Boolean.TRUE);
       }
       if (p1 != null) {
          ost2 = ost2.a("offline_uri", p1);
       }
       if (p3 != null) {
          ost2 = ost2.a("uid", p3);
       }
       return ost2.b();
    }
    public static xw0 G(xw0 p0,xw0 p1){
       co5.o(p1, "context");
       if (p1 == il1.a) {
       }else {
          p0 = p1.J(p0, bo6.v);
       }
       return p0;
    }
    public static void H(AtomicLong p0,long p1){
       while (true) {
          long l = p0.get();
          if (!(l - Long.MAX_VALUE)) {
             return;
          }
          long l1 = l - p1;
          int i = 0;
          if ((l1 - i) < 0) {
             RxJavaPlugins.c(new IllegalStateException(kg4.k("More produced than requested: ", l1)));
             l1 = i;
          }
          if (p0.compareAndSet(l, l1)) {
             break ;
          }
       }
       return;
    }
    public static long I(AtomicLong p0,long p1){
       long l1;
       while (true) {
          long l = p0.get();
          l1 = Long.MIN_VALUE;
          if (!(l - l1)) {
             return l1;
          }
          l1 = Long.MAX_VALUE;
          if (!(l - l1)) {
             return l1;
          }
          l1 = l - p1;
          int i = 0;
          if ((l1 - i) < 0) {
             RxJavaPlugins.c(new IllegalStateException(kg4.k("More produced than requested: ", l1)));
             l1 = i;
          }
          if (p0.compareAndSet(l, l1)) {
             break ;
          }
       }
       return l1;
    }
    public static final Cursor J(xy5 p0,zy5 p1,boolean p2){
       int type;
       co5.o(p0, "db");
       co5.o(p1, "sqLiteQuery");
       Cursor uCursor = p0.o(p1, null);
       if (p2 && uCursor instanceof AbstractWindowedCursor) {
          Cursor uCursor1 = uCursor;
          int count = uCursor1.getCount();
          int numRows = (uCursor1.hasWindow())? uCursor1.getWindow().getNumRows(): count;
          if (Build$VERSION.SDK_INT < 23 || numRows < count) {
             co5.o(uCursor, "c");
             MatrixCursor matrixCursor = new MatrixCursor(uCursor.getColumnNames(), uCursor.getCount());
             while (true) {
                if (uCursor.moveToNext()) {
                   Object[] objArray = new Object[uCursor.getColumnCount()];
                   int columnCount = uCursor.getColumnCount();
                   int i = 0;
                   while (true) {
                      if (i < columnCount) {
                         if (type = uCursor.getType(i)) {
                            if (type != 1) {
                               if (type != 2) {
                                  if (type != 3) {
                                     if (type == 4) {
                                        objArray[i] = uCursor.getBlob(i);
                                     }else {
                                        break ;
                                     }
                                  }else {
                                     objArray[i] = uCursor.getString(i);
                                  }
                               }else {
                                  objArray[i] = Double.valueOf(uCursor.getDouble(i));
                               }
                            }else {
                               objArray[i] = Long.valueOf(uCursor.getLong(i));
                            }
                         }else {
                            objArray[i] = null;
                         }
                         i = i + 1;
                      }else {
                         matrixCursor.addRow(objArray);
                      }
                   }
                   throw new IllegalStateException();
                }else {
                   eb3.d(uCursor, null);
                   return matrixCursor;
                }
             }
          }
       }
       return uCursor;
    }
    public static f94 K(MappedByteBuffer p0){
       int i1;
       long l;
       ByteBuffer uByteBuffer = p0.duplicate();
       u44 ou44 = new u44(uByteBuffer);
       int i = 4;
       ou44.I(i);
       if ((i1 = uByteBuffer.getShort() & 0xffff) > 100) {
          throw new IOException("Cannot read metadata.");
       }
       ou44.I(6);
       int i2 = 0;
       int i3 = 0;
       while (true) {
          u44 b = ou44.b;
          int i4 = -1;
          if (i3 < i1) {
             ou44.I(i);
             l = ou44.H();
             ou44.I(i);
             if (0x6d657461 == b.getInt()) {
             label_0042 :
                if (l - i4) {
                   ou44.I((int)(l - (long)uByteBuffer.position()));
                   ou44.I(12);
                   long l1 = ou44.H();
                   while (((long)i2 - l1) < 0) {
                      i3 = b.getInt();
                      long l2 = ou44.H();
                      ou44.H();
                      if (0x456d6a69 != i3 && 0x656d6a69 != i3) {
                         i2 = i2 + 1;
                      }else {
                         uByteBuffer.position((int)(l2 + l));
                         f94 uof94 = new f94();
                         uByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                         uof94.b(uByteBuffer, (uByteBuffer.position() + uByteBuffer.getInt(uByteBuffer.position())));
                         return uof94;
                      }
                   }
                }
                break ;
             }else {
                i3 = i3 + 1;
             }
          }else {
             l = i4;
             goto label_0042 ;
          }
       }
       throw new IOException("Cannot read metadata.");
    }
    public static final gs5 L(Set p0){
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       HashMap hashMap2 = new HashMap();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ri2 ori2 = iterator.next();
          ri2 c = ori2.c;
          ri2 a = ori2.a;
          if (c != null) {
             hashMap.put(a, Long.valueOf(c.longValue()));
          }
          if ((c = ori2.d) != null) {
             hashMap1.put(a, Long.valueOf(c.longValue()));
          }
          if ((ori2 = ori2.b) != null) {
             hashMap2.put(a, ori2);
          }
       }
       return new gs5(hashMap, hashMap1, hashMap2);
    }
    public static void M(TextView p0,int p1){
       is7.g(p1);
       if (Build$VERSION.SDK_INT >= 28) {
          b37.c(p0, p1);
          return;
       }else {
          Paint$FontMetricsInt fontMetricsI = p0.getPaint().getFontMetricsInt();
          fontMetricsI = (u27.a(p0))? fontMetricsI.top: fontMetricsI.ascent;
          if (p1 > Math.abs(fontMetricsI)) {
             p0.setPadding(p0.getPaddingLeft(), (p1 + fontMetricsI), p0.getPaddingRight(), p0.getPaddingBottom());
          }
          return;
       }
    }
    public static void N(TextView p0,int p1){
       is7.g(p1);
       Paint$FontMetricsInt fontMetricsI = p0.getPaint().getFontMetricsInt();
       fontMetricsI = (u27.a(p0))? fontMetricsI.bottom: fontMetricsI.descent;
       if (p1 > Math.abs(fontMetricsI)) {
          p0.setPadding(p0.getPaddingLeft(), p0.getPaddingTop(), p0.getPaddingRight(), (p1 - fontMetricsI));
       }
       return;
    }
    public static void O(TextView p0,int p1){
       is7.g(p1);
       int fontMetricsI = p0.getPaint().getFontMetricsInt(null);
       if (p1 != fontMetricsI) {
          p0.setLineSpacing((float)(p1 - fontMetricsI), 0x3f800000);
       }
       return;
    }
    public static void P(HashMap p0){
       SharedPreferences sharedPrefer;
       if ((sharedPrefer = sz1.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0)) == null) {
          return;
       }
       String str = "dataset_id";
       Object obj = p0.get(str);
       Object obj1 = p0.get("endpoint");
       p0 = p0.get("access_key");
       if (obj != null && (obj1 != null && p0 != null)) {
          SharedPreferences$Editor uEditor = sharedPrefer.edit();
          uEditor.putString(str, obj.toString());
          uEditor.putString("endpoint", obj1.toString());
          uEditor.putString("access_key", p0.toString());
          uEditor.apply();
          sz1.i(ns3.t);
       }
       return;
    }
    public static void Q(TextView p0,int p1){
       if (Build$VERSION.SDK_INT >= 23) {
          jx1.A(p0, p1);
       }else {
          p0.setTextAppearance(p0.getContext(), p1);
       }
       return;
    }
    public static tt2 R(vt p0){
       return vv7.F(p0.a.toString(), null, p0.g.e(Boolean.FALSE).booleanValue(), null);
    }
    public static final String S(String p0){
       int i2;
       int i4;
       int i5;
       co5.o(p0, "<this>");
       boolean b = false;
       String str = null;
       int i = -1;
       int i1 = 1;
       if (av6.f0(p0, ":")) {
          InetAddress inetAddress = (av6.D0(p0, "[", b) && av6.g0(p0, "]", b))? vv7.m(p0, i1, (p0.length() - i1)): vv7.m(p0, b, p0.length());
          if (inetAddress == null) {
             return str;
          }else {
             byte[] address = inetAddress.getAddress();
             i2 = 4;
             if (address.length == 16) {
                int i3 = 0;
                i4 = 0;
                while (i3 < address.length) {
                   i1 = i3;
                   while (i1 < 16 && (!address[i1] && !(i5 = i1 + 1))) {
                      i1 = i1 + 2;
                   }
                   if ((i5 = i1 - i3) > i4 && i5 >= i2) {
                      i = i3;
                      i4 = i5;
                   }
                   i3 = i1 + 2;
                }
                e70 uoe70 = new e70();
                while (b < address.length) {
                   i1 = 58;
                   if (b == i) {
                      uoe70.v0(i1);
                      if ((b = b + i4) == 16) {
                         uoe70.v0(i1);
                      }
                   }else if(b > 0){
                      uoe70.v0(i1);
                   }
                   i1 = address[b] & 0x00ff;
                   i1 = i1 << 8;
                   i2 = b + 1;
                   i2 = address[i2] & 0x00ff;
                   i1 = i1 | i2;
                   uoe70.x0((long)i1);
                   b = b + 2;
                }
                return uoe70.q0();
             }else if(address.length == i2){
                return inetAddress.getHostAddress();
             }else {
                throw new AssertionError("Invalid IPv6 address: \'"+p0+''');
             }
          }
       }else {
          try{
             p0 = IDN.toASCII(p0);
             co5.l(p0, "toASCII\(host\)");
             Locale uS = Locale.US;
             co5.l(uS, "US");
             p0 = p0.toLowerCase(uS);
             co5.l(p0, "this as java.lang.String\).toLowerCase\(locale\)");
             uS = (!p0.length())? 1: 0;
             if (uS) {
                return str;
             }else {
                i4 = p0.length();
                i2 = 0;
                while (i2 < i4) {
                   int i6 = i2 + 1;
                   char c = p0.charAt(i2);
                   if (co5.r(c, 31) > 0 && (co5.r(c, 127) < 0 && av6.m0(" #%/:?@[\\]", c, b, b, 6) == i)) {
                      i2 = i6;
                   }else {
                      b = true;
                      break ;
                   }
                }
                if (!b) {
                   str = p0;
                }
                return str;
             }
          }catch(java.lang.IllegalArgumentException e0){
          }
       }
    }
    public static final w32 T(File p0){
       ll1 a;
       co5.o(p0, "<this>");
       String path = p0.getPath();
       co5.l(path, "path");
       int i = vv7.w(path);
       int i1 = 0;
       String str = path.substring(i1, i);
       co5.l(str, "this as java.lang.String…ing\(startIndex, endIndex\)");
       path = path.substring(i);
       co5.l(path, "this as java.lang.String\).substring\(startIndex\)");
       int i2 = 1;
       i = (!path.length())? 1: 0;
       if (i) {
          a = ll1.a;
       }else {
          char[] uocharArray = new char[i2];
          uocharArray[i1] = File.separatorChar;
          List list = av6.A0(path, uocharArray);
          ArrayList uArrayList = new ArrayList(aj0.b0(list));
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(new File(iterator.next()));
          }
          a = uArrayList;
       }
       return new w32(new File(str), a);
    }
    public static final List U(List p0){
       int i;
       if (i = p0.size()) {
          p0 = (i != 1)? Collections.unmodifiableList(new ArrayList(p0)): Collections.singletonList(dj0.k0(p0));
       }else {
          ll1 a = ll1.a;
       }
       return p0;
    }
    public static final Map V(Map p0){
       int i;
       if (i = p0.size()) {
          if (i != 1) {
             p0 = Collections.unmodifiableMap(new LinkedHashMap(p0));
          }else {
             Map$Entry uEntry = dj0.j0(p0.entrySet());
             Object key = uEntry.getKey();
             uEntry = Collections.singletonMap(key, uEntry.getValue());
          }
       }else {
          ml1 a = ml1.a;
       }
       return p0;
    }
    public static ActionMode$Callback W(ActionMode$Callback p0){
       c37 a;
       if (p0 instanceof c37 && Build$VERSION.SDK_INT >= 26) {
          a = p0.a;
       }
       return a;
    }
    public static final zb7 X(au0 p0,xw0 p1,Object p2){
       ex0 uoex0;
       zb7 ozb7 = null;
       if (!p0 instanceof ex0) {
          return ozb7;
       }
       int i = (p1.f(ac7.a) != null)? 1: 0;
       if (!i) {
          return ozb7;
       }else {
          while (true) {
             if (!p0 instanceof hc1 && (uoex0 = p0.a()) != null) {
                if (uoex0 instanceof zb7) {
                   ozb7 = uoex0;
                }
             }
             if (ozb7 != null) {
                ozb7.t.set(new t65(p1, p2));
                break ;
             }
             break ;
          }
          return ozb7;
       }
    }
    public static a28 Y(List p0){
       if (p0 == null || p0.isEmpty()) {
          return vv7.t(null);
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
             }
             continue ;
          }else {
             a28 uoa28 = new a28();
             w07 ow07 = new w07(p0.size(), uoa28);
             Iterator iterator1 = p0.iterator();
             while (iterator1.hasNext()) {
                j07 oj07 = iterator1.next();
                kj b = o07.b;
                oj07.c(b, ow07);
                oj07.b(b, ow07);
                oj07.a(b, ow07);
             }
             return uoa28;
          }
       }
    }
    public static ActionMode$Callback Z(ActionMode$Callback p0,TextView p1){
       int sDK_INT;
       if ((sDK_INT = Build$VERSION.SDK_INT) >= 26 && (sDK_INT <= 27 && (!p0 instanceof c37 && p0 != null))) {
          return new c37(p0, p1);
       }
       return p0;
    }
    public static long a(AtomicLong p0,long p1){
       long l;
       while (true) {
          l = p0.get();
          long l1 = Long.MAX_VALUE;
          if (!(l - l1)) {
             return l1;
          }
          if (p0.compareAndSet(l, vv7.c(l, p1))) {
             break ;
          }
       }
       return l;
    }
    public static void a0(ByteBuffer p0,double p1){
       int i = (int)(p1 * 1073741824.00f);
       p0.put((byte)((0xff000000 & i) >> 24));
       p0.put((byte)((0xff0000 & i) >> 16));
       p0.put((byte)((0xff00 & i) >> 8));
       p0.put((byte)(i & 0x00ff));
    }
    public static long b(AtomicLong p0,long p1){
       long l;
       while (true) {
          l = p0.get();
          long l1 = Long.MIN_VALUE;
          if (!(l - l1)) {
             return l1;
          }
          l1 = Long.MAX_VALUE;
          if (!(l - l1)) {
             return l1;
          }
          if (p0.compareAndSet(l, vv7.c(l, p1))) {
             break ;
          }
       }
       return l;
    }
    public static void b0(ByteBuffer p0,double p1){
       int i = (int)(p1 * 0x40f0000000000000);
       p0.put((byte)((0xff000000 & i) >> 24));
       p0.put((byte)((0xff0000 & i) >> 16));
       p0.put((byte)((0xff00 & i) >> 8));
       p0.put((byte)(i & 0x00ff));
    }
    public static long c(long p0,long p1){
       p0 = p0 + p1;
       if ((p0) < 0) {
          p0 = Long.MAX_VALUE;
       }
       return p0;
    }
    public static void c0(ByteBuffer p0,double p1){
       short s = (short)(int)(p1 * 256.00f);
       p0.put((byte)((0xff00 & s) >> 8));
       p0.put((byte)(s & 0x00ff));
    }
    public static int d(int p0){
       if (Build$VERSION.SDK_INT >= 23) {
          p0 = p0 | 0x4000000;
       }
       return p0;
    }
    public static void d0(ByteBuffer p0,String p1){
       int i = 3;
       if (p1.getBytes().length != i) {
          throw new IllegalArgumentException(tp2.m("\"", p1, "\" language string isn\'t exactly 3 characters long!"));
       }
       int i2 = 0;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          int i3 = p1.getBytes()[i1] - 96;
          int i4 = i1 - 2;
          i4 = i4 * 5;
          i3 = i3 << i4;
          i2 = i2 + i3;
       }
       vv7.e0(p0, i2);
       return;
    }
    public static boolean e(v95[] p0,v95[] p1){
       if (p0 == null || p1 == null) {
          return false;
       }
       if (p0.length != p1.length) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p0.length) {
             return true;
          }
          object oobject = p0[i];
          object oobject1 = p1[i];
          if (oobject.a == oobject1.a && oobject.b.length == oobject1.b.length) {
             i = i + 1;
          }else {
             break ;
          }
       }
       return false;
    }
    public static void e0(ByteBuffer p0,int p1){
       p1 = p1 & 0xffff;
       p0.put((byte)((p1 >> 8) & 0x00ff));
       p0.put((byte)((p1 & 0x00ff) & 0x00ff));
    }
    public static final void f(int p0){
       ib3 oib3 = new ib3(2, 36);
       oib3 = (2 <= p0 && p0 <= oib3.b)? 1: 0;
       if (oib3) {
          return;
       }else {
          throw new IllegalArgumentException(kg4.r("radix ", p0, " was not in valid range ")+new ib3(2, 36));
       }
    }
    public static void f0(ByteBuffer p0,int p1){
       p1 = p1 & 0xffffff;
       vv7.e0(p0, (p1 >> 8));
       p0.put((byte)(p1 & 0x00ff));
    }
    public static final uj0 g(EsResponseWithReasons$ResponseWithReasons p0){
       co5.o(p0, "response");
       tj0 otj0 = (vj0.a[p0.f().ordinal()] == 1)? new tj0(): new sj0(p0.g());
       return otj0;
    }
    public static void g0(ByteBuffer p0,String p1){
       p0.put(ej4.p(p1));
       p0.put((byte)0);
    }
    public static float[] h(float[] p0,int p1){
       int len;
       if (p1 < 0) {
          throw new IllegalArgumentException();
       }
       if ((len = p0.length) < 0) {
          throw new ArrayIndexOutOfBoundsException();
       }
       p1 = p1 - 0;
       len = Math.min(p1, (len - 0));
       float[] uofloatArray = new float[p1];
       System.arraycopy(p0, 0, uofloatArray, 0, len);
       return uofloatArray;
    }
    public static final void i(int p0,int p1){
       if (p0 <= p1) {
          return;
       }
       throw new IndexOutOfBoundsException("toIndex \("+p0+"\) is greater than size \("+p1+"\).");
    }
    public static ij1 j(Context p0){
       ProviderInfo providerInfo;
       ProviderInfo applicationI;
       int i;
       int i1;
       ob2 oob2;
       ij1 oij1 = null;
       b7 uob7 = new b7(oij1);
       PackageManager packageManag = p0.getPackageManager();
       is7.h(packageManag, "Package manager required to locate emoji font provider");
       Iterator iterator = uob7.b.T(packageManag, new Intent("androidx.content.action.LOAD_EMOJI_FONT")).iterator();
       while (true) {
          if (iterator.hasNext()) {
             if ((providerInfo = uob7.b.F(iterator.next())) != null && (applicationI = providerInfo.applicationInfo) != null) {
                i = 1;
                if ((i1 = applicationI.flags & i) == i) {
                label_0044 :
                   if (!i) {
                      continue ;
                   }
                }
             }
             i = 0;
             goto label_0044 ;
          }else {
             providerInfo = oij1;
          }
          try{
             if (providerInfo != null) {
                oob2 = uob7.n(providerInfo, packageManag);
             label_0052 :
                if (oob2 != null) {
                   oij1 = new ij1(p0, oob2);
                   break ;
                }
                break ;
             }
          }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          }
          oob2 = oij1;
          goto label_0052 ;
       }
       return oij1;
    }
    public static v95[] k(String p0){
       String str;
       int i3;
       int i4;
       int i5;
       float[] uofloatArray;
       float[] uofloatArray1;
       char c1;
       if (!(str = p0)) {
          return null;
       }
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       int i1 = 1;
       int i2 = 0;
       while (i1 < p0.length()) {
          while (true) {
             i3 = 101;
             if (i1 < p0.length()) {
                char c = str.charAt(i1);
                i4 = c - 65;
                i5 = c - 90;
                if ((i5 = i5 * i4) > 0) {
                   i4 = c - 97;
                   i5 = c - 122;
                   if ((i5 = i5 * i4) > 0) {
                   label_0037 :
                      i1 = i1 + 1;
                   }
                }
                if (c != i3 && c != 'E') {
                   break ;
                }else {
                   goto label_0037 ;
                }
             }else {
                break ;
             }
          }
          String str1 = str.substring(i2, i1).trim();
          if (str1.length() > 0) {
             if (str1.charAt(i) != 'z' && str1.charAt(i) != 'Z') {
                try{
                   uofloatArray1 = new float[str1.length()];
                   int i6 = str1.length();
                   i4 = 1;
                   i5 = 0;
                   while (i4 < i6) {
                      int i7 = 0;
                      int i8 = 0;
                      int i9 = 0;
                      int i10 = 0;
                      int i11 = i4;
                      while (i11 < str1.length()) {
                         if ((c1 = str1.charAt(i11)) != ' ') {
                            i3 = 101;
                            if (c1 != 'E' && c1 != i3) {
                               switch (c1){
                                   case ',':
                                  label_0093 :
                                     i7 = 1;
                                     break;
                                   case '-':
                                     if (i11 != i4 && !i10) {
                                     label_008d :
                                        i8 = 1;
                                        goto label_0093 ;
                                     }
                                     break;
                                   case '.':
                                     if (!i9) {
                                        i9 = 1;
                                     }else {
                                        goto label_008d ;
                                     }
                                     break;
                                   default:
                               }
                            }else {
                               i10 = 1;
                            label_0095 :
                               if (i7) {
                                  break ;
                               }
                            }
                         }else {
                            i3 = 101;
                            goto label_0093 ;
                         }
                         i10 = 0;
                         goto label_0095 ;
                         i11 = i11 + 1;
                      }
                      if (i4 < i11) {
                         i7 = i5 + 1;
                         uofloatArray1[i5] = Float.parseFloat(str1.substring(i4, i11));
                         i5 = i7;
                      }
                      if (!i8) {
                         i11 = i11 + 1;
                      }
                      i4 = i11;
                   }
                   uofloatArray = vv7.h(uofloatArray1, i5);
                   i = 0;
                }catch(java.lang.NumberFormatException e0){
                   throw new RuntimeException(tp2.m("error in parsing \"", str1, "\""), e0);
                }
             }else {
                uofloatArray = new float[i];
             }
             uArrayList.add(new v95(str1.charAt(i), uofloatArray));
          }
          i = i1 + 1;
          i2 = i1;
          i1 = i;
          i = 0;
       }
       if (((i1 - i2)) == 1 && i2 < p0.length()) {
          uofloatArray1 = new float[0];
          uArrayList.add(new v95(str.charAt(i2), uofloatArray1));
       }
       v95[] ov95Array = new v95[uArrayList.size()];
       return uArrayList.toArray(ov95Array);
    }
    public static Path l(String p0){
       v95[] ov95Array;
       Path path = new Path();
       if ((ov95Array = vv7.k(p0)) == null) {
          return null;
       }
       try{
          v95.b(ov95Array, path);
          return path;
       }catch(java.lang.RuntimeException e0){
          throw new RuntimeException(en6.n("Error in parsing ", p0), e0);
       }
    }
    public static final InetAddress m(String p0,int p1,int p2){
       int i7;
       String str = p0;
       int i = p2;
       int i1 = 16;
       byte[] uobyteArray = new byte[i1];
       int b = false;
       int i2 = -1;
       int i3 = p1;
       int i4 = 0;
       int i5 = -1;
       int i6 = -1;
       while (true) {
          if (i3 < i) {
             if (i4 == i1) {
                return null;
             }
             if ((i7 = i3 + 2) <= i && av6.C0(i3, str, "::", b)) {
                if (i5 != i2) {
                   return null;
                }else {
                   i4 = i4 + 2;
                   i5 = i4;
                   if (i7 == i) {
                   label_00da :
                      if (i4 != 16) {
                         if (i5 == -1) {
                            return null;
                         }else {
                            i = i4 - i5;
                            System.arraycopy(uobyteArray, i5, uobyteArray, (i - 16), i);
                            Arrays.fill(uobyteArray, i5, ((i4 - 16) + i5), 0);
                            break ;
                         }
                      }
                      break ;
                   }else {
                      i6 = i7;
                   }
                }
             }else if(i4){
                if (av6.C0(i3, str, ":", b)) {
                   i3 = i3 + 1;
                }else if(av6.C0(i3, str, ".", b)){
                   i3 = i4 - 2;
                   i7 = i3;
                   while (true) {
                      if (i6 < i) {
                         if (i7 == i1) {
                         label_009e :
                            str = 0;
                         }else if(i7 != i3){
                            if (str.charAt(i6) != '.') {
                               goto label_009e ;
                            }else {
                               i6 = i6 + 1;
                            }
                         }
                         int i8 = i6;
                         int i9 = 0;
                         while (true) {
                            if (i8 < i) {
                               char c = str.charAt(i8);
                               i1 = 48;
                               if (co5.r(c, i1) >= 0 && co5.r(c, 57) <= 0) {
                                  if (!i9 && i6 != i8) {
                                     goto label_009e ;
                                  }else {
                                     i9 = i9 * 10;
                                     i9 = i9 + c;
                                     if ((i9 = i9 - i1) > 255) {
                                        goto label_009e ;
                                     }else {
                                        i8 = i8 + 1;
                                        i2 = -1;
                                     }
                                  }
                               }else if(!(i1 = i8 - i6)){
                                  goto label_009e ;
                               }else {
                                  i1 = i7 + 1;
                                  uobyteArray[i7] = (byte)i9;
                                  i7 = i1;
                                  i6 = i8;
                                  i1 = 16;
                                  i2 = -1;
                               }
                            }else {
                            }
                         }
                         if (!str) {
                            return null;
                         }else {
                            i4 = i4 + 2;
                            goto label_00da ;
                         }
                      }else if(i7 == (i3 + 4)){
                         str = 1;
                      }else {
                         goto label_009e ;
                      }
                   }
                   return InetAddress.getByAddress(uobyteArray);
                }else {
                   return null;
                }
             }
             i6 = i3;
             i1 = 0;
             for (i3 = i6; i3 < i && (b = we7.r(str.charAt(i3))) != -1; i3 = i3 + 1) {
                i1 = i1 << 4;
                i1 = i1 + b;
             }
             if ((b = i3 - i6) && b <= 4) {
                b = i4 + 1;
                i2 = i1 >> 8;
                i2 = i2 & 255;
                uobyteArray[i4] = (byte)i2;
                i4 = b + 1;
                i1 = i1 & 0x00ff;
                uobyteArray[b] = (byte)i1;
                i1 = 16;
                b = false;
                i2 = -1;
             }else {
                return null;
             }
          }else {
             goto label_00da ;
          }
       }
    }
    public static v95[] n(v95[] p0){
       if (p0 == null) {
          return null;
       }
       v95[] ov95Array = new v95[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          ov95Array[i] = new v95(p0[i]);
       }
       return ov95Array;
    }
    public static final void o(nf2 p0){
       hl3 ohl3 = new hl3();
       Cursor uCursor = p0.a0("SELECT name FROM sqlite_master WHERE type = \'trigger\'");
       while (uCursor.moveToNext()) {
          ohl3.add(uCursor.getString(0));
       }
       eb3.d(uCursor, null);
       ye7.g(ohl3);
       Iterator iterator = ohl3.iterator();
       while (true) {
          Iterator iterator1 = iterator;
          if (iterator1.hasNext()) {
             String str = iterator1.next();
             co5.l(str, "triggerName");
             if (av6.D0(str, "room_fts_content_sync_", 0)) {
                p0.r("DROP TRIGGER IF EXISTS ".concat(str));
             }
          }else {
             break ;
          }
       }
       return;
    }
    public static HashSet p(Object[] p0){
       HashSet hashSet = new HashSet(p0.length);
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          p0[i].getClass();
       }
       Collections.addAll(hashSet, p0);
       return hashSet;
    }
    public static final boolean q(char p0,char p1,boolean p2){
       boolean b = true;
       if (p0 == p1) {
          return b;
       }
       if (!p2) {
          return false;
       }
       p0 = Character.toUpperCase(p0);
       p1 = Character.toUpperCase(p1);
       if (p0 != p1 && Character.toLowerCase(p0) != Character.toLowerCase(p1)) {
          b = false;
       }
       return b;
    }
    public static final xw0 s(xw0 p0,xw0 p1,boolean p2){
       Boolean fALSE = Boolean.FALSE;
       bo6 x = bo6.x;
       boolean b = p1.J(fALSE, x).booleanValue();
       if (!p0.J(fALSE, x).booleanValue() && !b) {
          return p0.T(p1);
       }
       ks5 oks5 = new ks5();
       oks5.a = p1;
       il1 a = il1.a;
       p0 = p0.J(a, new zu6(2, oks5, p2));
       if (b) {
          oks5.a = oks5.a.J(a, bo6.w);
       }
       return p0.T(oks5.a);
    }
    public static a28 t(Object p0){
       a28 uoa28 = new a28();
       uoa28.k(p0);
       return uoa28;
    }
    public static final String u(String p0){
       co5.o(p0, "codeVerifier");
       if (!vv7.y(p0)) {
          throw new ny1("Invalid Code Verifier.");
       }
       try{
          byte[] bytes = p0.getBytes(oe0.b);
          co5.l(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
          MessageDigest instance = MessageDigest.getInstance("SHA-256");
          instance.update(bytes, 0, bytes.length);
          bytes = instance.digest();
          bytes = Base64.encodeToString(bytes, 11);
          co5.l(bytes, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray\(Charsets.US_ASCII\)\n      val messageDigest = MessageDigest.getInstance\(\"SHA-256\"\)\n      messageDigest.update\(bytes, 0, bytes.size\)\n      val digest = messageDigest.digest\(\)\n\n      Base64.encodeToString\(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP\)\n    }");
          return bytes;
       }catch(java.lang.Exception e3){
          throw new ny1(e3);
       }
    }
    public static final int v(int p0,List p1){
       int i;
       int i2;
       co5.o(p1, "timeSortedLyrics");
       int i1 = ((i = p1.size() - 1) >= 0)? 1: 0;
       if (i1) {
          long l = (long)p0;
          long l1 = (long)100;
          if ((l - (p1.get(0).a - l1)) < 0) {
             return -1;
          }else {
             p0 = 0;
             while (true) {
                if (p0 >= i) {
                   return i;
                }
                i2 = p0 + i;
                i2 = i2 / 2;
                long l2 = p1.get(i2).a - l1;
                int i3 = i2 + 1;
                long l3 = p1.get(i3).a - l1;
                l3 = ((l2 - l) <= 0 && (l - l3) < 0)? 1: 0;
                if (l3) {
                   break ;
                }else if((l - l2) < 0){
                   i = i2 - 1;
                }else {
                   p0 = i3;
                }
             }
             return i2;
          }
       }else {
          throw new IllegalArgumentException("The list cannot be empty".toString());
       }
    }
    public static final int w(String p0){
       int i = 4;
       int i1 = av6.m0(p0, File.separatorChar, 0, 0, i);
       int i2 = 1;
       if (!i1) {
          if (p0.length() > i2) {
             char separatorCha = File.separatorChar;
             if (p0.charAt(i2) == separatorCha && (i1 = av6.m0(p0, separatorCha, 2, 0, i)) >= 0) {
                if ((i1 = av6.m0(p0, File.separatorChar, (i1 + i2), 0, i)) >= 0) {
                   return (i1 + i2);
                }else {
                   return p0.length();
                }
             }
          }
          return i2;
       }else if(i1 > 0 && p0.charAt((i1 - 1)) == ':'){
          return (i1 + i2);
       }else if(i1 == -1 && av6.h0(p0, ':')){
          return p0.length();
       }else {
          return 0;
       }
    }
    public static zh5 x(TextView p0){
       TextDirectionHeuristic lTR;
       byte directionali;
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 28;
       if (sDK_INT >= i) {
          return new zh5(b37.b(p0));
       }
       kb3 okb3 = new kb3(new TextPaint(p0.getPaint()));
       if (sDK_INT >= 23) {
          okb3.a = x27.a(p0);
          okb3.b = x27.d(p0);
       }
       if (p0.getTransformationMethod() instanceof PasswordTransformationMethod) {
          lTR = TextDirectionHeuristics.LTR;
       }else {
          int i1 = 1;
          if (sDK_INT >= i && ((p0.getInputType() & 0x0f)) == 3) {
             if ((directionali = Character.getDirectionality(b37.a(y27.a(v27.d(p0)))[0].codePointAt(0))) != i1 && directionali != 2) {
                lTR = TextDirectionHeuristics.LTR;
             }else {
                lTR = TextDirectionHeuristics.RTL;
             }
          }else if(v27.b(p0) == i1){
             i1 = 0;
          }
          switch (v27.c(p0)){
              case 2:
                lTR = TextDirectionHeuristics.ANYRTL_LTR;
                break;
              case 3:
                lTR = TextDirectionHeuristics.LTR;
                break;
              case 4:
                lTR = TextDirectionHeuristics.RTL;
                break;
              case 5:
                lTR = TextDirectionHeuristics.LOCALE;
                break;
              case 6:
                lTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                break;
              case 7:
                lTR = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                break;
              default:
                if (i1) {
                   lTR = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }else {
                   lTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                }
          }
       }
       okb3.d = lTR;
       return new zh5(okb3.c, lTR, okb3.a, okb3.b);
    }
    public static final boolean y(String p0){
       boolean b = false;
       int i = (p0 != null && p0.length())? 0: 1;
       if (!i && (p0.length() >= 43 && p0.length() <= 128)) {
          Pattern pattern = Pattern.compile("^[-._~A-Za-z0-9]+$");
          co5.l(pattern, "compile\(pattern\)");
          return pattern.matcher(p0).matches();
       }else {
          return b;
       }
    }
    public static final boolean z(char p0){
       boolean b = (!Character.isWhitespace(p0) && !Character.isSpaceChar(p0))? false: true;
       return b;
    }
    public abstract el r(t91 p0,he3 p1);
}
