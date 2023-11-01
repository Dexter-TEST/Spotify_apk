package p.yn3;
import p.yf2;
import p.h12;
import java.lang.Object;
import java.util.List;
import p.vn3;
import java.lang.Class;
import p.sn3;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.rk0;
import com.spotify.socialgraph.proto.SocialgraphV2$SocialGraphReply;
import p.tk0;
import p.bc3;
import java.lang.Iterable;
import p.ab2;
import p.rm;
import p.ci5;
import p.rp;
import p.jg2;
import com.google.common.collect.d;
import p.g16;
import java.util.ArrayList;

public final class yn3 implements yf2	// class@002df0 from classes.dex
{
    public final int a;
    public final h12 b;

    public void yn3(h12 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       int i = 0;
       yn3 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             p0 = (!p0.f())? tk0.a: Completable.i(new g16(tb, 9, ab2.b(p0.g()).a(new rm(i)).m(new rp(21)).k()));
             return p0;
             break;
           case 1:
             tb.getClass();
             return Completable.i(new sn3(tb, p0, 4));
           case 2:
             tb.getClass();
             return Completable.i(new sn3(tb, p0, 3)).p(s36.c);
           case 3:
             tb.getClass();
             return Completable.i(new sn3(tb, p0, 1)).p(s36.c);
           case 4:
             tb.getClass();
             return Completable.i(new sn3(tb, p0, i)).p(s36.c);
           case 5:
             tb.getClass();
             return Completable.i(new sn3(tb, p0, 2)).p(s36.c);
           default:
             tb.getClass();
             return Completable.i(new sn3(tb, p0, 5));
       }
    }
}
