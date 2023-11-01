package com.spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClientClientImpl;
import com.spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClientClient;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$NullableStoredUserInfo;
import java.util.Base64$Encoder;
import p.p3;
import java.lang.RuntimeException;
import p.tp2;
import java.lang.Throwable;
import com.google.protobuf.Empty;
import io.reactivex.rxjava3.core.Single;
import p.s74;
import com.spotify.connectivity.auth.storage.esperanto.proto.a;
import p.yf2;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfo;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;

final class AuthStorageClientClientImpl extends ClientBase implements AuthStorageClientClient	// class@000649 from classes.dex
{
    private final Transport transport;

    public void AuthStorageClientClientImpl(Transport p0){
       co5.o(p0, "transport");
       super(p0);
       this.transport = p0;
    }
    public static EsAuthStorageResult$AuthStorageResult a(byte[] p0){
       return AuthStorageClientClientImpl.updateUserAuthBlob$lambda-2(p0);
    }
    public static EsAuthStorageResult$AuthStorageResult b(byte[] p0){
       return AuthStorageClientClientImpl.storeUser$lambda-0(p0);
    }
    public static EsStoredUserInfo$NullableStoredUserInfo c(byte[] p0){
       return AuthStorageClientClientImpl.getStoredUser$lambda-3(p0);
    }
    public static EsAuthStorageResult$AuthStorageResult d(byte[] p0){
       return AuthStorageClientClientImpl.removeUser$lambda-1(p0);
    }
    private static final EsStoredUserInfo$NullableStoredUserInfo getStoredUser$lambda-3(byte[] p0){
       EsStoredUserInfo$NullableStoredUserInfo nullableStor;
       try{
          nullableStor = EsStoredUserInfo$NullableStoredUserInfo.parseFrom(p0);
          return nullableStor;
       }catch(java.lang.Exception e0){
          throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo.NullableStoredUserInfo: \'", p3.n(p3.o(), nullableStor), "\' \(Base64\)"), e0);
       }
    }
    private static final EsAuthStorageResult$AuthStorageResult removeUser$lambda-1(byte[] p0){
       EsAuthStorageResult$AuthStorageResult uAuthStorage;
       try{
          uAuthStorage = EsAuthStorageResult$AuthStorageResult.parseFrom(p0);
          return uAuthStorage;
       }catch(java.lang.Exception e0){
          throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult.AuthStorageResult: \'", p3.n(p3.o(), uAuthStorage), "\' \(Base64\)"), e0);
       }
    }
    private static final EsAuthStorageResult$AuthStorageResult storeUser$lambda-0(byte[] p0){
       EsAuthStorageResult$AuthStorageResult uAuthStorage;
       try{
          uAuthStorage = EsAuthStorageResult$AuthStorageResult.parseFrom(p0);
          return uAuthStorage;
       }catch(java.lang.Exception e0){
          throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult.AuthStorageResult: \'", p3.n(p3.o(), uAuthStorage), "\' \(Base64\)"), e0);
       }
    }
    private static final EsAuthStorageResult$AuthStorageResult updateUserAuthBlob$lambda-2(byte[] p0){
       EsAuthStorageResult$AuthStorageResult uAuthStorage;
       try{
          uAuthStorage = EsAuthStorageResult$AuthStorageResult.parseFrom(p0);
          return uAuthStorage;
       }catch(java.lang.Exception e0){
          throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult.AuthStorageResult: \'", p3.n(p3.o(), uAuthStorage), "\' \(Base64\)"), e0);
       }
    }
    public Single getStoredUser(Empty p0){
       co5.o(p0, "request");
       Single single = this.callSingle("spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClient", "getStoredUser", p0).map(new a(3));
       co5.l(single, "callSingle\(\"spotify.conn…     }\n                }\)");
       return single;
    }
    public Single removeUser(Empty p0){
       co5.o(p0, "request");
       Single single = this.callSingle("spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClient", "removeUser", p0).map(new a(0));
       co5.l(single, "callSingle\(\"spotify.conn…     }\n                }\)");
       return single;
    }
    public Single storeUser(EsStoredUserInfo$StoredUserInfo p0){
       co5.o(p0, "request");
       Single single = this.callSingle("spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClient", "storeUser", p0).map(new a(1));
       co5.l(single, "callSingle\(\"spotify.conn…     }\n                }\)");
       return single;
    }
    public Single updateUserAuthBlob(EsAuthBlob$AuthBlob p0){
       co5.o(p0, "request");
       Single single = this.callSingle("spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClient", "updateUserAuthBlob", p0).map(new a(2));
       co5.l(single, "callSingle\(\"spotify.conn…     }\n                }\)");
       return single;
    }
}
