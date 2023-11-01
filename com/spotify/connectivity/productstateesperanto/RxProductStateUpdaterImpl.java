package com.spotify.connectivity.productstateesperanto.RxProductStateUpdaterImpl;
import com.spotify.connectivity.productstate.RxProductStateUpdater;
import com.spotify.connectivity.productstateesperanto.ProductStateMethods;
import java.lang.Object;
import p.fn0;
import java.lang.String;
import io.reactivex.rxjava3.core.Completable;
import com.spotify.connectivity.productstateesperanto.RxProductStateUpdaterImpl$1;
import io.reactivex.rxjava3.core.CompletableObserver;

public class RxProductStateUpdaterImpl implements RxProductStateUpdater	// class@000800 from classes.dex
{
    private final fn0 disposables;
    private final ProductStateMethods mproductStateMethods;

    public void RxProductStateUpdaterImpl(ProductStateMethods p0){
       super();
       this.disposables = new fn0();
       this.mproductStateMethods = p0;
    }
    public static fn0 access$000(RxProductStateUpdaterImpl p0){
       return p0.disposables;
    }
    public void dispose(){
       this.disposables.e();
    }
    public void update(String p0,String p1){
       this.mproductStateMethods.updateState(p0, p1).subscribe(new RxProductStateUpdaterImpl$1(this));
    }
}
