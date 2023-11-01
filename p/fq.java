package p.fq;
import p.pb3;
import java.lang.Object;
import p.vu0;
import java.lang.String;
import p.co5;
import p.bv5;
import p.r45;
import p.ne5;
import java.io.File;
import p.ax5;
import p.sm5;
import p.on;
import p.xe7;
import p.nn6;
import p.hp5;
import p.ex5;
import p.u54;
import p.g70;
import p.cx5;
import p.jj5;
import p.c0;
import p.fx5;
import p.l42;
import java.lang.StringBuilder;
import java.io.IOException;
import p.i15;
import java.io.FileOutputStream;
import p.nn;
import p.b57;
import java.io.OutputStream;
import p.el6;
import p.gp5;
import java.lang.Throwable;
import p.ob3;
import p.yp5;
import p.ps2;
import p.sm2;
import java.lang.Class;
import java.util.TreeMap;
import java.util.Comparator;
import p.mp2;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.lang.Boolean;
import p.zu5;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Configuration;
import p.br3;
import p.is7;
import java.lang.Math;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Iterator;
import p.nd;
import p.xj0;
import p.aw6;
import p.gg1;
import p.fv5;
import p.we7;
import p.az5;
import p.es2;
import p.av6;
import p.on2;

public final class fq implements pb3	// class@00161e from classes.dex
{
    public final int a;
    public final Object b;

    public void fq(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void fq(vu0 p0){
       this.a = 4;
       co5.o(p0, "cookieJar");
       super();
       this.b = p0;
    }
    public final r45 a(bv5 p0,String p1){
       fq tb = this.b;
       File uFile = tb.a(p1);
       uFile = (uFile.isFile() && uFile.canRead())? 1: 0;
       if (uFile) {
          ax5 uoax5 = new ax5();
          uoax5.c = 200;
          uoax5.a = p0;
          uoax5.b = sm5.c;
          uoax5.d = "OK";
          uoax5.g = new ex5(null, -1, xe7.f(xe7.c0(tb.a(p1))));
          return new jj5(uoax5.a());
       }else {
          return c0.a;
       }
    }
    public final cx5 b(String p0,cx5 p1){
       cx5 x;
       File parentFile;
       if (p1.x() && (x = p1.x) != null) {
          boolean b = false;
          fq tb = this.b;
          if (p1.y == null) {
             File uFile = tb.a(p0);
             uFile = (uFile.isFile() && uFile.canRead())? 1: 0;
             if (uFile) {
             label_00e9 :
                return p1;
             }
          }
          g70 og70 = x.y();
          File uFile1 = tb.a(p0);
          if ((parentFile = uFile1.getParentFile()) != null) {
             if (parentFile.exists()) {
                if (!parentFile.isDirectory()) {
                   throw new IOException("File "+parentFile+" exists and is not a directory. Unable to create directory.");
                }
             }else if(!parentFile.mkdirs() && !parentFile.isDirectory()){
                throw new IOException("Unable to create directory "+parentFile);
             }
          }
          nn b1 = new nn(new FileOutputStream(uFile1, b), new b57());
          gp5 ogp5 = xe7.d(b1);
          ogp5.A(og70);
          ogp5.close();
          b1.close();
          og70.close();
          ax5 uoax5 = new ax5(p1);
          uoax5.g = new ex5(x.x(), x.f(), xe7.f(xe7.c0(tb.a(p0))));
          return uoax5.a();
       }else {
          goto label_00e9 ;
       }
    }
    public final cx5 intercept(ob3 p0){
       r45 or45;
       ax5 uoax5;
       cx5 uocx5;
       yp5 e1;
       Locale locale;
       String str3;
       String str4;
       List list1;
       List list2;
       ps2 i6;
       bv5 d2;
       u54 ou54;
       cx5 x;
       String str = "US";
       int i = 2;
       int i1 = 0;
       fq tb = this.b;
       int i2 = 1;
       switch (this.a){
           case 0:
             or45 = tb.get();
             if (!or45.c()) {
                uoax5 = new ax5();
                uoax5.b = sm5.c;
                uoax5.c = 401;
                uoax5.d = "";
                uoax5.g = gg1.s("", gg1.P("text/plain"));
                yp5 e = p0.e;
                co5.o(e, "request");
                uoax5.a = e;
                uocx5 = uoax5.a();
             }else {
                uocx5 = p0.b(xe7.a(p0.e, or45.b()));
             }
             break;
           case 1:
             e1 = p0.e;
             if (e1.c.a("Accept-Language") == null) {
                zu5 ozu5 = new zu5(e1);
                co5.o(tb, "context");
                ArrayList uArrayList = new ArrayList(i);
                if ((locale = is7.p(tb.getResources().getConfiguration()).c(i1)) != null) {
                   uArrayList.add(locale);
                }
                Locale uS = Locale.US;
                if (!co5.c(uS, locale)) {
                   co5.l(uS, str);
                   uArrayList.add(uS);
                }
                List list = uArrayList.subList(i1, Math.min(uArrayList.size(), i2));
                ArrayList uArrayList1 = new ArrayList(3);
                String str1 = new StringBuilder(32);
                NumberFormat numberInstan = NumberFormat.getNumberInstance(uS);
                co5.j(numberInstan, "null cannot be cast to non-null type java.text.DecimalFormat");
                numberInstan.applyPattern("#.##");
                Iterator iterator = list.iterator();
                double d = 0x3ff0000000000000;
                while (iterator.hasNext()) {
                   str1.delete(i1, str1.length());
                   str1 = str1.append(nd.a("-", iterator.next()));
                   if (list.size() > i2) {
                      str1 = str1.append(";q=").append(numberInstan.format(d));
                   }
                   String str2 = str1.toString();
                   co5.l(str2, "acceptLanguageValueBuilder.toString\(\)");
                   uArrayList1.add(str2);
                   double d1 = d / (double)list.size();
                   d = d - d1;
                }
                str3 = new StringBuilder(32);
                Iterator iterator1 = uArrayList1.iterator();
                while (iterator1.hasNext()) {
                   str1 = iterator1.next();
                   if (str3.length()) {
                      str3 = str3.append(", ");
                   }
                   str3 = str3.append(str1);
                }
                str3 = xj0.I0(str3);
                co5.l(str3, "normalizeAndStripNonAsci…geHeaderValue.toString\(\)\)");
                ozu5.d("Accept-Language", str3);
                e1 = ozu5.b();
             }
             return p0.b(e1);
             break;
           case 2:
             e1 = p0;
             yp5 e2 = e1.e;
             bv5 c = e2.c;
             c.getClass();
             Comparator cASE_INSENSI = String.CASE_INSENSITIVE_ORDER;
             co5.l(cASE_INSENSI, "CASE_INSENSITIVE_ORDER");
             TreeMap treeMap = new TreeMap(cASE_INSENSI);
             int i3 = c.a.length / i;
             for (int i4 = 0; i4 < i3; i4 = i5) {
                int i5 = i4 + 1;
                Locale uS1 = Locale.US;
                co5.l(uS1, str);
                str4 = c.c(i4).toLowerCase(uS1);
                co5.l(str4, "this as java.lang.String\).toLowerCase\(locale\)");
                if ((list1 = treeMap.get(str4)) == null) {
                   list1 = new ArrayList(i);
                   treeMap.put(str4, list1);
                }
                list1.add(c.g(i4));
             }
             if ("GET".equals(e2.b)) {
                if ((list2 = treeMap.get("X-Offline")) != null && (!list2.isEmpty() && Boolean.valueOf(list2.get(i1)).booleanValue())) {
                   i1 = 1;
                }
                try{
                   if (!i1) {
                   label_00e4 :
                      uocx5 = e1.b(e2);
                   }else {
                      i6 = e2.a.i;
                      uocx5 = p0.b(e2);
                      if (!uocx5.x()) {
                         r45 or451 = this.a(e2, i6);
                         if (or451.c()) {
                            uocx5 = or451.b();
                         }
                      }
                      uocx5 = this.b(i6, uocx5);
                   }
                }catch(java.io.IOException e15){
                   or45 = this.a(e2, i6);
                   if (or45.c()) {
                      uocx5 = or45.b();
                   }else {
                      throw e15;
                   }
                }
             }else {
                goto label_00e4 ;
             }
             return uocx5;
             break;
           case 3:
             e1 = p0.e;
             String str5 = p0.b(e1);
             if (tb.equals(e1.a.d)) {
                uoax5 = new ax5(str5);
                uoax5.f.g("Date");
                str5 = uoax5.a();
             }
             return str5;
             break;
           default:
             e1 = p0.e;
             e1.getClass();
             zu5 ozu51 = new zu5(e1);
             if ((d2 = e1.d) != null) {
                if ((ou54 = d2.b()) != null) {
                   ozu51.d("Content-Type", ou54.a);
                }
                long l = d2.a();
                str4 = "Transfer-Encoding";
                if (l - -1) {
                   ozu51.d("Content-Length", String.valueOf(l));
                   ozu51.c.g(str4);
                }else {
                   ozu51.d(str4, "chunked");
                   ozu51.c.g("Content-Length");
                }
             }
             d2 = e1.c;
             String str6 = "Host";
             bv5 a = e1.a;
             if (d2.a(str6) == null) {
                ozu51.d(str6, we7.w(a, i1));
             }
             str6 = "Connection";
             if (d2.a(str6) == null) {
                ozu51.d(str6, "Keep-Alive");
             }
             str6 = "Accept-Encoding";
             if (d2.a(str6) == null && d2.a("Range") == null) {
                ozu51.d(str6, "gzip");
                i1 = 1;
             }
             tb.getClass();
             co5.o(a, "url");
             if (d2.a("User-Agent") == null) {
                ozu51.d("User-Agent", "okhttp/4.10.0");
             }
             uocx5 = p0.b(ozu51.b());
             cx5 w = uocx5.w;
             es2.b(tb, a, w);
             ax5 uoax51 = new ax5(uocx5);
             uoax51.a = e1;
             if (i1) {
                str3 = "Content-Encoding";
                if (av6.i0("gzip", cx5.f(uocx5, str3), i2) && (es2.a(uocx5) && (x = uocx5.x) != null)) {
                   sm2 osm2 = w.d();
                   osm2.g(str3);
                   osm2.g("Content-Length");
                   uoax51.c(osm2.e());
                   uoax51.g = new ex5(cx5.f(uocx5, "Content-Type"), -1, xe7.f(new on2(x.y())));
                }
             }
             return uoax51.a();
       }
       return uocx5;
    }
}
