package p.ih6;
import p.yf2;
import p.mp;
import java.lang.Object;
import p.zf6;
import p.c;
import p.vp;
import java.lang.String;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Observable;
import p.ns4;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.jh6;
import p.yf6;

public final class ih6 implements yf2	// class@001996 from classes.dex
{
    public final int a;
    public final mp b;

    public void ih6(mp p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       int i = 0;
       ih6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return tb.e(p0.A, p0.B).toObservable().compose(new ns4(i)).map(new jh6(1)).onErrorReturn(new jh6(6));
       }
       p0 = p0.A;
       return tb.d(p0.a, p0.b).toObservable().compose(new ns4(i)).map(new jh6(4)).onErrorReturn(new jh6(6));
    }
}
