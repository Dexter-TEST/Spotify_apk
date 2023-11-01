package com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsTargetAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.b;
import java.lang.Object;
import p.p33;
import com.spotify.hubs.moshi.HubsJsonTarget;
import java.lang.Class;
import com.squareup.moshi.i;
import java.io.IOException;
import java.lang.String;

class HubsMoshiAdapterFactory$HubsTargetAdapter extends JsonAdapter	// class@0008dc from classes.dex
{
    private final Moshi mMoshi;

    public void HubsMoshiAdapterFactory$HubsTargetAdapter(Moshi p0){
       super();
       this.mMoshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public p33 fromJson(b p0){
       HubsJsonTarget hubsJsonTarg = this.mMoshi.c(HubsJsonTarget.class).fromJson(p0);
       hubsJsonTarg.getClass();
       return hubsJsonTarg.a();
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,p33 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
}
