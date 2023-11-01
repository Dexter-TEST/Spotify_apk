package com.spotify.hubs.moshi.HubsJsonMoshiAdapters;
import java.lang.Object;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Moshi$a;
import com.squareup.moshi.b;
import p.tt2;
import com.spotify.hubs.moshi.HubsJsonCommandModel;
import java.lang.Class;
import com.squareup.moshi.JsonAdapter;
import p.au2;
import p.a23;
import p.fu2;
import com.spotify.hubs.moshi.HubsJsonComponentIdentifier;
import p.hu2;
import com.spotify.hubs.moshi.HubsJsonComponentImages;
import p.ju2;
import com.spotify.hubs.moshi.HubsJsonComponentModel;
import p.tu2;
import com.spotify.hubs.moshi.HubsJsonComponentText;
import p.j13;
import com.spotify.hubs.moshi.HubsJsonImage;
import com.squareup.moshi.b$c;
import java.lang.reflect.Type;
import java.lang.String;
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import java.util.LinkedList;
import com.spotify.hubs.moshi.HubsJsonMoshiAdapters$a;
import java.lang.Enum;
import java.util.List;
import java.lang.CharSequence;
import java.lang.Long;
import java.util.Collection;
import com.spotify.hubs.moshi.HubsJsonComponentBundle;
import p.p33;
import com.spotify.hubs.moshi.HubsJsonTarget;
import p.b43;
import com.spotify.hubs.moshi.HubsJsonViewModel;
import com.squareup.moshi.i;
import java.io.IOException;

public final class HubsJsonMoshiAdapters	// class@0008cf from classes.dex
{
    private static final String a = "Hubs model classes do not currently support serialization to JSON";
    public static final HubsJsonMoshiAdapters b;

    static {
       HubsJsonMoshiAdapters.b = new HubsJsonMoshiAdapters();
    }
    public void HubsJsonMoshiAdapters(){
       super();
    }
    private static Moshi a(){
       return new Moshi$a().b(HubsJsonMoshiAdapters.b).d();
    }
    public tt2 fromJsonHubsCommandModel(b p0){
       HubsJsonCommandModel hubsJsonComm = HubsJsonMoshiAdapters.a().c(HubsJsonCommandModel.class).fromJson(p0);
       hubsJsonComm.getClass();
       return hubsJsonComm.a();
    }
    public au2 fromJsonHubsComponentBundle(b p0){
       return a23.W(this.fromJsonHubsImmutableComponentBundle(p0));
    }
    public fu2 fromJsonHubsComponentIdentifier(b p0){
       HubsJsonComponentIdentifier hubsJsonComp = HubsJsonMoshiAdapters.a().c(HubsJsonComponentIdentifier.class).fromJson(p0);
       hubsJsonComp.getClass();
       return hubsJsonComp.a();
    }
    public hu2 fromJsonHubsComponentImages(b p0){
       HubsJsonComponentImages hubsJsonComp = HubsJsonMoshiAdapters.a().c(HubsJsonComponentImages.class).fromJson(p0);
       hubsJsonComp.getClass();
       return hubsJsonComp.a();
    }
    public ju2 fromJsonHubsComponentModel(b p0){
       HubsJsonComponentModel hubsJsonComp = HubsJsonMoshiAdapters.a().c(HubsJsonComponentModel.class).fromJson(p0);
       hubsJsonComp.getClass();
       return hubsJsonComp.a();
    }
    public tu2 fromJsonHubsComponentText(b p0){
       HubsJsonComponentText hubsJsonComp = HubsJsonMoshiAdapters.a().c(HubsJsonComponentText.class).fromJson(p0);
       hubsJsonComp.getClass();
       return hubsJsonComp.a();
    }
    public j13 fromJsonHubsImage(b p0){
       HubsJsonImage hubsJsonImag = HubsJsonMoshiAdapters.a().c(HubsJsonImage.class).fromJson(p0);
       hubsJsonImag.getClass();
       return hubsJsonImag.a();
    }
    public a23 fromJsonHubsImmutableComponentBundle(b p0){
       String str2;
       if (p0.q0() == b$c.z) {
          return null;
       }
       Type[] typeArray = new Type[]{String.class,Object.class};
       Map map = HubsJsonMoshiAdapters.a().d(ya7.j(Map.class, typeArray)).fromJson(p0.r0());
       map.getClass();
       LinkedList linkedList = new LinkedList();
       LinkedList linkedList1 = new LinkedList();
       linkedList.push(map);
       p0.f();
       while (p0.T()) {
          String str = p0.l0();
          int i = HubsJsonMoshiAdapters$a.a[p0.q0().ordinal()];
          String str1 = ".";
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   p0.A0();
                }else {
                   p0.b();
                   linkedList1.push(linkedList.peek().get(str));
                   int i1 = 0;
                   while (p0.T()) {
                      if (p0.q0() == b$c.x) {
                         if ((str2 = p0.o0()) != null && !str2.contains(str1)) {
                            linkedList1.peek().set(i1, Long.valueOf(Long.parseLong(str2)));
                         }
                      }else {
                         p0.A0();
                      }
                      i1 = i1 + 1;
                   }
                   linkedList1.pop();
                   p0.x();
                }
             }else {
                p0.f();
                linkedList.push(linkedList.peek().get(str));
             }
          }else if((str2 = p0.o0()) != null && !str2.contains(str1)){
             linkedList.peek().put(str, Long.valueOf(Long.parseLong(str2)));
          }
       }
       linkedList.pop();
       p0.y();
       if (linkedList.isEmpty()) {
          return new HubsJsonComponentBundle(map).c();
       }
    }
    public p33 fromJsonHubsTarget(b p0){
       HubsJsonTarget hubsJsonTarg = HubsJsonMoshiAdapters.a().c(HubsJsonTarget.class).fromJson(p0);
       hubsJsonTarg.getClass();
       return hubsJsonTarg.a();
    }
    public b43 fromJsonHubsViewModel(b p0){
       HubsJsonViewModel hubsJsonView = HubsJsonMoshiAdapters.a().c(HubsJsonViewModel.class).fromJson(p0);
       hubsJsonView.getClass();
       return hubsJsonView.a();
    }
    public void toJsonHubsCommandModel(i p0,tt2 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
    public void toJsonHubsComponentBundle(i p0,au2 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
    public void toJsonHubsComponentIdentifier(i p0,fu2 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
    public void toJsonHubsComponentImages(i p0,hu2 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
    public void toJsonHubsComponentModel(i p0,ju2 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
    public void toJsonHubsComponentText(i p0,tu2 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
    public void toJsonHubsImage(i p0,j13 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
    public void toJsonHubsImmutableComponentBundle(i p0,a23 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
    public void toJsonHubsTarget(i p0,p33 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
    public void toJsonHubsViewModel(i p0,b43 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
}
