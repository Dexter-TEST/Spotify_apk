package p.bc1;
import p.ng2;
import p.ww6;
import p.ec1;
import p.au0;
import java.lang.Object;
import p.cx0;
import p.jc7;
import p.eb3;
import p.i20;
import p.el6;
import p.gp5;
import p.xe7;

public final class bc1 extends ww6 implements ng2	// class@001096 from classes.dex
{
    public final ec1 v;

    public void bc1(ec1 p0,au0 p1){
       this.v = p0;
       super(p1);
    }
    public final Object b(Object p0,Object p1){
       return this.c(p0, p1).f(jc7.a);
    }
    public final au0 c(Object p0,au0 p1){
       return new bc1(this.v, p1);
    }
    public final Object f(Object p0){
       int i1;
       eb3.G(p0);
       p0 = this.v;
       _monitor_enter(p0);
       if (p0.C != null && p0.D == null) {
          int i = 1;
          try{
             p0.l0();
          }catch(java.io.IOException e0){
             p0.E = e0;
          }
          try{
             if (p0.z >= 2000) {
                i1 = 1;
             label_001f :
                if (i1) {
                   p0.n0();
                }
             }else {
                i1 = 0;
                goto label_001f ;
             }
          }catch(java.io.IOException e0){
             p0.F = e0;
             p0.A = xe7.d(new i20());
          }
          _monitor_exit(p0);
          return jc7.a;
       }else {
          _monitor_exit(p0);
          return jc7.a;
       }
    }
}
