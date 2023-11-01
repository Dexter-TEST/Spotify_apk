package p.ds6;
import p.yt0;
import p.wv5;
import p.js6;
import p.tu0;
import p.he3;
import p.mg3;
import p.gb6;
import p.tf3;
import p.m00;
import p.ia7;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import p.wf0;
import p.dp5;
import p.oe7;
import p.vf3;
import p.ka7;

public final class ds6 extends js6 implements yt0, wv5	// class@0013ab from classes.dex
{
    public final he3 c;
    public final mg3 t;

    public void ds6(tu0 p0,he3 p1,mg3 p2){
       super(p1);
       this.c = p1;
       this.t = p2;
    }
    public final void a(gb6 p0){
       ds6 tt;
       if ((tt = this.t) != null && tt instanceof wv5) {
          tt.a(p0);
       }
       return;
    }
    public final void acceptJsonFormatVisitor(tf3 p0,he3 p1){
       ds6 tt;
       if ((tt = this.t) != null) {
          tt.acceptJsonFormatVisitor(p0, p1);
       }
       return;
    }
    public final mg3 b(gb6 p0,m00 p1){
       mg3 omg3;
       ds6 tt = this.t;
       ds6 tc = this.c;
       if (tt == null) {
          if (tc != null) {
             if (!tc.k()) {
                omg3 = p0.s(tc);
             label_001a :
                if (omg3 instanceof yt0) {
                   omg3 = p0.v(omg3, p1);
                }
                if (omg3 == tt) {
                   return this;
                }else {
                   wf0.t(ds6.class, this, "withDelegate");
                   return new ds6(null, tc, omg3);
                }
             }
          }else {
             p0.f();
             throw null;
          }
       }
       omg3 = tt;
       goto label_001a ;
    }
    public final mg3 d(gb6 p0,Object p1){
       mg3 omg3;
       p1 = p1.getClass();
       if ((omg3 = p0.w.a(p1)) != null || (omg3 = p0.a.o(p1)) != null) {
          return omg3;
       }
       p0.getClass();
       throw null;
    }
    public final mg3 getDelegatee(){
       return this.t;
    }
    public final boolean isEmpty(gb6 p0,Object p1){
       throw false;
    }
    public final void serialize(Object p0,vf3 p1,gb6 p2){
       throw null;
    }
    public final void serializeWithType(Object p0,vf3 p1,gb6 p2,ka7 p3){
       throw null;
    }
}
