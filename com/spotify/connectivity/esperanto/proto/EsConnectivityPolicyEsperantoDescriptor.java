package com.spotify.connectivity.esperanto.proto.EsConnectivityPolicyEsperantoDescriptor;
import com.spotify.connectivity.esperanto.proto.EsConnectivityPolicyEsperantoDescriptor$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.clientfoundations.esperanto.esperanto.MethodDescriptor;
import java.lang.String;
import java.lang.Object;

public final class EsConnectivityPolicyEsperantoDescriptor	// class@0006f9 from classes.dex
{
    public static final EsConnectivityPolicyEsperantoDescriptor$Companion Companion;

    static {
       EsConnectivityPolicyEsperantoDescriptor$Companion uCompanion = new EsConnectivityPolicyEsperantoDescriptor$Companion(null);
       EsConnectivityPolicyEsperantoDescriptor.Companion = uCompanion;
       EsConnectivityPolicyEsperantoDescriptor$Companion.access$addMethod(uCompanion, "setRules", new MethodDescriptor("com.spotify.connectivity.esperanto.proto.PutRulesRequest", "com.spotify.connectivity.esperanto.proto.PutRulesResponse", "setRules"));
    }
    public void EsConnectivityPolicyEsperantoDescriptor(){
       super();
    }
    public static String getServiceID(){
       return EsConnectivityPolicyEsperantoDescriptor.Companion.getServiceID();
    }
    public static String getServiceName(){
       return EsConnectivityPolicyEsperantoDescriptor.Companion.getServiceName();
    }
}
