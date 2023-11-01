package p.nt5;
import com.spotify.clientfoundations.esperanto.esperanto.ServiceBase;
import p.fv1;
import java.lang.Object;
import p.ps1;
import java.lang.String;
import p.co5;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfig$LookupRequest;
import p.pl;
import io.reactivex.rxjava3.core.Single;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import p.kg4;
import io.reactivex.rxjava3.core.Observable;
import p.dr1;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfig$BoolResponse;
import java.lang.Boolean;
import com.google.protobuf.c;
import com.google.protobuf.b;
import com.google.protobuf.a;
import p.fr1;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfig$IntResponse;
import java.lang.Number;
import p.er1;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfig$EnumResponse;
import com.spotify.shoreline.esperanto.proto.EsShorelineLogger$SetContextValueRequest;
import com.spotify.shoreline.esperanto.proto.EsShorelineLogger$PlaybackIds;
import p.bc3;
import p.cc1;
import java.lang.Iterable;
import p.zf2;
import p.dj0;
import java.util.ArrayList;
import p.aj0;
import java.util.Iterator;
import p.i80;
import p.ay;
import java.util.Locale;
import java.lang.Class;
import p.qg0;
import p.or1;
import com.spotify.shoreline.esperanto.proto.EsShorelineLogger$SetContextValueResponse;

public final class nt5 implements ServiceBase	// class@002047 from classes.dex
{
    public final int a;
    public final String b;
    public final Object c;

    public void nt5(fv1 p0){
       this.a = 1;
       super();
       this.b = "spotify.shoreline.esperanto.proto.ShorelineLogger";
       this.c = p0;
    }
    public void nt5(ps1 p0){
       this.a = 0;
       co5.o(p0, "resolver");
       super();
       this.b = "spotify.remote_config.esperanto.proto.RemoteConfig";
       this.c = p0;
    }
    public final pl a(EsRemoteConfig$LookupRequest p0){
       String str = p0.f();
       co5.l(str, "request.scope");
       String name = p0.getName();
       co5.l(name, "request.name");
       return this.c.e(str, name);
    }
    public final Single callSingle(String p0,String p1,byte[] p2){
       nt5 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             co5.o(p0, "service");
             co5.o(p1, "method");
             co5.o(p2, "payload");
             if (!co5.c(p0, tb)) {
                throw new RuntimeException("Attempted to access mismatched ["+p0+"], but this service is ["+tb+']');
             }
             throw new RuntimeException(kg4.m("Attempted to access unknown method. [", p0, ':', p1, ']'));
       }
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       if (!co5.c(p0, tb)) {
          throw new RuntimeException("Attempted to access mismatched ["+p0+"], but this service is ["+tb+']');
       }
       throw new RuntimeException(kg4.m("Attempted to access unknown method. [", p0, ':', p1, ']'));
    }
    public final Observable callStream(String p0,String p1,byte[] p2){
       nt5 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             co5.o(p0, "service");
             co5.o(p1, "method");
             co5.o(p2, "payload");
             if (!co5.c(p0, tb)) {
                throw new RuntimeException("Attempted to access mismatched ["+p0+"], but this service is ["+tb+']');
             }
             throw new RuntimeException(kg4.m("Attempted to access unknown method. [", p0, ':', p1, ']'));
       }
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       if (!co5.c(p0, tb)) {
          throw new RuntimeException("Attempted to access mismatched ["+p0+"], but this service is ["+tb+']');
       }
       throw new RuntimeException(kg4.m("Attempted to access unknown method. [", p0, ':', p1, ']'));
    }
    public final byte[] callSync(String p0,String p1,byte[] p2){
       EsRemoteConfig$LookupRequest lookupReques;
       pl c1;
       c uoc;
       byte[] uobyteArray;
       nt5 tb = this.b;
       char c = ':';
       String str = "Attempted to access unknown method. [";
       String str1 = "request_msg";
       String str2 = "], but this service is [";
       switch (this.a){
           case 0:
             co5.o(p0, "service");
             co5.o(p1, "method");
             co5.o(p2, "payload");
             if (co5.c(p0, tb)) {
                if (co5.c(p1, "lookupBool")) {
                   lookupReques = EsRemoteConfig$LookupRequest.g(p2);
                   co5.l(lookupReques, str1);
                   dr1 uodr1 = EsRemoteConfig$BoolResponse.g();
                   if ((c1 = this.a(lookupReques).c) != null) {
                      uodr1.c(c1.booleanValue());
                   }
                   uoc = uodr1.build();
                   co5.l(uoc, "response.build\(\)");
                   uobyteArray = uoc.toByteArray();
                   co5.l(uobyteArray, "lookupBool\(request_msg\).toByteArray\(\)");
                }else if(co5.c(p1, "lookupInt")){
                   lookupReques = EsRemoteConfig$LookupRequest.g(p2);
                   co5.l(lookupReques, str1);
                   fr1 uofr1 = EsRemoteConfig$IntResponse.g();
                   if ((c1 = this.a(lookupReques).d) != null) {
                      uofr1.c(c1.intValue());
                   }
                   uoc = uofr1.build();
                   co5.l(uoc, "response.build\(\)");
                   uobyteArray = uoc.toByteArray();
                   co5.l(uobyteArray, "lookupInt\(request_msg\).toByteArray\(\)");
                }else if(co5.c(p1, "lookupEnum")){
                   lookupReques = EsRemoteConfig$LookupRequest.g(p2);
                   co5.l(lookupReques, str1);
                   er1 uoer1 = EsRemoteConfig$EnumResponse.g();
                   if ((c1 = this.a(lookupReques).e) != null) {
                      uoer1.c(c1);
                   }
                   uoc = uoer1.build();
                   co5.l(uoc, "response.build\(\)");
                   uobyteArray = uoc.toByteArray();
                   co5.l(uobyteArray, "lookupEnum\(request_msg\).toByteArray\(\)");
                }else {
                   throw new RuntimeException(kg4.m(str, p0, c, p1, ']'));
                }
             }else {
                throw new RuntimeException("Attempted to access mismatched ["+p0+str2+tb+']');
             }
             break;
           default:
             co5.o(p0, "service");
             co5.o(p1, "method");
             co5.o(p2, "payload");
             if (!co5.c(p0, tb)) {
                throw new RuntimeException("Attempted to access mismatched ["+p0+str2+tb+']');
             }
             if (!co5.c(p1, "SetContextValue")) {
                throw new RuntimeException(kg4.m(str, p0, c, p1, ']'));
             }
             EsShorelineLogger$SetContextValueRequest setContextVa = EsShorelineLogger$SetContextValueRequest.k(p2);
             co5.l(setContextVa, str1);
             nt5 tc = this.c;
             if (setContextVa.i()) {
                bc3 uobc3 = setContextVa.f().g();
                co5.l(uobc3, "request.playbackIds.playbackIdList");
                dj0.q0(uobc3, null, null, null, new cc1(6, this), 31);
                bc3 uobc31 = setContextVa.f().g();
                co5.l(uobc31, "request.playbackIds.playbackIdList");
                ArrayList uArrayList = new ArrayList(aj0.b0(uobc31));
                Iterator iterator = uobc31.iterator();
                while (iterator.hasNext()) {
                   i80 oi80 = iterator.next();
                   co5.l(oi80, "playbackId");
                   String str3 = ay.e.c(oi80.p());
                   co5.l(str3, "base16\(\).encode\(this.toByteArray\(\)\)");
                   str3 = str3.toLowerCase(Locale.ROOT);
                   co5.l(str3, "this as java.lang.String\).toLowerCase\(Locale.ROOT\)");
                   uArrayList.add(str3);
                }
                tc.getClass();
             }else if(setContextVa.j()){
                setContextVa.g();
                co5.l(setContextVa.g(), "request.playbackStatus");
                tc.getClass();
             }else if(setContextVa.h()){
                tc.getClass();
                co5.o(qg0.a, "contextValue");
             }
             uoc = EsShorelineLogger$SetContextValueResponse.f().build();
             co5.l(uoc, "newBuilder\(\).build\(\)");
             uobyteArray = uoc.toByteArray();
             co5.l(uobyteArray, "SetContextValue\(request_msg\).toByteArray\(\)");
             return uobyteArray;
       }
       return uobyteArray;
    }
    public final String getName(){
       return this.b;
    }
}
