package com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesKt;
import p.rn6;
import java.lang.String;
import p.b07;

public final class ConnectionTypePropertiesKt	// class@0006b8 from classes.dex
{
    private static final rn6 netCapabilitiesValidatedDisabledKey;
    private static final rn6 shouldUseSingleThreadKey;

    static {
       b07 b = rn6.b;
       ConnectionTypePropertiesKt.netCapabilitiesValidatedDisabledKey = b.a("NET_CAPABILITIES_VALIDATED_DISABLED");
       ConnectionTypePropertiesKt.shouldUseSingleThreadKey = b.a("LISTENER_SHOULD_USE_SINGLE_THREAD");
    }
    public static final rn6 access$getNetCapabilitiesValidatedDisabledKey$p(){
       return ConnectionTypePropertiesKt.netCapabilitiesValidatedDisabledKey;
    }
    public static final rn6 access$getShouldUseSingleThreadKey$p(){
       return ConnectionTypePropertiesKt.shouldUseSingleThreadKey;
    }
}
