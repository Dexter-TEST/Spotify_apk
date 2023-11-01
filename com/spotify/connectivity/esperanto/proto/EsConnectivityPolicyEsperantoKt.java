package com.spotify.connectivity.esperanto.proto.EsConnectivityPolicyEsperantoKt;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import com.spotify.connectivity.esperanto.proto.ConnectivityPolicyClient;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.esperanto.proto.ConnectivityPolicyClientImpl;

public final class EsConnectivityPolicyEsperantoKt	// class@0006fa from classes.dex
{

    public static final ConnectivityPolicyClient createConnectivityPolicyClient(Transport p0){
       co5.o(p0, "transport");
       return new ConnectivityPolicyClientImpl(p0);
    }
}
