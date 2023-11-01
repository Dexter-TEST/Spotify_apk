package p.i12;
import io.reactivex.rxjava3.core.ObservableTransformer;
import android.content.Context;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.mx6;
import p.yf2;

public final class i12 implements ObservableTransformer	// class@001902 from classes.dex
{
    public final Context a;

    public void i12(Context p0){
       super();
       this.a = p0;
    }
    public final ObservableSource apply(Observable p0){
       return p0.map(new mx6(10, this));
    }
}
