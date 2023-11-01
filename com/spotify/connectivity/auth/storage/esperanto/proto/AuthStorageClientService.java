package com.spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClientService;
import com.spotify.clientfoundations.esperanto.esperanto.ServiceBase;
import java.lang.Object;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$NullableStoredUserInfo;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult;
import com.google.protobuf.a;
import java.lang.String;
import io.reactivex.rxjava3.core.Single;
import p.co5;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfo;
import com.spotify.connectivity.auth.storage.esperanto.proto.a;
import p.yf2;
import com.google.protobuf.Empty;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;
import java.lang.RuntimeException;
import p.kg4;
import java.lang.StringBuilder;
import p.en6;
import io.reactivex.rxjava3.core.Observable;

public abstract class AuthStorageClientService implements ServiceBase	// class@00064a from classes.dex
{
    private final String name;

    public void AuthStorageClientService(){
       super();
       this.name = "spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClient";
    }
    public static byte[] a(EsStoredUserInfo$NullableStoredUserInfo p0){
       return AuthStorageClientService.callSingle$lambda-3(p0);
    }
    public static byte[] b(EsAuthStorageResult$AuthStorageResult p0){
       return AuthStorageClientService.callSingle$lambda-2(p0);
    }
    public static byte[] c(EsAuthStorageResult$AuthStorageResult p0){
       return AuthStorageClientService.callSingle$lambda-1(p0);
    }
    private static final byte[] callSingle$lambda-0(EsAuthStorageResult$AuthStorageResult p0){
       return p0.toByteArray();
    }
    private static final byte[] callSingle$lambda-1(EsAuthStorageResult$AuthStorageResult p0){
       return p0.toByteArray();
    }
    private static final byte[] callSingle$lambda-2(EsAuthStorageResult$AuthStorageResult p0){
       return p0.toByteArray();
    }
    private static final byte[] callSingle$lambda-3(EsStoredUserInfo$NullableStoredUserInfo p0){
       return p0.toByteArray();
    }
    public static byte[] d(EsAuthStorageResult$AuthStorageResult p0){
       return AuthStorageClientService.callSingle$lambda-0(p0);
    }
    public Single callSingle(String p0,String p1,byte[] p2){
       Single single;
       Empty uEmpty;
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       if (!co5.c(p0, this.getName())) {
          throw new RuntimeException(en6.t("Attempted to access mismatched [", p0, "], but this service is [")+this.getName()+']');
       }
       String str = "request_msg";
       if (co5.c(p1, "storeUser")) {
          EsStoredUserInfo$StoredUserInfo storedUserIn = EsStoredUserInfo$StoredUserInfo.parseFrom(p2);
          co5.l(storedUserIn, str);
          single = this.storeUser(storedUserIn).map(new a(4));
          co5.l(single, "storeUser\(request_msg\).m…it.toByteArray\(\)\n      }\)");
          return single;
       }else if(co5.c(p1, "removeUser")){
          uEmpty = Empty.g(p2);
          co5.l(uEmpty, str);
          single = this.removeUser(uEmpty).map(new a(5));
          co5.l(single, "removeUser\(request_msg\).…it.toByteArray\(\)\n      }\)");
          return single;
       }else if(co5.c(p1, "updateUserAuthBlob")){
          EsAuthBlob$AuthBlob uAuthBlob = EsAuthBlob$AuthBlob.parseFrom(p2);
          co5.l(uAuthBlob, str);
          single = this.updateUserAuthBlob(uAuthBlob).map(new a(6));
          co5.l(single, "updateUserAuthBlob\(reque…it.toByteArray\(\)\n      }\)");
          return single;
       }else if(co5.c(p1, "getStoredUser")){
          uEmpty = Empty.g(p2);
          co5.l(uEmpty, str);
          single = this.getStoredUser(uEmpty).map(new a(7));
          co5.l(single, "getStoredUser\(request_ms…it.toByteArray\(\)\n      }\)");
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
    public abstract Single getStoredUser(Empty p0);
    public abstract Single removeUser(Empty p0);
    public abstract Single storeUser(EsStoredUserInfo$StoredUserInfo p0);
    public abstract Single updateUserAuthBlob(EsAuthBlob$AuthBlob p0);
}
