package p.dd7;
import p.fd7;
import sun.misc.Unsafe;
import java.lang.UnsupportedOperationException;
import java.lang.Object;
import p.gd7;
import java.lang.Double;
import java.lang.Float;

public final class dd7 extends fd7	// class@001329 from classes.dex
{
    public final int b;

    public void dd7(Unsafe p0,int p1){
       this.b = p1;
       super(p0);
    }
    public final void c(long p0,byte[] p1,long p2){
       switch (this.b){
           case 0:
           default:
             throw new UnsupportedOperationException();
       }
       throw new UnsupportedOperationException();
    }
    public final boolean d(long p0,Object p1){
       boolean b = true;
       switch (this.b){
           case 0:
             if (gd7.h) {
                if (!gd7.j(p0, p1)) {
                   b = false;
                }
             }else if(gd7.k(p0, p1)){
             }
             break;
           default:
             if (gd7.h) {
                if (!gd7.j(p0, p1)) {
                label_0027 :
                   b = false;
                }
             }else if(gd7.k(p0, p1)){
             }
             return b;
       }
       return b;
    }
    public final byte e(long p0){
       switch (this.b){
           case 0:
           default:
             throw new UnsupportedOperationException();
       }
       throw new UnsupportedOperationException();
    }
    public final byte f(long p0,Object p1){
       byte b;
       switch (this.b){
           case 0:
             b = (gd7.h)? gd7.j(p0, p1): gd7.k(p0, p1);
             break;
           default:
             b = (gd7.h)? gd7.j(p0, p1): gd7.k(p0, p1);
             return b;
       }
       return b;
    }
    public final double g(long p0,Object p1){
       switch (this.b){
           case 0:
           default:
             return Double.longBitsToDouble(this.j(p0, p1));
       }
       return Double.longBitsToDouble(this.j(p0, p1));
    }
    public final float h(long p0,Object p1){
       switch (this.b){
           case 0:
           default:
             return Float.intBitsToFloat(this.i(p0, p1));
       }
       return Float.intBitsToFloat(this.i(p0, p1));
    }
    public final void m(Object p0,long p1,boolean p2){
       switch (this.b){
           case 0:
             if (gd7.h) {
                gd7.t(p0, p1, (byte)p2);
             }else {
                gd7.u(p0, p1, (byte)p2);
             }
             break;
           default:
             if (gd7.h) {
                gd7.t(p0, p1, (byte)p2);
             }else {
                gd7.u(p0, p1, (byte)p2);
             }
             return;
       }
       return;
    }
    public final void n(Object p0,long p1,byte p2){
       switch (this.b){
           case 0:
             if (gd7.h) {
                gd7.t(p0, p1, p2);
             }else {
                gd7.u(p0, p1, p2);
             }
             break;
           default:
             if (gd7.h) {
                gd7.t(p0, p1, p2);
             }else {
                gd7.u(p0, p1, p2);
             }
             return;
       }
       return;
    }
    public final void o(Object p0,long p1,double p2){
       switch (this.b){
           case 0:
           default:
             this.r(p0, p1, Double.doubleToLongBits(p2));
             return;
       }
       this.r(p0, p1, Double.doubleToLongBits(p2));
       return;
    }
    public final void p(Object p0,long p1,float p2){
       switch (this.b){
           case 0:
           default:
             this.q(Float.floatToIntBits(p2), p1, p0);
             return;
       }
       this.q(Float.floatToIntBits(p2), p1, p0);
       return;
    }
    public final boolean u(){
       return false;
    }
}
