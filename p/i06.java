package p.i06;
import p.cp7;
import java.lang.Object;
import java.util.ArrayList;
import p.p91;
import p.rp2;
import p.l91;
import java.lang.Math;

public final class i06	// class@0018fc from classes.dex
{
    public final cp7 a;
    public final ArrayList b;

    public void i06(cp7 p0){
       super();
       this.a = null;
       this.b = new ArrayList();
       this.a = p0;
    }
    public static long a(p91 p0,long p1){
       p91 d = p0.d;
       if (d instanceof rp2) {
          return p1;
       }
       p91 k = p0.k;
       int i = k.size();
       int i1 = 0;
       long l = p1;
       while (i1 < i) {
          l91 ol91 = k.get(i1);
          if (ol91 instanceof p91 && ol91.d != d) {
             long l1 = (long)ol91.f + p1;
             l = Math.min(l, i06.a(ol91, l1));
          }
          i1 = i1 + 1;
       }
       if (p0 == d.i) {
          cp7 h = d.h;
          p1 = p1 - d.j();
          l = Math.min(Math.min(l, i06.a(h, p1)), (p1 - (long)h.f));
       }
       return l;
    }
    public static long b(p91 p0,long p1){
       p91 d = p0.d;
       if (d instanceof rp2) {
          return p1;
       }
       p91 k = p0.k;
       int i = k.size();
       int i1 = 0;
       long l = p1;
       while (i1 < i) {
          l91 ol91 = k.get(i1);
          if (ol91 instanceof p91 && ol91.d != d) {
             long l1 = (long)ol91.f + p1;
             l = Math.max(l, i06.b(ol91, l1));
          }
          i1 = i1 + 1;
       }
       if (p0 == d.h) {
          cp7 i2 = d.i;
          p1 = p1 + d.j();
          l = Math.max(Math.max(l, i06.b(i2, p1)), (p1 - (long)i2.f));
       }
       return l;
    }
}
