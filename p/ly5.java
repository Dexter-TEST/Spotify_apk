package p.ly5;
import p.ny5;
import java.lang.String;
import p.gx5;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import p.co5;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;

public final class ly5 extends ny5	// class@001deb from classes.dex
{

    public void ly5(){
       super("OBSERVABLE", 0);
    }
    public final Object a(gx5 p0,Observable p1){
       co5.o(p0, "converter");
       co5.o(p1, "source");
       Observable observable = p1.compose(p0);
       co5.l(observable, "source.compose\(converter\)");
       return observable;
    }
    public final boolean b(String p0,Type p1){
       boolean b = false;
       if ("SUB".equals(p0)) {
          int i = (p1 instanceof ParameterizedType && p1.getRawType().equals(Observable.class))? 1: 0;
          if (i) {
             b = true;
          }
       }
       return b;
    }
}
