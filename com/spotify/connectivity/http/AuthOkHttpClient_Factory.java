package com.spotify.connectivity.http.AuthOkHttpClient_Factory;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.http.SpotifyOkHttp;
import java.lang.String;
import com.spotify.connectivity.http.AuthOkHttpClient;

public final class AuthOkHttpClient_Factory	// class@000724 from classes.dex
{
    private final tm5 spotifyOkHttpProvider;

    public void AuthOkHttpClient_Factory(tm5 p0){
       super();
       this.spotifyOkHttpProvider = p0;
    }
    public static AuthOkHttpClient_Factory create(tm5 p0){
       return new AuthOkHttpClient_Factory(p0);
    }
    public static AuthOkHttpClient newInstance(SpotifyOkHttp p0,String p1){
       return new AuthOkHttpClient(p0, p1);
    }
    public AuthOkHttpClient get(String p0){
       return AuthOkHttpClient_Factory.newInstance(this.spotifyOkHttpProvider.get(), p0);
    }
}
