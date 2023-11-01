package p.ly0;
import p.by0;
import p.ey0;
import p.dv0;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.util.Map;
import java.util.Collections;
import android.content.Context;
import p.wx0;
import p.yy6;
import p.u53;
import p.i51;
import p.a70;
import p.kf6;
import p.i77;
import p.oy0;
import p.ze;
import p.zb;
import p.es;
import java.util.concurrent.atomic.AtomicInteger;
import p.m07;
import java.util.concurrent.atomic.AtomicBoolean;
import p.uv1;
import p.xj0;
import android.content.res.Resources;
import android.util.Log;
import p.oe7;
import p.u44;
import p.sr3;
import p.b7;
import p.g54;
import p.fy0;
import p.xl0;
import p.nq6;
import p.am2;
import java.io.File;
import p.kz0;
import p.tz0;
import p.n51;
import p.t87;
import p.s80;
import java.lang.Class;
import p.nq5;
import java.util.Set;
import p.t63;
import p.fw;
import java.nio.charset.Charset;
import p.xl1;
import p.o11;
import p.s87;
import java.lang.IllegalArgumentException;
import p.a28;
import java.util.ArrayList;
import p.xx0;
import java.io.FilenameFilter;
import java.lang.Long;
import p.vv7;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p.dy0;
import p.t5;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import java.util.List;
import java.util.Date;
import p.t80;
import java.util.Locale;
import p.ay0;
import p.jy0;
import p.et0;
import p.ob2;
import android.os.Build$VERSION;
import p.hy0;
import android.os.StatFs;
import android.os.Environment;
import p.wj0;
import android.os.Build;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.HashMap;
import java.lang.Enum;
import java.lang.Runtime;
import p.cy0;
import p.jz0;
import p.ej5;
import java.lang.Integer;
import p.as;
import java.lang.Boolean;
import p.cs;
import p.oy6;
import p.qs;
import p.fs;
import p.bs;
import p.vr;
import p.nz0;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.NullPointerException;
import java.io.FileOutputStream;
import p.wh0;
import java.lang.StringBuilder;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.System;
import java.io.OutputStream;
import java.util.Comparator;
import java.util.Arrays;
import java.lang.Throwable;
import java.util.HashSet;
import java.lang.Math;
import java.util.regex.Matcher;
import p.c84;
import java.util.Scanner;
import p.si4;
import p.gf4;
import p.s32;
import p.kg4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import p.c10;
import p.q80;
import java.io.Serializable;
import java.util.Iterator;
import p.ff4;
import p.co5;
import p.li5;
import p.zr;
import p.n91;
import p.i73;
import p.yr;
import java.util.Objects;
import p.az7;
import p.hh0;
import p.oz0;
import android.util.JsonReader;
import java.io.StringReader;
import p.gs;
import java.io.IOException;
import p.iz0;
import java.lang.IllegalStateException;
import java.util.concurrent.atomic.AtomicReference;
import p.uc6;
import p.vh4;
import java.lang.ThreadLocal;
import p.vz0;
import java.util.LinkedList;
import java.util.Collection;
import p.vf;
import p.o07;
import p.pv6;
import p.if7;
import p.bu0;
import p.iy0;
import java.lang.Thread;
import p.zq7;
import p.e67;
import java.lang.Float;
import android.hardware.SensorManager;
import android.hardware.Sensor;
import android.content.res.Configuration;
import android.app.ActivityManager$MemoryInfo;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.lang.StackTraceElement;
import java.util.Map$Entry;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import p.bc6;
import p.k80;

public final class ly0	// class@001de6 from classes.dex
{
    public final AtomicInteger a;
    public final Context b;
    public final i51 c;
    public final kf6 d;
    public final oe7 e;
    public final wx0 f;
    public final yy6 g;
    public final u53 h;
    public final a70 i;
    public final i77 j;
    public final uv1 k;
    public final u44 l;
    public final sr3 m;
    public final b7 n;
    public final fy0 o;
    public final oy0 p;
    public final xl0 q;
    public final String r;
    public final zb s;
    public final i77 t;
    public vz0 u;
    public final m07 v;
    public final m07 w;
    public final m07 x;
    public final AtomicBoolean y;
    public static final ey0 A;
    public static final dv0 B;
    public static final dv0 C;
    public static final Pattern D;
    public static final Map E;
    public static final String[] F;
    public static final by0 z;

    static {
       ly0.z = new by0();
       ly0.A = new ey0(0);
       ly0.B = new dv0(6);
       ly0.C = new dv0(7);
       ly0.D = Pattern.compile("\([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}\).+");
       ly0.E = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
       String[] stringArray = new String[]{"SessionUser","SessionApp","SessionOS","SessionDevice"};
       ly0.F = stringArray;
    }
    public void ly0(Context p0,wx0 p1,yy6 p2,u53 p3,i51 p4,a70 p5,kf6 p6,i77 p7,oy0 p8,ze p9,zb p10,es p11){
       int i2;
       String str1;
       u44 str1;
       byte[] uobyteArray;
       AtomicInteger uAtomicInteg = this;
       Context uContext = p0;
       u53 ou53 = p3;
       a70 uoa70 = p5;
       i77 oi77 = p7;
       ze oze = p9;
       super();
       int i = 0;
       uAtomicInteg.a = new AtomicInteger(i);
       uAtomicInteg.v = new m07();
       uAtomicInteg.w = new m07();
       uAtomicInteg.x = new m07();
       uAtomicInteg.y = new AtomicBoolean(i);
       uAtomicInteg.b = uContext;
       uAtomicInteg.f = p1;
       uAtomicInteg.g = p2;
       uAtomicInteg.h = ou53;
       uAtomicInteg.c = p4;
       uAtomicInteg.i = uoa70;
       uAtomicInteg.d = p6;
       uAtomicInteg.j = oi77;
       uAtomicInteg.k = new uv1(19, uAtomicInteg);
       uAtomicInteg.p = p8;
       String str = null;
       int i1 = 3;
       boolean b = true;
       if (oze.a == null) {
          ze b1 = oze.b;
          if (i2 = xj0.o0(b1, "com.google.firebase.crashlytics.unity_version", "string")) {
             str1 = b1.getResources().getString(i2);
             Log.isLoggable("FirebaseCrashlytics", i1);
          }else {
             str1 = str;
          }
          oze.c = str1;
          oze.a = b;
       }
       if ((oze = oze.c) == null) {
          String str3 = str;
       }
       uAtomicInteg.r = oze;
       uAtomicInteg.s = p10;
       oe7 ooe7 = new oe7(6);
       uAtomicInteg.e = ooe7;
       str1 = new u44(20, uoa70);
       uAtomicInteg.l = str1;
       sr3 osr3 = new sr3(uContext, str1, str);
       uAtomicInteg.m = osr3;
       uAtomicInteg.n = new b7(17, new g54(uAtomicInteg));
       uAtomicInteg.o = new fy0(uAtomicInteg);
       nq6[] onq6Array = new nq6[b];
       int i3 = 4;
       onq6Array[i] = new am2(10, i3);
       xl0 str11 = new xl0(onq6Array);
       uAtomicInteg.q = str11;
       kz0 okz0 = new kz0(uContext, ou53, oi77, str11);
       tz0 otz0 = new tz0(new File(new File(uoa70.a.getFilesDir(), ".com.google.firebase.crashlytics").getPath()), p11);
       t87.b(p0);
       t87 ot87 = t87.a();
       ot87.getClass();
       Set set = Collections.unmodifiableSet(s80.d);
       t63 ot63 = fw.a();
       ot63.r("cct");
       String c = n51.c;
       String d = n51.d;
       int i4 = 2;
       if (d == null && c == null) {
          uobyteArray = null;
       }else {
          Object[] objArray1 = new Object[i3];
          objArray1[i] = "1$";
          objArray1[b] = c;
          objArray1[i4] = "\\";
          if (d == null) {
             d = "";
          }
          objArray1[i1] = d;
          uobyteArray = String.format("%s%s%s%s", objArray1).getBytes(Charset.forName("UTF-8"));
       }
       ot63.c = uobyteArray;
       nq5 onq5 = new nq5(set, ot63.j(), ot87);
       String str2 = "FIREBASE_CRASHLYTICS_REPORT";
       xl1 oxl1 = new xl1("json");
       gg1 e = n51.e;
       if (onq5.a.contains(oxl1)) {
          o11 oo11 = new o11(onq5.b, str2, oxl1, e, onq5.c, 5);
          oi77 = new i77(okz0, otz0, new n51(i), osr3, ooe7);
          uAtomicInteg.t = onq5;
          return;
       }else {
          Object[] objArray = new Object[i4];
          objArray[i] = oxl1;
          objArray[b] = onq5.a;
          throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", objArray));
       }
    }
    public static a28 a(ly0 p0){
       int i2;
       int i3;
       a28 uoa28;
       p0.getClass();
       ArrayList uArrayList = new ArrayList();
       File[] uFileArray = p0.l(xx0.a);
       int len = uFileArray.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = uFileArray[i];
          int i1 = 3;
          try{
             long l = Long.parseLong(oobject.getName().substring(i1));
             try{
                i2 = 1;
                Class.forName("com.google.firebase.crash.FirebaseCrash");
                i3 = 1;
             }catch(java.lang.ClassNotFoundException e0){
                i3 = 0;
             }
             if (i3) {
                Log.isLoggable(e0, i1);
                uoa28 = vv7.t(null);
             }else {
                uoa28 = new a28();
                new ScheduledThreadPoolExecutor(i2).execute(new t5(uoa28, new dy0(p0, l), 22));
             }
             uArrayList.add(uoa28);
          }catch(java.lang.NumberFormatException e0){
             oobject.getName();
             Log.isLoggable(e0, i1);
          }
          oobject.delete();
       }
       return vv7.Y(uArrayList);
    }
    public static void b(ly0 p0){
       i77 a2;
       String str8;
       u53 c2;
       vr h1;
       Integer integer;
       wj0 owj0;
       ly0 oly0 = p0;
       p0.getClass();
       long l = new Date().getTime() / 1000;
       ly0 h = oly0.h;
       t80 ot80 = new t80(h);
       String b = t80.b;
       String str = "FirebaseCrashlytics";
       Log.isLoggable(str, 3);
       ly0 p = oly0.p;
       p.g(b);
       Locale uS = Locale.US;
       int i = 1;
       Object[] objArray = new Object[i];
       String str1 = "17.2.1";
       objArray[0] = str1;
       String str2 = String.format(uS, "Crashlytics Android SDK/%s", objArray);
       oly0.s(b, "BeginSession", new ay0(b, str2, l));
       p.e(b, str2, l);
       u53 c = h.c;
       ly0 j = oly0.j;
       i77 oi77 = j.e;
       i77 oi771 = j.f;
       cy0 String str3 = h.b();
       if (j.c != null) {
          i = 4;
       }
       boolean i1 = et0.h(i);
       ob2 oob2 = v4;
       ob2 oob21 = v4;
       long l1 = l;
       String str4 = str1;
       oob2 = new ob2(p0, c, oi77, oi771, str3, i1);
       oly0.s(b, "SessionApp", oob21);
       Locale locale = uS;
       int i2 = 3;
       str3 = str;
       str1 = b;
       oly0.p.d(b, c, oi77, oi771, str3, i1, oly0.r);
       String rELEASE = Build$VERSION.RELEASE;
       String cODENAME = Build$VERSION.CODENAME;
       ly0 b1 = oly0.b;
       boolean b2 = xj0.D0(b1);
       oly0.s(str1, "SessionOS", new hy0(oly0, rELEASE, cODENAME, b2));
       p.f(str1, rELEASE, b2, cODENAME);
       StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
       b = Build.CPU_ABI;
       wj0 a = wj0.a;
       if (TextUtils.isEmpty(b)) {
          Log.isLoggable(str3, i2);
       }else if((owj0 = wj0.b.get(b.toLowerCase(locale))) == null){
          a = owj0;
       }
       int i3 = a.ordinal();
       str = Build.MODEL;
       i1 = Runtime.getRuntime().availableProcessors();
       long l2 = xj0.q0();
       String str5 = str3;
       Locale locale1 = locale;
       long l3 = (long)statFs.getBlockSize() * (long)statFs.getBlockCount();
       i1 = xj0.A0(b1);
       int i4 = xj0.l0(b1);
       String mANUFACTURER = Build.MANUFACTURER;
       String pRODUCT = Build.PRODUCT;
       str3 = new cy0(i3, str, i1, l2, l3, i1, i4, mANUFACTURER, pRODUCT);
       oly0.s(str1, "SessionDevice", str3);
       String str6 = str;
       str3 = str;
       str3 = b;
       long l4 = l2;
       oly0.p.c(str1, i3, str6, i1, l4, l3, i1, i4, mANUFACTURER, pRODUCT);
       oly0.m.a(str1);
       String str7 = str1.replaceAll("-", "");
       j = oly0.t;
       j.f = str7;
       i77 a1 = j.a;
       a1.getClass();
       int i5 = 6;
       ej5 uoej5 = new ej5(i5);
       uoej5.a = str4;
       kz0 c1 = a1.c;
       if ((a2 = c1.a) != null) {
          uoej5.b = a2;
          kz0 b3 = a1.b;
          if ((str8 = b3.b()) != null) {
             uoej5.d = str8;
             i77 e = c1.e;
             str6 = "Null buildVersion";
             if (e != null) {
                uoej5.e = e;
                if ((e = c1.f) != null) {
                   uoej5.f = e;
                   uoej5.c = Integer.valueOf(4);
                   as uoas = new as(0);
                   uoas.a = Boolean.FALSE;
                   uoas.d = Long.valueOf(l1);
                   str = "Null identifier";
                   if (str7 != null) {
                      uoas.c = str7;
                      if ((str7 = kz0.e) != null) {
                         uoas.b = str7;
                         o11 oo11 = new o11(7);
                         if ((c2 = b3.c) != null) {
                            oo11.b = c2;
                            i77 e1 = c1.e;
                            b = "Null version";
                            if (e1 != null) {
                               oo11.c = e1;
                               oo11.t = c1.f;
                               oo11.w = b3.b();
                               uoas.f = oo11.e();
                               oy6 ooy6 = new oy6(i5);
                               ooy6.b = Integer.valueOf(3);
                               if (rELEASE != null) {
                                  ooy6.c = rELEASE;
                                  if (cODENAME != null) {
                                     ooy6.t = cODENAME;
                                     kz0 a3 = a1.a;
                                     ooy6.v = Boolean.valueOf(xj0.D0(a3));
                                     uoas.h = ooy6.j();
                                     StatFs statFs1 = new StatFs(Environment.getDataDirectory().getPath());
                                     int i6 = (TextUtils.isEmpty(str3) || (integer = kz0.f.get(str3.toLowerCase(locale1))) == null)? 7: integer.intValue();
                                     int i7 = Runtime.getRuntime().availableProcessors();
                                     l = xj0.q0();
                                     long l5 = (long)statFs1.getBlockCount() * (long)statFs1.getBlockSize();
                                     boolean b4 = xj0.A0(a3);
                                     i = xj0.l0(a3);
                                     es uoes = new es();
                                     uoes.a = Integer.valueOf(i6);
                                     if (str3 != null) {
                                        uoes.d = str3;
                                        uoes.b = Integer.valueOf(i7);
                                        uoes.g = Long.valueOf(l);
                                        uoes.h = Long.valueOf(l5);
                                        uoes.i = Boolean.valueOf(b4);
                                        uoes.c = Integer.valueOf(i);
                                        if (mANUFACTURER != null) {
                                           uoes.e = mANUFACTURER;
                                           if (pRODUCT != null) {
                                              try{
                                                 uoes.f = pRODUCT;
                                                 uoas.i = uoes.a();
                                                 uoas.k = Integer.valueOf(3);
                                                 uoej5.g = uoas.a();
                                                 vr ovr = uoej5.b();
                                                 i77 b5 = j.b;
                                                 b5.getClass();
                                                 if ((h1 = ovr.h) == null) {
                                                    Log.isLoggable(str5, 3);
                                                 }else {
                                                    bs StringWriter b6 = h1.b;
                                                    File uFile = new File(b5.b, b6);
                                                    tz0.f(uFile);
                                                    tz0.i.getClass();
                                                    g54 a4 = nz0.a;
                                                    a4.getClass();
                                                    b6 = new StringWriter();
                                                    a4.n(ovr, b6);
                                                    tz0.i(new File(uFile, "report"), b6.toString());
                                                 }
                                              }catch(java.io.IOException e0){
                                                 Log.isLoggable(str5, 3);
                                              }catch(java.io.IOException e0){
                                              }
                                              return;
                                           }else {
                                              throw new NullPointerException("Null modelClass");
                                           }
                                        }else {
                                           throw new NullPointerException("Null manufacturer");
                                        }
                                     }else {
                                        throw new NullPointerException("Null model");
                                     }
                                  }else {
                                     throw new NullPointerException(str6);
                                  }
                               }else {
                                  throw new NullPointerException(b);
                               }
                            }else {
                               throw new NullPointerException(b);
                            }
                         }else {
                            throw new NullPointerException(str);
                         }
                      }else {
                         throw new NullPointerException("Null generator");
                      }
                   }else {
                      throw new NullPointerException(str);
                   }
                }else {
                   throw new NullPointerException("Null displayVersion");
                }
             }else {
                throw new NullPointerException(str6);
             }
          }else {
             throw new NullPointerException("Null installationUuid");
          }
       }else {
          throw new NullPointerException("Null gmpAppId");
       }
    }
    public static void c(File p0,String p1){
       if (p1 == null) {
          return;
       }
       FileOutputStream uFileOutputS = new FileOutputStream(p0, true);
       byte[] uobyteArray = new byte[4096];
       wh0 owh0 = new wh0(uFileOutputS, uobyteArray);
       new g54(p1).h(owh0);
       xj0.h0(owh0, "Failed to flush to append to "+p0.getPath());
       xj0.l(uFileOutputS, "Failed to close "+p0.getPath());
       return;
    }
    public static void d(FileInputStream p0,wh0 p1,int p2){
       int i1;
       byte[] uobyteArray = new byte[p2];
       int i = 0;
       while (i < p2) {
          i1 = p2 - i;
          if ((i1 = p0.read(uobyteArray, i, i1)) >= 0) {
             i = i + i1;
          }else {
             break ;
          }
       }
       wh0 c = p1.c;
       wh0 b = p1.b;
       i1 = b - c;
       wh0 a = p1.a;
       if (i1 >= p2) {
          System.arraycopy(uobyteArray, 0, a, c, p2);
          p1.c = p1.c + p2;
       }else {
          System.arraycopy(uobyteArray, 0, a, c, i1);
          int i2 = i1 + 0;
          p2 = p2 - i1;
          p1.c = b;
          p1.h();
          if (p2 <= b) {
             System.arraycopy(uobyteArray, i2, a, 0, p2);
             p1.c = p2;
          }else {
             p1.t.write(uobyteArray, i2, p2);
          }
       }
       return;
    }
    public static String i(File p0){
       return p0.getName().substring(0, 35);
    }
    public static void q(wh0 p0,File[] p1,String p2){
       Arrays.sort(p1, xj0.c);
       int len = p1.length;
       int i = 0;
       while (i < len) {
          object oobject = p1[i];
          try{
             Object[] objArray = new Object[]{p2,oobject.getName()};
             String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", objArray);
             Log.isLoggable("FirebaseCrashlytics", 3);
             ly0.t(p0, oobject);
          }catch(java.lang.Exception e4){
             Log.e("FirebaseCrashlytics", "Error writting non-fatal to session.", e4);
          }
          i = i + 1;
       }
       return;
    }
    public static void t(wh0 p0,File p1){
       String str = "Failed to close file input stream.";
       Throwable throwable = null;
       if (!p1.exists()) {
          Log.e("FirebaseCrashlytics", "Tried to include a file that doesn\'t exist: "+p1.getName(), throwable);
          return;
       }else {
          FileInputStream uFileInputSt = new FileInputStream(p1);
          ly0.d(uFileInputSt, p0, (int)p1.length());
          xj0.l(uFileInputSt, str);
          return;
       }
    }
    public final void e(int p0,boolean p1){
       File[] uFileArray1;
       int len;
       int i4;
       String str;
       int i5;
       ly0 e;
       String str4;
       int i6;
       File[] uFileArray3;
       String str5;
       int i7;
       boolean b2;
       String str6;
       int b3;
       int i8;
       int i9;
       String str8;
       File uFile1;
       int i10;
       wh0 owh0;
       hh0 ohh0;
       Iterator iterator;
       String str10;
       File obj2;
       String str11;
       File uFile2;
       vr h;
       ArrayList uArrayList1;
       Iterator iterator2;
       ly0 oly02;
       ly0 oly03;
       Serializable serializable;
       ff4 uoff4;
       InputStream inputStream;
       byte[] uobyteArray2;
       zr ozr;
       li5 oli5;
       sr3 osr31;
       sr3 osr32;
       Closeable uCloseable;
       FileInputStream i4;
       ly0 oly0 = this;
       int i = p1 ^ 0x01;
       HashSet hashSet = new HashSet();
       by0 z = ly0.z;
       File[] uFileArray = oly0.l(z);
       dv0 b = ly0.B;
       Arrays.sort(uFileArray, b);
       int i1 = Math.min((i + 8), uFileArray.length);
       int i2 = 0;
       for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
          hashSet.add(ly0.i(uFileArray[i3]));
       }
       sr3 b1 = oly0.m.b;
       b1.getClass();
       File uFile = new File(b1.b.b(), "log-files");
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       if ((uFileArray1 = uFile.listFiles()) != null) {
          len = uFileArray1.length;
          i3 = 0;
          while (i3 < len) {
             object oobject = uFileArray1[i3];
             String name = oobject.getName();
             if ((i4 = name.lastIndexOf(".temp")) != -1) {
                name = name.substring(20, i4);
             }
             if (!hashSet.contains(name)) {
                oobject.delete();
             }
             i3 = i3 + 1;
          }
       }
       uFileArray1 = oly0.l(new ey0());
       len = uFileArray1.length;
       i3 = 0;
       while (true) {
          str = "FirebaseCrashlytics";
          i5 = 3;
          i4 = 1;
          if (i3 < len) {
             object oobject1 = uFileArray1[i3];
             Matcher matcher = ly0.D.matcher(oobject1.getName());
             if (!matcher.matches()) {
                Log.isLoggable(str, i5);
                oobject1.delete();
             }else if(!hashSet.contains(matcher.group(i4))){
                Log.isLoggable(str, i5);
                oobject1.delete();
             }
             i3 = i3 + 1;
          }else {
             break ;
          }
       }
       File[] uFileArray2 = oly0.l(z);
       Arrays.sort(uFileArray2, b);
       if (uFileArray2.length <= i) {
          Log.isLoggable(str, i5);
          return;
       }else {
          String str1 = ly0.i(uFileArray2[i]);
          String str2 = "";
          File[] obj = null;
          if (this.j()) {
             e = oly0.e;
          }else {
             str4 = "Failed to close user metadata file.";
             uFile2 = new c84(this.h()).a(str1);
             b3 = 6;
             if (!uFile2.exists()) {
                e = new oe7(b3);
             }else {
                try{
                   try{
                      i4 = new FileInputStream(uFile2);
                      Scanner scanner = new Scanner(i4).useDelimiter("\\A");
                      str11 = (scanner.hasNext())? scanner.next(): str2;
                      e = c84.b(str11);
                      xj0.l(i4, str4);
                   }catch(java.lang.Exception e0){
                   }
                   Log.e(str, "Error deserializing user metadata.", e0);
                   xj0.l(uCloseable, str4);
                   e = new oe7(b3);
                }catch(java.lang.Exception e0){
                   uCloseable = obj;
                }
             }
          }
          oly0.s(str1, "SessionUser", new si4(oly0, e, i2));
          String str3 = "report";
          str4 = "user";
          ly0 t = oly0.t;
          if (p1) {
             t.f = obj;
          }else {
             ly0 obj1 = oly0.p;
             if (obj1.h(str1)) {
                Log.isLoggable(str, i5);
                gf4 ogf4 = obj1.b(str1);
                if ((uFile2 = ogf4.j()) != null && uFile2.exists()) {
                   long File l2 = uFile2.lastModified();
                   i6 = i;
                   n91 ly0 b5 = oly0.b;
                   sr3 osr3 = new sr3(b5, oly0.l, str1);
                   uFileArray3 = uFileArray2;
                   oly02 = obj1;
                   File uFile4 = new File(new File(this.h(), "native-sessions"), str1);
                   if (!uFile4.mkdirs()) {
                      Log.isLoggable(str, 3);
                      oly03 = oly02;
                      str5 = str;
                   label_03a7 :
                      oly03.a(str1);
                   label_03b0 :
                      i1 = 3;
                      Log.isLoggable(str5, i1);
                      i = i6;
                      File[] uFileArray4 = uFileArray3;
                      while (i < uFileArray4.length) {
                         object oobject2 = uFileArray4[i];
                         str1 = ly0.i(oobject2);
                         Log.isLoggable(str5, i1);
                         Log.isLoggable(str5, i1);
                         i7 = 1;
                         ly0 oly01 = this;
                         uFileArray1 = oly01.l(new az7(kg4.l(str1, "SessionCrash"), i7));
                         b2 = (uFileArray1.length > 0)? true: false;
                         Locale uS = Locale.US;
                         Object[] objArray = new Object[2];
                         objArray[0] = str1;
                         objArray[i7] = Boolean.valueOf(b2);
                         String.format(uS, "Session %s has fatal exception: %s", objArray);
                         Log.isLoggable(str5, 3);
                         str6 = "SessionEvent";
                         obj = oly01.l(new az7(kg4.l(str1, str6), i7));
                         b3 = (obj.length > 0)? true: false;
                         Object[] objArray1 = new Object[]{str1,Boolean.valueOf(b3)};
                         uFileArray3 = uFileArray4;
                         String.format(uS, "Session %s has non-fatal exceptions: %s", objArray1);
                         i8 = 3;
                         Log.isLoggable(str5, i8);
                         if (!b2 && !b3) {
                            Log.isLoggable(str5, i8);
                            i1 = 3;
                            i9 = i;
                            str8 = str3;
                            i10 = str4;
                         }else {
                            i9 = p0;
                            if (obj.length > i9) {
                               Object[] objArray2 = new Object[]{Integer.valueOf(p0)};
                               String.format(uS, "Trimming down to %d logged exceptions.", objArray2);
                               Log.isLoggable(str5, i8);
                               oly01.n(i9, str1);
                               obj = oly01.l(new az7(kg4.l(str1, str6), 1));
                            }
                            object oobject3 = (b2)? uFileArray1[0]: null;
                            String str7 = "Failed to close CLS file";
                            str = "Error flushing session file stream";
                            b3 = (oobject3 != null)? 1: 0;
                            if (b3) {
                               str8 = str3;
                               uFile1 = new File(this.h(), "fatal-sessions");
                            }else {
                               str8 = str3;
                               uFile1 = new File(this.h(), "nonfatal-sessions");
                            }
                            if (!uFile1.exists()) {
                               uFile1.mkdirs();
                            }
                            try{
                               try{
                                  ohh0 = new hh0(uFile1, str1);
                                  byte[] uobyteArray = new byte[4096];
                                  owh0 = new wh0(ohh0, uobyteArray);
                                  try{
                                     uobyteArray = 3;
                                     Log.isLoggable(str5, uobyteArray);
                                     ly0.t(owh0, oobject2);
                                     long time = new Date().getTime();
                                     try{
                                        i9 = i;
                                        long l = time / 1000;
                                        i10 = str4;
                                        i3 = 4;
                                        try{
                                           owh0.q(i3, l);
                                           owh0.o(5, 0);
                                           owh0.l(b3);
                                           owh0.p(11, 1);
                                           owh0.j(12, 3);
                                           oly01.p(owh0, str1);
                                           ly0.q(owh0, obj, str1);
                                           if (b3) {
                                              ly0.t(owh0, oobject3);
                                           label_04de :
                                              xj0.h0(owh0, str);
                                              xj0.l(ohh0, str7);
                                           }else {
                                              goto label_04de ;
                                           }
                                        }catch(java.lang.Exception e0){
                                        }
                                     label_0504 :
                                        Log.e(str5, "Failed to write session file for session ID: ".append(str1).toString(), e0);
                                        xj0.h0(owh0, str);
                                        if (ohh0) {
                                           try{
                                              ohh0.b();
                                           }catch(java.io.IOException e0){
                                              Log.e(str5, "Error closing session file stream in the presence of an exception", e0);
                                           }
                                        }
                                     }catch(java.lang.Exception e0){
                                     }
                                     i10 = str4;
                                     goto label_0504 ;
                                  }catch(java.lang.Exception e0){
                                     i9 = i;
                                  }
                               }catch(java.lang.Exception e0){
                                  i9 = i;
                                  i10 = str4;
                                  owh0 = null;
                                  goto label_0504 ;
                               }
                            }catch(java.lang.Exception e0){
                               i9 = i;
                               i10 = str4;
                               owh0 = null;
                               ohh0 = null;
                               goto label_0504 ;
                            }
                         }
                         Log.isLoggable(str5, i1);
                         uFileArray1 = oly01.l(new az7(str1, 2));
                         i8 = uFileArray1.length;
                         for (i = 0; i < i8; i = i + 1) {
                            uFileArray1[i].delete();
                         }
                         i = i9 + 1;
                         i1 = 3;
                         str3 = str8;
                         uFileArray4 = uFileArray3;
                         str4 = i10;
                      }
                      str8 = str3;
                      String str9 = str4;
                      long l1 = new Date().getTime() / 1000;
                      i77 oi77 = t.b;
                      oi77.getClass();
                      List list = tz0.e(oi77.b, new oz0(0, t.f));
                      Collections.sort(list, tz0.j);
                      i7 = 8;
                      if (list.size() > i7) {
                         iterator = list.subList(i7, list.size()).iterator();
                         while (iterator.hasNext()) {
                            tz0.h(iterator.next());
                         }
                         list = list.subList(0, i7);
                      }
                      iterator = list.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            obj1 = iterator.next();
                            list = tz0.d(obj1, tz0.k);
                            if (list.isEmpty()) {
                               str10 = str8;
                               str4 = str9;
                            }else {
                               Collections.sort(list);
                               ArrayList uArrayList = new ArrayList();
                               Iterator iterator1 = list.iterator();
                               while (true) {
                                  b2 = false;
                                  while (true) {
                                     nz0 i11 = tz0.i;
                                     if (iterator1.hasNext()) {
                                        obj2 = iterator1.next();
                                        try{
                                           str11 = tz0.g(obj2);
                                           try{
                                              i11.getClass();
                                              JsonReader jsonReader = new JsonReader(new StringReader(str11));
                                              gs ogs = nz0.b(jsonReader);
                                              try{
                                                 jsonReader.close();
                                                 uArrayList.add(ogs);
                                                 if (!b2) {
                                                    str11 = obj2.getName();
                                                    ogs = (str11.startsWith("event") && str11.endsWith("_"))? 1: 0;
                                                    if (!ogs) {
                                                       continue ;
                                                    }
                                                 }
                                                 b2 = true;
                                              }catch(java.io.IOException e0){
                                                 Objects.toString(obj2);
                                                 Log.isLoggable(str5, 3);
                                              }
                                           }catch(java.lang.IllegalStateException e0){
                                              throw new IOException(e0);
                                           }
                                        }catch(java.io.IOException e0){
                                        }
                                     }else {
                                        try{
                                           str4 = str9;
                                           uFile2 = new File(obj1, str4);
                                           if (uFile2.isFile()) {
                                              try{
                                                 str11 = tz0.g(uFile2);
                                              label_0650 :
                                                 str10 = str8;
                                                 obj2 = new File(obj1, str10);
                                                 tz0 c = (b2)? oi77.c: oi77.d;
                                                 i11.getClass();
                                                 vr ovr = nz0.f(tz0.g(obj2)).a(l1, str11, b2);
                                                 i73 oi73 = new i73(uArrayList);
                                                 if ((h = ovr.h) != null) {
                                                    ej5 uoej5 = new ej5(ovr);
                                                    as ovr1 = new as(h);
                                                    ovr1.j = oi73;
                                                    uoej5.g = ovr1.a();
                                                    ovr = uoej5.b();
                                                    if ((h = ovr.h) != null) {
                                                       tz0.f(c);
                                                       File uFile3 = new File(c, h.b);
                                                       g54 a = nz0.a;
                                                       a.getClass();
                                                       StringWriter uoej51 = new StringWriter();
                                                       a.n(ovr, uoej51);
                                                       tz0.i(uFile3, uoej51.toString());
                                                    }
                                                 }else {
                                                    throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                                 }
                                              }catch(java.io.IOException e0){
                                                 obj1.getName();
                                                 Log.isLoggable(str5, 3);
                                              }
                                              str11 = null;
                                              goto label_0650 ;
                                           }else {
                                           }
                                        }catch(java.io.IOException e0){
                                           Objects.toString(obj2);
                                           Log.isLoggable(str5, 3);
                                        }catch(java.io.IOException e0){
                                        }
                                     }
                                  }
                               }
                            }
                            tz0.h(obj1);
                            str9 = str4;
                            str8 = str10;
                         }else {
                            vh4 b4 = oi77.f.h.get().b.b;
                            uArrayList1 = oi77.c();
                            if ((i8 = uArrayList1.size()) > b4) {
                               iterator2 = uArrayList1.subList(b4, i8).iterator();
                               while (iterator2.hasNext()) {
                                  iterator2.next().delete();
                               }
                            }
                            break ;
                         }
                      }
                      return;
                   }else {
                      oly0.o(l2);
                      uFile2 = this.h();
                      byte[] uobyteArray1 = osr3.c.h();
                      File uFile5 = new c84(uFile2).a(str1);
                      str6 = kg4.l(str1, "keys.meta");
                      try{
                         l2 = new File(uFile2, str6);
                         if ((uFile2 = ogf4.n()) != null && uFile2.exists()) {
                            BufferedReader uBufferedRea = new BufferedReader(new FileReader(uFile2));
                            osr32 = osr3;
                            serializable = new c10(b5, new yy6(13)).a(uBufferedRea);
                            xj0.m(uBufferedRea);
                         }else {
                            osr32 = osr3;
                            serializable = new byte[0];
                         }
                      }catch(java.lang.Exception e0){
                         i10 = osr3;
                         serializable = null;
                      }catch(java.lang.Exception e0){
                      }
                      uArrayList1 = new ArrayList();
                      String str12 = str;
                      uArrayList1.add(new q80("logs_file", "logs", uobyteArray1, 0));
                      uArrayList1.add(new q80("binary_images_file", "binaryImages", serializable, 0));
                      int i12 = 1;
                      uArrayList1.add(new q80("crash_meta_file", "metadata", ogf4.p(), i12));
                      uArrayList1.add(new q80("session_meta_file", "session", ogf4.l(), i12));
                      uArrayList1.add(new q80("app_meta_file", "app", ogf4.b(), i12));
                      uArrayList1.add(new q80("device_meta_file", "device", ogf4.i(), i12));
                      uArrayList1.add(new q80("os_meta_file", "os", ogf4.d(), i12));
                      uArrayList1.add(new q80("minidump_file", "minidump", ogf4.j(), i12));
                      uArrayList1.add(new q80("user_meta_file", str4, uFile5, i12));
                      uArrayList1.add(new q80("keys_file", "keys", l2, i12));
                      iterator2 = uArrayList1.iterator();
                      while (iterator2.hasNext()) {
                         uoff4 = iterator2.next();
                         try{
                            if ((inputStream = uoff4.b()) != null) {
                               try{
                                  co5.z(new File(uFile4, uoff4.c), inputStream);
                               }catch(java.io.IOException e0){
                               }
                            }
                         }catch(java.io.IOException e0){
                            inputStream = null;
                         }
                         xj0.m(inputStream);
                      }
                      str11 = str1.replaceAll("-", str2);
                      t.getClass();
                      ArrayList uArrayList2 = new ArrayList();
                      Iterator iterator3 = uArrayList1.iterator();
                      while (true) {
                         int i13 = 7;
                         if (iterator3.hasNext()) {
                            uoff4 = iterator3.next();
                            String str13 = "Null filename";
                            q80 b6 = uoff4.b;
                            switch (uoff4.a){
                                case 0:
                                  if ((uobyteArray2 = uoff4.a()) == null) {
                                  label_0324 :
                                     ozr = null;
                                  }else {
                                     oli5 = new li5(i13);
                                     oli5.c = uobyteArray2;
                                     if (b6 != null) {
                                        oli5.b = b6;
                                        ozr = oli5.a();
                                     }else {
                                        throw new NullPointerException(str13);
                                     }
                                  }
                                  break;
                                default:
                                  if ((uobyteArray2 = uoff4.a()) != null) {
                                     oli5 = new li5(i13);
                                     oli5.c = uobyteArray2;
                                     if (b6 != null) {
                                        oli5.b = b6;
                                        ozr = oli5.a();
                                     }else {
                                        throw new NullPointerException(str13);
                                     }
                                  }else {
                                     goto label_0324 ;
                                  }
                            }
                            if (ozr != null) {
                               uArrayList2.add(ozr);
                            }
                         }else {
                            i77 b7 = t.b;
                            b5 = new n91(i13, null);
                            b5.b = new i73(uArrayList2);
                            yr oyr = b5.a();
                            b7.getClass();
                            File uFile6 = new File(new File(b7.b, str11), str3);
                            try{
                               tz0 StringWriter e1 = b7.e;
                               tz0.i.getClass();
                               ej5 uoej52 = new ej5(nz0.f(tz0.g(uFile6)));
                               uoej52.g = null;
                               uoej52.h = oyr;
                               vr ovr2 = uoej52.b();
                               tz0.f(e1);
                               File uFile7 = new File(e1, str11);
                               g54 a1 = nz0.a;
                               a1.getClass();
                               try{
                                  e1 = new StringWriter();
                                  a1.n(ovr2, e1);
                                  tz0.i(uFile7, e1.toString());
                                  osr31 = i10;
                                  str5 = str12;
                               }catch(java.io.IOException e0){
                               }
                            }catch(java.io.IOException e0){
                               Objects.toString(uFile6);
                               str5 = str12;
                               Log.isLoggable(str5, 3);
                               osr31 = i10;
                               osr31.c.k();
                            }
                         }
                      }
                   }
                }else {
                   i6 = i;
                   uFileArray3 = uFileArray2;
                   oly02 = obj1;
                   str5 = str;
                }
                oly03 = oly02;
                goto label_03a7 ;
             }
          }
          i6 = i;
          uFileArray3 = uFileArray2;
          str5 = str;
          goto label_03b0 ;
       }
    }
    public final boolean f(int p0){
       if (!Boolean.TRUE.equals(this.f.d.get())) {
          throw new IllegalStateException("Not running on background worker thread as intended.");
       }
       if (this.j()) {
          Log.isLoggable("FirebaseCrashlytics", 3);
          return false;
       }else {
          try{
             Log.isLoggable("FirebaseCrashlytics", 3);
             this.e(p0, false);
             Log.isLoggable("FirebaseCrashlytics", 3);
             return true;
          }catch(java.lang.Exception e5){
             Log.e(v3, "Unable to finalize previously open sessions.", e5);
             return v2;
          }
       }
    }
    public final String g(){
       File[] uFileArray = this.l(ly0.z);
       Arrays.sort(uFileArray, ly0.B);
       String str = (uFileArray.length > 0)? ly0.i(uFileArray[0]): null;
       return str;
    }
    public final File h(){
       return this.i.b();
    }
    public final boolean j(){
       ly0 tu;
       boolean b = ((tu = this.u) != null && tu.d.get())? true: false;
       return b;
    }
    public final File[] k(){
       File[] uFileArray;
       LinkedList linkedList = new LinkedList();
       ey0 a = ly0.A;
       if ((uFileArray = new File(this.h(), "fatal-sessions").listFiles(a)) == null) {
          uFileArray = new File[0];
       }
       Collections.addAll(linkedList, uFileArray);
       if ((uFileArray = new File(this.h(), "nonfatal-sessions").listFiles(a)) == null) {
          uFileArray = new File[0];
       }
       Collections.addAll(linkedList, uFileArray);
       if ((uFileArray = this.h().listFiles(a)) == null) {
          uFileArray = new File[0];
       }
       Collections.addAll(linkedList, uFileArray);
       uFileArray = new File[linkedList.size()];
       return linkedList.toArray(uFileArray);
    }
    public final File[] l(FilenameFilter p0){
       File[] uFileArray;
       if ((uFileArray = this.h().listFiles(p0)) == null) {
          uFileArray = new File[0];
       }
       return uFileArray;
    }
    public final a28 m(a28 p0){
       a28 uoa28;
       ly0 tn = this.n;
       File[] uFileArray = tn.b.a.k();
       g54 a = tn.b.a;
       a.getClass();
       File[] uFileArray1 = new File(a.h(), "native-sessions").listFiles();
       int i = 0;
       if (uFileArray1 == null) {
          uFileArray1 = new File[i];
       }
       if (uFileArray != null && (uFileArray.length > 0 || uFileArray1.length > 0)) {
          i = 1;
       }
       tn = this.v;
       String str = "FirebaseCrashlytics";
       int i1 = 3;
       if (!i) {
          Log.isLoggable(str, i1);
          tn.b(Boolean.FALSE);
          return vv7.t(null);
       }else {
          Log.isLoggable(str, i1);
          ly0 tc = this.c;
          if (tc.b()) {
             Log.isLoggable(str, i1);
             tn.b(Boolean.FALSE);
             uoa28 = vv7.t(Boolean.TRUE);
          }else {
             Log.isLoggable(str, i1);
             Log.isLoggable(str, i1);
             tn.b(Boolean.TRUE);
             i51 f = tc.f;
             _monitor_enter(f);
             m07 a1 = tc.g.a;
             _monitor_exit(f);
             a1.getClass();
             mt7 a2 = o07.a;
             uoa28 = a1.g(a2, new vf(19, this));
             Log.isLoggable(str, i1);
             m07 a3 = this.w.a;
             a1 = new m07();
             b7 uob7 = new b7(16, a1);
             uoa28.h(a2, uob7);
             a3.getClass();
             a3.h(a2, uob7);
             uoa28 = a1.a;
          }
          uoa28.getClass();
          return uoa28.g(o07.a, new iy0(this, p0));
       }
    }
    public final void n(int p0,String p1){
       if7.b(this.h(), new az7(kg4.l(p1, "SessionEvent"), 1), p0);
    }
    public final void o(long p0){
       String str = ".ae";
       try{
          new File(this.h(), str+p0).createNewFile();
       }catch(java.io.IOException e0){
          Log.isLoggable("FirebaseCrashlytics", 3);
       }
       return;
    }
    public final void p(wh0 p0,String p1){
       String[] f = ly0.F;
       int len = f.length;
       int i = 0;
       while (i < len) {
          File[] uFileArray = this.l(new az7("".append(p1).append(f[i]).append(".cls").toString(), 1));
          if (!uFileArray.length) {
             Log.isLoggable("FirebaseCrashlytics", 3);
          }else {
             Log.isLoggable("FirebaseCrashlytics", 3);
             ly0.t(p0, uFileArray[0]);
          }
          i = i + 1;
       }
       return;
    }
    public final void r(wh0 p0,Thread p1,Throwable p2,long p3,String p4,boolean p5){
       int i1;
       ActivityManager$RunningAppProcessInfo runningAppPr1;
       Thread[] threadArray;
       TreeMap treeMap;
       Configuration uConfigurati;
       TreeMap treeMap1;
       int len;
       String str1;
       long l4;
       k80 ok801;
       int i10;
       String value1;
       ActivityManager$RunningAppProcessInfo runningAppPr3;
       k80 ok807;
       ly0 oly0 = this;
       wh0 owh0 = p0;
       long l = p3;
       ly0 q = oly0.q;
       zq7 ozq7 = new zq7(p2, q);
       ly0 b = oly0.b;
       e67 uoe67 = e67.a(b);
       e67 uoe671 = uoe67.c;
       int i = uoe67.c();
       if (xj0.A0(b)) {
          i1 = 0;
       }else if(b.getSystemService("sensor").getDefaultSensor(8) != null){
          ok807 = 1;
       }else {
          ok807 = 0;
       }
       i1 = ok807;
       Configuration orientation = b.getResources().getConfiguration().orientation;
       ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
       b.getSystemService("activity").getMemoryInfo(memoryInfo);
       StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
       long l1 = (long)statFs.getBlockSize();
       long l2 = xj0.q0() - memoryInfo.availMem;
       long l3 = (long)statFs.getBlockCount() * l1;
       l1 = l3 - (l1 * (long)statFs.getAvailableBlocks());
       ActivityManager$RunningAppProcessInfo runningAppPr = xj0.i0(b, b.getPackageName());
       LinkedList linkedList = new LinkedList();
       zq7 ozq71 = ozq7;
       zq7 ozq72 = ozq71.c;
       i77 b1 = oly0.j.b;
       u53 c = oly0.h.c;
       if (p5) {
          Map allStackTrac = Thread.getAllStackTraces();
          runningAppPr1 = runningAppPr;
          threadArray = new Thread[allStackTrac.size()];
          Iterator iterator = allStackTrac.entrySet().iterator();
          int i2 = 0;
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             threadArray[i2] = uEntry.getKey();
             linkedList.add(q.c(uEntry.getValue()));
             i2 = i2 + 1;
             threadArray = threadArray;
          }
          Thread[] threadArray1 = threadArray;
       }else {
          runningAppPr1 = runningAppPr;
          threadArray = new Thread[0];
       }
       if (!xj0.j0(b, "com.crashlytics.CollectCustomKeys")) {
          treeMap = new TreeMap();
       }else if((treeMap = Collections.unmodifiableMap(oly0.e.b)) != null){
          uConfigurati = orientation;
          if (treeMap.size() > 1) {
             treeMap1 = new TreeMap(treeMap);
          label_011b :
             ly0 m = oly0.m;
             byte[] uobyteArray = m.c.h();
             k80 ok80 = k80.a(c);
             String str = "";
             b1 = (b1 == null)? 0: k80.a(b1.replace("-", str));
             if (uobyteArray != null) {
                len = uobyteArray.length;
                str1 = str;
                byte[] uobyteArray1 = new byte[len];
                l4 = l1;
                System.arraycopy(uobyteArray, 0, uobyteArray1, 0, len);
                ok801 = new k80(uobyteArray1);
                len = 3;
             }else {
                str1 = str;
                l4 = l1;
                Log.isLoggable("FirebaseCrashlytics", 3);
                ok801 = null;
             }
             owh0.o(10, 2);
             k80 ok802 = b1;
             zq7 ozq73 = ozq72;
             zq7 ozq74 = ozq71;
             LinkedList linkedList1 = linkedList;
             long l5 = l2;
             Thread[] threadArray2 = threadArray;
             ActivityManager$RunningAppProcessInfo runningAppPr2 = runningAppPr1;
             ly0 oly01 = m;
             Configuration uConfigurati1 = uConfigurati;
             int i3 = i1;
             int i4 = bc6.d(ozq71, p1, ozq72, threadArray, linkedList, ok80, ok802, treeMap1, runningAppPr2, uConfigurati1);
             k80 ok803 = ok80;
             i4 = bc6.e(uoe671, i, i3, uConfigurati1, l5, l4);
             int i5 = ((wh0.b(i4) + wh0.d(5)) + i4) + (((wh0.b(i4) + wh0.d(3)) + i4) + (wh0.a(2, k80.a(p4)) + (wh0.g(1, l) + 0)));
             int i6 = 6;
             if (ok801 != null) {
                i4 = wh0.a(1, ok801);
                i5 = i5 + ((wh0.b(i4) + wh0.d(i6)) + i4);
             }
             owh0.n(i5);
             owh0.q(1, l);
             owh0.i(2, k80.a(p4));
             owh0.o(3, 2);
             Thread thread = p1;
             zq7 ozq75 = ozq73;
             Thread[] threadArray3 = threadArray2;
             LinkedList linkedList2 = linkedList1;
             k80 ok804 = ok803;
             k80 ok805 = ok802;
             int i7 = 3;
             owh0.n(bc6.d(ozq74, thread, ozq75, threadArray3, linkedList2, ok804, ok805, treeMap1, runningAppPr2, uConfigurati1));
             owh0.o(1, 2);
             owh0.n(bc6.c(ozq74, thread, ozq75, threadArray3, linkedList2, ok804, ok805));
             int i8 = 4;
             bc6.j(owh0, thread, ozq73, i8, 1);
             threadArray = threadArray2;
             int len1 = threadArray.length;
             for (i4 = 0; i4 < len1; i4 = i4 + 1) {
                bc6.j(owh0, threadArray[i4], linkedList1.get(i4), 0, 0);
             }
             int i9 = 0;
             bc6.i(owh0, ozq74, 1, 2);
             owh0.o(i7, 2);
             k80 a = bc6.a;
             long l6 = 0;
             owh0.n((wh0.g(i7, l6) + (wh0.a(2, a) + (wh0.a(1, a) + i9))));
             owh0.i(1, a);
             owh0.i(2, a);
             owh0.q(i7, l6);
             owh0.o(i8, 2);
             k80 ok806 = ok802;
             owh0.n(bc6.a(ok803, ok806));
             owh0.q(1, l6);
             owh0.q(2, l6);
             owh0.i(i7, ok803);
             if (ok806 != null) {
                owh0.i(i8, ok806);
             }
             if (treeMap1 != null && !treeMap1.isEmpty()) {
                Iterator iterator1 = treeMap1.entrySet().iterator();
                while (iterator1.hasNext()) {
                   Map$Entry uEntry1 = iterator1.next();
                   owh0.o(2, 2);
                   String value = uEntry1.getValue();
                   len = wh0.a(1, k80.a(uEntry1.getKey()));
                   if (value == null) {
                      value = str1;
                   }
                   i10 = wh0.a(2, k80.a(value)) + len;
                   owh0.n(i10);
                   owh0.i(1, k80.a(uEntry1.getKey()));
                   if ((value1 = uEntry1.getValue()) == null) {
                      value1 = str1;
                   }
                   owh0.i(2, k80.a(value1));
                }
             }
             if ((runningAppPr3 = runningAppPr2) != null) {
                len1 = (runningAppPr3.importance != 100)? 1: 0;
                owh0.o(i7, i9);
                owh0.l(len1);
             }
             Configuration uConfigurati2 = uConfigurati1;
             owh0.p(i8, uConfigurati2);
             owh0.o(5, 2);
             owh0.n(bc6.e(uoe671, i, i3, uConfigurati2, l5, l4));
             if (uoe671 != null) {
                owh0.o(1, 5);
                i10 = Float.floatToRawIntBits(uoe671.floatValue());
                owh0.l((i10 & 0x00ff));
                owh0.l(((i10 >> 8) & 0x00ff));
                owh0.l(((i10 >> 16) & 0x00ff));
                owh0.l(((i10 >> 24) & 0x00ff));
             }
             owh0.o(2, i9);
             owh0.n(((i << 1) ^ (i >> 31)));
             owh0.o(3, i9);
             owh0.l(i3);
             owh0.p(i8, uConfigurati2);
             owh0.q(5, l5);
             i8 = 6;
             owh0.q(i8, l4);
             if (ok801 != null) {
                owh0.o(i8, 2);
                owh0.n(wh0.a(1, ok801));
                owh0.i(1, ok801);
             }
             oly01.c.k();
             return;
          }else {
          label_0119 :
             treeMap1 = treeMap;
             goto label_011b ;
          }
       }
       uConfigurati = orientation;
       goto label_0119 ;
    }
    public final void s(String p0,String p1,jy0 p2){
       hh0 ohh0 = new hh0(this.h(), p0+p1);
       byte[] uobyteArray = new byte[4096];
       wh0 owh0 = new wh0(ohh0, uobyteArray);
       p2.h(owh0);
       xj0.h0(owh0, "Failed to flush to session "+p1+" file.");
       xj0.l(ohh0, "Failed to close session "+p1+" file.");
    }
}
