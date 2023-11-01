package com.spotify.clientfoundations.core.coreimpl.NativeApplicationScopeImpl$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.clientfoundations.concurrency.async.NativeTimerManagerThread;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import com.spotify.clientfoundations.prefs.prefsimpl.NativePrefs;
import com.spotify.clientfoundations.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.connectivity.auth.NativeLoginController;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import com.spotify.clientfoundations.core.coreimpl.NativeApplicationScopeImpl;

public final class NativeApplicationScopeImpl$Companion	// class@000562 from classes.dex
{

    private void NativeApplicationScopeImpl$Companion(){
       super();
    }
    public void NativeApplicationScopeImpl$Companion(DefaultConstructorMarker p0){
       super();
    }
    public final NativeApplicationScopeImpl create(NativeTimerManagerThread p0,NativeRouter p1,NativePrefs p2,ApplicationScopeConfiguration p3,NativeLoginController p4,EventSenderCoreBridge p5){
       return NativeApplicationScopeImpl.create(p0, p1, p2, p3, p4, p5);
    }
}
