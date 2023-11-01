package p.yk0;
import p.u90;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import p.v90;
import java.lang.Class;
import p.do5;
import java.util.concurrent.CompletableFuture;
import java.lang.reflect.ParameterizedType;
import p.bx5;
import p.px3;
import java.lang.Object;
import p.x3;
import java.lang.IllegalStateException;
import java.lang.String;

public final class yk0 extends u90	// class@0003de from classes2.dex
{
    public static final yk0 a;

    static {
       yk0.a = new yk0();
    }
    public void yk0(){
       super();
    }
    public final v90 a(Type p0,Annotation[] p1){
       if (do5.C(p0) != CompletableFuture.class) {
          return null;
       }
       if (!p0 instanceof ParameterizedType) {
          throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
       }
       int i = 0;
       p0 = do5.B(i, p0);
       if (do5.C(p0) != bx5.class) {
          return new px3(p0);
       }
       if (p0 instanceof ParameterizedType) {
          return new x3(do5.B(i, p0));
       }
       throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
