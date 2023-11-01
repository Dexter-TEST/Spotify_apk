package com.spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClientClient;
import com.google.protobuf.Empty;
import io.reactivex.rxjava3.core.Single;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfo;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;

public interface abstract AuthStorageClientClient	// class@000648 from classes.dex
{

    Single getStoredUser(Empty p0);
    Single removeUser(Empty p0);
    Single storeUser(EsStoredUserInfo$StoredUserInfo p0);
    Single updateUserAuthBlob(EsAuthBlob$AuthBlob p0);
}
