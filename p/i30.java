package p.i30;
import p.yt0;
import p.is6;
import java.lang.Boolean;
import java.lang.Class;
import java.net.InetAddress;
import p.tf3;
import p.he3;
import java.lang.Object;
import p.gb6;
import p.m00;
import p.mg3;
import p.js6;
import p.rf3;
import p.qf3;
import p.s57;
import p.vf3;
import java.lang.String;
import p.ka7;
import p.qg3;
import p.ds7;

public final class i30 extends is6 implements yt0	// class@001914 from classes.dex
{
    public final int t;
    public final boolean v;

    public void i30(int p0,boolean p1){
       this.t = p0;
       Boolean uBoolean = Boolean.class;
       if (p0 != 1) {
          if (p0 != 2) {
             if (p1) {
                uBoolean = Boolean.TYPE;
             }
             super(uBoolean);
             this.v = p1;
             return;
          }else {
             super(0, InetAddress.class);
             this.v = p1;
             return;
          }
       }else if(p1){
          uBoolean = Boolean.TYPE;
       }
       super(uBoolean);
       this.v = p1;
       return;
    }
    public final void acceptJsonFormatVisitor(tf3 p0,he3 p1){
       switch (this.t){
           case 0:
             p0.getClass();
             return;
           case 1:
             p0.getClass();
             return;
           default:
             super.acceptJsonFormatVisitor(p0, p1);
             return;
       }
    }
    public final mg3 b(gb6 p0,m00 p1){
       rf3 orf3;
       i30 oi30;
       s57 os57;
       mg3 omg3;
       int i = 0;
       js6 ta = this.a;
       i30 tv = this.v;
       switch (this.t){
           case 0:
             oi30 = ((orf3 = js6.c(p1, p0, Boolean.class)) != null && !orf3.b.a())? new i30(1, tv): this;
             break;
           case 1:
             if ((orf3 = js6.c(p1, p0, ta)) != null) {
                orf3 = orf3.b;
                if (orf3.a()) {
                   oi30 = new i30(i, tv);
                }else if(orf3 == qf3.w){
                   os57 = new s57(ta);
                }else {
                label_002a :
                   os57 = this;
                }
             }else {
                goto label_002a ;
             }
             return oi30;
             break;
           default:
             if ((orf3 = js6.c(p1, p0, ta)) != null) {
                orf3 = orf3.b;
                if (orf3.a() || orf3 == qf3.b) {
                   i = 1;
                }
             }
             oi30 = (i != tv)? new i30(2, i): this;
             return oi30;
       }
       return oi30;
    }
    public final void e(InetAddress p0,vf3 p1){
       String hostAddress;
       int i;
       if (this.v != null) {
          hostAddress = p0.getHostAddress();
       }else {
          hostAddress = p0.toString().trim();
          if ((i = hostAddress.indexOf(47)) >= 0) {
             hostAddress = (!i)? hostAddress.substring(1): hostAddress.substring(0, i);
          }
       }
       p1.x0(hostAddress);
       return;
    }
    public final void serialize(Object p0,vf3 p1,gb6 p2){
       switch (this.t){
           case 0:
             p1.n0((Boolean.FALSE.equals(p0) ^ 0x01));
             return;
           case 1:
             p1.T(Boolean.TRUE.equals(p0));
             return;
           default:
             this.e(p0, p1);
             return;
       }
    }
    public final void serializeWithType(Object p0,vf3 p1,gb6 p2,ka7 p3){
       switch (this.t){
           case 0:
             p1.T(Boolean.TRUE.equals(p0));
             return;
           case 1:
             p1.T(Boolean.TRUE.equals(p0));
             return;
           default:
             ds7 uods7 = p3.b(qg3.D, p0);
             uods7.e = InetAddress.class;
             this.e(p0, p1);
             p3.d(p1, p3.c(p1, uods7));
             return;
       }
    }
}
