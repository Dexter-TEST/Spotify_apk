package com.spotify.hubs.moshi.HubsMoshiAdapterFactory$HubsImmutableComponentBundleAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.b;
import java.lang.Object;
import p.a23;
import com.squareup.moshi.b$c;
import java.lang.reflect.Type;
import java.lang.String;
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import java.lang.Class;
import java.util.LinkedList;
import com.spotify.hubs.moshi.HubsMoshiAdapterFactory$a;
import java.lang.Enum;
import java.util.List;
import java.lang.CharSequence;
import java.lang.Long;
import java.util.Collection;
import com.spotify.hubs.moshi.HubsJsonComponentBundle;
import p.au2;
import com.squareup.moshi.i;
import java.io.IOException;

class HubsMoshiAdapterFactory$HubsImmutableComponentBundleAdapter extends JsonAdapter	// class@0008db from classes.dex
{
    private final Moshi mMoshi;

    public void HubsMoshiAdapterFactory$HubsImmutableComponentBundleAdapter(Moshi p0){
       super();
       this.mMoshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public a23 fromJson(b p0){
       String str2;
       if (p0.q0() == b$c.z) {
          return null;
       }
       Type[] typeArray = new Type[]{String.class,Object.class};
       Map map = this.mMoshi.d(ya7.j(Map.class, typeArray)).fromJson(p0.r0());
       map.getClass();
       LinkedList linkedList = new LinkedList();
       LinkedList linkedList1 = new LinkedList();
       linkedList.push(map);
       p0.f();
       while (p0.T()) {
          String str = p0.l0();
          int i = HubsMoshiAdapterFactory$a.a[p0.q0().ordinal()];
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
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,a23 p1){
       throw new IOException("Hubs model classes do not currently support serialization to JSON");
    }
}
