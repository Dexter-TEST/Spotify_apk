package p.o9;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ir2;
import p.yf2;

public final class o9 implements ObservableTransformer	// class@0020da from classes.dex
{
    public static final o9 a;

    static {
       o9.a = new o9();
    }
    public void o9(){
       super();
    }
    public final ObservableSource apply(Observable p0){
       return p0.map(ir2.B);
    }
}
