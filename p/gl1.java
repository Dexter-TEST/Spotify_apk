package p.gl1;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.kv6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class gl1 extends Enum implements FlowableSubscriber, Observer, MaybeObserver, SingleObserver, CompletableObserver, kv6, Disposable	// class@00172c from classes.dex
{
    public static final gl1 a;
    public static final gl1[] b;

    static {
       gl1 ogl1 = new gl1();
       gl1.a = ogl1;
       gl1[] ogl1Array = new gl1[]{ogl1};
       gl1.b = ogl1Array;
    }
    public void gl1(){
       super("INSTANCE", 0);
    }
    public static gl1 valueOf(String p0){
       return Enum.valueOf(gl1.class, p0);
    }
    public static gl1[] values(){
       return gl1.b.clone();
    }
    public final void a(long p0){
    }
    public final void cancel(){
    }
    public void dispose(){
    }
    public boolean isDisposed(){
       return true;
    }
    public final void onComplete(){
    }
    public final void onError(Throwable p0){
       RxJavaPlugins.c(p0);
    }
    public final void onNext(Object p0){
    }
    public final void onSubscribe(Disposable p0){
       p0.dispose();
    }
    public final void onSubscribe(kv6 p0){
       p0.cancel();
    }
    public final void onSuccess(Object p0){
    }
}
