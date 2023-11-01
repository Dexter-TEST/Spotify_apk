package p.wp3;
import p.we6;
import p.p80;
import p.n80;
import java.lang.Integer;
import java.lang.String;
import p.rn6;
import p.tn6;
import java.lang.Object;
import p.ko1;
import io.reactivex.rxjava3.core.Observable;
import p.fx6;
import p.yf2;

public final class wp3 implements we6	// class@002b7f from classes.dex
{
    public final tn6 a;
    public final ko1 b;
    public final ko1 c;
    public final ko1 d;
    public final ko1 e;
    public final ko1 f;
    public final ko1 g;
    public final ko1 h;
    public final ko1 i;
    public final ko1 j;
    public final ko1 k;
    public final ko1 l;
    public final ko1 m;
    public final ko1 n;
    public final ko1 o;
    public static final rn6 A;
    public static final rn6 B;
    public static final rn6 C;
    public static final rn6 D;
    public static final rn6 E;
    public static final rn6 F;
    public static final rn6 G;
    public static final rn6 H;
    public static final long p;
    public static final Integer q;
    public static final Integer r;
    public static final rn6 s;
    public static final rn6 t;
    public static final rn6 u;
    public static final rn6 v;
    public static final rn6 w;
    public static final rn6 x;
    public static final rn6 y;
    public static final rn6 z;

    static {
       wp3.p = p80.c.c(750);
       Integer integer = Integer.valueOf(R.id.sort_alphabetical);
       wp3.q = integer;
       wp3.r = integer;
       wp3.s = rn6.a("SAVED_AUDIO_QUALITY");
       wp3.t = rn6.a("CELLULAR_USAGE_LIMIT");
       wp3.u = rn6.a("DOWNLOAD_OVER_CELLULAR");
       wp3.v = rn6.a("PRIVATE_MODE");
       wp3.w = rn6.a("USE_LOW_QUALITY_ON_CELLULAR");
       wp3.x = rn6.a("view_cache_size");
       wp3.y = rn6.a("image_cache_size");
       wp3.z = rn6.a("FORCED_OFFLINE");
       wp3.A = rn6.a("FORCED_OFFLINE_ON_MOBILE");
       wp3.B = rn6.a("USER_WAS_SIGNUP");
       wp3.C = rn6.a("CROSSFADE_TIME_MILLIS");
       wp3.D = rn6.a("GAPLESS_PLAYBACK");
       wp3.E = rn6.a("AUTOMIX");
       wp3.F = rn6.a("NORMALIZE_VOLUME");
       wp3.G = rn6.a("SORT_OPTION_PLAYLISTS");
       wp3.H = rn6.a("SORT_OPTION_ALBUMS");
    }
    public void wp3(tn6 p0){
       super();
       this.b = ko1.m(wp3.s, 0);
       this.c = ko1.n(wp3.t, wp3.p);
       this.d = ko1.l(wp3.u);
       this.e = ko1.l(wp3.v);
       this.f = ko1.l(wp3.w);
       this.g = ko1.l(wp3.z);
       this.h = ko1.l(wp3.A);
       this.i = ko1.l(wp3.B);
       this.j = ko1.m(wp3.C, 0);
       this.k = ko1.l(wp3.D);
       this.l = ko1.l(wp3.E);
       this.m = ko1.l(wp3.F);
       this.n = ko1.m(wp3.G, wp3.q.intValue());
       this.o = ko1.m(wp3.H, wp3.r.intValue());
       this.a = p0;
    }
    public final Observable a(){
       return this.b.r(this.a).map(new fx6(24));
    }
}
