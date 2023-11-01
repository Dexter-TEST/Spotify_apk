package p.z41;
import p.sc;
import p.p31;
import com.spotify.signup.signup.SignupActivity;
import java.lang.Object;
import p.ta3;
import p.wd0;
import p.tm5;
import p.jm6;
import p.u87;
import p.nd1;
import p.nc1;
import p.a21;
import p.s01;
import p.vp;
import p.zg0;
import p.tf6;

public final class z41 implements sc	// class@002e83 from classes.dex
{
    public final p31 a;
    public wd0 b;
    public ta3 c;
    public wd0 t;
    public tm5 v;

    public void z41(p31 p0,SignupActivity p1){
       super();
       this.a = p0;
       this.b = wd0.a(p0.e1);
       ta3 ota3 = ta3.a(p1);
       this.c = ota3;
       this.t = wd0.b(ota3);
       this.v = nd1.b(u87.b(p0.e1, this.b, this.c, this.t, jm6.a(p0.k2)));
    }
    public final void a(Object p0){
       z41 ta = this.a;
       p0.Q = ta.e();
       p0.W = this.v.get();
       p0.X = p31.c(ta);
       p0.Y = ta.A1.get();
       p0.Z = p31.d(ta);
    }
}
