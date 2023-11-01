package com.spotify.connectivity.auth.esperanto.proto.EsSessionEsperantoDescriptor;
import com.spotify.connectivity.auth.esperanto.proto.EsSessionEsperantoDescriptor$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.clientfoundations.esperanto.esperanto.MethodDescriptor;
import java.lang.String;
import java.lang.Object;

public final class EsSessionEsperantoDescriptor	// class@000631 from classes.dex
{
    public static final EsSessionEsperantoDescriptor$Companion Companion;

    static {
       EsSessionEsperantoDescriptor$Companion uCompanion = new EsSessionEsperantoDescriptor$Companion(null);
       EsSessionEsperantoDescriptor.Companion = uCompanion;
       EsSessionEsperantoDescriptor$Companion.access$addMethod(uCompanion, "willLogoutAndForgetCurrentUser", new MethodDescriptor("com.google.protobuf.Empty", "com.google.protobuf.Empty", "willLogoutAndForgetCurrentUser"));
       EsSessionEsperantoDescriptor$Companion.access$addMethod(uCompanion, "sendEndSongs", new MethodDescriptor("com.google.protobuf.Empty", "com.spotify.connectivity.auth.esperanto.proto.EsSession$SendEndSongsResult", "sendEndSongs"));
       EsSessionEsperantoDescriptor$Companion.access$addMethod(uCompanion, "writeProductStateToLegacyStorage", new MethodDescriptor("com.spotify.connectivity.auth.esperanto.proto.EsSession$ProductStateMap", "com.google.protobuf.Empty", "writeProductStateToLegacyStorage"));
    }
    public void EsSessionEsperantoDescriptor(){
       super();
    }
    public static String getServiceID(){
       return EsSessionEsperantoDescriptor.Companion.getServiceID();
    }
    public static String getServiceName(){
       return EsSessionEsperantoDescriptor.Companion.getServiceName();
    }
}
