package p.we7;
import java.lang.String;
import p.mp2;
import p.gg1;
import p.e70;
import p.ex5;
import p.u54;
import p.g70;
import p.j80;
import p.ir2;
import p.t45;
import java.util.TimeZone;
import java.lang.Object;
import p.co5;
import p.ts5;
import p.g15;
import java.lang.Class;
import p.av6;
import java.io.IOException;
import java.util.List;
import java.lang.System;
import java.io.PrintStream;
import java.util.Iterator;
import java.lang.Exception;
import java.lang.Throwable;
import p.io2;
import p.ps2;
import java.util.concurrent.TimeUnit;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.io.Closeable;
import java.net.Socket;
import java.lang.CharSequence;
import p.nn6;
import java.util.Locale;
import java.util.Arrays;
import java.util.Comparator;
import p.ko6;
import p.xe7;
import p.cx5;
import java.lang.Long;
import p.ye7;
import java.util.Collections;
import java.util.ArrayList;
import java.lang.NullPointerException;
import java.nio.charset.Charset;
import p.oe0;
import java.lang.AssertionError;
import java.nio.charset.StandardCharsets;
import p.b57;
import java.lang.Math;
import p.ro2;
import java.lang.StringBuilder;
import java.util.Collection;
import p.dj0;

public abstract class we7	// class@002b21 from classes.dex
{
    public static final byte[] a;
    public static final mp2 b;
    public static final ex5 c;
    public static final t45 d;
    public static final TimeZone e;
    public static final ts5 f;
    public static final String g;

    static {
       int i = 0;
       byte[] uobyteArray = new byte[i];
       we7.a = uobyteArray;
       String[] stringArray = new String[i];
       we7.b = gg1.O(stringArray);
       e70 stringArray1 = new e70();
       stringArray1.write(uobyteArray, i, i);
       long l = (long)i;
       we7.c = new ex5(null, l, stringArray1);
       we7.c(l, l, l);
       j80[] oj80Array = new j80[]{ir2.r("efbbbf"),ir2.r("feff"),ir2.r("fffe"),ir2.r("0000ffff"),ir2.r("ffff0000")};
       we7.d = ir2.E(oj80Array);
       TimeZone timeZone = TimeZone.getTimeZone("GMT");
       co5.i(timeZone);
       we7.e = timeZone;
       we7.f = new ts5("\([0-9a-fA-F]*:[0-9a-fA-F:.]*\)|\([\\d.]+\)");
       String str = av6.w0("okhttp3.", g15.class.getName());
       String str1 = "Client";
       if (av6.g0(str, str1, i)) {
          str = str.substring(i, (str.length() - str1.length()));
          co5.l(str, "this as java.lang.String…ing\(startIndex, endIndex\)");
       }
       we7.g = str;
    }
    public static final void A(IOException p0,List p1){
       co5.o(p0, "<this>");
       if (p1.size() > 1) {
          System.out.println(p1);
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          io2.a(p0, iterator.next());
       }
       return;
    }
    public static final boolean a(ps2 p0,ps2 p1){
       co5.o(p0, "<this>");
       co5.o(p1, "other");
       boolean b = (co5.c(p0.d, p1.d) && (p0.e == p1.e && co5.c(p0.a, p1.a)))? true: false;
       return b;
    }
    public static final int b(long p0,TimeUnit p1){
       int i = 0;
       int i1 = ((v4 = p0) >= 0)? 1: 0;
       if (i1) {
          p0 = p1.toMillis(p0);
          int i2 = ((p0 - 0x7fffffff) <= 0)? 1: 0;
          if (i2) {
             if ((p0) || v4 <= 0) {
                i = 1;
             }
             if (i) {
                return (int)p0;
             }else {
                throw new IllegalArgumentException(co5.K(" too small.", "timeout").toString());
             }
          }else {
             throw new IllegalArgumentException(co5.K(" too large.", "timeout").toString());
          }
       }else {
          throw new IllegalStateException(co5.K(" < 0", "timeout").toString());
       }
    }
    public static final void c(long p0,long p1,long p2){
       if (((p1 | p2)) >= 0 && ((p1 - p0) <= 0 && ((p0 - p1) - p2) >= 0)) {
          return;
       }
       throw new ArrayIndexOutOfBoundsException();
    }
    public static final void d(Closeable p0){
       try{
          co5.o(p0, "<this>");
          p0.close();
          return;
       }catch(java.lang.RuntimeException e1){
          throw e1;
       }catch(java.lang.Exception e0){
       }
    }
    public static final void e(Socket p0){
       try{
          p0.close();
          return;
       }catch(java.lang.AssertionError e2){
          throw e2;
       }catch(java.lang.RuntimeException e2){
          if (co5.c(e2.getMessage(), "bio == null")) {
             return;
          }
          throw e2;
       }catch(java.lang.Exception e0){
       }
    }
    public static final int f(int p0,String p1,int p2,String p3){
       co5.o(p1, "<this>");
       while (true) {
          if (p0 >= p2) {
             return p2;
          }
          int i = p0 + 1;
          if (av6.e0(p3, p1.charAt(p0))) {
             break ;
          }else {
             p0 = i;
          }
       }
       return p0;
    }
    public static final int g(String p0,char p1,int p2,int p3){
       co5.o(p0, "<this>");
       while (true) {
          if (p2 >= p3) {
             return p3;
          }
          int i = p2 + 1;
          if (p0.charAt(p2) == p1) {
             break ;
          }else {
             p2 = i;
          }
       }
       return p2;
    }
    public static final boolean h(nn6 p0,TimeUnit p1){
       boolean b;
       co5.o(p0, "<this>");
       co5.o(p1, "timeUnit");
       try{
          int i = 100;
          b = we7.u(p0, i, p1);
       }catch(java.io.IOException e0){
          b = false;
       }
       return b;
    }
    public static final String i(String p0,Object[] p1){
       co5.o(p0, "format");
       p1 = Arrays.copyOf(p1, p1.length);
       p0 = String.format(Locale.US, p0, Arrays.copyOf(p1, p1.length));
       co5.l(p0, "format\(locale, format, *args\)");
       return p0;
    }
    public static final boolean j(String[] p0,String[] p1,Comparator p2){
       co5.o(p0, "<this>");
       int i = (!p0.length)? 1: 0;
       if (!i && p1 != null) {
          i = (!p1.length)? 1: 0;
          if (!i) {
             i = p0.length;
             int i1 = 0;
             while (i1 < i) {
                object oobject = p0[i1];
                i1 = i1 + 1;
                ko6 oko6 = xe7.D(p1);
                while (true) {
                   if (oko6.hasNext()) {
                      if (!p2.compare(oobject, oko6.next())) {
                         return true;
                      }
                   }else {
                      continue ;
                   }
                }
             }
          }
       }
       return false;
    }
    public static final long k(cx5 p0){
       String str;
       long l;
       if ((str = p0.w.a("Content-Length")) == null) {
          l = -1;
       }else {
          try{
             l = Long.parseLong(str);
          }catch(java.lang.NumberFormatException e0){
          }
       }
       return l;
    }
    public static final List l(Object[] p0){
       co5.o(p0, "elements");
       p0 = p0.clone();
       List list = Collections.unmodifiableList(ye7.K(Arrays.copyOf(p0, p0.length)));
       co5.l(list, "unmodifiableList\(listOf\(*elements.clone\(\)\)\)");
       return list;
    }
    public static final int m(String p0){
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return -1;
          }
          int i2 = i1 + 1;
          char c = p0.charAt(i1);
          if (co5.r(c, 31) > 0 && co5.r(c, 127) < 0) {
             i1 = i2;
          }else {
             break ;
          }
       }
       return i1;
    }
    public static final int n(String p0,int p1,int p2){
       co5.o(p0, "<this>");
       while (true) {
          if (p1 >= p2) {
             return p2;
          }
          int i = p1 + 1;
          char c = p0.charAt(p1);
          int i1 = 0;
          int i2 = (c == 9 || c == 10)? 1: 0;
          i2 = (i2 || c == 12)? 1: 0;
          i2 = (i2 || c == 13)? 1: 0;
          if (i2 || c == ' ') {
             i1 = 1;
          }
          if (i1) {
             p1 = i;
          }else {
             break ;
          }
       }
       return p1;
    }
    public static final int o(String p0,int p1,int p2){
       int i2;
       co5.o(p0, "<this>");
       p2 = p2 - 1;
       if (p1 <= p2) {
          while (true) {
             int i = p2 - 1;
             char c = p0.charAt(p2);
             int i1 = 0;
             if (c == 9 || c == 10) {
                i2 = 1;
             label_001c :
                i2 = (i2 || c == 12)? 1: 0;
                i2 = (i2 || c == 13)? 1: 0;
                if (i2 || c == ' ') {
                   i1 = 1;
                }
                if (i1) {
                   if (p2 != p1) {
                      p2 = i;
                   }
                }else {
                   return (p2 + 1);
                }
             }else {
                i2 = 0;
                goto label_001c ;
             }
          }
       }
       return p1;
    }
    public static final String[] p(String[] p0,String[] p1,Comparator p2){
       Object[] objArray;
       co5.o(p1, "other");
       ArrayList uArrayList = new ArrayList();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          i = i + 1;
          int len1 = p1.length;
          int i1 = 0;
          while (true) {
             if (i1 < len1) {
                i1 = i1 + 1;
                if (!p2.compare(oobject, p1[i1])) {
                   uArrayList.add(oobject);
                }
             }else {
                continue ;
             }
          }
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
       }
       p0 = new String[0];
       if ((objArray = uArrayList.toArray(p0)) != null) {
          return objArray;
       }
    }
    public static final boolean q(String p0){
       co5.o(p0, "name");
       boolean b = true;
       if (!av6.i0(p0, "Authorization", b) && (!av6.i0(p0, "Cookie", b) && (!av6.i0(p0, "Proxy-Authorization", b) && !av6.i0(p0, "Set-Cookie", b)))) {
          b = false;
       }
       return b;
    }
    public static final int r(char p0){
       char c;
       int i2;
       int i = 1;
       int i1 = ((c = '0') <= p0 && p0 < ':')? 1: 0;
       if (i1) {
          i2 = p0 - c;
       }else if((c = 'a') <= p0 && p0 < 'g'){
          i1 = 1;
       }else {
          i1 = 0;
       }
       if (!i1) {
          if ((c = 'A') > p0 || p0 >= 'G') {
             i = 0;
          }
          if (!i) {
             i2 = -1;
          }
       }
       i2 = (p0 - c) + 10;
       return i2;
    }
    public static final Charset s(g70 p0,Charset p1){
       int i;
       Charset c;
       co5.o(p0, "<this>");
       co5.o(p1, "default");
       if ((i = p0.U(we7.d)) != -1) {
          if (i) {
             if (i != 1) {
                if (i != 2) {
                   if (i != 3) {
                      if (i == 4) {
                         if ((c = oe0.c) == null) {
                            c = Charset.forName("UTF-32LE");
                            co5.l(c, "forName\(\"UTF-32LE\"\)");
                            oe0.c = c;
                         }
                      }else {
                         throw new AssertionError();
                      }
                   }else if((c = oe0.d) == null){
                      c = Charset.forName("UTF-32BE");
                      co5.l(c, "forName\(\"UTF-32BE\"\)");
                      oe0.d = c;
                   }
                   p1 = c;
                }else {
                   p1 = StandardCharsets.UTF_16LE;
                   co5.l(p1, "UTF_16LE");
                }
             }else {
                p1 = StandardCharsets.UTF_16BE;
                co5.l(p1, "UTF_16BE");
             }
          }else {
             p1 = StandardCharsets.UTF_8;
             co5.l(p1, "UTF_8");
          }
       }
       return p1;
    }
    public static final int t(g70 p0){
       co5.o(p0, "<this>");
       return ((p0.readByte() & 0x00ff) | (((p0.readByte() & 0x00ff) << 16) | ((p0.readByte() & 0x00ff) << 8)));
    }
    public static final boolean u(nn6 p0,int p1,TimeUnit p2){
       boolean b;
       co5.o(p0, "<this>");
       co5.o(p2, "timeUnit");
       long l = System.nanoTime();
       long l1 = (p0.e().e())? p0.e().c() - l: Long.MAX_VALUE;
       b57 uob57 = p0.e();
       long l2 = Math.min(l1, p2.toNanos((long)p1)) + l;
       try{
          uob57.d(l2);
          e70 uoe70 = new e70();
          while (p0.o(uoe70, 8192) - -1) {
             uoe70.f();
          }
          if (!(l1 - Long.MAX_VALUE)) {
             p0.e().a();
          }else {
             p0.e().d((l + l1));
          }
          b = true;
       }catch(java.io.InterruptedIOException e0){
          if (!(l1 - Long.MAX_VALUE)) {
             p0.e().a();
          }else {
             p0.e().d((e0 + l1));
          }
          b = false;
       }
       return b;
    }
    public static final mp2 v(List p0){
       Object[] objArray;
       ArrayList uArrayList = new ArrayList(20);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ro2 oro2 = iterator.next();
          uArrayList.add(oro2.a.q());
          uArrayList.add(av6.K0(oro2.b.q()).toString());
       }
       String[] stringArray = new String[0];
       if ((objArray = uArrayList.toArray(stringArray)) != null) {
          return new mp2(objArray);
       }
       throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
    public static final String w(ps2 p0,boolean p1){
       int i;
       co5.o(p0, "<this>");
       ps2 d = p0.d;
       if (av6.f0(d, ":")) {
          d = "["+d+']';
       }
       ps2 e = p0.e;
       if (!p1) {
          p0 = p0.a;
          co5.o(p0, "scheme");
          if (co5.c(p0, "http")) {
             i = 80;
          }else if(co5.c(p0, "https")){
             i = 443;
          }else {
             i = -1;
          }
          if (e == i) {
          label_005a :
             return d;
          }
       }
       d = d+':'+e;
       goto label_005a ;
    }
    public static final List x(List p0){
       co5.o(p0, "<this>");
       p0 = Collections.unmodifiableList(dj0.C0(p0));
       co5.l(p0, "unmodifiableList\(toMutableList\(\)\)");
       return p0;
    }
    public static final int y(int p0,String p1){
       try{
          Long longx = (p1 == null)? null: Long.valueOf(Long.parseLong(p1));
          if (longx == null) {
             return p0;
          }else {
             long l = longx.longValue();
             if ((l - 0x7fffffff) > 0) {
                l = Integer.MAX_VALUE;
             }else if((l) < 0){
                l = 0;
             }else {
                l = (int)l;
             }
             return l;
          }
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public static final String z(String p0,int p1,int p2){
       p1 = we7.n(p0, p1, p2);
       p0 = p0.substring(p1, we7.o(p0, p1, p2));
       co5.l(p0, "this as java.lang.String…ing\(startIndex, endIndex\)");
       return p0;
    }
}
