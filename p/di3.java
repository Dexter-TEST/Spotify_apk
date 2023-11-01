package p.di3;
import p.z04;
import p.ei3;
import p.bi3;
import p.nq5;

public final class di3 extends z04	// class@0001b9 from classes2.dex
{
    public final nq5[] t;
    public final ei3 v;

    public void di3(ei3 p0,int p1,int p2){
       this.v = p0;
       super(p0, p1, p2);
       nq5[] onq5Array = new nq5[(1 << (p1 + p2))];
       this.t = onq5Array;
       int i = 0;
       while (true) {
          di3 tt = this.t;
          if (i < tt.length) {
             tt[i] = new nq5(this);
             i++;
          }else {
             break ;
          }
       }
       return;
    }
}
