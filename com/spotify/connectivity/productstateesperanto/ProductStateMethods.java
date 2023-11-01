package com.spotify.connectivity.productstateesperanto.ProductStateMethods;
import java.lang.String;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;

public interface abstract ProductStateMethods	// class@0007ee from classes.dex
{

    Completable overrideValue(String p0,String p1);
    Completable removeOverride(String p0);
    Completable updateState(String p0,String p1);
    Observable values();
}
