package p.l33;
import java.util.AbstractList;
import p.xj0;
import java.util.List;
import java.util.Collections;
import p.i33;
import java.lang.Class;
import java.lang.Object;
import com.google.common.collect.c;
import java.util.Collection;
import p.h33;
import p.ys5;
import p.zb3;
import p.ju2;

public final class l33 extends AbstractList	// class@001cd6 from classes.dex
{
    public final List a;
    public final List b;
    public final i33 c;
    public static final l33 t;

    static {
       l33.t = new l33(xj0.C, Collections.emptyList());
    }
    public void l33(i33 p0,List p1){
       xy c;
       List list;
       super();
       p1.getClass();
       p0.getClass();
       this.c = p0;
       this.a = (p1 instanceof c)? c.o(p1): Collections.unmodifiableList(p1);
       c = xj0.C;
       if (p0 != c) {
          if (!p0 instanceof h33) {
             h33 oh33 = new h33(p0);
          }
          c = p0;
       }
       l33 ta = this.a;
       int i = 0;
       int i1 = (ta == Collections.emptyList())? 1: 0;
       if (i1) {
          list = Collections.emptyList();
       }else {
          ys5 v = ys5.v;
          if (ta == v) {
             i = 1;
          }
          if (!i) {
             v = new zb3(c, ta);
          }
          list = v;
       }
       this.b = list;
       return;
    }
    public final Object get(int p0){
       return this.b.get(p0);
    }
    public final int size(){
       return this.a.size();
    }
}
