package com.spotify.mobius.rx3.RxConnectables;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.xo0;
import com.spotify.mobius.rx3.RxConnectables$1;
import com.spotify.mobius.rx3.DiscardAfterDisposeConnectable;

public abstract class RxConnectables	// class@000a87 from classes.dex
{

    public static xo0 a(ObservableTransformer p0){
       return new DiscardAfterDisposeConnectable(new RxConnectables$1(p0));
    }
}
