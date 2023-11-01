package p.kb7;
import p.pf7;
import p.lb7;
import java.lang.Object;
import java.util.List;
import p.ye7;
import java.lang.String;
import p.dj0;
import java.util.ArrayList;
import p.ll1;
import java.util.Collection;
import p.jb7;
import p.co5;
import java.lang.Class;
import p.tp2;
import p.kg4;
import java.lang.StringBuilder;
import java.lang.Iterable;
import p.zf2;
import p.hr7;

public final class kb7 implements pf7	// class@001be3 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final boolean e;
    public final String f;
    public final String g;
    public final lb7 h;
    public static final kb7 i;

    static {
       kb7 v8 = new kb7("", "", "", ye7.J(lb7.f), false, "", "");
       kb7.i = v8;
    }
    public void kb7(String p0,String p1,String p2,List p3,boolean p4,String p5,String p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = dj0.k0(p3);
    }
    public final List a(){
       ll1 a;
       ArrayList uArrayList = ye7.Z(this.d);
       kb7 th = this.h;
       int i = 0;
       int i1 = (th.a.length() > 0)? 1: 0;
       kb7 tc = this.c;
       if (i1) {
          i1 = (tc.length() > 0)? 1: 0;
          if (i1 && uArrayList.isEmpty()) {
             a = ll1.a;
          label_0056 :
             return a;
          }
       }
       ArrayList uArrayList1 = new ArrayList();
       uArrayList1.addAll(uArrayList);
       a = (!th.a.length())? 1: 0;
       if (a) {
          uArrayList1.add("spec id is empty");
       }
       if (!tc.length()) {
          i = 1;
       }
       if (i) {
          uArrayList1.add("app is empty");
       }
       a = uArrayList1;
       goto label_0056 ;
    }
    public final jb7 b(){
       jb7 ojb7 = new jb7();
       kb7 tc = this.c;
       co5.o(tc, "app");
       ojb7.h = tc;
       tc = this.b;
       co5.o(tc, "generatorVersion");
       ojb7.g = tc;
       kb7 th = this.h;
       lb7 a = th.a;
       co5.o(a, "specificationId");
       ojb7.a = a;
       kb7 ta = this.a;
       co5.o(ta, "specificationVersion");
       ojb7.f = ta;
       ojb7.b = th.b;
       ojb7.d = th.c;
       ojb7.c = th.d;
       ojb7.e = th.e;
       th = this.d;
       List list = th.subList(1, th.size());
       co5.o(list, "path");
       jb7 i = ojb7.i;
       i.clear();
       i.addAll(list);
       ojb7.j = this.e;
       th = this.f;
       co5.o(th, "annotatorVersion");
       ojb7.k = th;
       th = this.g;
       co5.o(th, "annotatorConfigurationVersion");
       ojb7.l = th;
       return ojb7;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       boolean b = false;
       if (p0 == null || !co5.c(kb7.class, p0.getClass())) {
          return b;
       }
       if (!co5.c(this.a, p0.a)) {
          return b;
       }
       if (!co5.c(this.b, p0.b)) {
          return b;
       }
       if (!co5.c(this.c, p0.c)) {
          return b;
       }
       if (!co5.c(this.h, p0.h)) {
          return b;
       }
       if (!co5.c(this.d, p0.d)) {
          return b;
       }
       if (this.e != p0.e) {
          return b;
       }
       if (!co5.c(this.f, p0.f)) {
          return b;
       }
       return co5.c(this.g, p0.g);
    }
    public final int hashCode(){
       int i = 31;
       int i1 = kg4.j(this.d, ((this.h.hashCode() + tp2.g(this.c, tp2.g(this.b, (this.a.hashCode() * 31), i), i)) * 31), i);
       int i2 = (this.e != null)? 1231: 1237;
       return (this.g.hashCode() + tp2.g(this.f, ((i1 + i2) * 31), 31));
    }
    public final String toString(){
       StringBuilder str = "["+this.c+"][";
       String str1 = (this.d.isEmpty())? "no path": dj0.q0(this.d, "/", null, null, null, 62);
       return hr7.a(str+str1+"] <spec version "+this.a+"><generator version ", this.b, '>');
    }
}
