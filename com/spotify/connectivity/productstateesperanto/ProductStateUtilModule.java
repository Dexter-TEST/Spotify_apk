package com.spotify.connectivity.productstateesperanto.ProductStateUtilModule;
import java.lang.Object;
import com.spotify.connectivity.flags.Flags;
import com.spotify.connectivity.productstate.ProductStateUtil;
import com.spotify.connectivity.flags.RxFlags;
import io.reactivex.rxjava3.core.Flowable;
import p.hl5;
import java.lang.Class;
import p.r82;
import p.yf2;
import p.i72;
import com.spotify.connectivity.productstate.RxProductState;
import io.reactivex.rxjava3.core.Observable;

public final class ProductStateUtilModule	// class@0007f7 from classes.dex
{

    public void ProductStateUtilModule(){
       super();
    }
    public static boolean provideIsOnDemandEnabled(Flags p0){
       return ProductStateUtil.onDemandEnabled(p0);
    }
    public static Flowable provideOnDemandEnabledFlowable(RxFlags p0){
       Flowable uFlowable = p0.flags();
       uFlowable.getClass();
       return new r82(uFlowable, new hl5(2), 0).g();
    }
    public static Observable provideOnDemandEnabledObservable(RxProductState p0){
       return p0.productState().map(new hl5(1)).distinctUntilChanged();
    }
}
