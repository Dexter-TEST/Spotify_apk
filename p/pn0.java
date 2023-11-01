package p.pn0;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import p.qn0;
import p.rn0;

public final class pn0	// class@002292 from classes.dex
{
    public final int a;
    public final qn0[] b;
    public long c;

    public void pn0(int p0,ThreadFactory p1){
       super();
       this.a = p0;
       qn0[] oqn0Array = new qn0[p0];
       this.b = oqn0Array;
       for (int i = 0; i < p0; i = i + 1) {
          this.b[i] = new qn0(p1);
       }
       return;
    }
    public final qn0 a(){
       pn0 ta;
       if ((ta = this.a) == null) {
          return rn0.g;
       }
       pn0 tc = this.c;
       this.c = 1 + tc;
       return this.b[(int)(tc % (long)ta)];
    }
}
