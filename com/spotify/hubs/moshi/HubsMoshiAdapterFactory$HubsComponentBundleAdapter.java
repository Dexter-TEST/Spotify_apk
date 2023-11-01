package com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsComponentBundleAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.b;
import java.lang.Object;
import p.au2;
import p.a23;
import java.lang.Class;
import com.squareup.moshi.i;
import java.io.IOException;
import java.lang.String;

class HubsMoshiAdapterFactory$HubsComponentBundleAdapter extends JsonAdapter	// class@0008d5 from classes.dex
{
    private final Moshi mMoshi;

    public void HubsMoshiAdapterFactory$HubsComponentBundleAdapter(Moshi p0){
       super();
       this.mMoshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public au2 fromJson(b p0){
       return a23.W(this.mMoshi.c(a23.class).fromJson(p0));
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,au2 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
}
