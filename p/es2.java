package p.es2;
import p.j80;
import java.lang.String;
import p.ir2;
import p.cx5;
import p.bv5;
import java.lang.Object;
import p.co5;
import p.we7;
import p.av6;
import p.vu0;
import p.ps2;
import p.mp2;
import p.uu0;
import java.util.List;
import java.lang.System;
import p.gg1;
import java.lang.Long;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import p.vv7;
import java.lang.IllegalArgumentException;
import java.lang.Class;
import p.ts5;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import java.util.ArrayList;
import java.util.Collections;
import p.ll1;

public abstract class es2	// class@0001e2 from classes2.dex
{

    static {
       ir2.t("\"\\");
       ir2.t("\t ,=");
    }
    public static final boolean a(cx5 p0){
       cx5 t;
       if (co5.c(p0.a.b, "HEAD")) {
          return false;
       }
       if ((t = p0.t) < 100 || (t >= 200 && (t != 204 && t != 304))) {
          return true;
       }
       if (!(we7.k(p0) - -1) && !av6.i0("chunked", cx5.f(p0, "Transfer-Encoding"), true)) {
          return false;
       }
       return true;
    }
    public static final void b(vu0 p0,ps2 p1,mp2 p2){
       int i4;
       String str2;
       String str3;
       int i11;
       int i12;
       long l3;
       String str4;
       int b5;
       int i13;
       String str6;
       uu0 str2;
       List list1;
       uu0 obj = p0;
       Object obj1 = p1;
       List obj2 = p2;
       co5.o(obj, "<this>");
       co5.o(obj1, "url");
       co5.o(obj2, "headers");
       if (obj == vu0.g) {
          return;
       }
       obj2 = obj2.k("Set-Cookie");
       int i = obj2.size();
       int i1 = 0;
       int i2 = 0;
       List list = null;
       while (true) {
          if (i2 < i) {
             int i3 = i2 + 1;
             ts5 obj3 = obj2.get(i2);
             co5.o(obj3, "setCookie");
             long l = System.currentTimeMillis();
             char c = ';';
             i2 = we7.g(obj3, c, i1, obj3.length());
             char c1 = '=';
             if ((i4 = we7.g(obj3, c1, i1, i2)) != i2) {
                String str = we7.z(obj3, i1, i4);
                boolean b = true;
                int i5 = (!str.length())? 1: 0;
                if (!i5) {
                   i1 = -1;
                   if (we7.m(str) == i1) {
                      i4 = i4 + 1;
                      String str1 = we7.z(obj3, i4, i2);
                      if (we7.m(str1) == i1) {
                         i2 = i2 + 1;
                         i1 = obj3.length();
                         int i6 = -1;
                         long l1 = i6;
                         boolean b1 = false;
                         boolean b2 = false;
                         boolean b3 = false;
                         boolean b4 = true;
                         int i7 = 0xe677d21fdbff;
                         int i8 = 0;
                         int i9 = 0;
                         while (true) {
                            long l2 = Long.MAX_VALUE;
                            int i10 = Long.MIN_VALUE;
                            if (i2 < i1) {
                               i4 = we7.g(obj3, c, i2, i1);
                               i5 = we7.g(obj3, c1, i2, i4);
                               str2 = we7.z(obj3, i2, i5);
                               if (i5 < i4) {
                                  i5 = i5 + 1;
                                  str3 = we7.z(obj3, i5, i4);
                               }else {
                                  str3 = "";
                               }
                               try{
                                  if (av6.i0(str2, "expires", b)) {
                                     try{
                                        i7 = gg1.R(str3, str3.length());
                                     }catch(java.lang.IllegalArgumentException e0){
                                     }
                                  }else if(av6.i0(str2, "max-age", b)){
                                     l1 = Long.parseLong(str3);
                                     if ((l1) > 0) {
                                        i10 = l1;
                                     }
                                     l1 = i10;
                                  }else if(av6.i0(str2, "domain", b)){
                                     str2 = ".";
                                     if (i12 = av6.g0(str3, str2, false) ^ 0x01) {
                                        if ((str2 = vv7.S(av6.w0(str2, str3))) != null) {
                                           i8 = str2;
                                           b4 = false;
                                        }else {
                                           throw new IllegalArgumentException();
                                        }
                                     }else {
                                        throw new IllegalArgumentException("Failed requirement.".toString());
                                     }
                                  }else if(av6.i0(str2, "path", b)){
                                     i9 = str3;
                                  }else if(av6.i0(str2, "secure", b)){
                                     b1 = true;
                                  }else if(av6.i0(str2, "httponly", b)){
                                     b2 = true;
                                  }
                                  i2 = i4 + 1;
                                  c = ';';
                                  c1 = '=';
                               }catch(java.lang.NumberFormatException e0){
                               }catch(java.lang.NumberFormatException e0){
                                  void ovoid = e0;
                                  Pattern pattern = Pattern.compile("-?\\d+");
                                  co5.l(pattern, "compile\(pattern\)");
                                  if (pattern.matcher(str3).matches()) {
                                     if (av6.D0(str3, "-", false)) {
                                        i11 = i10;
                                     }
                                     l1 = i11;
                                  }else {
                                     throw ovoid;
                                  }
                               }
                               b3 = true;
                            }else if(!(l1 - i10)){
                               l3 = i10;
                            }else if(l1 - i6){
                               if ((l1 - 0x20c49ba5e353f7) <= 0) {
                                  l2 = l1 * (long)1000;
                               }
                               l2 = l + l2;
                               b5 = 0xe677d21fdbff;
                               if ((l2 - l) >= 0 && (l2 - b5) <= 0) {
                                  l3 = l2;
                               }else {
                                  l3 = b5;
                               }
                            }else {
                               l3 = i7;
                            }
                            ps2 d = obj1.d;
                            if ((str4 = i8) == null) {
                               str4 = d;
                            }else if(co5.c(d, str4)){
                               if (av6.g0(d, str4, false)) {
                                  b5 = d.length() - str4.length();
                                  if ((b5 = b5 - b) == '.') {
                                     obj3 = we7.f;
                                     obj3.getClass();
                                     if (obj3.a.matcher(d).matches()) {
                                     }
                                  }else {
                                  }
                               }else {
                               }
                            }
                            if (b) {
                               if (d.length() == str4.length() || PublicSuffixDatabase.g.a(str4) != null) {
                                  str2 = "/";
                                  String str5 = i9;
                                  b5 = false;
                                  if (str5 != null && av6.D0(str5, str2, b5)) {
                                     str6 = str5;
                                  }else {
                                     str5 = p1.b();
                                     if (i13 = av6.q0(str5, '/', b5, 6)) {
                                        str2 = str5.substring(b5, i13);
                                        co5.l(str2, "this as java.lang.String…ing\(startIndex, endIndex\)");
                                     }
                                     str6 = str2;
                                  }
                                  str2 = new uu0(str, str1, l3, str4, str6, b1, b2, b3, b4);
                               label_0218 :
                                  if (obj != null) {
                                     if (list == null) {
                                        list = new ArrayList();
                                     }
                                     list.add(obj);
                                  }
                                  i2 = i3;
                                  i1 = 0;
                               }
                            }
                         }
                      }
                   }
                }
             }
             obj3 = 0;
             obj = null;
             goto label_0218 ;
          }else if(list != null){
             list1 = Collections.unmodifiableList(list);
             co5.l(list1, "{\n        Collections.un…ableList\(cookies\)\n      }");
             break ;
          }else {
             list1 = ll1.a;
             break ;
          }
       }
       list1.isEmpty();
       return;
    }
}
