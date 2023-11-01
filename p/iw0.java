package p.iw0;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.ow0;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

public final class iw0 implements ObservableTransformer	// class@001a15 from classes.dex
{
    public final int a;
    public final ow0 b;

    public void iw0(ow0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       iw0 tb = this.b;
       switch (this.a){
           case 0:
             return tb.r(p0);
           case 1:
             return tb.r(p0);
           default:
             return tb.r(p0);
       }
    }
}
