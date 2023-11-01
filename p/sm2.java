package p.sm2;
import p.pm2;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import p.co5;
import java.util.Locale;
import java.net.URLEncoder;
import java.util.Arrays;
import p.gg1;
import java.lang.CharSequence;
import p.av6;
import p.mp2;
import java.lang.NullPointerException;
import p.io2;

public final class sm2 implements pm2	// class@002657 from classes.dex
{
    public final ArrayList a;

    public void sm2(){
       super();
       this.a = new ArrayList(20);
    }
    public void sm2(ArrayList p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1){
       co5.o(p1, "value");
       Object[] objArray = new Object[]{p0,URLEncoder.encode(p1, "UTF-8")};
       p0 = String.format(Locale.US, "%s=%s", Arrays.copyOf(objArray, 2));
       co5.l(p0, "java.lang.String.format\(locale, format, *args\)");
       this.a.add(p0);
    }
    public void b(String p0,String p1){
       co5.o(p0, "name");
       co5.o(p1, "value");
       gg1.j(p0);
       gg1.l(p1, p0);
       this.d(p0, p1);
    }
    public void c(String p0){
       int i;
       co5.o(p0, "line");
       char c = ':';
       boolean b = false;
       if ((i = av6.m0(p0, c, 1, b, 4)) != -1) {
          String str = p0.substring(b, i);
          co5.l(str, "this as java.lang.String…ing\(startIndex, endIndex\)");
          p0 = p0.substring((i + 1));
          co5.l(p0, "this as java.lang.String\).substring\(startIndex\)");
          this.d(str, p0);
       }else if(p0.charAt(b) == c){
          p0 = p0.substring(1);
          co5.l(p0, "this as java.lang.String\).substring\(startIndex\)");
          this.d("", p0);
       }else {
          this.d("", p0);
       }
       return;
    }
    public void d(String p0,String p1){
       co5.o(p0, "name");
       co5.o(p1, "value");
       sm2 ta = this.a;
       ta.add(p0);
       ta.add(av6.K0(p1).toString());
    }
    public mp2 e(){
       Object[] objArray;
       String[] stringArray = new String[0];
       if ((objArray = this.a.toArray(stringArray)) != null) {
          return new mp2(objArray);
       }
       throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
    public String f(String p0){
       int i1;
       co5.o(p0, "name");
       sm2 ta = this.a;
       int i = ta.size() - 2;
       if ((i1 = io2.m(i, 0, -2)) <= i) {
          while (true) {
             int i2 = i - 2;
             if (av6.i0(p0, ta.get(i), true)) {
                return ta.get((i + true));
             }
             if (i != i1) {
                i = i2;
             }
          }
       }
       return null;
    }
    public void g(String p0){
       co5.o(p0, "name");
       int i = 0;
       while (true) {
          sm2 ta = this.a;
          if (i < ta.size()) {
             if (av6.i0(p0, ta.get(i), true)) {
                ta.remove(i);
                ta.remove(i);
                i = i - 2;
             }
             i = i + 2;
          }else {
             break ;
          }
       }
       return;
    }
}
