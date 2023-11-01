package p.wn6;
import android.content.SharedPreferences$Editor;
import p.ws6;
import p.kf7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.rn6;
import p.vs6;
import p.ss6;
import java.lang.IllegalStateException;
import java.lang.Class;
import java.lang.System;
import java.lang.Boolean;

public class wn6	// class@002b71 from classes.dex
{
    public final SharedPreferences$Editor a;
    public final ws6 b;
    public final boolean c;
    public final kf7 d;
    public boolean e;

    public void wn6(SharedPreferences$Editor p0,ws6 p1,boolean p2,kf7 p3){
       co5.o(p3, "mUtils");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(rn6 p0,boolean p1){
       co5.o(p0, "key");
       this.a.putBoolean(p0.a, p1);
       this.g(1);
    }
    public final void b(rn6 p0,long p1){
       co5.o(p0, "key");
       this.a.putLong(p0.a, p1);
       this.g(8);
    }
    public final void c(rn6 p0,String p1){
       co5.o(p0, "key");
       this.a.putString(p0.a, p1);
       int i = (p1 != null)? p1.length() * 2: 0;
       this.g(i);
       return;
    }
    public final void d(rn6 p0){
       wn6 tb;
       co5.o(p0, "key");
       this.a.remove(p0.a);
       if (this.c != null && (this.d != null && (tb = this.b) != null)) {
          vs6 v6 = new vs6(3, 0, 0, null);
          tb.a(v6);
       }
       return;
    }
    public final void e(){
       int i = 1;
       if (!((this.e ^ i))) {
          throw new IllegalStateException("Must not use the same Editor instance twice".toString());
       }
       this.a.apply();
       this.e = i;
       return;
    }
    public final void f(){
       wn6 td;
       wn6 tb;
       int i = 1;
       if (!((this.e ^ i))) {
          throw new IllegalStateException("Must not use the same Editor instance twice".toString());
       }
       wn6 ta = this.a;
       if (this.c != null && ((td = this.d) != null && (tb = this.b) != null)) {
          kf7 a = td.a;
          a.getClass();
          a.getClass();
          long l = System.currentTimeMillis() - System.currentTimeMillis();
          if (!Boolean.valueOf(ta.commit()).booleanValue()) {
             vs6 a1 = new vs6(2, 0, l, new ss6("fail when committing sharedpreferences", i));
             tb.a(a);
          }
       }else {
          ta.commit();
       }
       this.e = i;
       return;
    }
    public final void g(int p0){
       wn6 tb;
       if (this.c != null && (tb = this.b) != null) {
          vs6 v7 = new vs6(2, p0, 0, null);
          tb.a(v7);
       }
       return;
    }
}
