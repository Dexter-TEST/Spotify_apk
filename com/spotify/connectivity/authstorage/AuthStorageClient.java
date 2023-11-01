package com.spotify.connectivity.authstorage.AuthStorageClient;
import io.reactivex.rxjava3.core.Single;
import com.spotify.connectivity.auth.AuthUserInfo;
import com.spotify.connectivity.auth.AuthBlob;

public interface abstract AuthStorageClient	// class@00066a from classes.dex
{

    Single getStoredUser();
    Single removeUser();
    Single storeUser(AuthUserInfo p0);
    Single updateUserAuthBlob(AuthBlob p0);
}
