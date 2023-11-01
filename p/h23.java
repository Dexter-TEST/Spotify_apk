package p.h23;
import java.lang.Object;
import p.fu2;
import p.tu2;
import p.hu2;
import p.au2;
import p.p33;
import java.lang.String;
import java.util.Map;
import java.util.List;
import p.k23;
import p.c23;
import java.lang.Class;
import p.b23;
import p.o23;
import p.l23;
import p.g23;
import p.d23;
import p.a23;
import p.o13;
import p.v23;
import com.google.common.collect.c;
import p.eb3;
import p.n13;
import p.n26;
import p.m73;
import p.eo5;
import p.oi;
import p.ju2;
import p.co5;

public final class h23	// class@0017c8 from classes.dex
{

    public void h23(){
       super();
    }
    public static k23 a(fu2 p0,tu2 p1,hu2 p2,au2 p3,au2 p4,au2 p5,p33 p6,String p7,String p8,Map p9,List p10){
       int i2;
       k23 v12;
       int i = p0;
       int i1 = p6;
       c23.t.getClass();
       if (i) {
          if (i instanceof c23) {
          }else {
             i = b23.a(p0.c(), p0.d());
          }
       }else {
          i = c23.e();
       }
       c23 uoc23 = i;
       o23.c.getClass();
       o23 oo23 = (p1 != null)? l23.a(p1): o23.b();
       o23 oo231 = oo23;
       g23.c.getClass();
       g23 og23 = (p2 != null)? d23.b(p2): g23.j();
       g23 og231 = og23;
       a23.b.getClass();
       a23 uoa23 = o13.b(p3);
       a23 uoa231 = o13.b(p4);
       a23 uoa232 = o13.b(p5);
       p10.c.getClass();
       if (i1) {
          if (i1 instanceof p10) {
             i = i1;
          }else {
             i2 = new v23(p6.a(), eb3.p(p6.b()));
          label_007b :
             n13.v.getClass();
             v12 = new k23(uoc23, oo231, og231, uoa23, uoa231, uoa232, i2, p7, p8, eo5.x(p9, n13.class, n26.K), oi.b(p10));
             return v12;
          }
       }else {
          v12 = 0;
       }
       i2 = i;
       goto label_007b ;
    }
    public static k23 b(ju2 p0){
       co5.o(p0, "other");
       if (p0 instanceof k23) {
       }else {
          k23 ok23 = h23.a(p0.q(), p0.y(), p0.u(), p0.d(), p0.C(), p0.b(), p0.D(), p0.c(), p0.group(), p0.m(), p0.j());
       }
       return p0;
    }
}
