package com.spotify.hubs.moshi.HubsMoshiAdapterFactory;
import com.squareup.moshi.JsonAdapter$a;
import java.lang.Object;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.JsonAdapter;
import java.lang.Class;
import p.ya7;
import p.tt2;
import com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsCommandModelAdapter;
import p.a23;
import com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsImmutableComponentBundleAdapter;
import p.au2;
import com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsComponentBundleAdapter;
import p.j13;
import com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsImageAdapter;
import p.p33;
import com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsTargetAdapter;
import p.b43;
import com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsViewModelAdapter;
import p.ju2;
import com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsComponentModelAdapter;
import p.tu2;
import com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsComponentTextAdapter;
import p.fu2;
import com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsComponentIdentifierAdapter;
import p.hu2;
import com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsComponentImagesAdapter;

public class HubsMoshiAdapterFactory implements JsonAdapter$a	// class@0008df from classes.dex
{
    private static final String a = "Hubs model classes do not currently support serialization to JSON";

    public void HubsMoshiAdapterFactory(){
       super();
    }
    public JsonAdapter a(Type p0,Set p1,Moshi p2){
       HubsMoshiAdapterFactory$HubsCommandModelAdapter hubsCommandM;
       Class uClass = ya7.g(p0);
       JsonAdapter jsonAdapter = null;
       if (tt2.class.isAssignableFrom(uClass)) {
          hubsCommandM = new HubsMoshiAdapterFactory$HubsCommandModelAdapter(p2);
       }else if(a23.class.isAssignableFrom(uClass)){
          hubsCommandM = new HubsMoshiAdapterFactory$HubsImmutableComponentBundleAdapter(p2);
       }else if(au2.class.isAssignableFrom(uClass)){
          hubsCommandM = new HubsMoshiAdapterFactory$HubsComponentBundleAdapter(p2);
       }else if(j13.class.isAssignableFrom(uClass)){
          hubsCommandM = new HubsMoshiAdapterFactory$HubsImageAdapter(p2);
       }else if(p33.class.isAssignableFrom(uClass)){
          hubsCommandM = new HubsMoshiAdapterFactory$HubsTargetAdapter(p2);
       }else if(b43.class.isAssignableFrom(uClass)){
          hubsCommandM = new HubsMoshiAdapterFactory$HubsViewModelAdapter(p2);
       }else if(ju2.class.isAssignableFrom(uClass)){
          hubsCommandM = new HubsMoshiAdapterFactory$HubsComponentModelAdapter(p2);
       }else if(tu2.class.isAssignableFrom(uClass)){
          hubsCommandM = new HubsMoshiAdapterFactory$HubsComponentTextAdapter(p2);
       }else if(fu2.class.isAssignableFrom(uClass)){
          hubsCommandM = new HubsMoshiAdapterFactory$HubsComponentIdentifierAdapter(p2);
       }else if(hu2.class.isAssignableFrom(uClass)){
          hubsCommandM = new HubsMoshiAdapterFactory$HubsComponentImagesAdapter(p2);
       }else {
          hubsCommandM = jsonAdapter;
       }
       if (hubsCommandM != null) {
          jsonAdapter = hubsCommandM.nullSafe();
       }
       return jsonAdapter;
    }
}
