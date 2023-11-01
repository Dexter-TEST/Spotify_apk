package p.rr2;
import p.i07;
import java.lang.String;
import p.tr2;
import java.io.IOException;
import p.as2;

public final class rr2 extends i07	// class@000324 from classes2.dex
{
    public final tr2 e;
    public final long f;

    public void rr2(String p0,tr2 p1,long p2){
       this.e = p1;
       this.f = p2;
       super(p0, true);
    }
    public final long a(){
       int i;
       long l;
       rr2 te = this.e;
       _monitor_enter(te);
       rr2 te1 = this.e;
       tr2 d = te1.D;
       if ((te1.E - d) < 0) {
          i = 1;
       }else {
          te1.D = d + 1;
          i = 0;
       }
       _monitor_exit(te);
       if (i) {
          te1.f(null);
          l = -1;
       }else {
          try{
             te1.P.T(1, false, false);
          }catch(java.io.IOException e0){
             te1.f(e0);
          }
          l = this.f;
       }
       return l;
    }
}
