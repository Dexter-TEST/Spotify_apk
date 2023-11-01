package p.my5;
import p.ny5;
import java.lang.String;
import p.gx5;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import p.co5;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Single;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;

public final class my5 extends ny5	// class@001f2e from classes.dex
{

    public void my5(){
       super("SINGLE", 1);
    }
    public final Object a(gx5 p0,Observable p1){
       co5.o(p0, "converter");
       co5.o(p1, "source");
       Single single = p1.compose(p0).singleOrError();
       co5.l(single, "source.compose\(converter\).singleOrError\(\)");
       return single;
    }
    public final boolean b(String p0,Type p1){
       boolean b = false;
       if (!"SUB".equals(p0)) {
          int i = (p1 instanceof ParameterizedType && p1.getRawType().equals(Single.class))? 1: 0;
          if (i) {
             b = true;
          }
       }
       return b;
    }
}
