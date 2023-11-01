package com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageClientEsperantoKt;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import com.spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClientClient;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClientClientImpl;

public final class EsAuthStorageClientEsperantoKt	// class@00064e from classes.dex
{

    public static final AuthStorageClientClient createAuthStorageClientClient(Transport p0){
       co5.o(p0, "transport");
       return new AuthStorageClientClientImpl(p0);
    }
}
