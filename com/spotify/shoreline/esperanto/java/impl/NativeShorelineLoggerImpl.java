package com.spotify.shoreline.esperanto.java.impl.NativeShorelineLoggerImpl;
import com.spotify.shoreline.esperanto.java.api.NativeShorelineLogger;
import com.spotify.shoreline.esperanto.java.api.ShorelineLoggerApi;
import com.spotify.shoreline.esperanto.java.impl.NativeShorelineLoggerImpl$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;

public final class NativeShorelineLoggerImpl implements NativeShorelineLogger, ShorelineLoggerApi	// class@000c27 from classes.dex
{
    private long nThis;
    public static final NativeShorelineLoggerImpl$Companion Companion;

    static {
       NativeShorelineLoggerImpl.Companion = new NativeShorelineLoggerImpl$Companion(null);
    }
    private void NativeShorelineLoggerImpl(){
       super();
    }
    public static final NativeShorelineLoggerImpl access$createInternal(Transport p0){
       return NativeShorelineLoggerImpl.createInternal(p0);
    }
    public static final NativeShorelineLoggerImpl create(Transport p0){
       return NativeShorelineLoggerImpl.Companion.create(p0);
    }
    private static native final NativeShorelineLoggerImpl createInternal(Transport p0);
    public native void destroy();
    public long getNThis(){
       return this.nThis;
    }
}
