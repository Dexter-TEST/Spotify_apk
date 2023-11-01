package p.cl4;
import io.reactivex.rxjava3.core.ObservableTransformer;
import androidx.fragment.app.k;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.el4;
import android.app.Activity;
import p.yf2;
import io.reactivex.rxjava3.core.Completable;
import p.gl4;

public final class cl4 implements ObservableTransformer	// class@00122d from classes.dex
{
    public final int a;
    public final k b;

    public void cl4(k p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       int i = 0;
       cl4 tb = this.b;
       switch (this.a){
           case 0:
             return p0.flatMapCompletable(new gl4(tb, 1)).s();
           case 1:
             return p0.flatMapCompletable(new el4(tb, 2)).s();
           case 2:
             return p0.flatMapCompletable(new gl4(tb, i)).s();
           case 3:
             return p0.flatMapCompletable(new el4(tb, i)).s();
           case 4:
             return p0.flatMapCompletable(new el4(tb, 1)).s();
           default:
             return p0.flatMapCompletable(new el4(tb, 3)).s();
       }
    }
}
