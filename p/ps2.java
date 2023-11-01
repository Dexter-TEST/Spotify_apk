package p.ps2;
import p.gg1;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Object;
import p.co5;
import java.lang.CharSequence;
import p.av6;
import p.we7;
import p.os2;
import java.util.Collection;
import java.net.URI;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.lang.RuntimeException;
import java.lang.Throwable;

public final class ps2	// class@0022bf from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final List g;
    public final String h;
    public final String i;
    public final boolean j;
    public static final char[] k;

    static {
       gg1 ogg1 = new gg1();
       ps2.k = new char[16]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    }
    public void ps2(String p0,String p1,String p2,String p3,int p4,ArrayList p5,ArrayList p6,String p7,String p8){
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
       this.j = co5.c(p0, "https");
    }
    public final String a(){
       boolean b = false;
       int i = 1;
       int i1 = (!this.c.length())? 1: 0;
       if (i1) {
          return "";
       }else {
          ps2 ti = this.i;
          String str = ti.substring((av6.m0(ti, ':', (this.a.length() + 3), b, 4) + i), av6.m0(ti, '@', b, b, 6));
          co5.l(str, "this as java.lang.String…ing\(startIndex, endIndex\)");
          return str;
       }
    }
    public final String b(){
       ps2 ti = this.i;
       int i = av6.m0(ti, '/', (this.a.length() + 3), false, 4);
       String str = ti.substring(i, we7.f(i, ti, ti.length(), "?#"));
       co5.l(str, "this as java.lang.String…ing\(startIndex, endIndex\)");
       return str;
    }
    public final ArrayList c(){
       ps2 ti = this.i;
       int i = av6.m0(ti, '/', (this.a.length() + 3), false, 4);
       int i1 = we7.f(i, ti, ti.length(), "?#");
       ArrayList uArrayList = new ArrayList();
       for (; i < i1; i = i2) {
          i = i + 1;
          int i2 = we7.g(ti, '/', i, i1);
          String str = ti.substring(i, i2);
          co5.l(str, "this as java.lang.String…ing\(startIndex, endIndex\)");
          uArrayList.add(str);
       }
       return uArrayList;
    }
    public final String d(){
       if (this.g == null) {
          return null;
       }
       ps2 ti = this.i;
       int i = av6.m0(ti, '?', 0, 0, 6) + 1;
       String str = ti.substring(i, we7.g(ti, '#', i, ti.length()));
       co5.l(str, "this as java.lang.String…ing\(startIndex, endIndex\)");
       return str;
    }
    public final String e(){
       int i = (!this.b.length())? 1: 0;
       if (i) {
          return "";
       }else {
          i = this.a.length() + 3;
          ps2 ti = this.i;
          String str = ti.substring(i, we7.f(i, ti, ti.length(), ":@"));
          co5.l(str, "this as java.lang.String…ing\(startIndex, endIndex\)");
          return str;
       }
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof ps2 && co5.c(p0.i, this.i))? true: false;
       return b;
    }
    public final os2 f(){
       ps2 te;
       String str;
       os2 oos2 = new os2();
       ps2 ta = this.a;
       oos2.a = ta;
       oos2.b = this.e();
       oos2.c = this.a();
       oos2.d = this.d;
       if ((te = this.e) != gg1.y(ta)) {
       }else {
          te = -1;
       }
       oos2.e = te;
       os2 f = oos2.f;
       f.clear();
       f.addAll(this.c());
       oos2.d(this.d());
       if (this.h == null) {
          str = null;
       }else {
          ps2 ti = this.i;
          str = ti.substring((av6.m0(ti, '#', 0, 0, 6) + 1));
          co5.l(str, "this as java.lang.String\).substring\(startIndex\)");
       }
       oos2.h = str;
       return oos2;
    }
    public final os2 g(String p0){
       os2 oos2;
       String str = "link";
       try{
          co5.o(p0, str);
          oos2 = new os2();
          oos2.f(this, p0);
       }catch(java.lang.IllegalArgumentException e0){
          oos2 = null;
       }
       return oos2;
    }
    public final URI h(){
       String str1;
       os2 obj;
       URI uRI;
       os2 oos2 = this.f();
       os2 d = oos2.d;
       String str = null;
       if (d == null) {
          str1 = str;
       }else {
          Pattern pattern1 = Pattern.compile("[\"<>^`{|}]");
          co5.l(pattern1, "compile\(pattern\)");
          str1 = pattern1.matcher(d).replaceAll("");
          co5.l(str1, "nativePattern.matcher\(in…).replaceAll\(replacement\)");
       }
       oos2.d = str1;
       d = oos2.f;
       int i = d.size();
       int i1 = 0;
       for (int i2 = 0; i2 < i; i2 = i3) {
          int i3 = i2 + 1;
          d.set(i2, gg1.i(d.get(i2), 0, 0, "[]", true, true, false, false, 227));
       }
       if ((d = oos2.g) != null) {
          i = d.size();
          for (; i1 < i; i1 = i2) {
             i2 = i1 + 1;
             String str2 = ((obj = d.get(i1)) == null)? str: gg1.i(obj, 0, 0, "\\^`{|}", true, true, true, false, 195);
             d.set(i1, str2);
          }
       }
       if ((obj = oos2.h) != null) {
          str = gg1.i(obj, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
       }
       oos2.h = str;
       str1 = oos2.toString();
       try{
          uRI = new URI(str1);
       }catch(java.net.URISyntaxException e0){
          try{
             Pattern pattern = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
             co5.l(pattern, "compile\(pattern\)");
             str1 = pattern.matcher(str1).replaceAll("");
             co5.l(str1, "nativePattern.matcher\(in…).replaceAll\(replacement\)");
             uRI = URI.create(str1);
             co5.l(uRI, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
          }catch(java.lang.Exception e0){
             throw new RuntimeException(e0);
          }
       }
       return uRI;
    }
    public final int hashCode(){
       return this.i.hashCode();
    }
    public final String toString(){
       return this.i;
    }
}
