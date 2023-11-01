package com.spotify.connectivity.auth.esperanto.proto.EsSessionStateEsperantoDescriptor;
import com.spotify.connectivity.auth.esperanto.proto.EsSessionStateEsperantoDescriptor$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.clientfoundations.esperanto.esperanto.MethodDescriptor;
import java.lang.String;
import java.lang.Object;

public final class EsSessionStateEsperantoDescriptor	// class@000635 from classes.dex
{
    public static final EsSessionStateEsperantoDescriptor$Companion Companion;

    static {
       EsSessionStateEsperantoDescriptor$Companion uCompanion = new EsSessionStateEsperantoDescriptor$Companion(null);
       EsSessionStateEsperantoDescriptor.Companion = uCompanion;
       EsSessionStateEsperantoDescriptor$Companion.access$addMethod(uCompanion, "subState", new MethodDescriptor("com.spotify.connectivity.auth.esperanto.proto.SubStateRequest", "com.spotify.connectivity.auth.esperanto.proto.GetStateResult", "subState"));
    }
    public void EsSessionStateEsperantoDescriptor(){
       super();
    }
    public static String getServiceID(){
       return EsSessionStateEsperantoDescriptor.Companion.getServiceID();
    }
    public static String getServiceName(){
       return EsSessionStateEsperantoDescriptor.Companion.getServiceName();
    }
}
