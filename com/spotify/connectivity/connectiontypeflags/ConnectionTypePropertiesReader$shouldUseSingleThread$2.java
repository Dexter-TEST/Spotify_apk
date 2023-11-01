package com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesReader$shouldUseSingleThread$2;
import p.wf2;
import p.gi3;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesReader;
import java.lang.Boolean;
import p.tn6;
import p.rn6;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesKt;
import java.lang.Object;

final class ConnectionTypePropertiesReader$shouldUseSingleThread$2 extends gi3 implements wf2	// class@0006ba from classes.dex
{
    final ConnectionTypePropertiesReader this$0;

    public void ConnectionTypePropertiesReader$shouldUseSingleThread$2(ConnectionTypePropertiesReader p0){
       this.this$0 = p0;
       super(0);
    }
    public final Boolean invoke(){
       return Boolean.valueOf(ConnectionTypePropertiesReader.access$getSharedPreferences$p(this.this$0).d(ConnectionTypePropertiesKt.access$getShouldUseSingleThreadKey$p(), false));
    }
    public Object invoke(){
       return this.invoke();
    }
}
