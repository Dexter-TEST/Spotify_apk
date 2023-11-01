package com.spotify.clientfoundations.logging.logging.Logging;
import com.spotify.clientfoundations.logging.logging.Logging$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;

public final class Logging	// class@00058d from classes.dex
{
    public static final Logging$Companion Companion;

    static {
       Logging.Companion = new Logging$Companion(null);
    }
    public void Logging(){
       super();
    }
    public static native final void deinitLogging();
    public static native final void initLogging(boolean p0);
}
