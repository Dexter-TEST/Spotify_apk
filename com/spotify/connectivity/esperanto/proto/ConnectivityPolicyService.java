package com.spotify.connectivity.esperanto.proto.ConnectivityPolicyService;
import com.spotify.clientfoundations.esperanto.esperanto.ServiceBase;
import java.lang.Object;
import com.spotify.connectivity.esperanto.proto.PutRulesResponse;
import com.google.protobuf.a;
import java.lang.String;
import io.reactivex.rxjava3.core.Single;
import p.co5;
import com.spotify.connectivity.esperanto.proto.PutRulesRequest;
import com.spotify.connectivity.esperanto.proto.a;
import p.yf2;
import java.lang.RuntimeException;
import p.kg4;
import java.lang.StringBuilder;
import p.en6;
import io.reactivex.rxjava3.core.Observable;

public abstract class ConnectivityPolicyService implements ServiceBase	// class@0006f6 from classes.dex
{
    private final String name;

    public void ConnectivityPolicyService(){
       super();
       this.name = "spotify.connectivity.esperanto.proto.ConnectivityPolicy";
    }
    public static byte[] a(PutRulesResponse p0){
       return ConnectivityPolicyService.callSingle$lambda-0(p0);
    }
    private static final byte[] callSingle$lambda-0(PutRulesResponse p0){
       return p0.toByteArray();
    }
    public Single callSingle(String p0,String p1,byte[] p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       if (!co5.c(p0, this.getName())) {
          throw new RuntimeException(en6.t("Attempted to access mismatched [", p0, "], but this service is [")+this.getName()+']');
       }
       if (!co5.c(p1, "setRules")) {
          throw new RuntimeException(kg4.m("Attempted to access unknown method. [", p0, ':', p1, ']'));
       }
       PutRulesRequest putRulesRequ = PutRulesRequest.parseFrom(p2);
       co5.l(putRulesRequ, "request_msg");
       Single single = this.setRules(putRulesRequ).map(new a(1));
       co5.l(single, "setRules\(request_msg\).ma…it.toByteArray\(\)\n      }\)");
       return single;
    }
    public Observable callStream(String p0,String p1,byte[] p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       if (!co5.c(p0, this.getName())) {
          throw new RuntimeException(en6.t("Attempted to access mismatched [", p0, "], but this service is [")+this.getName()+']');
       }
       throw new RuntimeException(kg4.m("Attempted to access unknown method. [", p0, ':', p1, ']'));
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
    public abstract Single setRules(PutRulesRequest p0);
}
