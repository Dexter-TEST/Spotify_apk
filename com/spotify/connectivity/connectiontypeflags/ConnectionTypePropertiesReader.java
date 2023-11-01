package com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesReader;
import p.tn6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesReader$netCapabilitiesValidatedDisabled$2;
import p.ay6;
import p.wf2;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesReader$shouldUseSingleThread$2;
import p.ui3;
import java.lang.Boolean;

public final class ConnectionTypePropertiesReader	// class@0006bb from classes.dex
{
    private final ui3 netCapabilitiesValidatedDisabled$delegate;
    private final tn6 sharedPreferences;
    private final ui3 shouldUseSingleThread$delegate;

    public void ConnectionTypePropertiesReader(tn6 p0){
       co5.o(p0, "sharedPreferences");
       super();
       this.sharedPreferences = p0;
       this.netCapabilitiesValidatedDisabled$delegate = new ay6(new ConnectionTypePropertiesReader$netCapabilitiesValidatedDisabled$2(this));
       this.shouldUseSingleThread$delegate = new ay6(new ConnectionTypePropertiesReader$shouldUseSingleThread$2(this));
    }
    public static final tn6 access$getSharedPreferences$p(ConnectionTypePropertiesReader p0){
       return p0.sharedPreferences;
    }
    public final boolean getNetCapabilitiesValidatedDisabled(){
       return this.netCapabilitiesValidatedDisabled$delegate.getValue().booleanValue();
    }
    public final boolean getShouldUseSingleThread(){
       return this.shouldUseSingleThread$delegate.getValue().booleanValue();
    }
}
