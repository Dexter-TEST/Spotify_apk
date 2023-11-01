package com.spotify.connectivity.authtoken.TokenExchangeClient;
import java.lang.String;
import io.reactivex.rxjava3.core.Single;

public interface abstract TokenExchangeClient	// class@00067a from classes.dex
{

    Single getAuthCodeForConnectDevice(String p0);
    Single getSessionTransferTokenForWebAuthTransfer(String p0);
    Single getTokenForBuiltInAuthorization();
    Single getTokenForConnectDevice(String p0);
    Single getTokenForWebAuthTransfer(String p0);
}
