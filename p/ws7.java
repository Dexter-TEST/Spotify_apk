package p.ws7;
import p.ng2;
import p.gi3;
import p.hp5;
import p.ks5;
import java.lang.Object;
import java.lang.Number;
import p.g70;
import java.lang.Long;
import java.io.IOException;
import java.lang.String;
import p.jc7;

public final class ws7 extends gi3 implements ng2	// class@0003af from classes2.dex
{
    public final g70 a;
    public final ks5 b;
    public final ks5 c;
    public final ks5 t;

    public void ws7(hp5 p0,ks5 p1,ks5 p2,ks5 p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       super(2);
    }
    public final Object b(Object p0,Object p1){
       long l = p1.longValue();
       if (p0.intValue() == 0x5455) {
          p0 = "bad zip: extended timestamp extra too short";
          long l1 = 1;
          if ((l - l1) >= 0) {
             p1 = this.a;
             int i = p1.readByte() & 0x00ff;
             int i1 = 0;
             int i2 = (((i & 0x01)) == 1)? 1: 0;
             int i3 = (((i & 0x02)) == 2)? 1: 0;
             int i4 = 4;
             if (((i & i4)) == i4) {
                i1 = 1;
             }
             if (i2) {
                l1 = 5;
             }
             if (i3) {
                l1 = l1 + 4;
             }
             if (i1) {
                l1 = l1 + 4;
             }
             if ((l - l1) >= 0) {
                if (i2) {
                   this.b.a = Long.valueOf(((long)p1.E() * 1000));
                }
                if (i3) {
                   this.c.a = Long.valueOf(((long)p1.E() * 1000));
                }
                if (i1) {
                   p1.a = Long.valueOf(((long)p1.E() * 1000));
                }
             }else {
                throw new IOException(p0);
             }
          }else {
             throw new IOException(p0);
          }
       }
       return jc7.a;
    }
}
