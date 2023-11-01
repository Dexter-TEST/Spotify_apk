package p.t41;
import p.sc;
import p.p31;
import p.qn1;
import java.lang.Object;
import p.ta3;
import p.u36;
import p.tm5;
import p.nd1;
import p.oq2;
import p.f91;
import p.v36;
import p.f14;
import p.e14;
import java.lang.String;
import p.lo3;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule_ProvideInternetMonitorFactory;
import p.z84;
import p.wd0;
import p.jm6;
import p.co1;
import p.u87;
import p.ko3;
import p.g54;
import p.gj3;
import p.pm6;
import p.w12;
import p.ac;
import p.an1;
import p.m12;
import p.ke6;
import p.ge6;
import p.fv1;
import p.fe6;
import p.pe6;
import p.vn1;

public final class t41 implements sc	// class@0026f7 from classes.dex
{
    public wd0 A;
    public u36 B;
    public co1 C;
    public final p31 a;
    public tm5 b;
    public oq2 c;
    public v36 t;
    public v36 v;
    public v36 w;
    public tm5 x;
    public z84 y;
    public oq2 z;

    public void t41(p31 p0,qn1 p1){
       co1 p0;
       super();
       this.a = p0;
       this.b = nd1.b(u36.b(ta3.a(p1)));
       oq2 ooq2 = oq2.a(p0.Q3, u36.c(p0.e1));
       this.c = ooq2;
       this.t = v36.a(p0.e1, p0.w2, ooq2, this.b);
       this.v = v36.e(p0.e1, p0.w2, this.c, this.b);
       this.w = v36.d(p0.e1, p0.w2, this.c, this.b);
       e14 uoe14 = new e14();
       uoe14.k("lite:cardSmall", this.t);
       uoe14.k("lite:cardMedium", this.v);
       uoe14.k("lite:cardLarge", this.w);
       this.x = nd1.b(lo3.a(p0.w2, p0.k2, p0.A1, p0.P3, this.b, uoe14.j()));
       this.y = z84.a(p0.e1, p0.t1);
       p31 q3 = p0.q3;
       this.z = new oq2(p0.e1, q3, 21);
       this.A = new wd0(p0.r3, 3);
       this.B = u36.a(q3);
       p0 = new co1(p0.q3, p0.C2, this.y, this.z, this.A, this.B, p0.S3, p0.r3, p0.Z3, p0.R3, p0.N3, jm6.b(p0.j1));
       this.C = p0;
    }
    public final void a(Object p0){
       p0.a = this.x.get();
       p0.b = new g54(this.C);
       t41 ta = this.a;
       p0.c = ta.a4.get();
       p0.t = ta.J3.get();
       p0.v = ta.h3.get();
       p0.w = new an1(ta.k2.get());
       p0.x = ta.s3.get();
       p0.y = new pe6(new ke6(new ge6(0), new fv1()), ta.i());
       p0.z = vn1.i;
    }
}
