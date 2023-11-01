package com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsComponentImagesAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.b;
import java.lang.Object;
import p.hu2;
import com.spotify.hubs.moshi.HubsJsonComponentImages;
import java.lang.Class;
import com.squareup.moshi.i;
import java.io.IOException;
import java.lang.String;

class HubsMoshiAdapterFactory$HubsComponentImagesAdapter extends JsonAdapter	// class@0008d7 from classes.dex
{
    private final Moshi mMoshi;

    public void HubsMoshiAdapterFactory$HubsComponentImagesAdapter(Moshi p0){
       super();
       this.mMoshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public hu2 fromJson(b p0){
       HubsJsonComponentImages hubsJsonComp = this.mMoshi.c(HubsJsonComponentImages.class).fromJson(p0);
       hubsJsonComp.getClass();
       return hubsJsonComp.a();
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,hu2 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
}
