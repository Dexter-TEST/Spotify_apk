package p.vs7;
import p.ng2;
import p.gi3;
import p.hs5;
import p.js5;
import p.hp5;
import java.lang.Object;
import java.lang.Number;
import p.g70;
import java.io.IOException;
import java.lang.String;
import p.jc7;

public final class vs7 extends gi3 implements ng2	// class@00038f from classes2.dex
{
    public final hs5 a;
    public final long b;
    public final js5 c;
    public final g70 t;
    public final js5 v;
    public final js5 w;

    public void vs7(hs5 p0,long p1,js5 p2,hp5 p3,js5 p4,js5 p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       super(2);
    }
    public final Object b(Object p0,Object p1){
       long l = p1.longValue();
       boolean b = true;
       if (p0.intValue() == b) {
          p0 = this.a;
          if (p0.a == null) {
             p0.a = b;
             if ((l - this.b) >= 0) {
                p0 = this.c;
                js5 a = p0.a;
                b = this.t;
                if (!(a - 0xffffffff)) {
                   a = b.N();
                }
                p0.a = a;
                p0 = this.v;
                long l1 = 0;
                l = (!(p0.a - 0xffffffff))? b.N(): l1;
                p0.a = l;
                p0 = this.w;
                if (!(p0.a - 0xffffffff)) {
                   l1 = b.N();
                }
                p0.a = l1;
             }else {
                throw new IOException("bad zip: zip64 extra too short");
             }
          }else {
             throw new IOException("bad zip: zip64 extra repeated");
          }
       }
       return jc7.a;
    }
}
