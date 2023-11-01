package p.by3;
import p.yx3;
import p.hh3;
import p.qe4;
import java.lang.Class;
import java.lang.String;
import p.ns5;
import java.lang.Object;
import io.reactivex.rxjava3.core.Scheduler;
import p.t00;
import p.il0;
import p.zx3;
import p.u44;
import java.util.HashMap;
import java.lang.Integer;
import p.xz1;

public final class by3 implements yx3	// class@00115c from classes.dex
{
    public final Scheduler a;
    public final t00 b;
    public final t00 c;
    public il0 d;
    public final zx3 e;
    public final u44 f;
    public dx3 g;
    public final HashMap h;
    public final xz1 i;
    public il7 j;
    public static final hh3[] k;

    static {
       hh3[] ohh3Array = new hh3[]{new qe4(by3.class, "wordCount", "getWordCount\(\)I")};
       ns5.a.getClass();
       by3.k = ohh3Array;
    }
    public void by3(Scheduler p0){
       super();
       this.a = p0;
       this.b = t00.a();
       this.c = t00.a();
       this.d = new il0();
       this.e = new zx3(this);
       this.f = new u44(24);
       this.h = new HashMap();
       this.i = new xz1(Integer.valueOf(0));
    }
}
