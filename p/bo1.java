package p.bo1;
import p.vi7;
import p.rf5;
import p.wn3;
import p.e43;
import p.wm1;
import p.un1;
import p.h13;
import p.k33;
import p.ew0;
import p.w94;
import p.lq3;
import p.ah5;
import p.bh5;
import p.aq6;
import io.reactivex.rxjava3.core.Completable;
import java.lang.IllegalStateException;
import java.lang.Exception;
import p.ok0;
import java.util.List;
import p.u94;
import p.ab0;
import p.bi5;
import p.jk0;
import p.cw0;

public final class bo1 extends vi7	// class@001101 from classes.dex
{
    public final e43 A;
    public final ew0 B;
    public final w94 C;
    public final lq3 D;
    public final ah5 E;
    public final bh5 F;
    public u94 G;
    public final rf5 t;
    public final wn3 v;
    public final wm1 w;
    public final h13 x;
    public final k33 y;
    public final un1 z;

    public void bo1(rf5 p0,wn3 p1,e43 p2,wm1 p3,un1 p4,h13 p5,k33 p6,ew0 p7,w94 p8,lq3 p9,ah5 p10,bh5 p11){
       super();
       this.t = p0;
       this.v = p1;
       this.B = p7;
       this.w = p3;
       this.x = p5;
       this.y = p6;
       this.z = p4;
       this.A = p2;
       this.C = p8;
       this.D = p9;
       this.E = p10;
       this.F = p11;
    }
    public final Completable e(aq6 p0,boolean p1){
       bo1 tG;
       ok0 ook0;
       bo1 tB = this.B;
       if (p1) {
          ook0 = ((tG = this.G) == null)? Completable.h(new IllegalStateException()): tB.a(p0, tG.e(p0)).n(new ab0(20));
       }else {
          ook0 = tB.a.y(p0);
       }
       return ook0;
    }
}
