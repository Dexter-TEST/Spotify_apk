package com.spotify.connectivity.httpquasar.ManagedUserTransportApi;
import p.g15;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;

public interface abstract ManagedUserTransportApi	// class@00073e from classes.dex
{

    g15 getImageInstance();
    g15 getImageNoCacheInstance();
    g15 getInstance();
    g15 getPrototypeClient();
    RetrofitMaker getRetrofitMaker();
}
