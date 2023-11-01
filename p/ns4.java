package p.ns4;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.lang.Object;
import p.m72;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.TimeUnit;
import p.yf2;

public final class ns4 implements ObservableTransformer	// class@00203d from classes.dex
{
    public final m72 a;

    public void ns4(){
       super(0);
    }
    public void ns4(int p0){
       super();
       this.a = new m72(5, 1, 1000);
    }
    public final ObservableSource apply(Observable p0){
       return p0.timeout((long)30, TimeUnit.SECONDS).retryWhen(this.a);
    }
}
