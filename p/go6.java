package p.go6;
import p.co6;
import p.un6;
import p.ws6;
import p.kf7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.SharedPreferences;
import p.rn6;
import p.yn6;
import p.wf2;
import java.lang.Number;
import com.google.common.collect.g;
import java.util.Set;
import p.ao6;
import p.tf4;
import java.lang.Boolean;
import p.eo6;
import p.fo6;
import p.wn6;
import p.do6;
import android.content.SharedPreferences$Editor;
import p.xn6;

public final class go6 extends co6	// class@00174c from classes.dex
{
    public final tn6 e;

    public void go6(un6 p0,co6 p1,ws6 p2,boolean p3,kf7 p4){
       co5.o(p4, "utils");
       p0 = p0.get();
       co5.l(p0, "sharedPreferences.get\(\)");
       super(new un6(p0, 2), p2, p3, p4);
       this.e = p1;
    }
    public final String a(rn6 p0){
       co5.o(p0, "key");
       return this.g(p0, null);
    }
    public final long b(rn6 p0,long p1){
       yn6 sharedPrefer.contains(a);
       co5.o(p0, "key");
       rn6 a = p0.a;
       SharedPreferences sharedPrefer = this.h();
       if (sharedPrefer.contains(a)) {
          sharedPrefer.contains(a) = new yn6(sharedPrefer, a, p1, 1);
          p0 = this.i(sharedPrefer.contains(a));
          co5.i(p0);
          return p0.longValue();
       }else if(sharedPrefer.contains("__cleared__")){
          sharedPrefer.contains(a) = new yn6(this, a, p1, 2);
          p0 = this.i(sharedPrefer.contains("__cleared__"));
          co5.i(p0);
          p1 = p0.longValue();
       }
       return p1;
    }
    public final Set c(rn6 p0,g p1){
       co5.o(p0, "key");
       SharedPreferences sharedPrefer = this.h();
       p0 = p0.a;
       if (sharedPrefer.contains(p0)) {
          return this.i(new ao6(sharedPrefer, p0, p1, 1));
       }
       if (!sharedPrefer.contains("__cleared__")) {
          p1 = this.i(new ao6(this, p0, p1, 2));
       }
       return p1;
    }
    public final boolean d(rn6 p0,boolean p1){
       co5.o(p0, "key");
       SharedPreferences sharedPrefer = this.h();
       p0 = p0.a;
       if (sharedPrefer.contains(p0)) {
          p0 = this.i(new tf4(sharedPrefer, p0, p1, 2));
          co5.i(p0);
          return p0.booleanValue();
       }else if(sharedPrefer.contains("__cleared__")){
          p0 = this.i(new tf4(this, p0, p1, 3));
          co5.i(p0);
          p1 = p0.booleanValue();
       }
       return p1;
    }
    public final String e(rn6 p0){
       co5.o(p0, "key");
       SharedPreferences sharedPrefer = this.h();
       p0 = p0.a;
       String str = "";
       if (sharedPrefer.contains(p0)) {
          p0 = this.i(new eo6(sharedPrefer, p0, str, 1));
          co5.i(p0);
          return p0;
       }else if(!sharedPrefer.contains("__cleared__") && this.e.h().contains(p0)){
          p0 = this.i(new fo6(this, p0, str, 1));
          co5.i(p0);
          str = p0;
       }
       return str;
    }
    public final wn6 edit(){
       SharedPreferences$Editor uEditor = this.h().edit();
       co5.l(uEditor, "getSharedPreferences\(\).edit\(\)");
       return new do6(uEditor, this.b, this.c, this.d);
    }
    public final int f(rn6 p0,int p1){
       co5.o(p0, "key");
       SharedPreferences sharedPrefer = this.h();
       p0 = p0.a;
       if (sharedPrefer.contains(p0)) {
          p0 = this.i(new xn6(sharedPrefer, p0, p1, 1));
          co5.i(p0);
          return p0.intValue();
       }else if(sharedPrefer.contains("__cleared__")){
          p0 = this.i(new xn6(this, p0, p1, 2));
          co5.i(p0);
          p1 = p0.intValue();
       }
       return p1;
    }
    public final String g(rn6 p0,String p1){
       co5.o(p0, "key");
       SharedPreferences sharedPrefer = this.h();
       p0 = p0.a;
       if (sharedPrefer.contains(p0)) {
          return this.i(new eo6(sharedPrefer, p0, p1, 0));
       }
       if (!sharedPrefer.contains("__cleared__")) {
          p1 = this.i(new fo6(this, p0, p1, 0));
       }
       return p1;
    }
}
