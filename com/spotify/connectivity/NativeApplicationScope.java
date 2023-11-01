package com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.ApplicationScope;
import com.spotify.connectivity.NativeApplicationScope$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import com.spotify.connectivity.auth.NativeSerializableCredentialsTransferManager;
import com.spotify.clientfoundations.concurrency.async.NativeTimerManagerThread;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.ConnectionTypeProvider;
import com.spotify.connectivity.ConnectivityPolicyProvider;
import com.spotify.connectivity.auth.CredentialsStorage;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import com.spotify.connectivity.auth.NativeLoginController;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import com.spotify.connectivity.auth.SerializableCredentialsTransferManager;

public final class NativeApplicationScope implements ApplicationScope	// class@0005ba from classes.dex
{
    private final NativeSerializableCredentialsTransferManager _serializableCredentialsTransferManager;
    private long nThis;
    public static final NativeApplicationScope$Companion Companion;

    static {
       NativeApplicationScope.Companion = new NativeApplicationScope$Companion(null);
    }
    private void NativeApplicationScope(){
       super();
       this._serializableCredentialsTransferManager = new NativeSerializableCredentialsTransferManager();
    }
    public static native final NativeApplicationScope create(NativeTimerManagerThread p0,NativeRouter p1,AnalyticsDelegate p2,ConnectionTypeProvider p3,ConnectivityPolicyProvider p4,CredentialsStorage p5,ApplicationScopeConfiguration p6);
    public native final NativeLoginController createLoginController(NativeTimerManagerThread p0,NativeRouter p1,Object p2);
    public native final void destroy();
    public native final Transport getNativeAuthStorageTransport();
    public native final Transport getNativeLogin5Transport();
    public native final Transport getNativeTransport();
    public SerializableCredentialsTransferManager getSerializableCredentialsTransferManager(){
       return this._serializableCredentialsTransferManager;
    }
    public native void prepareForShutdown();
}
