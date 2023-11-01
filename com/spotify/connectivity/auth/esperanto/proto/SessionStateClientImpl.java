package com.spotify.connectivity.auth.esperanto.proto.SessionStateClientImpl;
import com.spotify.connectivity.auth.esperanto.proto.SessionStateClient;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.auth.esperanto.proto.GetStateResult;
import java.util.Base64$Encoder;
import p.p3;
import java.lang.RuntimeException;
import p.tp2;
import java.lang.Throwable;
import com.spotify.connectivity.auth.esperanto.proto.SubStateRequest;
import io.reactivex.rxjava3.core.Observable;
import p.s74;
import com.spotify.connectivity.auth.esperanto.proto.a;
import p.yf2;

final class SessionStateClientImpl extends ClientBase implements SessionStateClient	// class@00063f from classes.dex
{
    private final Transport transport;

    public void SessionStateClientImpl(Transport p0){
       co5.o(p0, "transport");
       super(p0);
       this.transport = p0;
    }
    public static GetStateResult a(byte[] p0){
       return SessionStateClientImpl.subState$lambda-0(p0);
    }
    private static final GetStateResult subState$lambda-0(byte[] p0){
       GetStateResult getStateResu;
       try{
          getStateResu = GetStateResult.parseFrom(p0);
          return getStateResu;
       }catch(java.lang.Exception e0){
          throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.connectivity.auth.esperanto.proto.GetStateResult: \'", p3.n(p3.o(), getStateResu), "\' \(Base64\)"), e0);
       }
    }
    public Observable subState(SubStateRequest p0){
       co5.o(p0, "request");
       Observable observable = this.callStream("spotify.connectivity.auth.esperanto.proto.SessionState", "subState", p0).map(new a(3));
       co5.l(observable, "callStream\(\"spotify.conn…     }\n                }\)");
       return observable;
    }
}
