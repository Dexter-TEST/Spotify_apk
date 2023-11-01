package com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesWriter;
import p.tn6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.wn6;
import p.rn6;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesKt;

public final class ConnectionTypePropertiesWriter	// class@0006bd from classes.dex
{
    private final tn6 sharedPreferences;

    public void ConnectionTypePropertiesWriter(tn6 p0){
       co5.o(p0, "sharedPreferences");
       super();
       this.sharedPreferences = p0;
    }
    public final void clearNetCapabilitiesValidatedDisabled(){
       wn6 own6 = this.sharedPreferences.edit();
       own6.d(ConnectionTypePropertiesKt.access$getNetCapabilitiesValidatedDisabledKey$p());
       own6.e();
    }
    public final void clearShouldUseSingleThread(){
       wn6 own6 = this.sharedPreferences.edit();
       own6.d(ConnectionTypePropertiesKt.access$getShouldUseSingleThreadKey$p());
       own6.e();
    }
    public final void storeNetCapabilitiesValidatedDisabled(boolean p0){
       wn6 own6 = this.sharedPreferences.edit();
       own6.a(ConnectionTypePropertiesKt.access$getNetCapabilitiesValidatedDisabledKey$p(), p0);
       own6.e();
    }
    public final void storeShouldUseSingleThread(boolean p0){
       wn6 own6 = this.sharedPreferences.edit();
       own6.a(ConnectionTypePropertiesKt.access$getShouldUseSingleThreadKey$p(), p0);
       own6.e();
    }
}
