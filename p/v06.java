package p.v06;
import p.u90;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import p.v90;
import java.lang.Class;
import p.do5;
import io.reactivex.rxjava3.core.Completable;
import p.u06;
import java.lang.Void;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import java.lang.reflect.ParameterizedType;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import p.bx5;
import p.vx5;

public final class v06 extends u90	// class@000379 from classes2.dex
{
    public final Scheduler a;
    public final boolean b;

    public void v06(Scheduler p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static v06 b(){
       return new v06(null, true);
    }
    public final v90 a(Type p0,Annotation[] p1){
       Class uClass;
       u06 p0;
       String str;
       Type type;
       boolean b3;
       boolean b4;
       if ((uClass = do5.C(p0)) == Completable.class) {
          p0 = new u06(Void.class, this.a, this.b, false, true, false, false, false, true);
          return p0;
       }else {
          p0 = 1;
          boolean b = (uClass == Flowable.class)? true: false;
          boolean b1 = (uClass == Single.class)? true: false;
          boolean b2 = (uClass == Maybe.class)? true: false;
          if (uClass != Observable.class && (!b && (!b1 && !b2))) {
             return null;
          }else if(!p0 instanceof ParameterizedType){
             if (!b) {
                if (!b1) {
                   str = (b2)? "Maybe": "Observable";
                }else {
                   str = "Single";
                }
             }else {
                str = "Flowable";
             }
             throw new IllegalStateException(str+" return type must be parameterized as "+str+"<Foo> or "+str+"<? extends Foo>");
          }else {
             p0 = do5.B(0, p0);
             if ((uClass = do5.C(p0)) == bx5.class) {
                if (p0 instanceof ParameterizedType) {
                   p0 = do5.B(0, p0);
                   p0 = 0;
                }else {
                   throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                }
             }else if(uClass == vx5.class){
                if (p0 instanceof ParameterizedType) {
                   p0 = do5.B(0, p0);
                }else {
                   throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
                }
             }else {
                type = p0;
                b3 = false;
                b4 = true;
             label_00b9 :
                p0 = new u06(type, this.a, this.b, b3, b4, b, b1, b2, false);
                return p0;
             }
             type = p0;
             b3 = p0;
             b4 = false;
             goto label_00b9 ;
          }
       }
    }
}
