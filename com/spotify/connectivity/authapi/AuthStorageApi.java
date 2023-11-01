package com.spotify.connectivity.authapi.AuthStorageApi;
import io.reactivex.rxjava3.core.Single;
import com.spotify.connectivity.auth.AuthUserInfo;
import com.spotify.connectivity.auth.AuthBlob;

public interface abstract AuthStorageApi	// class@000664 from classes.dex
{

    Single getStoredUser();
    Single removeUser();
    Single storeUser(AuthUserInfo p0);
    Single updateUserAuthBlob(AuthBlob p0);
}
