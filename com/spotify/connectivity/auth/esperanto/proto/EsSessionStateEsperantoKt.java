package com.spotify.connectivity.auth.esperanto.proto.EsSessionStateEsperantoKt;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import com.spotify.connectivity.auth.esperanto.proto.SessionStateClient;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.auth.esperanto.proto.SessionStateClientImpl;

public final class EsSessionStateEsperantoKt	// class@000636 from classes.dex
{

    public static final SessionStateClient createSessionStateClient(Transport p0){
       co5.o(p0, "transport");
       return new SessionStateClientImpl(p0);
    }
}
