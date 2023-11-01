package com.spotify.connectivity.auth.esperanto.proto.SessionClientImpl;
import com.spotify.connectivity.auth.esperanto.proto.SessionClient;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.google.protobuf.Empty;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$SendEndSongsResult;
import java.util.Base64$Encoder;
import p.p3;
import java.lang.RuntimeException;
import p.tp2;
import java.lang.Throwable;
import io.reactivex.rxjava3.core.Single;
import p.s74;
import com.spotify.connectivity.auth.esperanto.proto.a;
import p.yf2;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$ProductStateMap;

final class SessionClientImpl extends ClientBase implements SessionClient	// class@00063c from classes.dex
{
    private final Transport transport;

    public void SessionClientImpl(Transport p0){
       co5.o(p0, "transport");
       super(p0);
       this.transport = p0;
    }
    public static Empty a(byte[] p0){
       return SessionClientImpl.writeProductStateToLegacyStorage$lambda-2(p0);
    }
    public static Empty b(byte[] p0){
       return SessionClientImpl.willLogoutAndForgetCurrentUser$lambda-0(p0);
    }
    public static EsSession$SendEndSongsResult c(byte[] p0){
       return SessionClientImpl.sendEndSongs$lambda-1(p0);
    }
    private static final EsSession$SendEndSongsResult sendEndSongs$lambda-1(byte[] p0){
       EsSession$SendEndSongsResult sendEndSongs;
       try{
          sendEndSongs = EsSession$SendEndSongsResult.parseFrom(p0);
          return sendEndSongs;
       }catch(java.lang.Exception e0){
          throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.connectivity.auth.esperanto.proto.EsSession.SendEndSongsResult: \'", p3.n(p3.o(), sendEndSongs), "\' \(Base64\)"), e0);
       }
    }
    private static final Empty willLogoutAndForgetCurrentUser$lambda-0(byte[] p0){
       Empty uEmpty;
       try{
          uEmpty = Empty.g(p0);
          return uEmpty;
       }catch(java.lang.Exception e0){
          throw new RuntimeException(tp2.m("Unable to parse data as com.google.protobuf.Empty: \'", p3.n(p3.o(), uEmpty), "\' \(Base64\)"), e0);
       }
    }
    private static final Empty writeProductStateToLegacyStorage$lambda-2(byte[] p0){
       Empty uEmpty;
       try{
          uEmpty = Empty.g(p0);
          return uEmpty;
       }catch(java.lang.Exception e0){
          throw new RuntimeException(tp2.m("Unable to parse data as com.google.protobuf.Empty: \'", p3.n(p3.o(), uEmpty), "\' \(Base64\)"), e0);
       }
    }
    public Single sendEndSongs(Empty p0){
       co5.o(p0, "request");
       Single single = this.callSingle("spotify.connectivity.auth.esperanto.proto.Session", "sendEndSongs", p0).map(new a(2));
       co5.l(single, "callSingle\(\"spotify.conn…     }\n                }\)");
       return single;
    }
    public Observable willLogoutAndForgetCurrentUser(Empty p0){
       co5.o(p0, "request");
       Observable observable = this.callStream("spotify.connectivity.auth.esperanto.proto.Session", "willLogoutAndForgetCurrentUser", p0).map(new a(1));
       co5.l(observable, "callStream\(\"spotify.conn…     }\n                }\)");
       return observable;
    }
    public Single writeProductStateToLegacyStorage(EsSession$ProductStateMap p0){
       co5.o(p0, "request");
       Single single = this.callSingle("spotify.connectivity.auth.esperanto.proto.Session", "writeProductStateToLegacyStorage", p0).map(new a(0));
       co5.l(single, "callSingle\(\"spotify.conn…     }\n                }\)");
       return single;
    }
}
