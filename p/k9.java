package p.k9;
import p.ir0;
import p.v9;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;
import p.qb;
import p.ld;
import java.lang.String;
import p.md;
import java.util.Map;
import p.b9;
import p.de5;
import java.lang.Class;
import p.co5;
import p.eb4;
import p.bb7;
import p.jx;
import java.lang.Integer;
import p.nq5;
import p.j8;
import p.ob7;
import p.kb7;
import p.fb7;
import p.ib7;
import java.util.HashMap;
import p.gb7;
import p.pb7;
import p.nb3;
import p.ds3;
import p.vk;
import p.iq6;
import p.or7;
import p.oy6;
import p.wc4;
import p.xc4;
import p.v8;
import com.spotify.allboarding.entrypointlite.AllboardingFollowManagerImpl;
import p.nr0;
import p.xi0;
import io.reactivex.rxjava3.core.Completable;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.rk0;
import p.m72;
import java.util.concurrent.TimeUnit;
import p.ml0;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Objects;
import p.r82;
import p.yf2;
import p.ok0;
import io.reactivex.rxjava3.core.CompletableSource;
import p.lb;
import p.mb;
import p.b5;
import p.fn0;
import java.util.Set;
import p.a44;
import p.wi0;
import io.reactivex.rxjava3.core.Single;
import p.a9;
import p.jb7;
import p.lb7;
import java.util.ArrayList;
import p.z8;
import p.kf6;
import p.si4;

public final class k9 implements ir0	// class@001bd1 from classes.dex
{
    public final int a;
    public final v9 b;

    public void k9(v9 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void a(Disposable p0){
       v9 f;
       md omd;
       switch (this.a){
           case 0:
           default:
             f = this.b.f;
             omd = f.a.a("allboarding_initial_load");
             omd.h = "android-libs-allboarding";
             omd.g("allboarding_initial_load");
             f.b.put("allboarding_initial_load", omd);
             return;
       }
       f = this.b.f;
       omd = f.a.a("allboarding_post");
       omd.h = "android-libs-allboarding";
       omd.g("allboarding_post");
       f.b.put("allboarding_post", omd);
       return;
    }
    public final void accept(Object p0){
       v9 d;
       eb4 uoeb4;
       bb7 a1;
       String str2;
       v9 d1;
       r82 b2;
       oy6 ooy6;
       boolean b = false;
       String str = "hit";
       String str1 = "step";
       k9 tb = this.b;
       switch (this.a){
           case 0:
             this.a(p0);
             return;
           case 1:
             d = tb.d;
             z8 a = p0.a;
             d.getClass();
             co5.o(a, str1);
             uoeb4 = bb7.a(a);
             a1 = d.a;
             if (p0.b != null) {
                a1.b(new kf6(uoeb4).h());
             }else {
                p0 = new si4(uoeb4);
                ob7 oob7 = new ob7();
                oob7.c(p0.a);
                oob7.b = p0.b.a;
                p0 = new HashMap();
                str1 = "";
                if ((str2 = str1.toString()) != null) {
                   str1 = str2;
                }
                p0.put("destination", str1);
                oob7.d = new ib7(1, "ui_navigate", str, p0);
                a1.b(oob7.a());
             }
             return;
             break;
           case 2:
             d1 = tb.d;
             p0 = p0.a;
             d1.getClass();
             co5.o(p0, str1);
             p0 = bb7.a(p0);
             jb7 ojb7 = p0.b.b();
             lb7 tb1 = new lb7("back_button", null, null, null, null);
             ojb7.i.add(tb);
             ojb7.j = b;
             ob7 oob71 = new ob7();
             oob71.a = ojb7.a();
             oob71.b = p0.a;
             oob71.d = new ib7(1, "ui_hide", str, new HashMap());
             d1.a.b(oob71.a());
             return;
           case 3:
             d1 = tb.b;
             m72 v8 a2 = p0.a;
             d1.getClass();
             co5.o(a2, "content");
             a2.toString();
             p0 = p0.b;
             long l = 200;
             AllboardingFollowManagerImpl a3 = d1.a;
             AllboardingFollowManagerImpl b1 = d1.b;
             if (a2 instanceof vk) {
                a2 = new m72(3, b, l);
                p0 = a3.b(a2.a(), p0).p(s36.c).q((long)30, TimeUnit.SECONDS).r();
                p0.getClass();
                Objects.requireNonNull(a2, "handler is null");
                b2 = new r82(p0, a2, 4);
                b1.c(Completable.u(new ok0(6, b2)).subscribe(lb.c, mb.c));
             }else if(a2 instanceof iq6){
                xi0 oxi0 = a2.a();
                a3.getClass();
                co5.o(oxi0, "showUri");
                p0 = a3.a().flatMapCompletable(new wi0(co5.H(oxi0), p0, a3, 1));
                co5.l(p0, "override fun updateFavor…ld\(\)\)\n            }\n    }");
                a2 = new m72(3, b, l);
                p0 = p0.p(s36.c).q((long)30, TimeUnit.SECONDS).r();
                p0.getClass();
                Objects.requireNonNull(a2, "handler is null");
                b2 = new r82(p0, a2, 4);
                b1.c(Completable.u(new ok0(6, b2)).subscribe(lb.t, mb.t));
             }
             return;
             break;
           case 4:
             d = tb.d;
             b9 a4 = p0.a;
             b9 b3 = p0.b;
             de5 b4 = b3.b;
             d.getClass();
             co5.o(a4, str1);
             uoeb4 = bb7.a(a4);
             de5 c = b3.c;
             p0 = p0.c;
             a1 = d.a;
             de5 t = b3.t;
             if (c instanceof jx) {
                j8 oj8 = new j8(new nq5(uoeb4, Integer.valueOf(b4)), Integer.valueOf(p0), b3.b());
                if (t != null) {
                   p0 = new ob7();
                   p0.c(oj8.t);
                   p0.b = oj8.v.c.a;
                   p0.d = new ib7(1, "remove_interest", str, new HashMap());
                   p0 = p0.a();
                }else {
                   p0 = new ob7();
                   p0.c(oj8.t);
                   p0.b = oj8.v.c.a;
                   p0.d = new ib7(1, "add_interest", str, new HashMap());
                   p0 = p0.a();
                }
                a1.b(p0);
             }else if(c instanceof vk){
                int i = 1;
             }else {
                v7 = c instanceof iq6;
             }
             if (i) {
                ooy6 = new oy6(new or7(uoeb4, Integer.valueOf(b4)), Integer.valueOf(p0), b3.b());
                if (t != null) {
                   p0 = new ob7();
                   p0.c(ooy6.t);
                   p0.b = ooy6.v.c.a;
                   p0.d = new ib7(1, "remove_interest", str, new HashMap());
                   p0 = p0.a();
                }else {
                   p0 = new ob7();
                   p0.c(ooy6.t);
                   p0.b = ooy6.v.c.a;
                   p0.d = new ib7(1, "add_interest", str, new HashMap());
                   p0 = p0.a();
                }
                a1.b(p0);
             }else if(c instanceof wc4){
                ooy6 = 1;
             }else {
                v3 = c instanceof xc4;
             }
             if (ooy6) {
                ooy6 = new oy6(new or7(uoeb4, Integer.valueOf(b4)), Integer.valueOf(p0), b3.b());
                p0 = new ob7();
                p0.c(ooy6.t);
                p0.b = ooy6.v.c.a;
                p0.d = new ib7(1, "ui_reveal", str, new HashMap());
                a1.b(p0.a());
             }
             return;
             break;
           default:
             this.a(p0);
             return;
       }
    }
}
