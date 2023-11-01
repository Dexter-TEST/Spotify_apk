package p.l40;
import p.yf2;
import java.lang.Object;
import p.bx5;
import p.j40;
import com.spotify.bootstrap.v1.proto.Bootstrap$BootstrapResponse;
import com.spotify.bootstrap.v1.proto.Bootstrap$UcsResponseWrapperV0;
import com.spotify.bootstrap.v1.proto.Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess;
import com.spotify.ucs.v0.proto.Ucs$UcsResponseWrapper;
import com.spotify.ucs.v0.proto.Ucs$UcsResponseWrapper$UcsResponse;
import com.spotify.rcs.resolver.grpc.v0.proto.Resolve$ResolveResponse;
import com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Configuration;
import com.google.protobuf.a;
import java.lang.String;
import p.co5;
import com.spotify.ucs.v0.proto.Ucs$UcsResponseWrapper$AccountAttributesResponse;
import java.util.Map;
import java.util.LinkedHashMap;
import p.xe7;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import com.spotify.useraccount.v1.proto.Useraccount$AccountAttribute;
import com.spotify.useraccount.v1.AccountAttribute;
import java.lang.Throwable;
import p.tx5;
import p.eb3;
import p.ux5;
import com.spotify.base.java.logging.Logger;
import p.n40;
import p.m40;

public final class l40 implements yf2	// class@001cdc from classes.dex
{
    public static final l40 a;

    static {
       l40.a = new l40();
    }
    public void l40(){
       super();
    }
    public final Object apply(Object p0){
       byte[] uobyteArray;
       Object[] objArray1;
       if (!p0.a()) {
          p0 = new j40();
       }else if((p0 = p0.b) == null){
          p0 = new j40();
       }else {
          int i = 1;
          int i1 = 0;
          if (p0.f() == i && p0.g().h() == i) {
             p0 = p0.g().i();
             if (p0.h() && p0.f().j()) {
                p0 = p0.f().h();
                if (p0.i()) {
                   if (p0.j()) {
                      uobyteArray = p0.h().f().toByteArray();
                      co5.l(uobyteArray, "{\n                    uc…Array\(\)\n                }");
                   }else {
                      uobyteArray = new byte[i1];
                   }
                   Map map = p0.f().f();
                   co5.l(map, "ucsResponse.accountAttri…cess.accountAttributesMap");
                   LinkedHashMap linkedHashMa = new LinkedHashMap(xe7.F(map.size()));
                   Iterator iterator = map.entrySet().iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      Object key = uEntry.getKey();
                      AccountAttribute uAccountAttr = AccountAttribute.k(uEntry.getValue().toByteArray());
                      if (ux5.a(uAccountAttr) != null) {
                         Object[] objArray = new Object[i1];
                         Logger.i("Unable to migrate Bootstrap AccountAttribute to RC", objArray);
                         uAccountAttr = AccountAttribute.g();
                      }
                      linkedHashMa.put(key, uAccountAttr);
                   }
                   p0 = p0.f().toByteArray();
                   co5.l(p0, "ucsResponse.accountAttributesSuccess.toByteArray\(\)");
                   p0 = new n40(uobyteArray, co5.C(linkedHashMa), p0);
                }else if(p0.j()){
                   p0 = p0.h().f().toByteArray();
                   co5.l(p0, "config.toByteArray\(\)");
                   p0 = new m40(p0);
                }
             }
             objArray1 = new Object[i1];
             Logger.i("No successful customization was delivered via bootstrap.", objArray1);
          }
          objArray1 = new Object[i1];
          Logger.b("Could not parse to any bootstrap data result", objArray1);
          p0 = new j40();
       }
       return p0;
    }
}
