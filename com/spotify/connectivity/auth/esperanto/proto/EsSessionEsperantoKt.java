package com.spotify.connectivity.auth.esperanto.proto.EsSessionEsperantoKt;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import com.spotify.connectivity.auth.esperanto.proto.SessionClient;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.auth.esperanto.proto.SessionClientImpl;

public final class EsSessionEsperantoKt	// class@000632 from classes.dex
{

    public static final SessionClient createSessionClient(Transport p0){
       co5.o(p0, "transport");
       return new SessionClientImpl(p0);
    }
}
