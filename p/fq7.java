package p.fq7;
import p.zq7;
import p.eq7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.eq0;
import p.h00;
import p.tq0;
import p.i00;
import p.di4;
import p.ai4;
import java.lang.Class;
import java.util.ArrayList;
import p.es3;
import p.gq7;
import java.util.Iterator;
import p.jr7;
import java.util.Objects;
import java.util.List;
import java.util.Collection;

public final class fq7	// class@00161d from classes.dex
{
    public final eq7 a;
    public final eq0[] b;
    public final Object c;

    public void fq7(zq7 p0,eq7 p1){
       co5.o(p0, "trackers");
       eq0[] uoeq0Array = new eq0[]{new h00(p0.a, 0),new h00(p0.b),new h00(p0.t, 4),new h00(p0.c, 2),new h00(p0.c, 3),new di4(p0.c),new ai4(p0.c)};
       super();
       this.a = p1;
       this.b = uoeq0Array;
       this.c = new Object();
    }
    public final boolean a(String p0){
       object oobject;
       co5.o(p0, "workSpecId");
       fq7 tc = this.c;
       _monitor_enter(tc);
       fq7 tb = this.b;
       int len = tb.length;
       boolean b = false;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = tb[i];
             oobject.getClass();
             eq0 d = ((d = oobject.d) != null && (oobject.b(d) && oobject.c.contains(p0)))? 1: 0;
             if (d) {
             label_0031 :
                if (oobject != null) {
                   es3.c().getClass();
                }
                if (oobject == null) {
                   b = true;
                   break ;
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             oobject = null;
             goto label_0031 ;
          }
       }
       _monitor_exit(tc);
       return b;
    }
    public final void b(ArrayList p0){
       fq7 ta;
       co5.o(p0, "workSpecs");
       fq7 tc = this.c;
       _monitor_enter(tc);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (this.a(obj.a)) {
             uArrayList.add(obj);
          }
       }
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          Objects.toString(iterator.next());
          es3.c().getClass();
       }
       if ((ta = this.a) != null) {
          ta.d(uArrayList);
       }
       _monitor_exit(tc);
       return;
    }
    public final void c(Collection p0){
       co5.o(p0, "workSpecs");
       fq7 tc = this.c;
       _monitor_enter(tc);
       fq7 tb = this.b;
       int len = tb.length;
       int i = 0;
       int i1 = 0;
       while (i1 < len) {
          object oobject = tb[i1];
          if (oobject.e != null) {
             fq7 uofq7 = null;
             oobject.e = uofq7;
             oobject.d(uofq7, oobject.d);
          }
          i1 = i1 + 1;
       }
       tb = this.b;
       len = tb.length;
       for (i1 = 0; i1 < len; i1 = i1 + 1) {
          tb[i1].c(p0);
       }
       fq7 tb1 = this.b;
       int len1 = tb1.length;
       while (i < len1) {
          object oobject1 = tb1[i];
          if (oobject1.e != this) {
             oobject1.e = this;
             oobject1.d(this, oobject1.d);
          }
          i = i + 1;
       }
       _monitor_exit(tc);
       return;
    }
    public final void d(){
       int i1;
       fq7 tc = this.c;
       _monitor_enter(tc);
       fq7 tb = this.b;
       int len = tb.length;
       int i = 0;
       while (i < len) {
          object oobject = tb[i];
          eq0 b = oobject.b;
          if (i1 = b.isEmpty() ^ 0x01) {
             b.clear();
             oobject.a.b(oobject);
          }
          i = i + 1;
       }
       _monitor_exit(tc);
       return;
    }
}
