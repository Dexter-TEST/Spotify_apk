package p.k52;
import p.xc2;
import p.nn6;
import p.e70;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Math;
import java.io.IOException;
import java.lang.StringBuilder;

public final class k52 extends xc2	// class@000271 from classes2.dex
{
    public final long b;
    public final boolean c;
    public long t;

    public void k52(nn6 p0,long p1,boolean p2){
       super(p0);
       this.b = p1;
       this.c = p2;
    }
    public final long o(e70 p0,long p1){
       co5.o(p0, "sink");
       k52 tt = this.t;
       k52 tb = this.b;
       if ((tt - tb) > 0) {
          p1 = 0;
       }else if(this.c != null){
          long l = tb - tt;
          if (!(l)) {
             return -1;
          }else {
             p1 = Math.min(p1, l);
          }
       }
       p1 = super.o(p0, p1);
       if (v0 = p1 - -1) {
          this.t = this.t + p1;
       }
       k52 tt1 = this.t;
       if ((v3 = tt1 - tb) < 0 && (!tt || v3 > 0)) {
          if ((p1) > 0 && v3 > 0) {
             e70 uoe70 = new e70();
             uoe70.A(p0);
             p0.I(uoe70, (p0.b - (tt1 - tb)));
             uoe70.f();
          }
          throw new IOException("expected "+tb+" bytes but got "+this.t);
       }else {
          return p1;
       }
    }
}
