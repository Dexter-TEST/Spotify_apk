package com.spotify.clientfoundations.platform.os.SteadyClock;
import com.spotify.clientfoundations.platform.os.SteadyClock$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;

public final class SteadyClock	// class@000591 from classes.dex
{
    public static final SteadyClock$Companion Companion;
    private static final long timeSinceEpochMs;

    static {
       SteadyClock.Companion = new SteadyClock$Companion(null);
    }
    public void SteadyClock(){
       super();
    }
    public static native final long getTimeSinceEpochMs();
}
