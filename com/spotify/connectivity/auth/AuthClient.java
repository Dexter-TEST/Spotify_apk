package com.spotify.connectivity.auth.AuthClient;
import com.spotify.connectivity.auth.AuthRequest;
import io.reactivex.rxjava3.core.Single;

public interface abstract AuthClient	// class@0005d2 from classes.dex
{

    Single authenticate(AuthRequest p0);
}
