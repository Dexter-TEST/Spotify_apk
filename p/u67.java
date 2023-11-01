package p.u67;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.lang.String;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.e16;
import p.yf2;

public final class u67 implements ObservableTransformer	// class@002853 from classes.dex
{
    public final String a;

    public void u67(String p0){
       super();
       this.a = p0;
    }
    public final ObservableSource apply(Observable p0){
       return p0.map(new e16(10, this));
    }
}
