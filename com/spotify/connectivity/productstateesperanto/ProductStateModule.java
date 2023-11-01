package com.spotify.connectivity.productstateesperanto.ProductStateModule;
import com.spotify.connectivity.productstateesperanto.ProductStateAccumulator;
import io.reactivex.rxjava3.core.ObservableTransformer;
import com.spotify.connectivity.productstateesperanto.RxProductStateUpdaterImpl;
import com.spotify.connectivity.productstate.RxProductStateUpdater;

public interface abstract ProductStateModule	// class@0007f2 from classes.dex
{

    ObservableTransformer bindProductStateAccumulator(ProductStateAccumulator p0);
    RxProductStateUpdater bindRxProductStateUpdater(RxProductStateUpdaterImpl p0);
}
