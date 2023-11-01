package com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageClientEsperantoDescriptor;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageClientEsperantoDescriptor$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.clientfoundations.esperanto.esperanto.MethodDescriptor;
import java.lang.String;
import java.lang.Object;

public final class EsAuthStorageClientEsperantoDescriptor	// class@00064d from classes.dex
{
    public static final EsAuthStorageClientEsperantoDescriptor$Companion Companion;

    static {
       EsAuthStorageClientEsperantoDescriptor$Companion uCompanion = new EsAuthStorageClientEsperantoDescriptor$Companion(null);
       EsAuthStorageClientEsperantoDescriptor.Companion = uCompanion;
       EsAuthStorageClientEsperantoDescriptor$Companion.access$addMethod(uCompanion, "storeUser", new MethodDescriptor("com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfo", "com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult", "storeUser"));
       EsAuthStorageClientEsperantoDescriptor$Companion.access$addMethod(uCompanion, "removeUser", new MethodDescriptor("com.google.protobuf.Empty", "com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult", "removeUser"));
       EsAuthStorageClientEsperantoDescriptor$Companion.access$addMethod(uCompanion, "updateUserAuthBlob", new MethodDescriptor("com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob", "com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult", "updateUserAuthBlob"));
       EsAuthStorageClientEsperantoDescriptor$Companion.access$addMethod(uCompanion, "getStoredUser", new MethodDescriptor("com.google.protobuf.Empty", "com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$NullableStoredUserInfo", "getStoredUser"));
    }
    public void EsAuthStorageClientEsperantoDescriptor(){
       super();
    }
    public static String getServiceID(){
       return EsAuthStorageClientEsperantoDescriptor.Companion.getServiceID();
    }
    public static String getServiceName(){
       return EsAuthStorageClientEsperantoDescriptor.Companion.getServiceName();
    }
}
