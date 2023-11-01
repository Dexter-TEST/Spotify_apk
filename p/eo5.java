package p.eo5;
import p.w54;
import p.ps3;
import p.bx6;
import java.lang.String;
import p.c65;
import p.yy6;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.IllegalArgumentException;
import java.util.Collection;
import java.util.Iterator;
import java.lang.NullPointerException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import p.eb3;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import p.m73;
import p.ry7;
import p.k73;
import p.v74;
import p.dt5;
import java.io.FileInputStream;
import p.ta1;
import p.ap5;
import java.util.Arrays;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.util.HashSet;
import android.os.Parcelable;
import android.os.Build$VERSION;
import p.jx1;
import java.util.TreeMap;
import java.lang.Integer;
import java.util.BitSet;
import android.view.View;
import java.lang.Class;
import p.zk2;
import p.n4;
import p.h10;
import p.rm;
import p.xz5;
import p.g10;
import p.gg1;
import p.jk7;
import p.sz1;
import p.hy1;
import p.vy6;
import java.lang.System;
import java.lang.Long;
import p.yu6;
import java.lang.StringBuilder;
import java.lang.ClassCastException;
import java.lang.RuntimeException;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.io.OutputStream;
import p.cs7;
import java.util.Set;
import java.util.Map$Entry;
import p.et0;
import java.lang.CharSequence;
import java.lang.Character;
import io.reactivex.rxjava3.core.Flowable;
import p.iv6;
import p.yf2;
import p.rl1;
import p.zv6;
import p.kv6;
import java.util.Objects;
import p.bn5;
import p.b36;
import p.pc;
import java.util.Map;
import com.google.common.collect.d;
import android.content.Context;
import android.widget.TextView;
import java.util.Locale;
import p.en6;
import android.view.accessibility.AccessibilityManager;
import android.text.TextUtils;
import android.text.SpannableStringBuilder;
import android.content.res.Resources;
import p.xj0;
import p.lk2;
import java.util.AbstractCollection;
import p.ch3;
import p.dh3;
import java.util.List;
import p.eh3;
import p.ng2;
import p.fh2;
import p.wf2;
import p.zf2;
import p.cu5;
import android.os.Bundle;
import android.os.BaseBundle;
import org.json.JSONArray;
import p.dj0;
import p.eu1;
import p.f22;
import p.h22;
import p.ki;
import org.json.JSONObject;
import p.b3;
import io.reactivex.rxjava3.core.Observer;
import p.yh6;
import io.reactivex.rxjava3.disposables.Disposable;
import p.pn5;
import p.xh6;
import p.a27;
import java.util.concurrent.atomic.AtomicInteger;
import p.ju2;
import p.tu2;
import p.au2;
import p.b7;
import p.vx5;
import p.f10;
import android.content.pm.PackageManager;
import android.content.Intent;
import android.net.Uri;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import android.app.Activity;
import android.app.Application;
import p.ao2;
import android.app.Service;
import android.content.BroadcastReceiver;
import p.sc;
import p.bm;
import p.mm0;
import p.rt;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import p.hq1;
import p.r45;
import p.oq1;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import java.lang.Number;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.w51;
import p.n26;
import java.lang.Iterable;
import p.te5;
import android.text.Spanned;

public abstract class eo5 implements w54	// class@0014c9 from classes.dex
{
    public static final c65 A;
    public static final int B;
    public static final yy6 C;
    public static final ps3 a;
    public static md b;
    public static final ps3 c;
    public static final bx6 t;
    public static final byte[] v;
    public static final byte[] w;
    public static final int[] x;
    public static final int[] y;
    public static final int[] z;

    static {
       eo5.a = new ps3(14);
       eo5.c = new ps3(2);
       eo5.t = new bx6("NULL");
       eo5.v = new byte[4]{'p','r','o',0x00};
       eo5.w = new byte[4]{'p','r','m',0x00};
       eo5.x = new int[6]{0x101011c,0x1010194,0x1010195,0x1010196,0x101030c,0x101030d};
       eo5.y = new int[2]{0x10100d0,0x1010199};
       eo5.z = new int[4]{0x1010199,0x1010449,0x101044a,0x101044b};
       eo5.A = new c65(16);
       eo5.C = new yy6(5);
    }
    public void eo5(){
       super();
    }
    public static final void A(String p0,String p1){
       co5.o(p0, "arg");
       int i = (p0.length() > 0)? 1: 0;
       if (i) {
          return;
       }else {
          throw new IllegalArgumentException(tp2.m("Argument \'", p1, "\' cannot be empty").toString());
       }
    }
    public static final void B(Collection p0){
       co5.o(p0, "container");
       Iterator iterator = p0.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next() == null) {
                throw new NullPointerException("Container \'requests\' cannot contain null values");
             }
             continue ;
          }else if((p0.isEmpty() ^ 0x01)){
             return;
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("Container \'requests\' cannot be empty".toString());
    }
    public static final void C(String p0,String p1){
       int i = 0;
       if (p0 != null) {
          int i1 = (p0.length() > 0)? 1: 0;
          if (i1) {
             i = 1;
          }
       }
       if (i) {
          return;
       }else {
          throw new IllegalArgumentException(tp2.m("Argument \'", p1, "\' cannot be null or empty").toString());
       }
    }
    public static int[] D(int p0,ByteArrayInputStream p1){
       int[] ointArray = new int[p0];
       int i1 = 0;
       for (int i = 0; i < p0; i = i + 1) {
          i1 = i1 + eb3.x(p1);
          ointArray[i] = i1;
       }
       return ointArray;
    }
    public static m73 E(Parcel p0,Parcelable$Creator p1){
       v74 g = ry7.G;
       int i = p0.readInt();
       k73 ok73 = m73.a();
       while (true) {
          int i1 = i - 1;
          if (i > 0) {
             ok73.d(g.createFromParcel(p0), p1.createFromParcel(p0));
             i = i1;
          }else {
             break ;
          }
       }
       return ok73.b(true);
    }
    public static ta1[] F(FileInputStream p0,byte[] p1,byte[] p2,ta1[] p3){
       ByteArrayInputStream uByteArrayIn;
       byte[] c = ap5.C;
       int i = 4;
       String str = "Unsupported meta version";
       if (Arrays.equals(p1, c)) {
          if (Arrays.equals(ap5.x, p2)) {
             throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
          }
          if (!Arrays.equals(p1, c)) {
             throw new IllegalStateException(str);
          }
          int i1 = (int)eb3.w(1, p0);
          p1 = eb3.v(p0, (int)eb3.w(i, p0), (int)eb3.w(i, p0));
          if (p0.read() > 0) {
             throw new IllegalStateException("Content found after the end of file");
          }
          uByteArrayIn = new ByteArrayInputStream(p1);
          uByteArrayIn.close();
          return eo5.G(uByteArrayIn, i1, p3);
       }else if(Arrays.equals(p1, ap5.D)){
          int i2 = eb3.x(p0);
          c = eb3.v(p0, (int)eb3.w(i, p0), (int)eb3.w(i, p0));
          if (p0.read() > 0) {
             throw new IllegalStateException("Content found after the end of file");
          }
          uByteArrayIn = new ByteArrayInputStream(c);
          uByteArrayIn.close();
          return eo5.H(uByteArrayIn, p2, i2, p3);
       }else {
          throw new IllegalStateException(str);
       }
    }
    public static ta1[] G(ByteArrayInputStream p0,int p1,ta1[] p2){
       int i = 0;
       if (!p0.available()) {
          ta1[] ota1Array = new ta1[i];
          return ota1Array;
       }else if(p1 == p2.length){
          String[] stringArray = new String[p1];
          int[] ointArray = new int[p1];
          for (int i1 = 0; i1 < p1; i1 = i1 + 1) {
             ointArray[i1] = eb3.x(p0);
             stringArray[i1] = new String(eb3.u(eb3.x(p0), p0), StandardCharsets.UTF_8);
          }
          while (true) {
             if (i >= p1) {
                return p2;
             }
             object oobject = p2[i];
             if (oobject.b.equals(stringArray[i])) {
                int i2 = ointArray[i];
                oobject.e = i2;
                oobject.h = eo5.D(i2, p0);
                i = i + 1;
             }else {
                break ;
             }
          }
          throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
       }else {
          throw new IllegalStateException("Mismatched number of dex files found in metadata");
       }
    }
    public static ta1[] H(ByteArrayInputStream p0,byte[] p1,int p2,ta1[] p3){
       String str;
       object oobject;
       int i2;
       String str1;
       if (!p0.available()) {
          ta1[] ota1Array = new ta1[0];
          return ota1Array;
       }else if(p2 == p3.length){
          int i = 0;
          while (true) {
             if (i >= p2) {
                return p3;
             }
             eb3.x(p0);
             str = new String(eb3.u(eb3.x(p0), p0), StandardCharsets.UTF_8);
             long l = eb3.w(4, p0);
             int i1 = eb3.x(p0);
             if (p3.length > 0) {
                if ((i2 = str.indexOf("!")) < 0) {
                   i2 = str.indexOf(":");
                }
                if (i2 > 0) {
                   i2 = i2 + 1;
                   str1 = str.substring(i2);
                }else {
                   str1 = str;
                }
                int i3 = 0;
                while (true) {
                   if (i3 < p3.length) {
                      if (p3[i3].b.equals(str1)) {
                         oobject = p3[i3];
                         break ;
                      }else {
                         i3 = i3 + 1;
                      }
                   }
                }
                if (oobject != null) {
                   oobject.d = l;
                   int[] ointArray = eo5.D(i1, p0);
                   if (Arrays.equals(p1, ap5.B)) {
                      oobject.e = i1;
                      oobject.h = ointArray;
                   }
                   i = i + 1;
                }else {
                }
             }
             oobject = null;
          }
          throw new IllegalStateException("Missing profile key: ".concat(str));
       }else {
          throw new IllegalStateException("Mismatched number of dex files found in metadata");
       }
    }
    public static ta1[] I(FileInputStream p0,byte[] p1,String p2){
       if (!Arrays.equals(p1, ap5.y)) {
          throw new IllegalStateException("Unsupported version");
       }
       int i = (int)eb3.w(1, p0);
       byte[] uobyteArray = eb3.v(p0, (int)eb3.w(4, p0), (int)eb3.w(4, p0));
       if (p0.read() > 0) {
          throw new IllegalStateException("Content found after the end of file");
       }
       ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(uobyteArray);
       uByteArrayIn.close();
       return eo5.L(uByteArrayIn, p2, i);
    }
    public static HashSet J(Parcel p0){
       int i = p0.readInt();
       HashSet hashSet = new HashSet(i);
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          hashSet.add(p0.readString());
       }
       return hashSet;
    }
    public static Parcelable K(Parcel p0,Parcelable$Creator p1){
       if (Build$VERSION.SDK_INT >= 23) {
          return jx1.m(p0, p1);
       }
       int i = (p0.readInt())? 1: 0;
       if (i) {
          return p1.createFromParcel(p0);
       }else {
          return null;
       }
    }
    public static ta1[] L(ByteArrayInputStream p0,String p1,int p2){
       int i2;
       ta1 i2;
       int i8;
       int i9;
       Integer integer;
       InputStream inputStream = p0;
       int i = p2;
       if (!p0.available()) {
          ta1[] ota1Array = new ta1[0];
          return ota1Array;
       }else {
          ta1[] ota1Array1 = new ta1[i];
          int i1 = 0;
          while (true) {
             i2 = 4;
             if (i1 < i) {
                int i3 = eb3.x(p0);
                int[] ointArray = new int[i3];
                i2 = new ta1(p1, new String(eb3.u(eb3.x(p0), inputStream), StandardCharsets.UTF_8), eb3.w(i2, inputStream), i3, (int)eb3.w(i2, inputStream), (int)eb3.w(i2, inputStream), ointArray, new TreeMap());
                ota1Array1[i1] = i2;
                i1 = i1 + 1;
             }else {
                break ;
             }
          }
          i1 = 0;
          while (true) {
             if (i1 >= i) {
                return ota1Array1;
             }
             object oobject = ota1Array1[i1];
             int i4 = p0.available() - oobject.f;
             int i5 = 0;
             while (true) {
                ta1 i6 = oobject.i;
                if (p0.available() > i4) {
                   i5 = i5 + eb3.x(p0);
                   int i7 = 1;
                   i6.put(Integer.valueOf(i5), Integer.valueOf(i7));
                   i8 = eb3.x(p0);
                   while (i8 > 0) {
                      eb3.x(p0);
                      if ((i9 = (int)eb3.w(i7, inputStream)) != 6 && i9 != 7) {
                         while (i9 > 0) {
                            eb3.w(i7, inputStream);
                            int i10 = (int)eb3.w(i7, inputStream);
                            while (i10 > 0) {
                               eb3.x(p0);
                               i10 = i10 - 1;
                            }
                            i9 = i9 - 1;
                         }
                      }
                      i8 = i8 - 1;
                   }
                }else if(p0.available() == i4){
                   oobject.h = eo5.D(oobject.e, inputStream);
                   ta1 g = oobject.g;
                   i4 = g * 2;
                   i4 = i4 + 8;
                   i4 = i4 - 1;
                   i4 = i4 & 0xf8;
                   i4 = i4 / 8;
                   BitSet uBitSet = BitSet.valueOf(eb3.u(i4, inputStream));
                   i8 = 0;
                   while (i8 < g) {
                      i8 = 2;
                      if (!uBitSet.get(eo5.z(i8, i8, g))) {
                         i8 = 0;
                      }
                      if (uBitSet.get(eo5.z(i2, i8, g))) {
                         i8 = i8 | 0x04;
                      }
                      if (i8) {
                         if ((integer = i6.get(Integer.valueOf(i8))) == null) {
                            integer = Integer.valueOf(0);
                         }
                         i8 = i8 | integer.intValue();
                         i6.put(Integer.valueOf(i8), Integer.valueOf(i8));
                      }
                      i5 = i8 + 1;
                   }
                   i1 = i1 + 1;
                }else {
                }
             }
          }
          throw new IllegalStateException("Read too much data during profile line parse");
       }
    }
    public static zk2 M(View p0,Class p1){
       zk2 ozk2;
       p0.getClass();
       if ((ozk2 = p1.cast(p0.getTag(R.id.glue_viewholder_tag))) != null) {
          return ozk2;
       }
       throw new IllegalStateException("This view doesn\'t have a GlueViewBinder associated with it. Have you called GlueViewBinders.save\(\)?");
    }
    public static h10 N(int p0,n4 p1){
       return eo5.n(p0, xz5.class, p1, new rm(24));
    }
    public static h10 O(int p0){
       return eo5.n(p0, xz5.class, new n4(7, gg1.A), new rm(25));
    }
    public static void P(zk2 p0){
       p0.getView().setTag(R.id.glue_viewholder_tag, p0);
    }
    public static final void Q(){
       if (sz1.h()) {
          return;
       }
       throw new hy1("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize\(\) first.");
    }
    public static final long R(String p0,long p1,long p2,long p3){
       String property;
       Long longx;
       int a = vy6.a;
       try{
          property = System.getProperty(p0);
       }catch(java.lang.SecurityException e0){
          property = null;
       }
       if (property != null) {
          if ((longx = yu6.d0(property)) != null) {
             long l = longx.longValue();
             longx = ((p2 - l) <= 0 && (l - p3) <= 0)? 1: 0;
             if (longx) {
                longx = l;
             }else {
                throw new IllegalStateException("System property \'"+p0+"\' should be in range "+p2+".."+p3+", but is \'"+l+'''.toString());
             }
          }else {
             throw new IllegalStateException("System property \'"+p0+"\' has unrecognized value \'"+property+'''.toString());
          }
       }
       return p1;
    }
    public static int S(String p0,int p1,int p2,int p3,int p4){
       if ((p4 & 0x04)) {
          p2 = 1;
       }
       if ((p4 & 0x08)) {
          p3 = Integer.MAX_VALUE;
       }
       return (int)eo5.R(p0, (long)p1, (long)p2, (long)p3);
    }
    public static void T(Object p0,String p1){
       p0 = (p0 == null)? "null": p0.getClass().getName();
       ClassCastException uClassCastEx = new ClassCastException(p0+" cannot be cast to "+p1);
       co5.G(eo5.class.getName(), uClassCastEx);
       throw uClassCastEx;
    }
    public static boolean U(ByteArrayOutputStream p0,byte[] p1,ta1[] p2){
       int i6;
       byte[] uobyteArray2;
       ArrayList uArrayList3;
       int len1;
       int i8;
       ByteArrayOutputStream uByteArrayOu = p0;
       byte[] uobyteArray = p1;
       ta1[] ota1Array = p2;
       byte[] x = ap5.x;
       int b = false;
       int i = 1;
       if (Arrays.equals(uobyteArray, x)) {
          int i1 = 3;
          ArrayList uArrayList = new ArrayList(i1);
          ArrayList uArrayList1 = new ArrayList(i1);
          ByteArrayOutputStream uByteArrayOu1 = new ByteArrayOutputStream();
          eb3.N(uByteArrayOu1, ota1Array.length);
          int i2 = 2;
          int i4 = 2;
          for (int i3 = 0; i3 < ota1Array.length; i3 = i3 + 1) {
             object oobject = ota1Array[i3];
             i4 = i4 + 4;
             eb3.M(uByteArrayOu1, oobject.c, 4);
             i4 = i4 + 4;
             eb3.M(uByteArrayOu1, oobject.d, 4);
             i4 = i4 + 4;
             eb3.M(uByteArrayOu1, (long)oobject.g, 4);
             String str = eo5.k(oobject.a, oobject.b, x);
             i4 = i4 + i2;
             int len = str.getBytes(StandardCharsets.UTF_8).length;
             eb3.N(uByteArrayOu1, len);
             len = len * 1;
             i4 = i4 + len;
             uByteArrayOu1.write(str.getBytes(StandardCharsets.UTF_8));
          }
          x = uByteArrayOu1.toByteArray();
          if (i4 != x.length) {
             throw new IllegalStateException("Expected size "+i4+", does not match actual size "+x.length);
          }
          uByteArrayOu1.close();
          uArrayList.add(new cs7(i, x, b));
          ByteArrayOutputStream uByteArrayOu2 = new ByteArrayOutputStream();
          i3 = 0;
          for (int i5 = 0; i5 < ota1Array.length; i5 = i5 + 1) {
             object oobject1 = ota1Array[i5];
             i3 = i3 + 2;
             eb3.N(uByteArrayOu2, i5);
             i3 = i3 + i2;
             eb3.N(uByteArrayOu2, oobject1.e);
             i6 = oobject1.e * 2;
             i3 = i3 + i6;
             eo5.X(uByteArrayOu2, oobject1);
          }
          byte[] uobyteArray1 = uByteArrayOu2.toByteArray();
          if (i3 != uobyteArray1.length) {
             throw new IllegalStateException("Expected size "+i3+", does not match actual size "+uobyteArray1.length);
          }
          uByteArrayOu2.close();
          uArrayList.add(new cs7(i1, uobyteArray1, i));
          uByteArrayOu2 = new ByteArrayOutputStream();
          i1 = 0;
          i5 = 0;
          while (i1 < ota1Array.length) {
             object oobject2 = ota1Array[i1];
             Iterator iterator = oobject2.i.entrySet().iterator();
             i6 = 0;
             while (iterator.hasNext()) {
                i6 = i6 | iterator.next().getValue().intValue();
             }
             ByteArrayOutputStream iterator1 = new ByteArrayOutputStream();
             eo5.a0(iterator1, oobject2);
             uobyteArray2 = iterator1.toByteArray();
             iterator1.close();
             iterator1 = new ByteArrayOutputStream();
             eo5.b0(iterator1, oobject2);
             byte[] uobyteArray3 = iterator1.toByteArray();
             iterator1.close();
             i5 = i5 + 2;
             eb3.N(uByteArrayOu2, i1);
             i4 = uobyteArray2.length + i2;
             i4 = i4 + uobyteArray3.length;
             i5 = i5 + 4;
             eb3.M(uByteArrayOu2, (long)i4, 4);
             eb3.N(uByteArrayOu2, i6);
             uByteArrayOu2.write(uobyteArray2);
             uByteArrayOu2.write(uobyteArray3);
             i5 = i5 + i4;
             i1 = i1 + 1;
             uArrayList1 = uArrayList1;
             i2 = 2;
          }
          ArrayList uArrayList2 = uArrayList1;
          byte[] uobyteArray4 = uByteArrayOu2.toByteArray();
          if (i5 != uobyteArray4.length) {
             throw new IllegalStateException("Expected size "+i5+", does not match actual size "+uobyteArray4.length);
          }
          uByteArrayOu2.close();
          uArrayList.add(new cs7(4, uobyteArray4, true));
          long l = (((long)4 + (long)4) + 4) + (long)(uArrayList.size() * 16);
          eb3.M(uByteArrayOu, (long)uArrayList.size(), 4);
          i1 = 0;
          while (i1 < uArrayList.size()) {
             cs7 uocs7 = uArrayList.get(i1);
             eb3.M(uByteArrayOu, et0.j(uocs7.a), 4);
             eb3.M(uByteArrayOu, l, 4);
             uocs7 = uocs7.b;
             if (uocs7.c != null) {
                uobyteArray2 = eb3.f(uocs7);
                uArrayList3 = uArrayList2;
                uArrayList3.add(uobyteArray2);
                eb3.M(uByteArrayOu, (long)uobyteArray2.length, 4);
                eb3.M(uByteArrayOu, (long)uocs7.length, 4);
                b = uobyteArray2.length;
             }else {
                uArrayList3 = uArrayList2;
                uArrayList3.add(uocs7);
                eb3.M(uByteArrayOu, (long)uocs7.length, 4);
                eb3.M(uByteArrayOu, 0, 4);
                b = uocs7.length;
             }
             l = l + (long)b;
             i1 = i1 + 1;
             uArrayList2 = uArrayList3;
          }
          uArrayList3 = uArrayList2;
          for (b = 0; b < uArrayList3.size(); b = b + 1) {
             uByteArrayOu.write(uArrayList3.get(b));
          }
          return true;
       }else {
          x = ap5.y;
          if (Arrays.equals(uobyteArray, x)) {
             uobyteArray = eo5.i(ota1Array, x);
             eb3.M(uByteArrayOu, (long)ota1Array.length, 1);
             eb3.M(uByteArrayOu, (long)uobyteArray.length, 4);
             uobyteArray = eb3.f(uobyteArray);
             eb3.M(uByteArrayOu, (long)uobyteArray.length, 4);
             uByteArrayOu.write(uobyteArray);
             return true;
          }else {
             int i7 = 1;
             byte[] a = ap5.A;
             if (Arrays.equals(uobyteArray, a)) {
                eb3.M(uByteArrayOu, (long)ota1Array.length, i7);
                len1 = ota1Array.length;
                i7 = 0;
                while (i7 < len1) {
                   object oobject3 = ota1Array[i7];
                   i = oobject3.i.size() * 4;
                   String str1 = eo5.k(oobject3.a, oobject3.b, a);
                   eb3.N(uByteArrayOu, str1.getBytes(StandardCharsets.UTF_8).length);
                   eb3.N(uByteArrayOu, oobject3.h.length);
                   eb3.M(uByteArrayOu, (long)i, 4);
                   eb3.M(uByteArrayOu, oobject3.c, 4);
                   uByteArrayOu.write(str1.getBytes(StandardCharsets.UTF_8));
                   Iterator iterator2 = oobject3.i.keySet().iterator();
                   while (iterator2.hasNext()) {
                      eb3.N(uByteArrayOu, iterator2.next().intValue());
                      eb3.N(uByteArrayOu, 0);
                   }
                   ta1 h = oobject3.h;
                   i = h.length;
                   for (i8 = 0; i8 < i; i8 = i8 + 1) {
                      eb3.N(uByteArrayOu, h[i8]);
                   }
                   i7 = i7 + 1;
                }
                return true;
             }else {
                a = ap5.z;
                if (Arrays.equals(uobyteArray, a)) {
                   uobyteArray = eo5.i(ota1Array, a);
                   eb3.M(uByteArrayOu, (long)ota1Array.length, i7);
                   eb3.M(uByteArrayOu, (long)uobyteArray.length, 4);
                   uobyteArray = eb3.f(uobyteArray);
                   eb3.M(uByteArrayOu, (long)uobyteArray.length, 4);
                   uByteArrayOu.write(uobyteArray);
                   return true;
                }else {
                   x = ap5.B;
                   if (!Arrays.equals(uobyteArray, x)) {
                      return false;
                   }
                   eb3.N(uByteArrayOu, ota1Array.length);
                   len1 = ota1Array.length;
                   i8 = 0;
                   while (i8 < len1) {
                      object oobject4 = ota1Array[i8];
                      String str2 = eo5.k(oobject4.a, oobject4.b, x);
                      eb3.N(uByteArrayOu, str2.getBytes(StandardCharsets.UTF_8).length);
                      ta1 i9 = oobject4.i;
                      eb3.N(uByteArrayOu, i9.size());
                      eb3.N(uByteArrayOu, oobject4.h.length);
                      eb3.M(uByteArrayOu, oobject4.c, 4);
                      uByteArrayOu.write(str2.getBytes(StandardCharsets.UTF_8));
                      Iterator iterator3 = i9.keySet().iterator();
                      while (iterator3.hasNext()) {
                         eb3.N(uByteArrayOu, iterator3.next().intValue());
                      }
                      ta1 h1 = oobject4.h;
                      b = h1.length;
                      for (i = 0; i < b; i = i + 1) {
                         eb3.N(uByteArrayOu, h1[i]);
                      }
                      i8 = i8 + 1;
                   }
                   return true;
                }
             }
          }
       }
    }
    public static CharSequence V(CharSequence p0){
       int i = p0.length() - 1;
       int i1 = 0;
       int i2 = 0;
       while (i1 <= i) {
          boolean i3 = (!i2)? i1: i;
          i3 = Character.isWhitespace(p0.charAt(i3));
          if (!i2) {
             if (!i3) {
                i2 = 1;
             }else {
                i1 = i1 + 1;
             }
          }else if(!i3){
             break ;
          }else {
             i = i - 1;
          }
       }
       return p0.subSequence(i1, (i + 1));
    }
    public static boolean W(Flowable p0,iv6 p1,yf2 p2){
       rl1 a = rl1.a;
       if (!p0 instanceof zv6) {
          return false;
       }
       if ((p0 = p0.get()) == null) {
          p1.onSubscribe(a);
          p1.onComplete();
          return true;
       }else {
          p0 = p2.apply(p0);
          Objects.requireNonNull(p0, "The mapper returned a null Publisher");
          if (p0 instanceof zv6) {
             if ((p0 = p0.get()) == null) {
                p1.onSubscribe(a);
                p1.onComplete();
                return true;
             }else {
                p1.onSubscribe(new b36(p0, p1));
             }
          }else {
             p0.subscribe(p1);
          }
          return true;
       }
    }
    public static void X(ByteArrayOutputStream p0,ta1 p1){
       p1 = p1.h;
       int len = p1.length;
       int i1 = 0;
       for (int i = 0; i < len; i = i + 1) {
          Integer integer = Integer.valueOf(p1[i]);
          int i2 = integer.intValue() - i1;
          eb3.N(p0, i2);
          integer.intValue();
       }
       return;
    }
    public static void Y(ByteArrayOutputStream p0,ta1 p1,String p2){
       eb3.N(p0, p2.getBytes(StandardCharsets.UTF_8).length);
       eb3.N(p0, p1.e);
       eb3.M(p0, (long)p1.f, 4);
       eb3.M(p0, p1.c, 4);
       eb3.M(p0, (long)p1.g, 4);
       p0.write(p2.getBytes(StandardCharsets.UTF_8));
    }
    public static void Z(Parcel p0,m73 p1,pc p2,int p3){
       p0.writeInt(p1.size());
       Iterator iterator = p1.f().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          uEntry.getKey().getClass();
          uEntry.getValue().getClass();
          Object key = uEntry.getKey();
          switch (9){
              case 8:
                key.writeToParcel(p0, 0);
                break;
              default:
                key.getClass();
                p0.writeString(key);
          }
          Object value = uEntry.getValue();
          switch (p2.a){
              case 8:
                value.writeToParcel(p0, 0);
                break;
              default:
                value.getClass();
                p0.writeString(value);
          }
       }
       return;
    }
    public static void a(Context p0,TextView p1,String p2){
       int i1;
       int i2;
       AccessibilityManager systemServic;
       String str = "EXPLICIT";
       int i = 0;
       if (p2 == null) {
       }else {
          String str1 = p2.toUpperCase(Locale.US);
          str1.getClass();
          int i3 = -1;
          switch (str1.hashCode()){
              case 0x86bcdbf4:
                if (str1.equals("LYRICS")) {
                   i3 = 0;
                }
                break;
              case 0xbbaa5634:
                if (str1.equals(str)) {
                   i3 = 1;
                }
                break;
              case 1576:
                if (str1.equals("19")) {
                   i3 = 2;
                }
                break;
              case 0x17d05a37:
                if (str1.equals("PREMIUM")) {
                   i3 = 3;
                }
                break;
              default:
          }
          switch (i3){
              case 0:
                i1 = 5;
                break;
              case 1:
                i1 = 2;
                break;
              case 2:
                i1 = 3;
                break;
              case 3:
                i1 = 4;
                break;
              default:
                i1 = 1;
          }
       }
       if ((i2 = en6.A(i1)) != 1) {
          if (i2 != 2) {
             if (i2 != 3) {
                eo5.b(p0, p1, p2, i1);
             }else {
                eo5.b(p0, p1, "PREMIUM", 4);
             }
          }else {
             eo5.b(p0, p1, "19", 3);
          }
       }else if((systemServic = p0.getSystemService("accessibility")) != null && systemServic.isTouchExplorationEnabled()){
          i = 1;
       }
       if (!i) {
          str = "E";
       }
       eo5.b(p0, p1, str, 2);
       return;
    }
    public static void a0(ByteArrayOutputStream p0,ta1 p1){
       byte[] uobyteArray = new byte[(((((p1.g * 2) + 8) - 1) & 0xf8) / 8)];
       Iterator iterator = p1.i.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          int i = uEntry.getKey().intValue();
          int i1 = uEntry.getValue().intValue();
          int i2 = i1 & 0x02;
          ta1 g = p1.g;
          if (i2) {
             i2 = eo5.z(2, i, g);
             int i3 = i2 / 8;
             i2 = i2 % 8;
             i2 = 1 << i2;
             i2 = i2 | uobyteArray[i3];
             uobyteArray[i3] = (byte)i2;
          }
          if (i1 = i1 & 0x04) {
             i1 = eo5.z(4, i, g);
             i = i1 / 8;
             i1 = i1 % 8;
             i1 = 1 << i1;
             i1 = i1 | uobyteArray[i];
             uobyteArray[i] = (byte)i1;
          }
       }
       p0.write(uobyteArray);
       return;
    }
    public static void b(Context p0,TextView p1,String p2,int p3){
       if (p2 != null && !TextUtils.isEmpty(p2)) {
          p1.setText(eo5.c(p0, p1.getText(), p2, 0, p3));
       }
       return;
    }
    public static void b0(ByteArrayOutputStream p0,ta1 p1){
       int i2;
       Iterator iterator = p1.i.entrySet().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          int i1 = uEntry.getKey().intValue();
          if (!(i2 = uEntry.getValue().intValue() & 0x01)) {
             continue ;
          }else {
             i = i1 - i;
             eb3.N(p0, i);
             eb3.N(p0, 0);
             i = i1;
          }
       }
       return;
    }
    public static SpannableStringBuilder c(Context p0,CharSequence p1,String p2,int p3,int p4){
       int i = 0;
       boolean b = (p3 && p3 > p1.length())? false: true;
       ap5.d("Label position is outside of text bounds", b);
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       CharSequence uCharSequenc = eo5.V(p1.subSequence(i, p3));
       p1 = eo5.V(p1.subSequence(p3, p1.length()));
       if (!TextUtils.isEmpty(uCharSequenc)) {
          spannableStr.append(uCharSequenc);
          spannableStr.append(' ');
       }
       spannableStr.append(p2);
       if (!TextUtils.isEmpty(p1)) {
          spannableStr.append(' ');
          spannableStr.append(p1);
       }
       lk2 olk2 = (p4 != 3)? new lk2(p0, 0x7f0304e9, xj0.e0(3.00f, p0.getResources())): new lk2(p0, 0x7f0304e8, xj0.e0(4.00f, p0.getResources()));
       spannableStr.setSpan(olk2, p3, (p2.length() + p3), 33);
       return spannableStr;
    }
    public static void c0(Parcel p0,Set p1){
       p0.writeInt(p1.size());
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          p0.writeString(iterator.next());
       }
       return;
    }
    public static Collection d(AbstractCollection p0){
       if (!p0 instanceof ch3 || p0 instanceof dh3) {
          return p0;
       }
       eo5.T(p0, "kotlin.collections.MutableCollection");
       throw null;
    }
    public static void d0(int p0,Parcel p1,Parcelable p2){
       int i;
       if (Build$VERSION.SDK_INT >= 23) {
          jx1.n(p0, p1, p2);
       }else if(p2 != null){
          i = 1;
       }else {
          i = 0;
       }
       p1.writeInt(i);
       if (i) {
          p2.writeToParcel(p1, p0);
       }
       return;
    }
    public static List e(Object p0){
       if (!p0 instanceof ch3 || p0 instanceof eh3) {
          return p0;
       }
       eo5.T(p0, "kotlin.collections.MutableList");
       throw null;
    }
    public static void f(ng2 p0){
       int arity;
       if (p0 != null) {
          int i = 1;
          if (p0 instanceof fh2) {
             arity = p0.getArity();
          }else if(p0 instanceof wf2){
             arity = 0;
          }else if(p0 instanceof zf2){
             arity = 1;
          }else {
             arity = 2;
          }
          if (arity != 2) {
             i = 0;
          }
          if (!i) {
             eo5.T(p0, "kotlin.jvm.functions.Function2");
             throw null;
          }
       }
       return;
    }
    public static final Bundle g(cu5 p0,String p1,List p2){
       f22 uof22;
       ki v;
       int i;
       Bundle uBundle = new Bundle();
       uBundle.putString("event", p0.a);
       uBundle.putString("app_id", p1);
       if (cu5.c == p0) {
          JSONArray jSONArray = new JSONArray();
          ArrayList uArrayList = dj0.C0(p2);
          eu1.a(uArrayList);
          boolean b = false;
          if ((uof22 = h22.f(p1, b)) != null) {
             b = uof22.a;
          }
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             ki oki = iterator.next();
             if ((v = oki.v) == null) {
                v = 1;
             }else {
                String str = oki.a.toString();
                co5.l(str, "jsonObject.toString\(\)");
                boolean b1 = co5.c(b3.c(str), v);
             }
             if (v) {
                v = oki.b;
                if (!(i = v ^ 0x01) && (v == null && b != null)) {
                   continue ;
                }
             }else {
                co5.K(oki, "Event with invalid checksum: ");
                HashSet a = sz1.a;
             }
             jSONArray.put(oki.a);
          }
          if (!jSONArray.length()) {
             return null;
          }else {
             uBundle.putString("custom_events", jSONArray.toString());
          }
       }
       return uBundle;
    }
    public static boolean h(boolean p0,boolean p1,Observer p2,yh6 p3,Disposable p4,pn5 p5){
       if (p5.v != null) {
          p3.clear();
          p4.dispose();
          return true;
       }else if(p0 && p1){
          if (p4 != null) {
             p4.dispose();
          }
          p2.onComplete();
          return true;
       }else {
          return false;
       }
    }
    public static byte[] i(ta1[] p0,byte[] p1){
       object oobject;
       int i5;
       int len = p0.length;
       int i = 0;
       int i2 = 0;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          oobject = p0[i1];
          int i3 = eo5.k(oobject.a, oobject.b, p1).getBytes(StandardCharsets.UTF_8).length + 16;
          int i4 = oobject.e * 2;
          i4 = i4 + i3;
          i4 = i4 + oobject.f;
          i5 = oobject.g * 2;
          i5 = i5 + 8;
          i5 = i5 - 1;
          i5 = i5 & 0xf8;
          i5 = i5 / 8;
          i5 = i5 + i4;
          i2 = i2 + i5;
       }
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream(i2);
       if (Arrays.equals(p1, ap5.z)) {
          i1 = p0.length;
          for (; i < i1; i = i + 1) {
             oobject = p0[i];
             eo5.Y(uByteArrayOu, oobject, eo5.k(oobject.a, oobject.b, p1));
             eo5.b0(uByteArrayOu, oobject);
             eo5.X(uByteArrayOu, oobject);
             eo5.a0(uByteArrayOu, oobject);
          }
       }else {
          i1 = p0.length;
          for (i5 = 0; i5 < i1; i5 = i5 + 1) {
             object oobject1 = p0[i5];
             eo5.Y(uByteArrayOu, oobject1, eo5.k(oobject1.a, oobject1.b, p1));
          }
          int len1 = p0.length;
          for (; i < len1; i = i + 1) {
             object oobject2 = p0[i];
             eo5.b0(uByteArrayOu, oobject2);
             eo5.X(uByteArrayOu, oobject2);
             eo5.a0(uByteArrayOu, oobject2);
          }
       }
       if (uByteArrayOu.size() == i2) {
          return uByteArrayOu.toByteArray();
       }else {
          throw new IllegalStateException("The bytes saved do not match expectation. actual="+uByteArrayOu.size()+" expected="+i2);
       }
    }
    public static void j(xh6 p0,Observer p1,Disposable p2,pn5 p3){
       Object obj;
       int i1;
       int i = 1;
       while (true) {
          if (eo5.h(p3.w, p0.isEmpty(), p1, p0, p2, p3)) {
          }else {
             while (true) {
                pn5 w = p3.w;
                if ((obj = p0.poll()) == null) {
                   i1 = 1;
                label_001f :
                   if (eo5.h(w, i1, p1, p0, p2, p3)) {
                      return;
                   }
                   if (i1) {
                      if (!(i = - i)) {
                         return;
                      }
                      continue ;
                   }else {
                      p3.j(p1, obj);
                   }
                }else {
                   i1 = 0;
                   goto label_001f ;
                }
             }
             return;
          }
       }
    }
    public static String k(String p0,String p1,byte[] p2){
       String str1;
       byte[] b = ap5.B;
       byte[] a = ap5.A;
       String str = "!";
       if (Arrays.equals(p2, b)) {
       }else if(Arrays.equals(p2, a)){
          str1 = str;
       label_0018 :
          if (p0.length() <= 0) {
             if (str.equals(str1)) {
                p0 = p1.replace(":", str);
             }else if(":".equals(str1)){
                p1 = p1.replace(str, ":");
             }
             p0 = p1;
             return p0;
          }else if(p1.equals("classes.dex")){
             return p0;
          }else if(!p1.contains(str) && !p1.contains(":")){
             if (p1.endsWith(".apk")) {
                return p1;
             }else {
                p0 = en6.r(p0);
                if (Arrays.equals(p2, b) || Arrays.equals(p2, a)) {
                   str = ":";
                }
                return en6.p(p0, str, p1);
             }
          }else if(str.equals(str1)){
             p0 = p1.replace(":", str);
          }else if(":".equals(str1)){
             p1 = p1.replace(str, ":");
          }
          p0 = p1;
          return p0;
       }
       str1 = ":";
       goto label_0018 ;
    }
    public static CharSequence l(ju2 p0){
       return eo5.y(p0.y().m(), p0.b().y("glue:subtitleAsHtml", false));
    }
    public static CharSequence m(ju2 p0){
       return eo5.y(p0.y().d(), p0.b().y("glue:titleAsHtml", false));
    }
    public static h10 n(int p0,Class p1,g10 p2,rm p3){
       return new h10(p0, new b7(28, p2), new vx5(p1, 11, p3));
    }
    public static final boolean o(Context p0,String p1){
       PackageManager packageManag;
       Intent intent;
       List list;
       co5.o(p1, "redirectURI");
       if ((packageManag = p0.getPackageManager()) != null) {
          intent = new Intent();
          intent.setAction("android.intent.action.VIEW");
          intent.addCategory("android.intent.category.DEFAULT");
          intent.addCategory("android.intent.category.BROWSABLE");
          intent.setData(Uri.parse(p1));
          list = packageManag.queryIntentActivities(intent, 64);
       }else {
          list = null;
       }
       boolean b = false;
       if (list != null) {
          Iterator iterator = list.iterator();
          intent = 0;
          while (true) {
             if (iterator.hasNext()) {
                ResolveInfo activityInfo = iterator.next().activityInfo;
                if (co5.c(activityInfo.name, "com.facebook.CustomTabActivity") && co5.c(activityInfo.packageName, p0.getPackageName())) {
                   activityInfo = 1;
                }else {
                   return b;
                }
             }else {
                b = intent;
                break ;
             }
          }
       }
       return b;
    }
    public static boolean p(ju2 p0){
       tu2 otu2 = p0.y();
       boolean b = (otu2.d() != null && (otu2.m() != null && (otu2.j() == null && otu2.e() == null)))? true: false;
       return b;
    }
    public static void q(Activity p0){
       if (p0 == null) {
          throw new NullPointerException("activity");
       }
       Application application = p0.getApplication();
       if (application instanceof ao2) {
          eo5.t(p0, application);
          return;
       }else {
          Object[] objArray = new Object[]{application.getClass().getCanonicalName(),ao2.class.getCanonicalName()};
          throw new RuntimeException(String.format("%s does not implement %s", objArray));
       }
    }
    public static void r(Service p0){
       if (p0 == null) {
          throw new NullPointerException("service");
       }
       Application application = p0.getApplication();
       if (application instanceof ao2) {
          eo5.t(p0, application);
          return;
       }else {
          Object[] objArray = new Object[]{application.getClass().getCanonicalName(),ao2.class.getCanonicalName()};
          throw new RuntimeException(String.format("%s does not implement %s", objArray));
       }
    }
    public static void s(BroadcastReceiver p0,Context p1){
       if (p0 == null) {
          throw new NullPointerException("broadcastReceiver");
       }
       if (p1 == null) {
          throw new NullPointerException("context");
       }
       Application applicationC = p1.getApplicationContext();
       if (applicationC instanceof ao2) {
          eo5.t(p0, applicationC);
          return;
       }else {
          Object[] objArray = new Object[]{applicationC.getClass().getCanonicalName(),ao2.class.getCanonicalName()};
          throw new RuntimeException(String.format("%s does not implement %s", objArray));
       }
    }
    public static void t(Object p0,ao2 p1){
       sc osc = p1.d();
       co5.k(osc, p1.getClass(), "%s.androidInjector\(\) returned null");
       osc.a(p0);
    }
    public static h10 u(int p0){
       return new h10(p0, new bm(p0), new rm(22));
    }
    public static mm0 v(int p0,boolean p1){
       mm0 omm0 = new mm0(p0, -1);
       omm0.c = p1;
       return omm0;
    }
    public static final EsLoggingParams$LoggingParams w(rt p0){
       hq1 ohq1 = EsLoggingParams$LoggingParams.i();
       rt a = p0.a;
       if (a.c()) {
          oq1 ooq1 = EsOptional$OptionalInt64.i();
          Object obj = a.b();
          co5.l(obj, "loggingParams.commandInitiatedTime\(\).get\(\)");
          ooq1.c(obj.longValue());
          ohq1.e(ooq1.build());
       }
       a = p0.c;
       if (r45.a(w51.y(a)).c()) {
          ohq1.d(r45.a(w51.y(a)).b());
       }
       p0 = p0.d;
       if (r45.a(w51.y(p0)).c()) {
          ohq1.c(r45.a(w51.y(p0)).b());
       }
       c uoc = ohq1.build();
       co5.l(uoc, "newBuilder\(\).apply {\n   …)\n        }\n    }.build\(\)");
       return uoc;
    }
    public static final m73 x(Map p0,Class p1,n26 p2){
       dt5 x;
       int i;
       k73 ok73;
       Object obj;
       if (p0 != null && !p0.isEmpty()) {
          if (p0 instanceof m73) {
             x = p0;
             Collection uCollection = x.values();
             co5.l(uCollection, "map.values");
             if (!uCollection.isEmpty()) {
                Iterator key = uCollection.iterator();
                while (true) {
                   if (key.hasNext()) {
                      if (!co5.c(key.next().getClass(), p1)) {
                         ok73 = 0;
                         break ;
                      }
                   }
                }
                if (!i) {
                label_003f :
                   ok73 = m73.a();
                   Iterator iterator = p0.entrySet().iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      key = uEntry.getKey();
                      if ((obj = p2.invoke(uEntry.getValue())) == null) {
                         continue ;
                      }
                      ok73.d(key, obj);
                   }
                   x = ok73.b(true);
                }
             }
             i = 1;
          }else {
             goto label_003f ;
          }
       }else {
          x = dt5.x;
       }
       return x;
    }
    public static CharSequence y(String p0,boolean p1){
       Spanned spanned;
       if (p0 != null) {
       }else {
          p0 = "";
       }
       if (p1 && !te5.a(p0)) {
          spanned = eb3.k(p0);
       }
       return spanned;
    }
    public static int z(int p0,int p1,int p2){
       if (p0 == 1) {
          throw new IllegalStateException("HOT methods are not stored in the bitmap");
       }
       if (p0 == 2) {
          return p1;
       }
       if (p0 == 4) {
          return (p1 + p2);
       }
       throw new IllegalStateException(tp2.k("Unexpected flag: ", p0));
    }
}
