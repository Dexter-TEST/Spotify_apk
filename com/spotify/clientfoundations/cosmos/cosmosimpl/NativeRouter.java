package com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import com.spotify.clientfoundations.cosmos.cosmos.Router;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import com.spotify.clientfoundations.cosmos.cosmosimpl.Scheduler;
import com.spotify.clientfoundations.cosmos.cosmos.Request;
import com.spotify.clientfoundations.cosmos.cosmos.ResolveCallback;
import com.spotify.clientfoundations.cosmos.cosmos.Lifetime;

public final class NativeRouter implements Router	// class@000574 from classes.dex
{
    private long nThis;
    public static final NativeRouter$Companion Companion;

    static {
       NativeRouter.Companion = new NativeRouter$Companion(null);
    }
    public void NativeRouter(){
       super();
       NativeRouter$Companion.access$initializeRouter(NativeRouter.Companion, this);
    }
    public static final void access$initializeRouter(NativeRouter p0){
       NativeRouter.initializeRouter(p0);
    }
    public static native final NativeRouter create();
    private static native final void initializeRouter(NativeRouter p0);
    public native final void deinitializeScheduling();
    public native void destroy();
    public native final void initializeScheduling(Scheduler p0);
    public native Lifetime resolve(Request p0,ResolveCallback p1);
}
