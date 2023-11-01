package p.kr2;
import p.i07;
import java.lang.String;
import p.tr2;
import java.lang.Object;
import p.ks5;
import p.qc6;
import p.jr2;
import p.zr2;
import p.re5;
import p.co5;
import java.lang.Class;
import java.lang.Throwable;
import p.mo1;
import java.io.IOException;

public final class kr2 extends i07	// class@000288 from classes2.dex
{
    public final int e;
    public final tr2 f;
    public final Object g;

    public void kr2(String p0,tr2 p1,Object p2,int p3){
       this.e = p3;
       this.f = p1;
       this.g = p2;
       super(p0, true);
    }
    public final long a(){
       switch (this.e){
           case 0:
           default:
             try{
                this.f.b.b(this.g);
             }catch(java.io.IOException e0){
                String str = co5.K(this.f.t, "Http2Connection.Listener failure for ");
                re5.a.getClass();
                int i = 4;
                re5.i(i, str, e0);
                this.g.c(mo1.c, e0);
             }catch(java.io.IOException e0){
             }
       }
       kr2 tf = this.f;
       tf.b.a(tf, this.g.a);
       return -1;
    }
}
