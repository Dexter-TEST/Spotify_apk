package p.y41;
import p.sc;
import p.p31;
import p.cj5;
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
import p.d86;
import p.yl7;
import p.u76;
import p.ko3;
import p.g54;
import p.zg0;
import p.wd5;
import p.qf0;

public final class y41 implements sc	// class@002d45 from classes.dex
{
    public final int a;
    public final p31 b;
    public tm5 c;
    public oq2 t;
    public v36 v;
    public v36 w;
    public v36 x;
    public tm5 y;
    public a02 z;

    public void y41(p31 p0,cj5 p1){
       this.a = 0;
       super();
       this.b = p0;
       this.c = nd1.b(u36.b(ta3.a(p1)));
       oq2 ooq2 = oq2.a(p0.Q3, u36.c(p0.e1));
       this.t = ooq2;
       this.v = v36.a(p0.e1, p0.w2, ooq2, this.c);
       this.w = v36.e(p0.e1, p0.w2, this.t, this.c);
       this.x = v36.d(p0.e1, p0.w2, this.t, this.c);
       e14 uoe14 = new e14();
       uoe14.k("lite:cardSmall", this.v);
       uoe14.k("lite:cardMedium", this.w);
       uoe14.k("lite:cardLarge", this.x);
       this.y = nd1.b(lo3.a(p0.w2, p0.k2, p0.A1, p0.P3, this.c, uoe14.j()));
       this.z = new oq2(p0.R3, p0.u4, 7);
    }
    public void y41(p31 p0,cj5 p1,int p2){
       this.a = 0;
       super(p0, p1);
    }
    public void y41(p31 p0,d86 p1){
       this.a = 2;
       super();
       this.b = p0;
       this.c = nd1.b(u36.b(ta3.a(p1)));
       oq2 ooq2 = oq2.a(p0.Q3, u36.c(p0.e1));
       this.t = ooq2;
       this.v = v36.a(p0.e1, p0.w2, ooq2, this.c);
       this.w = v36.e(p0.e1, p0.w2, this.t, this.c);
       this.x = v36.d(p0.e1, p0.w2, this.t, this.c);
       e14 uoe14 = new e14();
       uoe14.k("lite:cardSmall", this.v);
       uoe14.k("lite:cardMedium", this.w);
       uoe14.k("lite:cardLarge", this.x);
       this.y = nd1.b(lo3.a(p0.w2, p0.k2, p0.A1, p0.P3, this.c, uoe14.j()));
       this.z = new yl7(p0.x4, p0.t3, p0.u4, 9);
    }
    public void y41(p31 p0,d86 p1,int p2){
       this.a = 2;
       super(p0, p1);
    }
    public void y41(p31 p0,u76 p1){
       this.a = 1;
       super();
       this.b = p0;
       this.c = nd1.b(u36.b(ta3.a(p1)));
       oq2 ooq2 = oq2.a(p0.Q3, u36.c(p0.e1));
       this.t = ooq2;
       this.v = v36.a(p0.e1, p0.w2, ooq2, this.c);
       this.w = v36.e(p0.e1, p0.w2, this.t, this.c);
       this.x = v36.d(p0.e1, p0.w2, this.t, this.c);
       e14 uoe14 = new e14();
       uoe14.k("lite:cardSmall", this.v);
       uoe14.k("lite:cardMedium", this.w);
       uoe14.k("lite:cardLarge", this.x);
       this.y = nd1.b(lo3.a(p0.w2, p0.k2, p0.A1, p0.P3, this.c, uoe14.j()));
       this.z = new yl7(p0.e1, p0.w4, p0.t3, 10);
    }
    public void y41(p31 p0,u76 p1,int p2){
       this.a = 1;
       super(p0, p1);
    }
    public final void a(Object p0){
       y41 tb = this.b;
       switch (this.a){
           case 0:
             p0.a = this.y.get();
             p0.b = new g54(this.z);
             p0.c = tb.w2.get();
             p0.t = new qf0();
             return;
           case 1:
             p0.a = this.y.get();
             p0.b = new g54(this.z);
             p0.c = tb.A1.get();
             return;
           default:
             p0.a = this.y.get();
             p0.b = new g54(this.z);
             p0.c = tb.A1.get();
             return;
       }
    }
}
