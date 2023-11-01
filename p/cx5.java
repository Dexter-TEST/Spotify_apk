package p.cx5;
import java.io.Closeable;
import p.bv5;
import p.sm5;
import java.lang.String;
import p.zn2;
import p.mp2;
import p.fx5;
import p.l67;
import java.lang.Object;
import java.lang.Class;
import p.c90;
import p.fv1;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public final class cx5 implements Closeable	// class@001298 from classes.dex
{
    public final cx5 A;
    public final long B;
    public final long C;
    public final l67 D;
    public c90 E;
    public final bv5 a;
    public final sm5 b;
    public final String c;
    public final int t;
    public final zn2 v;
    public final mp2 w;
    public final fx5 x;
    public final cx5 y;
    public final cx5 z;

    public void cx5(bv5 p0,sm5 p1,String p2,int p3,zn2 p4,mp2 p5,fx5 p6,cx5 p7,cx5 p8,cx5 p9,long p10,long p11,l67 p12){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
       this.y = p7;
       this.z = p8;
       this.A = p9;
       this.B = p10;
       this.C = p11;
       this.D = p12;
    }
    public static String f(cx5 p0,String p1){
       String str;
       p0.getClass();
       if ((str = p0.w.a(p1)) == null) {
          str = null;
       }
       return str;
    }
    public final c90 b(){
       cx5 tE;
       if ((tE = this.E) == null) {
          tE = fv1.z(this.w);
          this.E = tE;
       }
       return tE;
    }
    public final void close(){
       cx5 tx;
       if ((tx = this.x) == null) {
          throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
       }
       tx.close();
       return;
    }
    public final String toString(){
       return "Response{protocol="+this.b+", code="+this.t+", message="+this.c+", url="+this.a.a+'}';
    }
    public final boolean x(){
       boolean b = false;
       cx5 tt = this.t;
       if (200 <= tt && tt < 300) {
          b = true;
       }
       return b;
    }
}
