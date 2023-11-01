package com.spotify.clientfoundations.esperanto.esperantoimpl.NativeObserver;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;

public final class NativeObserver implements Observer	// class@000582 from classes.dex
{
    private final long nThis;

    public void NativeObserver(){
       super();
    }
    public native final void destroy();
    public native void onComplete();
    public native void onError(Throwable p0);
    public native void onNext(Object p0);
    public native void onSubscribe(Disposable p0);
}
