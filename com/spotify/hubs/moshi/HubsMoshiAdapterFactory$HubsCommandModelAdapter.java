package com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsCommandModelAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.b;
import java.lang.Object;
import p.tt2;
import com.spotify.hubs.moshi.HubsJsonCommandModel;
import java.lang.Class;
import com.squareup.moshi.i;
import java.io.IOException;
import java.lang.String;

class HubsMoshiAdapterFactory$HubsCommandModelAdapter extends JsonAdapter	// class@0008d4 from classes.dex
{
    private final Moshi mMoshi;

    public void HubsMoshiAdapterFactory$HubsCommandModelAdapter(Moshi p0){
       super();
       this.mMoshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public tt2 fromJson(b p0){
       HubsJsonCommandModel hubsJsonComm = this.mMoshi.c(HubsJsonCommandModel.class).fromJson(p0);
       hubsJsonComm.getClass();
       return hubsJsonComm.a();
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,tt2 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
}
