package p.co3;
import p.w12;
import java.lang.String;
import p.rn6;
import p.tn6;
import p.rp3;
import java.lang.Object;
import p.ko1;

public final class co3 implements w12	// class@001247 from classes.dex
{
    public final ko1 a;
    public final ko1 b;
    public final ko1 c;
    public final ko1 d;
    public final ko1 e;
    public final ko1 f;
    public final ko1 g;
    public final ko1 h;
    public final tn6 i;
    public final rp3 j;
    public static final rn6 k;
    public static final rn6 l;
    public static final rn6 m;
    public static final rn6 n;
    public static final rn6 o;
    public static final rn6 p;
    public static final rn6 q;
    public static final rn6 r;

    static {
       co3.k = rn6.a("NOW_PLAYING_VIEW_SHOWN");
       co3.l = rn6.a("TASTE_ONBOARDING_DONE");
       co3.m = rn6.a("SHOW_OPT_IN_TRIAL_OFFBOARDING");
       co3.n = rn6.a("IAM_DEV_ENABLED");
       co3.o = rn6.a("IAM_PREVIEW_ENABLED");
       co3.p = rn6.a("GLITTERPONY_CLEANED");
       co3.q = rn6.a("GLITTERPONY_MIGRATED");
       co3.r = rn6.a("GUEST_ACCOUNT_CREATION_TIME");
    }
    public void co3(tn6 p0,rp3 p1){
       super();
       this.a = ko1.l(co3.k);
       this.b = ko1.l(co3.l);
       this.c = ko1.l(co3.m);
       this.d = ko1.l(co3.n);
       this.e = ko1.l(co3.o);
       this.f = ko1.l(co3.q);
       this.g = ko1.n(co3.p, 0);
       this.h = ko1.n(co3.r, 0);
       this.i = p0;
       this.j = p1;
    }
}
