package p.ac1;
import p.c42;
import p.yg3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.m95;
import p.el6;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Collections;
import p.i51;
import java.lang.Long;
import java.util.Map;
import p.xg3;
import p.gk;
import java.util.AbstractCollection;
import p.nn6;
import java.lang.StringBuilder;
import java.lang.Class;
import p.uf0;
import p.ns5;

public final class ac1 extends c42	// class@000f53 from classes.dex
{
    public final c42 b;

    public void ac1(yg3 p0){
       co5.o(p0, "delegate");
       super();
       this.b = p0;
    }
    public final el6 a(m95 p0){
       return this.b.a(p0);
    }
    public final void b(m95 p0,m95 p1){
       co5.o(p0, "source");
       co5.o(p1, "target");
       this.b.b(p0, p1);
    }
    public final void c(m95 p0){
       this.b.c(p0);
    }
    public final void d(m95 p0){
       co5.o(p0, "path");
       this.b.d(p0);
    }
    public final List g(m95 p0){
       co5.o(p0, "dir");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.b.g(p0).iterator();
       while (iterator.hasNext()) {
          m95 om95 = iterator.next();
          co5.o(om95, "path");
          uArrayList.add(om95);
       }
       if (uArrayList.size() > 1) {
          Collections.sort(uArrayList);
       }
       return uArrayList;
    }
    public final i51 i(m95 p0){
       i51 oi51;
       i51 oi511;
       i51 "extras";
       co5.o(p0, "path");
       if ((oi51 = this.b.i(p0)) == null) {
          oi51 = null;
       }else if((oi511 = oi51.d) == null){
          i51 oi512 = oi51.i;
          co5.o(oi512, "extras");
          "extras" = new i51(oi51.b, oi51.c, oi511, oi51.e, oi51.f, oi51.g, oi51.h, oi512);
       }
       return oi51;
    }
    public final xg3 j(m95 p0){
       co5.o(p0, "file");
       return this.b.j(p0);
    }
    public final el6 k(m95 p0){
       m95 om95 = p0.b();
       ac1 tb = this.b;
       if (om95 != null) {
          gk ogk = new gk();
          for (; om95 != null && !this.f(om95); om95 = om95.b()) {
             ogk.addFirst(om95);
          }
          Iterator iterator = ogk.iterator();
          while (iterator.hasNext()) {
             m95 om951 = iterator.next();
             co5.o(om951, "dir");
             tb.c(om951);
          }
       }
       return tb.k(p0);
    }
    public final nn6 l(m95 p0){
       co5.o(p0, "file");
       return this.b.l(p0);
    }
    public final String m(){
       return ns5.a(ac1.class).b()+'('+this.b+')';
    }
    public final String toString(){
       return this.m();
    }
}
