package com.spotify.clientfoundations.core.coreimpl.NativeApplicationScopeImpl;
import com.spotify.clientfoundations.core.core.NativeApplicationScope;
import com.spotify.clientfoundations.core.core.ApplicationScope;
import com.spotify.clientfoundations.core.coreimpl.NativeApplicationScopeImpl$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import com.spotify.clientfoundations.concurrency.async.NativeTimerManagerThread;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import com.spotify.clientfoundations.prefs.prefsimpl.NativePrefs;
import com.spotify.clientfoundations.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.connectivity.auth.NativeLoginController;
import com.spotify.eventsender.api.EventSenderCoreBridge;

public final class NativeApplicationScopeImpl implements NativeApplicationScope, ApplicationScope	// class@000563 from classes.dex
{
    private final byte[] cacheId;
    private final byte[] cacheSalt;
    private long nThis;
    public static final NativeApplicationScopeImpl$Companion Companion;

    static {
       NativeApplicationScopeImpl.Companion = new NativeApplicationScopeImpl$Companion(null);
    }
    private void NativeApplicationScopeImpl(){
       super();
    }
    public static native final NativeApplicationScopeImpl create(NativeTimerManagerThread p0,NativeRouter p1,NativePrefs p2,ApplicationScopeConfiguration p3,NativeLoginController p4,EventSenderCoreBridge p5);
    public native void destroy();
    public native byte[] getCacheId();
    public native byte[] getCacheSalt();
    public long getNThis(){
       return this.nThis;
    }
    public native final void prepareForShutdown();
}
