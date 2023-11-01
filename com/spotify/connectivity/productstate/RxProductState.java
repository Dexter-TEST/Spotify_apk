package com.spotify.connectivity.productstate.RxProductState;
import io.reactivex.rxjava3.core.Observable;
import java.lang.String;

public interface abstract RxProductState	// class@0007dd from classes.dex
{

    Observable productState();
    Observable productStateKey(String p0);
    Observable productStateKeyOr(String p0,String p1);
    Observable productStateKeyV2(String p0);
}
