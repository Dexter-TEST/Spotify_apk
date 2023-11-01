package com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsComponentIdentifierAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.b;
import java.lang.Object;
import p.fu2;
import com.spotify.hubs.moshi.HubsJsonComponentIdentifier;
import java.lang.Class;
import com.squareup.moshi.i;
import java.io.IOException;
import java.lang.String;

class HubsMoshiAdapterFactory$HubsComponentIdentifierAdapter extends JsonAdapter	// class@0008d6 from classes.dex
{
    private final Moshi mMoshi;

    public void HubsMoshiAdapterFactory$HubsComponentIdentifierAdapter(Moshi p0){
       super();
       this.mMoshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public fu2 fromJson(b p0){
       HubsJsonComponentIdentifier hubsJsonComp = this.mMoshi.c(HubsJsonComponentIdentifier.class).fromJson(p0);
       hubsJsonComp.getClass();
       return hubsJsonComp.a();
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,fu2 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
}
