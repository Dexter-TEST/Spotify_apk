package p.ak4;
import java.lang.Enum;
import java.lang.String;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import p.yj4;
import java.lang.Throwable;
import p.xj4;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;

public final class ak4 extends Enum	// class@000f9d from classes.dex
{
    public static final ak4 a;
    public static final ak4[] b;

    static {
       ak4 uoak4 = new ak4();
       ak4.a = uoak4;
       ak4[] uoak4Array = new ak4[]{uoak4};
       ak4.b = uoak4Array;
    }
    public void ak4(){
       super("COMPLETE", 0);
    }
    public static boolean a(Observer p0,Object p1){
       if (p1 == ak4.a) {
          p0.onComplete();
          return true;
       }else if(p1 instanceof yj4){
          p0.onError(p1.a);
          return true;
       }else {
          p0.onNext(p1);
          return false;
       }
    }
    public static boolean b(Observer p0,Object p1){
       boolean b = true;
       if (p1 == ak4.a) {
          p0.onComplete();
          return b;
       }else if(p1 instanceof yj4){
          p0.onError(p1.a);
          return b;
       }else if(p1 instanceof xj4){
          p0.onSubscribe(p1.a);
          return false;
       }else {
          p0.onNext(p1);
          return false;
       }
    }
    public static boolean c(Object p0){
       boolean b = (p0 == ak4.a)? true: false;
       return b;
    }
    public static ak4 valueOf(String p0){
       return Enum.valueOf(ak4.class, p0);
    }
    public static ak4[] values(){
       return ak4.b.clone();
    }
    public final String toString(){
       return "NotificationLite.Complete";
    }
}
