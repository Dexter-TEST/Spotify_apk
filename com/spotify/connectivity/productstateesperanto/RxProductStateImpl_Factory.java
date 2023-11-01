package com.spotify.connectivity.productstateesperanto.RxProductStateImpl_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.productstateesperanto.RxProductStateImpl;

public final class RxProductStateImpl_Factory implements a02	// class@0007fe from classes.dex
{
    private final tm5 productStateProvider;

    public void RxProductStateImpl_Factory(tm5 p0){
       super();
       this.productStateProvider = p0;
    }
    public static RxProductStateImpl_Factory create(tm5 p0){
       return new RxProductStateImpl_Factory(p0);
    }
    public static RxProductStateImpl newInstance(Observable p0){
       return new RxProductStateImpl(p0);
    }
    public RxProductStateImpl get(){
       return RxProductStateImpl_Factory.newInstance(this.productStateProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
