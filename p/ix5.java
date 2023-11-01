package p.ix5;
import p.gx5;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.String;
import p.co5;
import p.hx5;
import p.yf2;

public final class ix5 implements gx5	// class@001a23 from classes.dex
{

    public void ix5(){
       super();
    }
    public final ObservableSource apply(Observable p0){
       co5.o(p0, "upstream");
       p0 = p0.map(hx5.a);
       co5.l(p0, "upstream.map {\n         …esponse\n                }");
       return p0;
    }
}
