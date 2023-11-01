package p.co6;
import p.tn6;
import p.un6;
import p.ws6;
import p.kf7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.rn6;
import p.yn6;
import p.wf2;
import java.lang.Number;
import com.google.common.collect.g;
import java.util.Set;
import p.ao6;
import java.util.Collections;
import p.tf4;
import java.lang.Boolean;
import p.zn6;
import java.lang.IllegalStateException;
import p.wn6;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import p.xn6;
import p.tm5;
import java.lang.Class;
import java.lang.System;
import p.ic;
import p.et0;
import p.vs6;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.util.Iterator;
import java.lang.Iterable;
import p.ss6;
import java.util.NoSuchElementException;
import java.lang.StringBuilder;
import p.en6;

public class co6 implements tn6	// class@00124a from classes.dex
{
    public final tm5 a;
    public final ws6 b;
    public final boolean c;
    public final kf7 d;

    public void co6(un6 p0,ws6 p1,boolean p2,kf7 p3){
       co5.o(p3, "mUtils");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public String a(rn6 p0){
       co5.o(p0, "key");
       this.j(p0);
       return this.g(p0, null);
    }
    public long b(rn6 p0,long p1){
       co5.o(p0, "key");
       yn6 v0 = new yn6(this, p0, p1, 0);
       p0 = this.i(v0);
       co5.i(p0);
       return p0.longValue();
    }
    public Set c(rn6 p0,g p1){
       co5.o(p0, "key");
       Set set = ((set = this.i(new ao6(this, p0, p1, 0))) == null)? null: Collections.unmodifiableSet(set);
       return set;
    }
    public boolean d(rn6 p0,boolean p1){
       co5.o(p0, "key");
       p0 = this.i(new tf4(this, p0, p1, 1));
       co5.i(p0);
       return p0.booleanValue();
    }
    public String e(rn6 p0){
       co5.o(p0, "key");
       if ((p0 = this.i(new zn6(this, p0, "", 1))) != null) {
          return p0;
       }
       throw new IllegalStateException("Required value was null.".toString());
    }
    public wn6 edit(){
       SharedPreferences$Editor uEditor = this.h().edit();
       co5.l(uEditor, "getSharedPreferences\(\).edit\(\)");
       return new wn6(uEditor, this.b, this.c, this.d);
    }
    public int f(rn6 p0,int p1){
       co5.o(p0, "key");
       p0 = this.i(new xn6(this, p0, p1, 0));
       co5.i(p0);
       return p0.intValue();
    }
    public String g(rn6 p0,String p1){
       co5.o(p0, "key");
       return this.i(new zn6(this, p0, p1, 0));
    }
    public final SharedPreferences h(){
       Object obj = this.a.get();
       co5.l(obj, "mSharedPreferences.get\(\)");
       return obj;
    }
    public final Object i(wf2 p0){
       int i;
       Object obj;
       int i4;
       ss6 oss6;
       co6 td = this.d;
       td.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          p0 = p0.invoke();
          obj = i;
       }catch(java.lang.Exception e12){
          obj = e12;
          p0 = i;
       }
       long l1 = et0.m(td.a, l);
       if (this.c != null && (td = this.b) != null) {
          int i1 = 0;
          int i2 = 2;
          if (p0 != null) {
             int i3 = 1;
             if (p0 instanceof Boolean) {
                i1 = 1;
             }else if(p0 instanceof Float){
                v10 = p0 instanceof Integer;
             }
             if (i3) {
                i1 = 4;
             }else if(p0 instanceof Long){
                i1 = 8;
             }else if(p0 instanceof String){
                i1 = p0.length() * 2;
             }else if(p0 instanceof Set){
                Iterator iterator = p0.iterator();
                while (iterator.hasNext()) {
                   i3 = iterator.next().length() * 2;
                   i1 = i1 + i3;
                }
             }
             i4 = i1;
          }else {
             i4 = 0;
          }
          if (obj) {
             oss6 = new ss6("unexpected result type", i2);
          }
          vs6 l2 = new vs6(1, i4, l1, oss6);
          td.a(l);
       }
       if (!obj) {
          return p0;
       }else {
          throw obj;
       }
    }
    public final void j(rn6 p0){
       co6 tb;
       co5.o(p0, "key");
       if (this.h().contains(p0.a)) {
          return;
       }
       if (this.c != null && (tb = this.b) != null) {
          vs6 v7 = new vs6(1, 0, 0, new ss6("requesting non existing key", 2));
          tb.a(v7);
       }
       throw new NoSuchElementException(en6.p("key ", p0.a, " has no value"));
    }
}
