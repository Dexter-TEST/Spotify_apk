package com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsComponentTextAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.b;
import java.lang.Object;
import p.tu2;
import com.spotify.hubs.moshi.HubsJsonComponentText;
import java.lang.Class;
import com.squareup.moshi.i;
import java.io.IOException;
import java.lang.String;

class HubsMoshiAdapterFactory$HubsComponentTextAdapter extends JsonAdapter	// class@0008d9 from classes.dex
{
    private final Moshi mMoshi;

    public void HubsMoshiAdapterFactory$HubsComponentTextAdapter(Moshi p0){
       super();
       this.mMoshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public tu2 fromJson(b p0){
       HubsJsonComponentText hubsJsonComp = this.mMoshi.c(HubsJsonComponentText.class).fromJson(p0);
       hubsJsonComp.getClass();
       return hubsJsonComp.a();
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,tu2 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
}
