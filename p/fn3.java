package p.fn3;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.f91;
import p.u36;
import p.w51;
import p.mp;
import p.wn3;
import p.e43;
import p.ew0;
import p.h13;
import p.u67;
import p.we6;
import p.p12;
import p.i12;
import p.e60;
import p.km3;
import io.reactivex.rxjava3.core.Scheduler;
import p.ap3;
import p.ef6;
import p.gn3;
import p.hn3;
import p.en3;
import p.ti4;
import p.mt6;
import p.vg0;
import p.al5;
import p.rf5;
import p.s01;
import p.yc6;

public final class fn3 implements a02	// class@0015fe from classes.dex
{
    public final int a;
    public final tm5 b;
    public final tm5 c;
    public final tm5 d;
    public final tm5 e;
    public final tm5 f;
    public final tm5 g;
    public final tm5 h;
    public final tm5 i;

    public void fn3(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4,tm5 p5,tm5 p6,tm5 p7,int p8){
       this.a = p8;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       super();
    }
    public static fn3 a(f91 p0,f91 p1,tm5 p2,tm5 p3,tm5 p4,u36 p5,tm5 p6){
       fn3 v10 = new fn3(p0, p1, p2, p3, p4, p5, w51.w, p6, 1);
       return v10;
    }
    public final Object get(){
       en3 v1;
       fn3 uofn3 = this;
       fn3 i = uofn3.i;
       fn3 h = uofn3.h;
       fn3 g = uofn3.g;
       fn3 f = uofn3.f;
       fn3 e = uofn3.e;
       fn3 d = uofn3.d;
       fn3 c = uofn3.c;
       fn3 b = uofn3.b;
       switch (uofn3.a){
           case 0:
             v1 = new en3(b.get(), c.get(), d.get(), e.get(), f.get(), g.get(), h.get(), i.get());
             return v1;
           case 1:
             p12 i1 = new p12(b.get(), c.get(), d.get(), e.get(), f.get(), g.get(), h.get(), i.get());
             return i;
           default:
             yc6 v11 = new yc6(b.get(), c.get(), d.get(), e.get(), f.get(), g.get(), h.get(), i.get());
             return v1;
       }
    }
}
