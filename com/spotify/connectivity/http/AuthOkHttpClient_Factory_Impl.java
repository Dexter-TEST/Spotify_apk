package com.spotify.connectivity.http.AuthOkHttpClient_Factory_Impl;
import com.spotify.connectivity.http.AuthOkHttpClient$Factory;
import com.spotify.connectivity.http.AuthOkHttpClient_Factory;
import java.lang.Object;
import p.tm5;
import p.ta3;
import java.lang.String;
import com.spotify.connectivity.http.AuthOkHttpClient;

public final class AuthOkHttpClient_Factory_Impl implements AuthOkHttpClient$Factory	// class@000725 from classes.dex
{
    private final AuthOkHttpClient_Factory delegateFactory;

    public void AuthOkHttpClient_Factory_Impl(AuthOkHttpClient_Factory p0){
       super();
       this.delegateFactory = p0;
    }
    public static tm5 create(AuthOkHttpClient_Factory p0){
       return ta3.a(new AuthOkHttpClient_Factory_Impl(p0));
    }
    public AuthOkHttpClient create(String p0){
       return this.delegateFactory.get(p0);
    }
}
