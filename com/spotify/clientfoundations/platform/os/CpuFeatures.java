package com.spotify.clientfoundations.platform.os.CpuFeatures;
import com.spotify.clientfoundations.platform.os.CpuFeatures$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;

public final class CpuFeatures	// class@00058f from classes.dex
{
    public static final CpuFeatures$Companion Companion;
    private static final int cpuFamily;
    private static final long cpuFeatures;

    static {
       CpuFeatures.Companion = new CpuFeatures$Companion(null);
    }
    public void CpuFeatures(){
       super();
    }
    public static native final int getCpuFamily();
    public static native final long getCpuFeatures();
}
