package p.t17;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;

public final class t17 extends Enum implements Observer	// class@0026e1 from classes.dex
{
    public static final t17 a;
    public static final t17[] b;

    static {
       t17 ot17 = new t17();
       t17.a = ot17;
       t17[] ot17Array = new t17[]{ot17};
       t17.b = ot17Array;
    }
    public void t17(){
       super("INSTANCE", 0);
    }
    public static t17 valueOf(String p0){
       return Enum.valueOf(t17.class, p0);
    }
    public static t17[] values(){
       return t17.b.clone();
    }
    public final void onComplete(){
    }
    public final void onError(Throwable p0){
    }
    public final void onNext(Object p0){
    }
    public final void onSubscribe(Disposable p0){
    }
}
