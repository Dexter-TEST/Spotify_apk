package com.spotify.connectivity.http.AuthOkHttpClient;
import com.spotify.connectivity.http.SpotifyOkHttp;
import java.lang.String;
import java.lang.Object;
import p.g15;
import com.spotify.connectivity.http.AuthInterceptor;
import java.lang.Class;
import p.f15;
import java.util.ArrayList;

public class AuthOkHttpClient	// class@000723 from classes.dex
{
    private final g15 mHttpClient;

    public void AuthOkHttpClient(SpotifyOkHttp p0,String p1){
       super();
       g15 instance = p0.getInstance();
       instance.getClass();
       f15 uof15 = new f15(instance);
       uof15.c.add(0, new AuthInterceptor(p1));
       this.mHttpClient = new g15(uof15);
    }
    public g15 getAuthClient(){
       return this.mHttpClient;
    }
}
