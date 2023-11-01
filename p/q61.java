package p.q61;
import p.u90;
import java.util.concurrent.Executor;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import p.v90;
import java.lang.Class;
import p.do5;
import p.s90;
import java.lang.reflect.ParameterizedType;
import p.ll6;
import p.ce7;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class q61 extends u90	// class@00030c from classes2.dex
{
    public final Executor a;

    public void q61(Executor p0){
       super();
       this.a = p0;
    }
    public final v90 a(Type p0,Annotation[] p1){
       v90 ov90 = null;
       if (do5.C(p0) != s90.class) {
          return ov90;
       }
       if (!p0 instanceof ParameterizedType) {
          throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
       }
       p0 = do5.B(0, p0);
       if (!do5.J(p1, ll6.class)) {
          ov90 = this.a;
       }
       return new ce7(this, p0, ov90);
    }
}
