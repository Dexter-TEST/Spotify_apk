package p.um;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.wm;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Class;
import p.om;
import p.yf2;
import io.reactivex.rxjava3.core.Completable;
import p.rm;

public final class um implements ObservableTransformer	// class@0028df from classes.dex
{
    public final int a;
    public final wm b;

    public void um(wm p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       int i = 5;
       um tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             return p0.switchMap(new om(tb, 9));
           case 1:
             tb.getClass();
             return p0.flatMapCompletable(new om(tb, 7)).s();
           case 2:
             tb.getClass();
             return p0.flatMapSingle(new om(tb, 2));
           case 3:
             tb.getClass();
             return p0.flatMapCompletable(new om(tb, 6)).s();
           case 4:
             tb.getClass();
             return p0.map(new rm(i)).map(new rm(6)).flatMapCompletable(new om(tb, 4)).s();
           case 5:
             tb.getClass();
             return p0.flatMapCompletable(new om(tb, 1)).s();
           case 6:
             tb.getClass();
             return p0.flatMapCompletable(new om(tb, 8)).s();
           case 7:
             tb.getClass();
             return p0.switchMap(new om(tb, 3));
           default:
             tb.getClass();
             return p0.flatMapCompletable(new om(tb, i)).s();
       }
    }
}
