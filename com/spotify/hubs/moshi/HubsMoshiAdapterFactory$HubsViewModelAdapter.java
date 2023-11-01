package com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsViewModelAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.b;
import java.lang.Object;
import p.b43;
import com.spotify.hubs.moshi.HubsJsonViewModel;
import java.lang.Class;
import com.squareup.moshi.i;
import java.io.IOException;
import java.lang.String;

class HubsMoshiAdapterFactory$HubsViewModelAdapter extends JsonAdapter	// class@0008dd from classes.dex
{
    private final Moshi mMoshi;

    public void HubsMoshiAdapterFactory$HubsViewModelAdapter(Moshi p0){
       super();
       this.mMoshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public b43 fromJson(b p0){
       HubsJsonViewModel hubsJsonView = this.mMoshi.c(HubsJsonViewModel.class).fromJson(p0);
       hubsJsonView.getClass();
       return hubsJsonView.a();
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,b43 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
}
