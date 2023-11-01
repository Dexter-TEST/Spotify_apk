package p.iv6;
import java.lang.Throwable;
import java.lang.Object;
import p.kv6;

public interface abstract iv6	// class@00024d from classes2.dex
{

    void onComplete();
    void onError(Throwable p0);
    void onNext(Object p0);
    void onSubscribe(kv6 p0);
}
