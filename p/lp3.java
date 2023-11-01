package p.lp3;
import p.vi5;
import p.we6;
import p.dl5;
import java.lang.Object;
import p.si5;
import io.reactivex.rxjava3.core.CompletableSource;
import java.lang.Boolean;
import p.el5;
import java.lang.Class;
import java.lang.String;
import p.co5;
import io.reactivex.rxjava3.core.Completable;
import com.spotify.connectivity.productstateesperanto.ProductStateMethods;
import p.wp3;
import p.tn6;
import p.ok0;
import p.ko1;
import p.jk0;
import io.reactivex.rxjava3.core.Observable;
import p.tp2;
import p.c16;
import p.yf2;
import io.reactivex.rxjava3.core.Single;
import p.ir2;
import io.reactivex.rxjava3.core.Maybe;
import p.up0;

public class lp3	// class@001d99 from classes.dex
{
    private final vi5 a;
    private final we6 b;
    private final dl5 c;

    public void lp3(vi5 p0,we6 p1,dl5 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static CompletableSource a(lp3 p0,si5 p1){
       return p0.f(p1);
    }
    public static CompletableSource b(lp3 p0,si5 p1,Boolean p2){
       return p0.e(p1, p2);
    }
    public static boolean c(Boolean p0){
       return lp3.d(p0);
    }
    private static boolean d(Boolean p0){
       return p0.booleanValue();
    }
    private CompletableSource e(si5 p0,Boolean p1){
       lp3 tc = this.c;
       p0 = p0.a;
       tc.getClass();
       co5.o(p0, "value");
       tc = this.b;
       return tc.a.updateState("created_by_partner", p0).c(tc.i.s(tc.a, Boolean.FALSE));
    }
    private CompletableSource f(si5 p0){
       lp3 tb = this.b;
       return tp2.i(0, tb.i.r(tb.a)).flatMapCompletable(new c16(this, 11, p0));
    }
    public Completable g(){
       lp3 ta = this.a;
       co5.o(ta, "<this>");
       Maybe maybe = ta.a().flatMapMaybe(ir2.Y);
       co5.l(maybe, "preloadData.flatMapMaybe….just\(it\)\n        }\n    }");
       return maybe.b(new up0(1, this));
    }
}
