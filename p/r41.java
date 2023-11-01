package p.r41;
import p.sc;
import p.p31;
import java.lang.Object;
import p.et0;
import com.spotify.lite.appmain.MainActivity;
import p.ta3;
import p.tm5;
import p.wd0;
import p.u87;
import p.nd1;
import p.jm6;
import p.v36;
import p.yl7;
import p.eo3;
import p.ie2;
import p.pm6;
import com.spotify.litecomponents.snackalog.a;
import p.ac;
import p.ge2;
import p.al5;
import p.jn3;
import p.xm3;
import p.j83;
import p.xq7;
import com.spotify.messaging.quicksilverliteintegration.DisplayOrchestrator;
import p.p97;
import p.fp6;
import p.fp3;
import p.rp3;
import p.b01;
import p.g54;
import p.iu5;

public final class r41 implements sc	// class@002471 from classes.dex
{
    public final int a;
    public final p31 b;
    public tm5 c;

    public void r41(p31 p0){
       this.a = 0;
       super(p0, null);
    }
    public void r41(p31 p0,int p1){
       this.a = 2;
       super(p0, null);
    }
    public void r41(p31 p0,MainActivity p1){
       this.a = 1;
       super();
       this.b = p0;
       this.c = nd1.b(u87.a(p0.h4, p0.x3, ta3.a(p1), p0.i4, p0.h3));
    }
    public void r41(p31 p0,MainActivity p1,int p2){
       this.a = 1;
       super(p0, p1);
    }
    public void r41(p31 p0,Object p1){
       v36 p0;
       this.a = 0;
       super();
       this.b = p0;
       p0 = new v36(p0.s3, p0.N3, p0.M1, jm6.b(p0.j1), 18);
       this.c = p0;
    }
    public void r41(p31 p0,et0 p1){
       this.a = 2;
       super();
       this.b = p0;
       this.c = new yl7(p0.t2, p0.s3, jm6.c(p0.F1), 7);
    }
    public final void a(Object p0){
       r41 tb = this.b;
       switch (this.a){
           case 0:
             p0.a = new g54(this.c);
             p0.b = tb.J3.get();
             return;
           case 1:
             p0.R = tb.c4.get();
             p0.S = tb.d4.get();
             p0.T = tb.J3.get();
             p0.U = tb.e4.get();
             p0.V = new ge2(0, tb.k2.get());
             p0.W = tb.k2.get();
             p0.X = tb.k3.get();
             p0.Y = tb.f4.get();
             p0.Z = tb.g4.get();
             p0.a0 = this.c.get();
             p0.b0 = new xq7(tb.x3.get(), 12, tb.j4.get());
             p0.c0 = p31.b(tb);
             p0.d0 = tb.i2.get();
             p0.e0 = tb.g3.get();
             return;
           default:
             p0.b = new g54(this.c);
             p0.c = tb.J3.get();
             return;
       }
    }
}
