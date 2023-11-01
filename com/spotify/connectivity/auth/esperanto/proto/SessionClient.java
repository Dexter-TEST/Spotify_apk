package com.spotify.connectivity.auth.esperanto.proto.SessionClient;
import com.google.protobuf.Empty;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$ProductStateMap;

public interface abstract SessionClient	// class@00063b from classes.dex
{

    Single sendEndSongs(Empty p0);
    Observable willLogoutAndForgetCurrentUser(Empty p0);
    Single writeProductStateToLegacyStorage(EsSession$ProductStateMap p0);
}
