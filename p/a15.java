package p.a15;
import javax.net.ssl.HostnameVerifier;
import java.lang.Object;
import java.security.cert.X509Certificate;
import java.util.List;
import p.ll1;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Integer;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;
import java.lang.IllegalArgumentException;
import p.tp2;
import p.we7;
import java.lang.Class;
import p.ts5;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p.vv7;
import java.lang.Iterable;
import java.util.Locale;
import p.av6;
import javax.net.ssl.SSLSession;
import java.security.cert.Certificate;
import java.lang.NullPointerException;

public final class a15 implements HostnameVerifier	// class@00015b from classes2.dex
{
    public static final a15 a;

    static {
       a15.a = new a15();
    }
    public void a15(){
       super();
    }
    public static List a(X509Certificate p0,int p1){
       Collection subjectAlter;
       List list;
       Object obj;
       ll1 a = ll1.a;
       try{
          if ((subjectAlter = p0.getSubjectAlternativeNames()) == null) {
             return a;
          }
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = subjectAlter.iterator();
          while (iterator.hasNext()) {
             if ((list = iterator.next()) != null && (list.size() >= 2 && (co5.c(list.get(0), Integer.valueOf(p1)) && (obj = list.get(1)) != null))) {
                uArrayList.add(obj);
             }
          }
          return uArrayList;
       }catch(java.security.cert.CertificateParsingException e0){
          return e0;
       }
    }
    public static boolean b(String p0){
       char c;
       int i4;
       int i6;
       int i = p0.length();
       int i1 = p0.length();
       boolean b = false;
       int i2 = (i1 >= 0)? 1: 0;
       if (i2) {
          i2 = (i1 <= p0.length())? 1: 0;
          if (i2) {
             long l = 0;
             int i3 = 0;
             while (i3 < i1) {
                if ((c = p0.charAt(i3)) < 128) {
                   l = l + 1;
                }else if(c < 2048){
                   i4 = 2;
                }else if(c >= 0xd800){
                   int i5 = 0xdfff;
                   if (c <= i5) {
                      char c1 = ((i6 = i3 + 1) < i1)? p0.charAt(i6): 0;
                      if (c <= 0xdbff && (c1 >= 0xdc00 && c1 <= i5)) {
                         l = l + (long)4;
                         i3 = i3 + 2;
                      }else {
                         l = l + 1;
                         i3 = i6;
                      }
                   }
                }
                i4 = 3;
                l = l + (long)i4;
                i3 = i3 + 1;
             }
             if (i == (int)l) {
                b = true;
             }
             return b;
          }else {
             throw new IllegalArgumentException(kg4.r("endIndex > string.length: ", i1, " > ")+p0.length().toString());
          }
       }else {
          throw new IllegalArgumentException(tp2.l("endIndex < beginIndex: ", i1, " < 0").toString());
       }
    }
    public static boolean c(String p0,X509Certificate p1){
       List list;
       Iterator iterator;
       boolean b1;
       co5.o(p0, "host");
       co5.o(p1, "certificate");
       ts5 f = we7.f;
       f.getClass();
       boolean b = false;
       if (f.a.matcher(p0).matches()) {
          p0 = vv7.S(p0);
          list = a15.a(p1, 7);
          if (!list.isEmpty()) {
             iterator = list.iterator();
             while (iterator.hasNext()) {
                if (co5.c(p0, vv7.S(iterator.next()))) {
                   b = true;
                   break ;
                }
             }
          }
       }else if(a15.b(p0)){
          Locale uS = Locale.US;
          co5.l(uS, "US");
          p0 = p0.toLowerCase(uS);
          co5.l(p0, "this as java.lang.String\).toLowerCase\(locale\)");
       }
       list = a15.a(p1, 2);
       if (!list.isEmpty()) {
          iterator = list.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             int i = (!p0.length())? 1: 0;
             if (!i) {
                String str1 = ".";
                if (!av6.D0(p0, str1, b)) {
                   String str2 = "..";
                   if (!av6.g0(p0, str2, b)) {
                      int i1 = (str != null && str.length())? 0: 1;
                      if (!i1 && (!av6.D0(str, str1, b) && !av6.g0(str, str2, b))) {
                         str2 = (!av6.g0(p0, str1, b))? co5.K(str1, p0): p0;
                         if (!av6.g0(str, str1, b)) {
                            str = co5.K(str1, str);
                         }
                         if (a15.b(str)) {
                            Locale uS1 = Locale.US;
                            co5.l(uS1, "US");
                            str = str.toLowerCase(uS1);
                            co5.l(str, "this as java.lang.String\).toLowerCase\(locale\)");
                         }
                         if (!av6.f0(str, "*")) {
                            b1 = co5.c(str2, str);
                         label_013b :
                            if (b1) {
                            }
                         }else {
                            str1 = "*.";
                            if (av6.D0(str, str1, b) && (av6.m0(str, '*', 1, b, 4) == -1 && (str2.length() >= str.length() && !co5.c(str1, str)))) {
                               str = str.substring(1);
                               co5.l(str, "this as java.lang.String\).substring\(startIndex\)");
                               if (av6.g0(str2, str, b)) {
                                  if ((i1 = str2.length() - str.length()) > 0) {
                                     i = i1 - 1;
                                     if (av6.q0(str2, '.', i, 4) == -1) {
                                     }
                                  }else {
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             }
             b1 = false;
             goto label_013b ;
          }
       }
       return b;
    }
    public final boolean verify(String p0,SSLSession p1){
       object oobject;
       try{
          co5.o(p0, "host");
          co5.o(p1, "session");
          boolean b = false;
          if (!a15.b(p0)) {
          }else if((oobject = p1.getPeerCertificates()[b]) != null){
             b = a15.c(p0, oobject);
          }else {
             throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
          }
          return b;
       }catch(javax.net.ssl.SSLException e0){
       }
    }
}
