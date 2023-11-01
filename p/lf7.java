package p.lf7;
import java.lang.StringBuilder;
import p.j80;
import java.lang.String;
import p.ir2;
import android.os.Looper;
import java.lang.Thread;
import java.lang.IllegalStateException;
import p.cv5;
import android.net.Uri;
import java.util.List;
import java.lang.Object;
import p.p77;
import p.e20;
import p.a5;
import java.util.ArrayList;

public abstract class lf7	// class@001d45 from classes.dex
{
    public static final StringBuilder a;
    public static final j80 b;
    public static final j80 c;

    static {
       lf7.a = "";
       lf7.b = ir2.t("RIFF");
       lf7.c = ir2.t("WEBP");
    }
    public static void a(){
       int i = (Looper.getMainLooper().getThread() == Thread.currentThread())? 1: 0;
       if (i) {
          return;
       }else {
          throw new IllegalStateException("Method call should happen from the main thread.");
       }
    }
    public static String b(cv5 p0,StringBuilder p1){
       cv5 e = p0.e;
       int i = 50;
       if (e != null) {
          p1.ensureCapacity((e.length() + i));
          p1 = p1+e;
       }else if((e = p0.c) != null){
          String str = e.toString();
          p1.ensureCapacity((str.length() + i));
          p1 = p1+str;
       }else {
          p1.ensureCapacity(i);
          p1 = p1+p0.d;
       }
       p1 = p1+10;
       char c = 'x';
       cv5 m = p0.m;
       if (0 - m) {
          p1 = p1+"rotation:"+m;
          if (p0.p != null) {
             p1 = p1+'@'+p0.n+c+p0.o;
          }
          p1 = p1+10;
       }
       if (p0.a()) {
          p1 = p1+"resize:"+p0.g+c+p0.h+10;
       }
       if (p0.i != null) {
          p1 = p1+"centerCrop:"+p0.j+10;
       }else if(p0.k != null){
          p1 = p1+"centerInside"+10;
       }
       if ((p0 = p0.f) != null) {
          i = p0.size();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             p1 = p1.append(p0.get(i1).a()).append(10);
          }
       }
       return p1;
    }
    public static String c(e20 p0){
       return lf7.d(p0, "");
    }
    public static String d(e20 p0,String p1){
       e20 b;
       String str = p1;
       if ((b = p0.B) != null) {
          str = str+b.b.b();
       }
       if ((p0 = p0.C) != null) {
          int i = p0.size();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             if (i1 > 0 || b != null) {
                str = str.append(", ");
             }
             str = str.append(p0.get(i1).b.b());
          }
       }
       return str;
    }
    public static void e(String p0,String p1,String p2){
       lf7.f(p0, p1, p2, "");
    }
    public static void f(String p0,String p1,String p2,String p3){
       Object[] objArray = new Object[]{p0,p1,p2,p3};
       String.format("%1$-11s %2$-12s %3$s %4$s", objArray);
    }
}
