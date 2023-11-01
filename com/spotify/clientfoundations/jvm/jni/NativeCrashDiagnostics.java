package com.spotify.clientfoundations.jvm.jni.NativeCrashDiagnostics;
import com.spotify.clientfoundations.jvm.jni.NativeCrashDiagnostics$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;

public final class NativeCrashDiagnostics	// class@000589 from classes.dex
{
    public static final NativeCrashDiagnostics$Companion Companion;

    static {
       NativeCrashDiagnostics.Companion = new NativeCrashDiagnostics$Companion(null);
    }
    public void NativeCrashDiagnostics(){
       super();
    }
    public static native final void crash();
}
