package p.ma7;
import java.lang.Object;
import java.lang.Class;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import p.mi;
import java.lang.RuntimeException;
import java.lang.String;

public class ma7	// class@001e5b from classes.dex
{
    public final Class a;
    public final Type b;
    public final int c;

    public void ma7(){
       super();
       Type genericSuper = this.getClass().getGenericSuperclass();
       if (genericSuper instanceof Class) {
          throw new RuntimeException("Missing type parameter.");
       }
       genericSuper = mi.e(genericSuper.getActualTypeArguments()[0]);
       this.b = genericSuper;
       this.a = mi.u(genericSuper);
       this.c = genericSuper.hashCode();
       return;
    }
    public void ma7(Type p0){
       super();
       p0.getClass();
       p0 = mi.e(p0);
       this.b = p0;
       this.a = mi.u(p0);
       this.c = p0.hashCode();
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof ma7 && mi.o(this.b, p0.b))? true: false;
       return b;
    }
    public final int hashCode(){
       return this.c;
    }
    public final String toString(){
       return mi.P(this.b);
    }
}
