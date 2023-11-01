package com.spotify.connectivity.esperanto.proto.ConnectivityPolicyClientImpl;
import com.spotify.connectivity.esperanto.proto.ConnectivityPolicyClient;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.esperanto.proto.PutRulesResponse;
import java.util.Base64$Encoder;
import p.p3;
import java.lang.RuntimeException;
import p.tp2;
import java.lang.Throwable;
import com.spotify.connectivity.esperanto.proto.PutRulesRequest;
import io.reactivex.rxjava3.core.Single;
import p.s74;
import com.spotify.connectivity.esperanto.proto.a;
import p.yf2;

final class ConnectivityPolicyClientImpl extends ClientBase implements ConnectivityPolicyClient	// class@0006f5 from classes.dex
{
    private final Transport transport;

    public void ConnectivityPolicyClientImpl(Transport p0){
       co5.o(p0, "transport");
       super(p0);
       this.transport = p0;
    }
    public static PutRulesResponse a(byte[] p0){
       return ConnectivityPolicyClientImpl.setRules$lambda-0(p0);
    }
    private static final PutRulesResponse setRules$lambda-0(byte[] p0){
       PutRulesResponse putRulesResp;
       try{
          putRulesResp = PutRulesResponse.parseFrom(p0);
          return putRulesResp;
       }catch(java.lang.Exception e0){
          throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.connectivity.esperanto.proto.PutRulesResponse: \'", p3.n(p3.o(), putRulesResp), "\' \(Base64\)"), e0);
       }
    }
    public Single setRules(PutRulesRequest p0){
       co5.o(p0, "request");
       Single single = this.callSingle("spotify.connectivity.esperanto.proto.ConnectivityPolicy", "setRules", p0).map(new a(0));
       co5.l(single, "callSingle\(\"spotify.conn…     }\n                }\)");
       return single;
    }
}
