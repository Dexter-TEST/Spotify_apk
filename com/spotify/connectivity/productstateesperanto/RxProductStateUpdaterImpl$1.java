package com.spotify.connectivity.productstateesperanto.RxProductStateUpdaterImpl$1;
import io.reactivex.rxjava3.core.CompletableObserver;
import com.spotify.connectivity.productstateesperanto.RxProductStateUpdaterImpl;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;
import p.fn0;
import java.lang.Throwable;

class RxProductStateUpdaterImpl$1 implements CompletableObserver	// class@0007ff from classes.dex
{
    private Disposable disposable;
    final RxProductStateUpdaterImpl this$0;

    public void RxProductStateUpdaterImpl$1(RxProductStateUpdaterImpl p0){
       this.this$0 = p0;
       super();
       this.disposable = null;
    }
    public void onComplete(){
       this.disposable.dispose();
       RxProductStateUpdaterImpl.access$000(this.this$0).a(this.disposable);
    }
    public void onError(Throwable p0){
       this.onComplete();
    }
    public void onSubscribe(Disposable p0){
       this.disposable = p0;
       RxProductStateUpdaterImpl.access$000(this.this$0).c(this.disposable);
    }
}
