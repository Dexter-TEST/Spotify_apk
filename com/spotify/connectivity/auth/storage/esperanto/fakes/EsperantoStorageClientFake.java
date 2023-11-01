package com.spotify.connectivity.auth.storage.esperanto.fakes.EsperantoStorageClientFake;
import com.spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClientClient;
import io.reactivex.rxjava3.core.Single;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.google.protobuf.Empty;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfo;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;

public final class EsperantoStorageClientFake implements AuthStorageClientClient	// class@000647 from classes.dex
{
    private final Single getUserResult;
    private final Single removeUserResult;
    private final Single storeUserResult;
    private final Single updateUserResult;

    public void EsperantoStorageClientFake(Single p0,Single p1,Single p2,Single p3){
       co5.o(p0, "getUserResult");
       co5.o(p1, "removeUserResult");
       co5.o(p2, "storeUserResult");
       co5.o(p3, "updateUserResult");
       super();
       this.getUserResult = p0;
       this.removeUserResult = p1;
       this.storeUserResult = p2;
       this.updateUserResult = p3;
    }
    public Single getStoredUser(Empty p0){
       co5.o(p0, "request");
       return this.getUserResult;
    }
    public Single removeUser(Empty p0){
       co5.o(p0, "request");
       return this.removeUserResult;
    }
    public Single storeUser(EsStoredUserInfo$StoredUserInfo p0){
       co5.o(p0, "request");
       return this.storeUserResult;
    }
    public Single updateUserAuthBlob(EsAuthBlob$AuthBlob p0){
       co5.o(p0, "request");
       return this.updateUserResult;
    }
}
