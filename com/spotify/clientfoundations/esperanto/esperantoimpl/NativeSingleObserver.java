package com.spotify.clientfoundations.esperanto.esperantoimpl.NativeSingleObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;

public final class NativeSingleObserver implements SingleObserver	// class@000583 from classes.dex
{
    private final long nThis;

    public void NativeSingleObserver(){
       super();
    }
    public native void onError(Throwable p0);
    public native void onSubscribe(Disposable p0);
    public native void onSuccess(Object p0);
}
