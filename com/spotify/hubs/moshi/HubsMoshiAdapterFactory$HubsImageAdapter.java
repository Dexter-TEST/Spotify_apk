package com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsImageAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.b;
import java.lang.Object;
import p.j13;
import com.spotify.hubs.moshi.HubsJsonImage;
import java.lang.Class;
import com.squareup.moshi.i;
import java.io.IOException;
import java.lang.String;

class HubsMoshiAdapterFactory$HubsImageAdapter extends JsonAdapter	// class@0008da from classes.dex
{
    private final Moshi mMoshi;

    public void HubsMoshiAdapterFactory$HubsImageAdapter(Moshi p0){
       super();
       this.mMoshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public j13 fromJson(b p0){
       HubsJsonImage hubsJsonImag = this.mMoshi.c(HubsJsonImage.class).fromJson(p0);
       hubsJsonImag.getClass();
       return hubsJsonImag.a();
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,j13 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
}
