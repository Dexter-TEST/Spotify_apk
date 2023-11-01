package p.uu0;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import java.util.Date;
import p.t51;
import java.lang.ThreadLocal;
import java.text.DateFormat;

public final class uu0	// class@00291e from classes.dex
{
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public static final Pattern j;
    public static final Pattern k;
    public static final Pattern l;
    public static final Pattern m;

    static {
       uu0.j = Pattern.compile("\(\\d{2,4}\)[^\\d]*");
       uu0.k = Pattern.compile("\(?i\)\(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec\).*");
       uu0.l = Pattern.compile("\(\\d{1,2}\)[^\\d]*");
       uu0.m = Pattern.compile("\(\\d{1,2}\):\(\\d{1,2}\):\(\\d{1,2}\)[^\\d]*");
    }
    public void uu0(String p0,String p1,long p2,String p3,String p4,boolean p5,boolean p6,boolean p7,boolean p8){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof uu0 && (co5.c(p0.a, this.a) && (co5.c(p0.b, this.b) && (!(p0.c - this.c) && (co5.c(p0.d, this.d) && (co5.c(p0.e, this.e) && (p0.f == this.f && (p0.g == this.g && (p0.h == this.h && p0.i == this.i)))))))))? true: false;
       return b;
    }
    public final int hashCode(){
       uu0 tc = this.c;
       int i = tp2.g(this.e, tp2.g(this.d, ((tp2.g(this.b, tp2.g(this.a, 527, 31), 31) + (int)(tc ^ (tc >> 32))) * 31), 31), 31);
       int i1 = 1231;
       int i2 = (this.f != null)? 1231: 1237;
       i = (i + i2) * 31;
       i2 = (this.g != null)? 1231: 1237;
       i = (i + i2) * 31;
       i2 = (this.h != null)? 1231: 1237;
       i = (i + i2) * 31;
       if (this.i == null) {
          i1 = 1237;
       }
       return (i + i1);
    }
    public final String toString(){
       String str = this.a+'='+this.b;
       if (this.h != null) {
          uu0 tc = this.c;
          if (!(tc - Long.MIN_VALUE)) {
             str = str+"; max-age=0";
          }else {
             String str1 = t51.a.get().format(new Date(tc));
             co5.l(str1, "STANDARD_DATE_FORMAT.get\(\).format\(this\)");
             str = str+"; expires="+str1;
          }
       }
       if (this.i == null) {
          str = str+"; domain="+this.d;
       }
       str = str+"; path="+this.e;
       if (this.f != null) {
          str = str+"; secure";
       }
       if (this.g != null) {
          str = str+"; httponly";
       }
       str = str;
       co5.l(str, "toString\(\)");
       return str;
    }
}
