package p.w41;
import p.sc;
import p.p31;
import com.spotify.litesettings.settings.SettingsActivity;
import java.lang.Object;
import p.ta3;
import p.wd0;
import p.tm5;
import p.jm6;
import p.u87;
import p.nd1;
import p.fn3;
import com.spotify.liteui.login.LoginActivity;
import p.g54;
import p.s01;
import p.ac;
import p.an1;
import p.gj3;
import com.spotify.litecomponents.snackalog.a;
import p.pm6;
import p.w12;

public final class w41 implements sc	// class@002ac1 from classes.dex
{
    public final int a;
    public final p31 b;
    public wd0 c;
    public a02 t;
    public a02 v;
    public a02 w;
    public tm5 x;

    public void w41(p31 p0,SettingsActivity p1){
       fn3 p0;
       this.a = 1;
       super();
       this.b = p0;
       this.c = wd0.a(p0.e1);
       ta3 ota3 = ta3.a(p1);
       this.t = ota3;
       this.v = wd0.b(ota3);
       jm6 ojm6 = jm6.a(p0.k2);
       this.w = ojm6;
       p0 = new fn3(p0.h1, p0.h2, p0.i1, p0.j1, p0.M2, p0.k3, p0.q3, nd1.b(u87.b(p0.e1, this.c, this.t, this.v, ojm6)), 2);
       this.x = p0;
    }
    public void w41(p31 p0,SettingsActivity p1,int p2){
       this.a = 1;
       super(p0, p1);
    }
    public void w41(p31 p0,LoginActivity p1){
       this.a = 0;
       super();
       this.b = p0;
       this.c = new wd0(p0.M1, 12);
       this.t = wd0.a(p0.e1);
       ta3 ota3 = ta3.a(p1);
       this.v = ota3;
       this.w = wd0.b(ota3);
       this.x = nd1.b(u87.b(p0.e1, this.t, this.v, this.w, jm6.a(p0.k2)));
    }
    public void w41(p31 p0,LoginActivity p1,int p2){
       this.a = 0;
       super(p0, p1);
    }
    public final void a(Object p0){
       switch (this.a){
           case 0:
           default:
             w41 tb = this.b;
             p0.S = new an1(tb.k2.get());
             p0.T = tb.a4.get();
             p0.U = new g54(this.x);
             p0.V = tb.e4.get();
             p0.W = tb.J3.get();
             p0.X = tb.h3.get();
             return;
       }
       p0.Q = new g54(this.c);
       p0.R = this.x.get();
       return;
    }
}
