package com.spotify.connectivity.auth.esperanto.proto.SessionStateService;
import com.spotify.clientfoundations.esperanto.esperanto.ServiceBase;
import java.lang.Object;
import com.spotify.connectivity.auth.esperanto.proto.GetStateResult;
import com.google.protobuf.a;
import java.lang.String;
import io.reactivex.rxjava3.core.Single;
import p.co5;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import p.en6;
import p.kg4;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.auth.esperanto.proto.SubStateRequest;
import com.spotify.connectivity.auth.esperanto.proto.a;
import p.yf2;

public abstract class SessionStateService implements ServiceBase	// class@000640 from classes.dex
{
    private final String name;

    public void SessionStateService(){
       super();
       this.name = "spotify.connectivity.auth.esperanto.proto.SessionState";
    }
    public static byte[] a(GetStateResult p0){
       return SessionStateService.callStream$lambda-0(p0);
    }
    private static final byte[] callStream$lambda-0(GetStateResult p0){
       return p0.toByteArray();
    }
    public Single callSingle(String p0,String p1,byte[] p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       if (!co5.c(p0, this.getName())) {
          throw new RuntimeException(en6.t("Attempted to access mismatched [", p0, "], but this service is [")+this.getName()+']');
       }
       throw new RuntimeException(kg4.m("Attempted to access unknown method. [", p0, ':', p1, ']'));
    }
    public Observable callStream(String p0,String p1,byte[] p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       if (!co5.c(p0, this.getName())) {
          throw new RuntimeException(en6.t("Attempted to access mismatched [", p0, "], but this service is [")+this.getName()+']');
       }
       if (!co5.c(p1, "subState")) {
          throw new RuntimeException(kg4.m("Attempted to access unknown method. [", p0, ':', p1, ']'));
       }
       SubStateRequest subStateRequ = SubStateRequest.parseFrom(p2);
       co5.l(subStateRequ, "request_msg");
       Observable observable = this.subState(subStateRequ).map(new a(7));
       co5.l(observable, "subState\(request_msg\).ma…it.toByteArray\(\)\n      }\)");
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
    public abstract Observable subState(SubStateRequest p0);
}
