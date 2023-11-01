package p.gd1;
import java.util.concurrent.Future;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import java.util.concurrent.TimeUnit;

public final class gd1 implements Future	// class@0016e6 from classes.dex
{
    public final Disposable a;

    public void gd1(Disposable p0){
       super();
       this.a = p0;
    }
    public final boolean cancel(boolean p0){
       this.a.dispose();
       return false;
    }
    public final Object get(){
       return null;
    }
    public final Object get(long p0,TimeUnit p1){
       return null;
    }
    public final boolean isCancelled(){
       return false;
    }
    public final boolean isDone(){
       return false;
    }
}
