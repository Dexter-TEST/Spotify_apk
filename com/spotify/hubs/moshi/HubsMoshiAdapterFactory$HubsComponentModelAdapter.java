package com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsComponentModelAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.b;
import java.lang.Object;
import p.ju2;
import com.spotify.hubs.moshi.HubsJsonComponentModel;
import java.lang.Class;
import com.squareup.moshi.i;
import java.io.IOException;
import java.lang.String;

class HubsMoshiAdapterFactory$HubsComponentModelAdapter extends JsonAdapter	// class@0008d8 from classes.dex
{
    private final Moshi mMoshi;

    public void HubsMoshiAdapterFactory$HubsComponentModelAdapter(Moshi p0){
       super();
       this.mMoshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public ju2 fromJson(b p0){
       HubsJsonComponentModel hubsJsonComp = this.mMoshi.c(HubsJsonComponentModel.class).fromJson(p0);
       hubsJsonComp.getClass();
       return hubsJsonComp.a();
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,ju2 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
}
