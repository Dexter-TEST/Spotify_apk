package com.spotify.connectivity.auth.esperanto.proto.SessionStateClient;
import com.spotify.connectivity.auth.esperanto.proto.SubStateRequest;
import io.reactivex.rxjava3.core.Observable;

public interface abstract SessionStateClient	// class@00063e from classes.dex
{

    Observable subState(SubStateRequest p0);
}
