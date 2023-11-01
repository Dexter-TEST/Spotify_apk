package com.spotify.connectivity.auth.esperanto.proto.SessionService;
import com.spotify.clientfoundations.esperanto.esperanto.ServiceBase;
import java.lang.Object;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$SendEndSongsResult;
import com.google.protobuf.Empty;
import com.google.protobuf.a;
import java.lang.String;
import io.reactivex.rxjava3.core.Single;
import p.co5;
import com.spotify.connectivity.auth.esperanto.proto.a;
import p.yf2;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$ProductStateMap;
import java.lang.RuntimeException;
import p.kg4;
import java.lang.StringBuilder;
import p.en6;
import io.reactivex.rxjava3.core.Observable;

public abstract class SessionService implements ServiceBase	// class@00063d from classes.dex
{
    private final String name;

    public void SessionService(){
       super();
       this.name = "spotify.connectivity.auth.esperanto.proto.Session";
    }
    public static byte[] a(EsSession$SendEndSongsResult p0){
       return SessionService.callSingle$lambda-1(p0);
    }
    public static byte[] b(Empty p0){
       return SessionService.callStream$lambda-0(p0);
    }
    public static byte[] c(Empty p0){
       return SessionService.callSingle$lambda-2(p0);
    }
    private static final byte[] callSingle$lambda-1(EsSession$SendEndSongsResult p0){
       return p0.toByteArray();
    }
    private static final byte[] callSingle$lambda-2(Empty p0){
       return p0.toByteArray();
    }
    private static final byte[] callStream$lambda-0(Empty p0){
       return p0.toByteArray();
    }
    public Single callSingle(String p0,String p1,byte[] p2){
       Single single;
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       if (!co5.c(p0, this.getName())) {
          throw new RuntimeException(en6.t("Attempted to access mismatched [", p0, "], but this service is [")+this.getName()+']');
       }
       String str = "request_msg";
       if (co5.c(p1, "sendEndSongs")) {
          Empty uEmpty = Empty.g(p2);
          co5.l(uEmpty, str);
          single = this.sendEndSongs(uEmpty).map(new a(4));
          co5.l(single, "sendEndSongs\(request_msg…it.toByteArray\(\)\n      }\)");
          return single;
       }else if(co5.c(p1, "writeProductStateToLegacyStorage")){
          EsSession$ProductStateMap productState = EsSession$ProductStateMap.parseFrom(p2);
          co5.l(productState, str);
          single = this.writeProductStateToLegacyStorage(productState).map(new a(5));
          co5.l(single, "writeProductStateToLegac…it.toByteArray\(\)\n      }\)");
          return single;
       }else {
          throw new RuntimeException(kg4.m("Attempted to access unknown method. [", p0, ':', p1, ']'));
       }
    }
    public Observable callStream(String p0,String p1,byte[] p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       if (!co5.c(p0, this.getName())) {
          throw new RuntimeException(en6.t("Attempted to access mismatched [", p0, "], but this service is [")+this.getName()+']');
       }
       if (!co5.c(p1, "willLogoutAndForgetCurrentUser")) {
          throw new RuntimeException(kg4.m("Attempted to access unknown method. [", p0, ':', p1, ']'));
       }
       Empty uEmpty = Empty.g(p2);
       co5.l(uEmpty, "request_msg");
       Observable observable = this.willLogoutAndForgetCurrentUser(uEmpty).map(new a(6));
       co5.l(observable, "willLogoutAndForgetCurre…it.toByteArray\(\)\n      }\)");
       return observable;
    }
    public byte[] callSync(String p0,String p1,byte[] p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       if (!co5.c(p0, this.getName())) {
          throw new RuntimeException(en6.t("Attempted to access mismatched [", p0, "], but this service is [")+this.getName()+']');
       }
       throw new RuntimeException(kg4.m("Attempted to access unknown method. [", p0, ':', p1, ']'));
    }
    public String getName(){
       return this.name;
    }
    public abstract Single sendEndSongs(Empty p0);
    public abstract Observable willLogoutAndForgetCurrentUser(Empty p0);
    public abstract Single writeProductStateToLegacyStorage(EsSession$ProductStateMap p0);
}
