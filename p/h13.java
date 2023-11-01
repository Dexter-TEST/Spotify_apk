package p.h13;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.rf5;
import java.lang.Object;
import p.ju2;
import java.lang.String;
import p.au2;
import p.zt2;
import p.ty0;
import p.a23;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.p54;
import p.pp;
import p.yf2;
import p.bm;
import p.w00;

public final class h13 implements ObservableTransformer	// class@0017be from classes.dex
{
    public final rf5 a;

    public void h13(rf5 p0){
       super();
       this.a = p0;
    }
    public static boolean a(ju2 p0,String p1,String p2){
       boolean b = (p2 != null && (p2.equals(p0.b().u("highlight:uid")) || p1.equals(p0.b().u("highlight:contextUri"))))? true: false;
       return b;
    }
    public static au2 b(String p0){
       return ty0.b().r("highlight:contextUri", p0).d();
    }
    public static au2 c(String p0){
       return ty0.b().r("highlight:uid", p0).d();
    }
    public final ObservableSource apply(Observable p0){
       return Observable.combineLatest(p0, this.a.i.hide().map(new pp(16)).distinctUntilChanged(), new bm(4));
    }
}
