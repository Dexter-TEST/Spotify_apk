package p.ap5;
import p.w54;
import p.c65;
import p.ps3;
import p.fv1;
import java.lang.Object;
import p.dt5;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Set;
import p.m73;
import java.util.Iterator;
import java.util.Map$Entry;
import p.oh6;
import java.lang.String;
import p.dv0;
import java.util.List;
import java.util.Comparator;
import p.dj0;
import p.n26;
import java.lang.Iterable;
import p.zf2;
import p.po2;
import p.no2;
import p.oe0;
import p.w51;
import p.m74;
import java.lang.CharSequence;
import java.nio.charset.Charset;
import p.fo2;
import p.co5;
import p.ye7;
import p.ph6;
import p.qh6;
import p.fk0;
import p.aj0;
import p.t65;
import java.util.Arrays;
import p.xe7;
import java.util.HashMap;
import p.q14;
import p.cu5;
import p.eu5;
import android.content.Context;
import p.sz1;
import android.content.Intent;
import p.du5;
import android.content.ServiceConnection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;
import android.os.IBinder;
import p.j53;
import p.i53;
import android.os.Bundle;
import p.eo5;
import p.h53;
import android.os.Parcel;
import p.oo2;
import p.g0;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import p.fx7;
import java.io.InputStream;
import p.gy7;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import p.mf3;
import java.lang.Integer;
import java.io.IOException;
import java.io.OutputStream;
import p.fy7;
import java.lang.Math;
import java.lang.Throwable;
import p.tp2;
import p.i80;
import com.spotify.login5.v3.challenges.proto.HashcashChallenge;
import com.spotify.login5.v3.challenges.proto.HashcashSolution;
import java.lang.System;
import p.mi;
import p.jo2;
import p.rf1;
import com.google.protobuf.Duration;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.h80;
import java.lang.IndexOutOfBoundsException;
import java.lang.NullPointerException;
import java.lang.IllegalStateException;
import android.widget.TextView;
import p.f37;
import android.view.View;
import android.os.Build$VERSION;
import p.q3;
import p.lh4;
import p.n3;
import p.wh7;
import p.jr7;
import p.qq7;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import p.uz1;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import java.util.Collection;
import p.j8;

public abstract class ap5 implements w54	// class@000fcb from classes.dex
{
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final int[] E;
    public static Boolean F;
    public static final c65 a;
    public static final c65 b;
    public static final ps3 c;
    public static final ps3 t;
    public static final ps3 v;
    public static final fv1 w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;

    static {
       ap5.a = new c65(2);
       ap5.b = new c65(13);
       ap5.c = new ps3(15);
       ap5.t = new ps3(26);
       ap5.v = new ps3(3);
       ap5.w = new fv1();
       ap5.x = new byte[4]{'0','1','5',0x00};
       ap5.y = new byte[4]{'0','1','0',0x00};
       ap5.z = new byte[4]{'0','0','9',0x00};
       ap5.A = new byte[4]{'0','0','5',0x00};
       ap5.B = new byte[4]{'0','0','1',0x00};
       ap5.C = new byte[4]{'0','0','1',0x00};
       ap5.D = new byte[4]{'0','0','2',0x00};
       ap5.E = new int[5]{0x7f0300b0,0x7f03025f,0x7f030260,0x7f030558,0x7f03058e};
    }
    public void ap5(){
       super();
    }
    public static final LinkedHashMap A(dt5 p0){
       ArrayList uArrayList = new ArrayList(p0.w);
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          uArrayList.add(new oh6(uEntry.getValue(), key));
       }
       List list = dj0.x0(uArrayList, new dv0(15));
       String str = no2.a.b().K(dj0.q0(list, "", null, null, n26.M, 30), oe0.a).B().toString();
       co5.l(str, "md5\(\).hashString\(concate…harsets.UTF_8\).toString\(\)");
       Iterator iterator1 = list.iterator();
       int i = 0;
       while (true) {
          if (iterator1.hasNext()) {
             Object obj = iterator1.next();
             int i1 = i + 1;
             if (i >= 0) {
                int i2 = i % str.length();
                obj.c = str.charAt(i2);
                obj.t = i;
                i = i1;
             }else {
                break ;
             }
          }else {
             zf2[] ozf2Array = new zf2[]{ph6.y,qh6.y};
             list = dj0.x0(list, new fk0(ozf2Array));
             uArrayList = new ArrayList(aj0.b0(list));
             iterator = list.iterator();
             while (iterator.hasNext()) {
                oh6 ooh6 = iterator.next();
                uArrayList.add(new t65(ooh6.a, ooh6.b));
             }
             t65[] ot65Array = new t65[0];
             ot65Array = uArrayList.toArray(ot65Array);
             ot65Array = Arrays.copyOf(ot65Array, ot65Array.length);
             co5.o(ot65Array, "pairs");
             LinkedHashMap linkedHashMa = new LinkedHashMap(xe7.F(ot65Array.length));
             q14.p0(linkedHashMa, ot65Array);
             return linkedHashMa;
          }
       }
       ye7.W();
       throw null;
    }
    public static eu5 B(cu5 p0,String p1,List p2){
       Intent intent;
       du5 b1;
       Bundle uBundle;
       eu5 b = eu5.b;
       Context uContext = sz1.a();
       if ((intent = ap5.p(uContext)) != null) {
          du5 uodu5 = new du5();
          eu5 c = eu5.c;
          if (uContext.bindService(intent, uodu5, 1)) {
             try{
                uodu5.a.await(5, TimeUnit.SECONDS);
                if ((b1 = uodu5.b) != null) {
                   j53 oj53 = i53.g(b1);
                   if ((uBundle = eo5.g(p0, p1, p2)) != null) {
                      Parcel parcel = Parcel.obtain();
                      Parcel parcel1 = Parcel.obtain();
                      parcel.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                      parcel.writeInt(1);
                      uBundle.writeToParcel(parcel, 0);
                      boolean b2 = oj53.a.transact(1, parcel, parcel1, 0);
                      parcel1.readException();
                      parcel1.readInt();
                      parcel1.recycle();
                      parcel.recycle();
                      co5.K(uBundle, "Successfully sent events to the remote service: ");
                   }
                   b = eu5.a;
                }
                uContext.unbindService(uodu5);
             }catch(java.lang.InterruptedException e0){
                HashSet a = sz1.a;
             }catch(android.os.RemoteException e0){
                a = sz1.a;
             }
             uContext.unbindService(uodu5);
          label_007f :
             b = c;
          }else {
             goto label_007f ;
          }
       }
       return b;
    }
    public static byte[] C(byte[] p0){
       g0 og0 = oo2.a.b();
       p0.getClass();
       og0.Y(p0, p0.length);
       return og0.B().a();
    }
    public static void E(int p0,String p1){
       if (p0 > 0) {
          return;
       }
       throw new IllegalArgumentException(p1+" > 0 required but it was "+p0);
    }
    public static void F(String p0,long p1){
       if ((p1) > 0) {
          return;
       }
       throw new IllegalArgumentException(p0+" > 0 required but it was "+p1);
    }
    public static int G(byte[] p0,int p1){
       p1++;
       return (((p0[p1] & 0x00ff) << 8) | (p0[p1] & 0x00ff));
    }
    public static void H(fx7 p0,InputStream p1,gy7 p2,long p3){
       int i;
       String str;
       long l2;
       byte[] uobyteArray = new byte[0x4000];
       DataInputStream uDataInputSt = new DataInputStream(new BufferedInputStream(p1, 4096));
       if ((i = uDataInputSt.readInt()) != -771763713) {
          Object[] objArray = new Object[]{Integer.valueOf(i)};
          str = String.valueOf(String.format("%x", objArray));
          str = (str.length())? "Unexpected magic=".concat(str): "Unexpected magic=";
          throw new mf3(str);
       }else if((i = uDataInputSt.read()) == 4){
          long l = 0;
          while (true) {
             long l1 = p3 - l;
             int i1 = uDataInputSt.read();
             str = -1;
             if (i1 == str) {
                throw new IOException("Patch file overrun");
             }
             if (i1) {
                String str1 = "Unexpected end of patch";
                switch (i1){
                    case 247:
                      i1 = uDataInputSt.readUnsignedShort();
                      ap5.J(uobyteArray, uDataInputSt, p2, i1, l1);
                      break;
                    case 248:
                      i1 = uDataInputSt.readInt();
                      ap5.J(uobyteArray, uDataInputSt, p2, i1, l1);
                      break;
                    case 249:
                      l2 = (long)uDataInputSt.readUnsignedShort();
                      if ((i1 = uDataInputSt.read()) == str) {
                         throw new IOException(str1);
                      }
                      ap5.I(uobyteArray, p0, p2, l2, i1, l1);
                      break;
                    case 250:
                      i1 = uDataInputSt.readUnsignedShort();
                      ap5.I(uobyteArray, p0, p2, (long)uDataInputSt.readUnsignedShort(), i1, l1);
                      break;
                    case 251:
                      i1 = uDataInputSt.readInt();
                      ap5.I(uobyteArray, p0, p2, (long)uDataInputSt.readUnsignedShort(), i1, l1);
                      break;
                    case 252:
                      l2 = (long)uDataInputSt.readInt();
                      if ((i1 = uDataInputSt.read()) == str) {
                         throw new IOException(str1);
                      }
                      ap5.I(uobyteArray, p0, p2, l2, i1, l1);
                      break;
                    case 253:
                      i1 = uDataInputSt.readUnsignedShort();
                      ap5.I(uobyteArray, p0, p2, (long)uDataInputSt.readInt(), i1, l1);
                      break;
                    case 254:
                      i1 = uDataInputSt.readInt();
                      ap5.I(uobyteArray, p0, p2, (long)uDataInputSt.readInt(), i1, l1);
                      break;
                    case 255:
                      i1 = uDataInputSt.readInt();
                      ap5.I(uobyteArray, p0, p2, uDataInputSt.readLong(), i1, l1);
                      break;
                    default:
                      ap5.J(uobyteArray, uDataInputSt, p2, i1, l1);
                }
                l = l + (long)i1;
             }else {
                p2.flush();
                return;
             }
          }
       }else {
          throw new mf3(new StringBuilder(30)+"Unexpected version="+i);
       }
    }
    public static void I(byte[] p0,fx7 p1,gy7 p2,long p3,int p4,long p5){
       int i;
       if ((i = p4) < 0) {
          throw new IOException("copyLength negative");
       }
       long l = 0;
       if ((p3 - l) < 0) {
          throw new IOException("inputOffset negative");
       }
       long l1 = (long)i;
       if ((l1 - p5) > 0) {
          throw new IOException("Output length overrun");
       }
       try{
          fy7 v10 = new fy7(p1, p3, l1);
          _monitor_enter(v10);
          InputStream inputStream = v10.y(l, (v10.c - v10.b));
          _monitor_exit(v10);
          while (true) {
             if (i > 0) {
                int i1 = Math.min(i, 0x4000);
                int i2 = 0;
                while (true) {
                   if (i2 < i1) {
                      int i3 = i1 - i2;
                      if ((i3 = inputStream.read(p0, i2, i3)) != -1) {
                         i2 = i2 + i3;
                      }else {
                         break ;
                      }
                   }else {
                      p2.write(p0, 0, i1);
                      i = i - i1;
                   }
                }
                throw new IOException("truncated input stream");
             }else {
                inputStream.close();
                return;
             }
          }
       }catch(java.io.EOFException e0){
          throw new IOException("patch underrun", e0);
       }
    }
    public static void J(byte[] p0,DataInputStream p1,gy7 p2,int p3,long p4){
       if (p3 < 0) {
          throw new IOException("copyLength negative");
       }
       if (((long)p3 - p4) > 0) {
          throw new IOException("Output length overrun");
       }
       while (p3 > 0) {
          int i = 0x4000;
          try{
             i = Math.min(p3, i);
             p1.readFully(p0, 0, i);
             p2.write(p0, 0, i);
             p3 = p3 - i;
          }catch(java.io.EOFException e0){
             throw new IOException("patch underrun");
          }
       }
       return;
    }
    public static String a(String p0,int p1,int p2){
       if (p1 < 0) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1)};
          return xe7.E("%s \(%s\) must not be negative", objArray);
       }else if(p2 >= 0){
          Object[] objArray1 = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2)};
          return xe7.E("%s \(%s\) must not be greater than size \(%s\)", objArray1);
       }else {
          throw new IllegalArgumentException(tp2.k("negative size: ", p2));
       }
    }
    public static HashcashSolution b(i80 p0,HashcashChallenge p1){
       byte b1;
       byte[] uobyteArray = p1.h().p();
       int i = p1.g();
       byte[] uobyteArray1 = Arrays.copyOfRange(ap5.C(p0.p()), 12, 20);
       int i1 = 8;
       int i2 = 0;
       int i3 = 1;
       boolean b = (uobyteArray1.length >= i1)? true: false;
       ap5.c(uobyteArray1.length, i1, "array too small: %s < %s", b);
       long l = ((((long)uobyteArray1[6] & 255) << i1) | ((((((((long)uobyteArray1[i3] & 255) << 48) | (((long)uobyteArray1[i2] & 255) << 56)) | (((long)uobyteArray1[2] & 255) << 40)) | (((long)uobyteArray1[3] & 255) << 32)) | (((long)uobyteArray1[4] & 255) << 24)) | (((long)uobyteArray1[5] & 255) << 16))) | ((long)uobyteArray1[7] & 255);
       i2 = 1;
       ap5.j("This stopwatch is already running.", (0 ^ i2));
       long l1 = System.nanoTime();
       byte[][] uobyteArray2 = new byte[][2]{mi.N(l),mi.N(0)};
       int i4 = 0;
       uobyteArray1 = xe7.j(uobyteArray2);
       byte[][] uobyteArray3 = new byte[][2]{uobyteArray,uobyteArray1};
       byte[] uobyteArray4 = ap5.C(xe7.j(uobyteArray3));
       long l2 = 0;
       while (true) {
          i4 = uobyteArray4.length - i2;
          i2 = 0;
          break ;
       }
       while (true) {
          if (i4 >= 0) {
             if (!(b1 = uobyteArray4[i4])) {
                i2 = i2 + 8;
                i4 = i4 - 1;
             }else {
                int i5 = i2;
                i2 = 1;
                while (i2 && !(i4 = b1 & i2)) {
                   i5 = i5 + 1;
                   i2 = i2 << 1;
                   i2 = (byte)i2;
                }
                i2 = i5;
             label_00c4 :
                if (i2 < i) {
                   uobyteArray2 = new byte[][2];
                   uobyteArray2[0] = mi.N(l);
                   i4 = 1;
                   uobyteArray2[i4] = mi.N(l2);
                   uobyteArray1 = xe7.j(uobyteArray2);
                   byte[][] uobyteArray5 = new byte[][2];
                   uobyteArray5[0] = uobyteArray;
                   uobyteArray5[i4] = uobyteArray1;
                   uobyteArray4 = ap5.C(xe7.j(uobyteArray5));
                   long l3 = 1;
                   l = l + l3;
                   l2 = l2 + l3;
                   i2 = 1;
                }else {
                }
             }
          }else {
             goto label_00c4 ;
          }
       }
       jo2 ojo2 = HashcashSolution.h();
       rf1 orf1 = Duration.g();
       orf1.c((int)TimeUnit.NANOSECONDS.convert(((System.nanoTime() - l1) + 0), TimeUnit.NANOSECONDS));
       ojo2.c(orf1.build());
       ojo2.d(i80.c(uobyteArray1, 0, uobyteArray1.length));
       return ojo2.build();
    }
    public static void c(int p0,int p1,String p2,boolean p3){
       if (p3) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1)};
       throw new IllegalArgumentException(xe7.E(p2, objArray));
    }
    public static void d(Object p0,boolean p1){
       if (p1) {
          return;
       }
       throw new IllegalArgumentException(String.valueOf(p0));
    }
    public static void e(boolean p0){
       if (p0) {
          return;
       }
       throw new IllegalArgumentException();
    }
    public static void f(int p0,int p1){
       String str;
       if (p0 >= 0 && p0 < p1) {
          return;
       }
       if (p0 >= 0) {
          if (p1 >= 0) {
             Object[] objArray = new Object[]{"index",Integer.valueOf(p0),Integer.valueOf(p1)};
             str = xe7.E("%s \(%s\) must be less than size \(%s\)", objArray);
          }else {
             throw new IllegalArgumentException(tp2.k("negative size: ", p1));
          }
       }else {
          Object[] objArray1 = new Object[]{"index",Integer.valueOf(p0)};
          str = xe7.E("%s \(%s\) must not be negative", objArray1);
       }
       throw new IndexOutOfBoundsException(str);
    }
    public static void g(Object p0,String p1){
       if (p0 != null) {
          return;
       }
       throw new NullPointerException(p1);
    }
    public static void h(int p0,int p1){
       if (p0 >= 0 && p0 <= p1) {
          return;
       }
       throw new IndexOutOfBoundsException(ap5.a("index", p0, p1));
    }
    public static void i(int p0,int p1,int p2){
       String str;
       if (p0 >= 0 && (p1 >= p0 && p1 <= p2)) {
          return;
       }
       if (p0 >= 0 && p0 <= p2) {
          if (p1 >= 0 && p1 <= p2) {
             Object[] objArray = new Object[]{Integer.valueOf(p1),Integer.valueOf(p0)};
             str = xe7.E("end index \(%s\) must not be less than start index \(%s\)", objArray);
          }else {
             str = ap5.a("end index", p1, p2);
          }
       }else {
          str = ap5.a("start index", p0, p2);
       }
       throw new IndexOutOfBoundsException(str);
    }
    public static void j(String p0,boolean p1){
       if (p1) {
          return;
       }
       throw new IllegalStateException(p0);
    }
    public static final f37 m(TextView p0,zf2 p1){
       co5.q(p0, "$this$editorActionEvents");
       co5.q(p1, "handled");
       return new f37(p0, p1);
    }
    public static void n(View p0){
       if (Build$VERSION.SDK_INT >= 28) {
          q3.q(p0);
       }
       wh7.o(p0, new lh4(1));
       return;
    }
    public static final qq7 o(jr7 p0){
       co5.o(p0, "<this>");
       return new qq7(p0.a, p0.t);
    }
    public static Intent p(Context p0){
       PackageManager packageManag;
       if ((packageManag = p0.getPackageManager()) != null) {
          String str = "ReceiverService";
          Intent intent = new Intent(str);
          String str1 = "com.facebook.katana";
          intent.setPackage(str1);
          if (packageManag.resolveService(intent, 0) != null && uz1.a(p0, str1)) {
             return intent;
          }else {
             intent = new Intent(str);
             intent.setPackage("com.facebook.wakizashi");
             if (packageManag.resolveService(intent, 0) != null && uz1.a(p0, "com.facebook.wakizashi")) {
                return intent;
             }
          }
       }
       return null;
    }
    public static View s(Context p0,int p1,RecyclerView p2,int p3){
       if ((p3 & 0x02)) {
          p2 = null;
       }
       return LayoutInflater.from(p0).inflate(p1, p2, false);
    }
    public static final boolean t(Context p0){
       co5.o(p0, "<this>");
       p0 = p0.getSystemService("accessibility");
       if (p0 instanceof AccessibilityManager) {
       }else {
          p0 = null;
       }
       if (p0 != null && p0.isEnabled()) {
          List enabledAcces = p0.getEnabledAccessibilityServiceList(1);
          co5.l(enabledAcces, "am.getEnabledAccessibili…FEEDBACK_SPOKEN\n        \)");
          return (enabledAcces.isEmpty() ^ 1);
       }else {
          return false;
       }
    }
    public abstract boolean D(View p0,int p1);
    public abstract int k(View p0,int p1);
    public abstract int l(View p0,int p1);
    public int q(View p0){
       return 0;
    }
    public int r(){
       return 0;
    }
    public abstract void u(Throwable p0);
    public abstract void v(j8 p0);
    public void w(View p0,int p1){
    }
    public abstract void x(int p0);
    public abstract void y(View p0,int p1,int p2);
    public abstract void z(View p0,float p1,float p2);
}
