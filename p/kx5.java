package p.kx5;
import p.gx5;
import com.spotify.cosmos.cosmonaut.Converter;
import java.lang.reflect.Type;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.String;
import p.co5;
import p.jx5;
import p.yf2;

public final class kx5 implements gx5	// class@001ca0 from classes.dex
{
    public final int a;
    public final Converter b;
    public final Type c;

    public void kx5(int p0,Converter p1,Type p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final ObservableSource apply(Observable p0){
       kx5 tb = this.b;
       kx5 tc = this.c;
       String str = "upstream";
       switch (this.a){
           case 0:
           default:
             co5.o(p0, str);
             p0 = p0.map(new jx5(1, tb, tc));
             co5.l(p0, "typeArgument = getActual…      }\n                }");
             return p0;
       }
       co5.o(p0, str);
       p0 = p0.map(new jx5(0, tb, tc));
       co5.l(p0, "nestedType = getActualTy…  \)\n                    }");
       return p0;
    }
}
