package com.spotify.shoreline.esperanto.java.impl.NativeShorelineLoggerImpl$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import com.spotify.shoreline.esperanto.java.impl.NativeShorelineLoggerImpl;
import java.lang.String;
import p.co5;

public final class NativeShorelineLoggerImpl$Companion	// class@000c26 from classes.dex
{

    private void NativeShorelineLoggerImpl$Companion(){
       super();
    }
    public void NativeShorelineLoggerImpl$Companion(DefaultConstructorMarker p0){
       super();
    }
    private final NativeShorelineLoggerImpl createInternal(Transport p0){
       return NativeShorelineLoggerImpl.access$createInternal(p0);
    }
    public final NativeShorelineLoggerImpl create(Transport p0){
       co5.o(p0, "shorelineLoggerTransport");
       return this.createInternal(p0);
    }
}
